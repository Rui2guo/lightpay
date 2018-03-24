package lightpay.security.filter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

import lightpay.security.JwtAuthenticationToken;
import lightpay.security.dto.RefreshToken;

public class TokenRefreshFilter extends AbstractAuthenticationProcessingFilter {

    private ObjectReader objectReader;

    public TokenRefreshFilter() {
        super("/api/token/refresh");

        ObjectMapper mapper = new ObjectMapper();
        objectReader = mapper.readerFor(RefreshToken.class);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException, IOException, ServletException {

        if (!request.getMethod().equals("POST")) {
            throw new AuthenticationServiceException(
                    "Authentication method not supported: " + request.getMethod());
        }

        RefreshToken refreshToken;
        try {
            refreshToken = objectReader.readValue(request.getReader());
        } catch (Exception e) {
            throw new AuthenticationServiceException("JSON parse failed.", e);
        }

        if (refreshToken.getRefreshToken() == null) {
            refreshToken.setRefreshToken("No refresh token");
        }

        JwtAuthenticationToken authenticationToken = new JwtAuthenticationToken(refreshToken.getRefreshToken());
        return getAuthenticationManager().authenticate(authenticationToken);
    }


}
