package lightpay.controller.network;

import lombok.Data;

@Data
public class OpenChannelReq {

    private String pubkey;

    private String host;

    private Integer port;

    private Long localFundingAmount;

}
