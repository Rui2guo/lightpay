package lightpay.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import lightpay.config.properties.LightPayBackendProperties;
import lightpay.security.filter.TokenAuthenticatedProcessingFilter;
import lightpay.security.filter.TokenIssuingFailureHandler;
import lightpay.security.filter.TokenIssuingFilter;
import lightpay.security.filter.TokenIssuingSuccessHandler;
import lightpay.security.filter.TokenRefreshFailureHandler;
import lightpay.security.filter.TokenRefreshFilter;
import lightpay.security.filter.TokenRefreshSuccessHandler;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private LightPayBackendProperties lightPayBackendProperties;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        configureAuthentication(http);

        http.addFilter(tokenAuthenticatedProcessingFilter());
        http.addFilterBefore(tokenRefreshFilter(), TokenAuthenticatedProcessingFilter.class);
        http.addFilterBefore(tokenIssuingFilter(), TokenRefreshFilter.class);

        UrlBasedCorsConfigurationSource corsConfigurationSource = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.addAllowedOrigin(CorsConfiguration.ALL);
        corsConfiguration.addAllowedHeader(CorsConfiguration.ALL);
        corsConfiguration.addAllowedMethod(CorsConfiguration.ALL);
        corsConfiguration.setMaxAge(600L);
        corsConfigurationSource.registerCorsConfiguration("/api/**", corsConfiguration);
        http.cors().configurationSource(corsConfigurationSource);
    }

    private void configureAuthentication(HttpSecurity http) throws Exception {
        if (!lightPayBackendProperties.getSecurity().getAuthentication().isEnabled()) {
            return;
        }

        http
        .authorizeRequests().antMatchers("/api/**").authenticated()
        .antMatchers("/api/token/**").permitAll();
    }

    @Bean
    public TokenIssuingFilter tokenIssuingFilter() throws Exception {
        TokenIssuingFilter filter = new TokenIssuingFilter();
        filter.setAuthenticationSuccessHandler(new TokenIssuingSuccessHandler());
        filter.setAuthenticationFailureHandler(new TokenIssuingFailureHandler());
        filter.setAuthenticationManager(authenticationManagerBean());
        return filter;
    }

    @Bean
    public TokenRefreshFilter tokenRefreshFilter() throws Exception {
        TokenRefreshFilter filter = new TokenRefreshFilter();
        filter.setAuthenticationSuccessHandler(new TokenRefreshSuccessHandler());
        filter.setAuthenticationFailureHandler(new TokenRefreshFailureHandler());
        filter.setAuthenticationManager(authenticationManagerBean());
        return filter;
    }

    @Bean
    public TokenAuthenticatedProcessingFilter tokenAuthenticatedProcessingFilter() throws Exception {
        TokenAuthenticatedProcessingFilter filter = new TokenAuthenticatedProcessingFilter();
        filter.setAuthenticationManager(authenticationManagerBean());
        return filter;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public JwtAuthenticationProvider jwtAuthenticationProvider() {
        JwtAuthenticationProvider provider = new JwtAuthenticationProvider();
        provider.setPasswordEncoder(passwordEncoder());
        provider.setUserDetailsService(userDetailsService());
        return provider;
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return new UserDetailsServiceImpl();
    }

}
