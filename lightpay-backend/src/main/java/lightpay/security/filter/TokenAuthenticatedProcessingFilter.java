package lightpay.security.filter;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;

public class TokenAuthenticatedProcessingFilter extends AbstractPreAuthenticatedProcessingFilter {

    @Override
    protected Object getPreAuthenticatedPrincipal(HttpServletRequest request) {
        return "";
    }

    @Override
    protected Object getPreAuthenticatedCredentials(HttpServletRequest request) {
        String accessToken = request.getHeader("Authorization");
        return StringUtils.isEmpty(accessToken) ? "" : accessToken;
    }

}
