package lightpay.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import lightpay.security.repository.User;
import lightpay.security.repository.UserAuthority;
import lightpay.security.repository.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (StringUtils.isEmpty(username)) {
            throw new UsernameNotFoundException("username is empty.");
        }

        User userEntity = userRepository.findOne(username);
        if (userEntity == null) {
            throw new UsernameNotFoundException("user not found.");
        }

        return new org.springframework.security.core.userdetails.User(
            userEntity.getName(),
            userEntity.getPassword(),
            getAuthorities(userEntity));
    }

    private Collection<? extends GrantedAuthority> getAuthorities(User userEntity) {
        Set<GrantedAuthority> authorities = new HashSet<>();
        for (UserAuthority userAuthority : userEntity.getAuthorities()) {
            authorities.add(new SimpleGrantedAuthority(userAuthority.getAuthority().toString()));
        }
        return authorities;
    }

}
