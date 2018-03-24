package lightpay.security.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class IssuedToken {

    private String accessToken;

    private Long accessTokenExpirationTime;

    private String refreshToken;

    private Long refreshTokenExpirationTime;

}
