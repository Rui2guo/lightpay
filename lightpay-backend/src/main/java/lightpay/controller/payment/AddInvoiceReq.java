package lightpay.controller.payment;

import lombok.Data;

@Data
public class AddInvoiceReq {

    private String memo;

    private Long value;

}
