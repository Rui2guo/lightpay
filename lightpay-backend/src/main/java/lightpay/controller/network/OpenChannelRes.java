package lightpay.controller.network;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class OpenChannelRes {

    private String fundingTxId;

    private Integer outputIndex;

}
