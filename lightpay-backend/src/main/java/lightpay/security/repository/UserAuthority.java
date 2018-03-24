package lightpay.security.repository;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lightpay.security.AuthorityType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode(exclude = { "user" })
@ToString(exclude = { "user" })
@Entity
@IdClass(UserAuthority.PK.class)
public class UserAuthority implements Serializable {

    @Id
    private String userName;

    @Id
    @Enumerated(EnumType.STRING)
    private AuthorityType authority;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userName", referencedColumnName = "name", insertable = false, updatable = false)
    private User user;

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class PK implements Serializable {

        private String userName;

        private AuthorityType authority;
    }

}
