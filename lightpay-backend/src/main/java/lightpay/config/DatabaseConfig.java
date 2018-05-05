package lightpay.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import lightpay.LightPayBackendApplication;

@Configuration
@EntityScan(basePackageClasses = { LightPayBackendApplication.class, Jsr310JpaConverters.class })
public class DatabaseConfig {

}
