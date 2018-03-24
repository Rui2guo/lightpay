package lightpay.controller.payment;

import lombok.Data;

@Data
public class AddInvoiceRes {

    private String rHash;

    private String paymentRequest;

}
