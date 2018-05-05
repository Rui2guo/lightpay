package lightpay.config.init;

import java.util.ArrayList;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import lightpay.config.properties.LightPayBackendProperties;
import lightpay.config.properties.Profile;
import lightpay.security.AuthorityType;
import lightpay.security.repository.User;
import lightpay.security.repository.UserAuthority;
import lightpay.security.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class InitialDataComponent {

    @Autowired
    private LightPayBackendProperties lightPayBackendProperties;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostConstruct
    @Transactional
    public void createInitialData() {
        createInitialUser();
    }

    private void createInitialUser() {
        if (userRepository.count() != 0) {
            return;
        }

        String password = generatePassword();
        User user = new User();
        user.setName("admin");
        user.setPassword(passwordEncoder.encode(password));
        user.setAuthorities(new ArrayList<>());

        UserAuthority authority = new UserAuthority();
        authority.setUserName("admin");
        authority.setAuthority(AuthorityType.ROLE_USER);
        user.getAuthorities().add(authority);

        userRepository.save(user);
        log.info("================ Create initial user ================");
        log.info("User: " + user.getName() + " Password: " + password);
        log.info("=====================================================");
    }

    private String generatePassword() {
        if (Profile.LOCAL.equals(lightPayBackendProperties.getActiveProfile())) {
            return "password";
        }

        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
