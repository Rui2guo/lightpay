package lightpay.security.filter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import lightpay.security.JwtAuthenticationToken;
import lightpay.security.dto.IssuedToken;

public class TokenRefreshSuccessHandler implements AuthenticationSuccessHandler {

    private ObjectWriter objectWriter;

    public TokenRefreshSuccessHandler() {
        super();
        ObjectMapper mapper = new ObjectMapper();
        objectWriter = mapper.writerFor(IssuedToken.class);
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
            Authentication authentication) throws IOException, ServletException {
        response.setStatus(HttpStatus.OK.value());
        response.setHeader("Content-Type", "application/json");

        JwtAuthenticationToken jwtAuthentication = (JwtAuthenticationToken) authentication;
        IssuedToken issuedToken = IssuedToken.builder()
            .accessToken(jwtAuthentication.getAccessToken())
            .accessTokenExpirationTime(jwtAuthentication.getAccessTokenExpirationTime())
            .refreshToken(jwtAuthentication.getRefreshToken())
            .refreshTokenExpirationTime(jwtAuthentication.getRefreshTokenExpirationTime())
            .build();

        String responseStr = objectWriter.writeValueAsString(issuedToken);
        response.getWriter().print(responseStr);
    }

}
