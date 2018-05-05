package lightpay.controller.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lightpay.payment.PaymentService;

@RestController
@RequestMapping("/api/payment")
@PreAuthorize("isAuthenticated()")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payreq/decode/{payreq}")
    public DecodePayReqRes decodePayReq(@PathVariable("payreq") String payreq) {
        return paymentService.decodePayReq(payreq);
    }

    @PostMapping("/send")
    public SendPaymentRes send(@RequestBody SendPaymentReq request) {
        return paymentService.sendPayment(request);
    }

    @PostMapping("/addinvoice")
    public AddInvoiceRes addInvoice(@RequestBody AddInvoiceReq request) {
        return paymentService.addInvoice(request);
    }

}
