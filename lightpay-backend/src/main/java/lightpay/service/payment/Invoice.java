package lightpay.service.payment;

import lombok.Data;

@Data
public class Invoice {

    private String memo;

    private String receipt;

    private String rPreimage;

    private String rHash;

    private Long value;

    private Boolean settled;

    private Long creationDate;

    private Long settleDate;

    private String paymentRequest;

    private String descriptionHash;

    private Long expiry;

    private String fallbackAddr;

    private Long cltvExpiry;

}
