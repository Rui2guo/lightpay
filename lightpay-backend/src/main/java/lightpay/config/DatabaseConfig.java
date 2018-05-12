package lightpay.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

import lightpay.LightPayBackendApplication;

@Configuration
@EntityScan(basePackageClasses = { LightPayBackendApplication.class })
public class DatabaseConfig {

}
