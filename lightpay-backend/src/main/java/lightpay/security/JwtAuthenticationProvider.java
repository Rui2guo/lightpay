package lightpay.security;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
import org.springframework.util.Assert;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

import lightpay.config.properties.LightPayBackendProperties;
import lightpay.security.JwtAuthenticationToken.RequestType;
import lightpay.security.repository.User;
import lightpay.security.repository.UserAuthority;
import lightpay.security.repository.UserRepository;

public class JwtAuthenticationProvider extends DaoAuthenticationProvider {

    public static final String ALGORITHM = "SHA1PRNG";

    public static final String ISSUER = "lightpay";

    public static final int TOKEN_BYTE_LENGTH = 32;

    @Autowired
    private LightPayBackendProperties lightPayBackendProperties;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Authentication authenticate(Authentication authentication)
        throws AuthenticationException {
        if (PreAuthenticatedAuthenticationToken.class.isAssignableFrom(authentication.getClass())) {
            return authenticateJwt((PreAuthenticatedAuthenticationToken) authentication);
        }

        Assert.isInstanceOf(JwtAuthenticationToken.class, authentication,
            "Unsupported Authentication");

        JwtAuthenticationToken jwtAuthenticationToken = (JwtAuthenticationToken) authentication;
        switch (jwtAuthenticationToken.getRequestType()) {
            case Issue:
                return issueToken(jwtAuthenticationToken);
            case Refresh:
                return refreshToken(jwtAuthenticationToken);
            default:
                throw new AuthenticationServiceException("Unsupported RequestType.");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return JwtAuthenticationToken.class.isAssignableFrom(authentication)
            || PreAuthenticatedAuthenticationToken.class.isAssignableFrom(authentication);
    }

    @Override
    protected Authentication createSuccessAuthentication(Object principal,
        Authentication authentication, UserDetails user) {
        RequestType requestType = ((JwtAuthenticationToken) authentication).getRequestType();
        JwtAuthenticationToken result = new JwtAuthenticationToken(
            requestType,
            principal,
            authentication.getCredentials(),
            user.getAuthorities());
        result.setDetails(authentication.getDetails());

        return result;
    }

    @Transactional
    private JwtAuthenticationToken generateToken(JwtAuthenticationToken authentication) {
        Algorithm algorithm;
        try {
            algorithm = Algorithm.HMAC256(lightPayBackendProperties.getJwt().getSecretKey());
        } catch (IllegalArgumentException | UnsupportedEncodingException e) {
            throw new AuthenticationServiceException("issue token error.", e);
        }

        long now = (new Date()).getTime();
        long accessTokenExpirationTime = now + lightPayBackendProperties.getJwt().getAccessTokenExpirationTime();

        String accessToken = JWT.create()
            .withIssuer(ISSUER)
            .withSubject(authentication.getName())
            .withAudience(toAudience(authentication.getAuthorities()))
            .withExpiresAt(new Date(accessTokenExpirationTime))
            .withIssuedAt(new Date(now))
            .sign(algorithm);

        User userEntity = userRepository.findOne(authentication.getName());
        if (userEntity == null) {
            throw new AuthenticationServiceException("user not found.");
        }

        String refreshToken = userEntity.getRefreshToken();
        Long refreshTokenExpirationTime = userEntity.getRefreshTokenExpirationTime();
        if (StringUtils.isEmpty(refreshToken)
            || refreshTokenExpirationTime == null
            || now > refreshTokenExpirationTime) {
            refreshToken = generateRefreshToken();
            userEntity.setRefreshToken(refreshToken);
        }

        refreshTokenExpirationTime = now + lightPayBackendProperties.getJwt().getRefreshTokenExpirationTime();
        userEntity.setRefreshTokenExpirationTime(refreshTokenExpirationTime);
        userRepository.save(userEntity);

        authentication.setAccessToken(accessToken);
        authentication.setAccessTokenExpirationTime(accessTokenExpirationTime);
        authentication.setRefreshToken(refreshToken);
        authentication.setRefreshTokenExpirationTime(refreshTokenExpirationTime);

        return authentication;
    }

    private String generateRefreshToken() {
        SecureRandom random;
        try {
            random = SecureRandom.getInstance(ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            throw new AuthenticationServiceException("issue token error.", e);
        }
        byte[] randomByte = new byte[TOKEN_BYTE_LENGTH];
        random.nextBytes(randomByte);
        return Hex.encodeHexString(randomByte);
    }

    private String[] toAudience(Collection<? extends GrantedAuthority> authorities) {
        String[] audience = new String[authorities.size()];

        int i = 0;
        for (GrantedAuthority authority : authorities) {
            audience[i] = authority.getAuthority();
            i++;
        }

        return audience;
    }

    private Collection<? extends GrantedAuthority> toAuthorities(List<String> audience) {
        Set<GrantedAuthority> authorities = new HashSet<>();
        for (String authority : audience) {
            authorities.add(new SimpleGrantedAuthority(authority));
        }
        return authorities;
    }

    private JwtAuthenticationToken issueToken(JwtAuthenticationToken authentication) {
        JwtAuthenticationToken result = (JwtAuthenticationToken) super.authenticate(authentication);
        return generateToken(result);
    }

    private JwtAuthenticationToken refreshToken(JwtAuthenticationToken authentication) {
        User userEntity = userRepository.findByRefreshToken(authentication.getRefreshToken());
        if (userEntity == null) {
            throw new AuthenticationServiceException("Refresh token not found.");
        }

        long now = (new Date()).getTime();
        if (now > userEntity.getRefreshTokenExpirationTime()) {
            throw new AuthenticationServiceException("Refresh token has expired.");
        }

        UserDetails userDetails = new org.springframework.security.core.userdetails.User(
            userEntity.getName(),
            userEntity.getPassword(),
            getAuthorities(userEntity));

        RequestType requestType = authentication.getRequestType();
        JwtAuthenticationToken result = new JwtAuthenticationToken(
            requestType,
            userEntity.getName(),
            userEntity.getPassword(),
            userDetails.getAuthorities());
        result.setDetails(userDetails);

        return generateToken(result);
    }

    private Collection<? extends GrantedAuthority> getAuthorities(User userEntity) {
        Set<GrantedAuthority> authorities = new HashSet<>();
        for (UserAuthority userAuthority : userEntity.getAuthorities()) {
            authorities.add(new SimpleGrantedAuthority(userAuthority.getAuthority().toString()));
        }
        return authorities;
    }

    private JwtAuthenticationToken authenticateJwt(PreAuthenticatedAuthenticationToken authentication) {
        DecodedJWT jwt;
        try {
            jwt = verifyJwt((String) authentication.getCredentials());
        } catch (Exception e) {
            throw new AuthenticationServiceException("Token authentication failed.", e);
        }

        UserDetails userDetails = new org.springframework.security.core.userdetails.User(
            jwt.getSubject(),
            "",
            toAuthorities(jwt.getAudience()));

        JwtAuthenticationToken result = new JwtAuthenticationToken(
            RequestType.Authenticate,
            jwt.getSubject(),
            "",
            userDetails.getAuthorities());
        result.setDetails(userDetails);

        return result;
    }

    public DecodedJWT verifyJwt(String token) throws IllegalArgumentException, UnsupportedEncodingException, JWTVerificationException {
        Algorithm algorithm = Algorithm.HMAC256(lightPayBackendProperties.getJwt().getSecretKey());
        JWTVerifier verifier = JWT.require(algorithm)
            .withIssuer(ISSUER)
            .build();

        return verifier.verify(token);
    }

}
