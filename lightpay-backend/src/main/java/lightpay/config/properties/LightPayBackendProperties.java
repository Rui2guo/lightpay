package lightpay.config.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "lightpay-backend", ignoreInvalidFields = true)
public class LightPayBackendProperties {

    @Value("${spring.profiles.active:" + Profile.PRODUCTION + "}")
    private String activeProfile;

    @NestedConfigurationProperty
    private JWT jwt = new JWT();

    @NestedConfigurationProperty
    private Lnd lnd = new Lnd();

    @NestedConfigurationProperty
    private RestTemplate restTemplate = new RestTemplate();

    @Data
    public static class Lnd {

        private String host;

        private Integer port;

        @NestedConfigurationProperty
        private SSL ssl = new SSL();

        @NestedConfigurationProperty
        private Macaroon macaroon = new Macaroon();

        @Data
        public static class SSL {

            private String certificateFilePath;

        }

        @Data
        public static class Macaroon {

            private String filePath;

        }

    }

    @Data
    public static class JWT {

        private String secretKey;

        private Long AccessTokenExpirationTime = 60000L;

        private Long refreshTokenExpirationTime = 120000L;

    }

    @Data
    public static class RestTemplate {

        private Integer connectTimeout = 5000;

        private Integer readTimeout = 5000;

    }

}
