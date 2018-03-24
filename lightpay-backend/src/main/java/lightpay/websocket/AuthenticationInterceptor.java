package lightpay.websocket;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import com.auth0.jwt.interfaces.DecodedJWT;

import lightpay.security.JwtAuthenticationProvider;

public class AuthenticationInterceptor implements HandshakeInterceptor {

    @Autowired
    private JwtAuthenticationProvider jwtAuthenticationProvider;

    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes)
        throws Exception {
        List<NameValuePair> params = URLEncodedUtils.parse(request.getURI(), Charset.forName("UTF-8"));
        String accessToken = null;
        for (NameValuePair param : params) {
            if ("accessToken".equals(param.getName())) {
                accessToken = param.getValue();
                break;
            }
        }

        if (StringUtils.isEmpty(accessToken)) {
            return false;
        }

        DecodedJWT jwt;
        try {
            jwt = jwtAuthenticationProvider.verifyJwt(accessToken);
            if (jwt == null) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    @Override
    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception exception) {

    }

}
