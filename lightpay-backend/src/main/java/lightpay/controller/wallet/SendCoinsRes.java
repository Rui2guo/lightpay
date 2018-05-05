package lightpay.controller.wallet;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SendCoinsRes {

    private String txid;

}
