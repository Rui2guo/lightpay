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
import lightpay.security.JwtAuthenticationToken.RequestType;
import lightpay.security.dto.Login;

public class TokenIssuingFilter extends AbstractAuthenticationProcessingFilter {

    private ObjectReader objectReader;

    public TokenIssuingFilter() {
        super("/api/token/issue");

        ObjectMapper mapper = new ObjectMapper();
        objectReader = mapper.readerFor(Login.class);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException, IOException, ServletException {

        if (!request.getMethod().equals("POST")) {
            throw new AuthenticationServiceException(
                    "Authentication method not supported: " + request.getMethod());
        }

        Login login;
        try {
            login = objectReader.readValue(request.getReader());
        } catch (Exception e) {
            throw new AuthenticationServiceException("JSON parse failed.", e);
        }

        if (login.getUserName() == null) {
            login.setUserName("");
        }

        if (login.getPassword() == null) {
            login.setPassword("");
        }

        JwtAuthenticationToken authenticationToken = new JwtAuthenticationToken(
                RequestType.Issue,
                login.getUserName(),
                login.getPassword());


        return getAuthenticationManager().authenticate(authenticationToken);
    }


}
