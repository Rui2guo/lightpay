package lightpay.security;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.util.Assert;

import lombok.Getter;
import lombok.Setter;

public class JwtAuthenticationToken extends UsernamePasswordAuthenticationToken {

    @Getter
    private RequestType requestType;

    @Getter
    @Setter
    private String accessToken;

    @Getter
    @Setter
    private Long accessTokenExpirationTime;

    @Getter
    @Setter
    private String refreshToken;

    @Getter
    @Setter
    private Long refreshTokenExpirationTime;

    public JwtAuthenticationToken(RequestType requestType, Object principal, Object credentials) {
        this(requestType, principal, credentials, AuthorityUtils.NO_AUTHORITIES);
    }

    public JwtAuthenticationToken(RequestType requestType, Object principal, Object credentials,
        Collection<? extends GrantedAuthority> authorities) {
        super(principal, credentials, authorities);
        Assert.notNull(requestType, "RequestType must not be null.");
        this.requestType = requestType;
    }

    public JwtAuthenticationToken(String refreshToken) {
        this(RequestType.Refresh, "", "");
        this.refreshToken = refreshToken;
    }

    public static enum RequestType {
        Issue,
        Refresh,
        Authenticate
    }

}
