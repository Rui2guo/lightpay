package lightpay.security.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(exclude = { "authorities" })
@ToString(exclude = { "authorities" })
@Entity
@Table(indexes = @Index(columnList = "refreshToken", unique = true))
public class User implements Serializable {

    @Id
    private String name;

    @Column(nullable = false)
    private String password;

    private String refreshToken;

    private Long refreshTokenExpirationTime;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "userName", referencedColumnName = "name", insertable = false, updatable = false)
    private List<UserAuthority> authorities;

}
