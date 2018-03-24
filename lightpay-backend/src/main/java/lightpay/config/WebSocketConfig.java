package lightpay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import lightpay.websocket.AuthenticationInterceptor;
import lightpay.websocket.LightPayWebSocket;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(lightPayWebSocketHandler(), "/ws")
            .addInterceptors(authenticationInterceptor())
            .setAllowedOrigins("*");
    }

    @Bean
    public LightPayWebSocket lightPayWebSocketHandler() {
        return new LightPayWebSocket();
    }

    @Bean
    public AuthenticationInterceptor authenticationInterceptor() {
        return new AuthenticationInterceptor();
    }


}
