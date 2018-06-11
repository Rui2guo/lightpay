package lightpay.controller.network;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CloseChannelRes {

    private String txId;

    private Integer outputIndex;

}
