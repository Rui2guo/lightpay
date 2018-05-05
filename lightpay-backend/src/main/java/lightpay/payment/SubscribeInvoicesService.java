package lightpay.service.payment;

import javax.annotation.PostConstruct;

import org.apache.commons.codec.binary.Hex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;

import io.grpc.stub.StreamObserver;
import lightpay.lnd.LndStub;
import lightpay.lnd.grpc.Invoice;
import lightpay.lnd.grpc.InvoiceSubscription;
import lightpay.websocket.LightPayWebSocket;
import lightpay.websocket.Message;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SubscribeInvoicesService {

    public static final String MESSAGE_TYPE = "SubscribeInvoices";

    @Autowired
    private LndStub lndStub;

    @Autowired
    private LightPayWebSocket lightPayWebSocket;

    @PostConstruct
    private void init() {
        connect();
    }

    private void connect() {
        lndStub.getInstance().subscribeInvoices(InvoiceSubscription.newBuilder().build(), new StreamObserver<Invoice>() {

            @Override
            public void onNext(Invoice value) {
                lightpay.service.payment.Invoice invoice = new lightpay.service.payment.Invoice();
                invoice.setMemo(value.getMemo());
                invoice.setReceipt(Hex.encodeHexString(value.getReceipt().toByteArray()));
                invoice.setRPreimage(Hex.encodeHexString(value.getRPreimage().toByteArray()));
                invoice.setRHash(Hex.encodeHexString(value.getRHash().toByteArray()));
                invoice.setValue(value.getValue());
                invoice.setSettled(value.getSettled());
                invoice.setCreationDate(value.getCreationDate());
                invoice.setSettleDate(value.getSettleDate());
                invoice.setPaymentRequest(value.getPaymentRequest());
                invoice.setDescriptionHash(Hex.encodeHexString(value.getDescriptionHash().toByteArray()));
                invoice.setExpiry(value.getExpiry());
                invoice.setFallbackAddr(value.getFallbackAddr());
                invoice.setCltvExpiry(value.getCltvExpiry());

                Message message = new Message();
                message.setMessageType(MESSAGE_TYPE);
                message.setBody(invoice);

                try {
                    lightPayWebSocket.broadcastJson(message);
                } catch (JsonProcessingException e) {
                    log.warn("JsonProcessingException !", e);
                }
            }

            @Override
            public void onError(Throwable t) {
                log.warn("subscribeInvoices error.", t);
            }

            @Override
            public void onCompleted() {
                log.error("subscribeInvoices is completed.");
            }
        });

        log.info("subscribeInvoices has been started.");
    }

}
