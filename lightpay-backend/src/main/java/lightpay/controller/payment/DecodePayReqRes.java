package lightpay.controller.payment;

import lombok.Data;

@Data
public class DecodePayReqRes {

    private String destination;

    private String paymentHash;

    private Long numSatoshis;

    private Long timestamp;

    private Long expiry;

    private String description;

    private String descriptionHash;

    private String fallbackAddr;

    private Long cltvExpiry;

}
