package lightpay.payment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lightpay.controller.payment.AddInvoiceReq;
import lightpay.controller.payment.AddInvoiceRes;
import lightpay.controller.payment.DecodePayReqRes;
import lightpay.controller.payment.SendPaymentReq;
import lightpay.controller.payment.SendPaymentRes;
import lightpay.controller.payment.SendPaymentRes.Route;
import lightpay.controller.payment.SendPaymentRes.Route.Hop;
import lightpay.history.wallet.WalletHistory;
import lightpay.history.wallet.WalletHistory.Direction;
import lightpay.history.wallet.WalletHistoryRepository;
import lightpay.lnd.LndBlockingStub;
import lightpay.lnd.grpc.AddInvoiceResponse;
import lightpay.lnd.grpc.Invoice;
import lightpay.lnd.grpc.PayReq;
import lightpay.lnd.grpc.PayReqString;
import lightpay.lnd.grpc.SendRequest;
import lightpay.lnd.grpc.SendResponse;

@Service
public class PaymentService {

    @Autowired
    private LndBlockingStub lndBlockingStub;

    @Autowired
    private WalletHistoryRepository walletHistoryRepository;

    public DecodePayReqRes decodePayReq(String payreq) {
        PayReqString.Builder payreqStr = PayReqString.newBuilder();
        payreqStr.setPayReq(payreq);

        PayReq payreqResponse = lndBlockingStub.getInstance().decodePayReq(payreqStr.build());

        DecodePayReqRes response = new DecodePayReqRes();
        response.setDestination(payreqResponse.getDestination());
        response.setPaymentHash(payreqResponse.getPaymentHash());
        response.setNumSatoshis(payreqResponse.getNumSatoshis());
        response.setTimestamp(payreqResponse.getTimestamp());
        response.setExpiry(payreqResponse.getExpiry());
        response.setDescription(payreqResponse.getDescription());
        response.setDescriptionHash(payreqResponse.getDescriptionHash());
        response.setFallbackAddr(payreqResponse.getFallbackAddr());
        response.setCltvExpiry(payreqResponse.getCltvExpiry());

        return response;
    }

    public SendPaymentRes sendPayment(SendPaymentReq request) {
        SendRequest.Builder sendRequest = SendRequest.newBuilder();
        sendRequest.setPaymentRequest(request.getPaymentRequest());

        SendResponse sendResponse = lndBlockingStub.getInstance().sendPaymentSync(sendRequest.build());

        SendPaymentRes response = new SendPaymentRes();
        response.setPaymentError(sendResponse.getPaymentError());
        response.setPaymentPreimage(Hex.encodeHexString(sendResponse.getPaymentPreimage().toByteArray()));

        if (StringUtils.isNotEmpty(sendResponse.getPaymentError())) {
            return response;
        }

        Route paymentRoute = new Route();
        paymentRoute.setTotalTimeLock(sendResponse.getPaymentRoute().getTotalTimeLock());
        paymentRoute.setTotalFeesMsat(sendResponse.getPaymentRoute().getTotalFeesMsat());
        paymentRoute.setTotalAmtMsat(sendResponse.getPaymentRoute().getTotalAmtMsat());

        List<Hop> hops = new ArrayList<>();
        for (lightpay.lnd.grpc.Hop h : sendResponse.getPaymentRoute().getHopsList()) {
            Hop hop = new Hop();
            hop.setChanId(h.getChanId());
            hop.setChanCapacity(h.getChanCapacity());
            hop.setAmtToForwardMsat(h.getAmtToForwardMsat());
            hop.setFeeMsat(h.getFeeMsat());
            hop.setExpiry(h.getExpiry());
            hops.add(hop);
        }

        paymentRoute.setHops(hops);
        response.setPaymentRoute(paymentRoute);

        writePaymentHistory(request.getPaymentRequest());

        return response;
    }

    private void writePaymentHistory(String payreq) {
        DecodePayReqRes decodePayReqRes = decodePayReq(payreq);
        WalletHistory walletHistory = WalletHistory.builder()
            .direction(Direction.LightningSend)
            .destination(decodePayReqRes.getDestination())
            .value(decodePayReqRes.getNumSatoshis())
            .settleDatetime(LocalDateTime.now())
            .build();

        walletHistoryRepository.save(walletHistory);
    }

    public AddInvoiceRes addInvoice(AddInvoiceReq request) {
        Invoice.Builder invoice = Invoice.newBuilder();
        if (request.getMemo() != null) {
            invoice.setMemo(request.getMemo());
        }
        invoice.setValue(request.getValue());

        AddInvoiceResponse addInvoiceResponse = lndBlockingStub.getInstance().addInvoice(invoice.build());
        AddInvoiceRes response = new AddInvoiceRes();
        response.setRHash(Hex.encodeHexString(addInvoiceResponse.getRHash().toByteArray()));
        response.setPaymentRequest(addInvoiceResponse.getPaymentRequest());

        return response;
    }

}
