package lightpay.controller.wallet;

import lombok.Data;

@Data
public class SendCoinsReq {

    private String address;

    private Long amount;

}
