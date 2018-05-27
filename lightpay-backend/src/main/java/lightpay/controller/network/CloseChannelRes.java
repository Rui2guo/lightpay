package lightpay.controller.network;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CloseChannelRes {

    private String fundingTxId;

    private Integer outputIndex;

}
