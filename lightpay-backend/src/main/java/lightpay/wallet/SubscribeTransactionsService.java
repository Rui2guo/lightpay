package lightpay.wallet;

import java.time.LocalDateTime;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.grpc.stub.StreamObserver;
import lightpay.history.wallet.TransactionHistory;
import lightpay.history.wallet.TransactionHistory.TransactionType;
import lightpay.history.wallet.TransactionHistoryRepository;
import lightpay.lnd.LndStub;
import lightpay.lnd.grpc.GetTransactionsRequest;
import lightpay.lnd.grpc.Transaction;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SubscribeTransactionsService {

    @Autowired
    private LndStub lndStub;

    @Autowired
    private TransactionHistoryRepository transactionHistoryRepository;

    @PostConstruct
    private void init() {
        connect();
    }

    private void connect() {
        lndStub.getInstance().subscribeTransactions(GetTransactionsRequest.newBuilder().build(), new StreamObserver<Transaction>() {

            @Override
            @Transactional
            public void onNext(Transaction value) {
                if (value.getNumConfirmations() == 0) {
                    return;
                }

                TransactionHistory history = transactionHistoryRepository.findOne(value.getTxHash());
                if (history == null) {
                    if (value.getAmount() <= 0) {
                        return;
                    }

                    history = new TransactionHistory();
                    history.setTxHash(value.getTxHash());
                    history.setTransactionType(TransactionType.ReceiveCoins);
                    history.setAmount(value.getAmount());
                    history.setTotalFees(value.getTotalFees());
                    history.setTimeStamp(LocalDateTime.now());

                    transactionHistoryRepository.save(history);
                    return;
                }

                history.setAmount(value.getAmount());
                history.setTotalFees(value.getTotalFees());
                if (history.getTimeStamp() == null) {
                    history.setTimeStamp(LocalDateTime.now());
                }
                transactionHistoryRepository.save(history);
            }

            @Override
            public void onError(Throwable t) {
                log.error("subscribeTransactions error.", t);
            }

            @Override
            public void onCompleted() {
                log.error("subscribeTransactions is completed.");
            }
        });

        log.info("subscribeTransactions has been started.");
    }

}
