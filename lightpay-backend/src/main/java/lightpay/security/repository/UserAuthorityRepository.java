package lightpay.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lightpay.security.repository.UserAuthority.PK;

public interface UserAuthorityRepository extends JpaRepository<UserAuthority, UserAuthority.PK> {

}
