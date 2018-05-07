package lightpay.wallet;

import java.time.LocalDateTime;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.grpc.stub.StreamObserver;
import lightpay.history.wallet.TransactionHistory;
import lightpay.history.wallet.TransactionHistory.TransactionType;
import lightpay.history.wallet.WalletHistory;
import lightpay.history.wallet.WalletHistoryRepository;
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
    private WalletHistoryRepository walletHistoryRepository;

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

                WalletHistory walletHistory = walletHistoryRepository.findWalletHistoryByTxHash(value.getTxHash());
                TransactionHistory transactionHistory;
                if (walletHistory != null
                    && value.getBlockHash().equals(walletHistory.getTransactionHistory().getBlockHash())) {
                    return;
                } else if (walletHistory == null) {
                    walletHistory = new WalletHistory();
                    transactionHistory = new TransactionHistory();
                    transactionHistory.setTxHash(value.getTxHash());
                    walletHistory.setTransactionHistory(transactionHistory);
                }

                transactionHistory = walletHistory.getTransactionHistory();
                transactionHistory.setBlockHash(value.getBlockHash());
                if (value.getAmount() <= 0) {
                    transactionHistory.setTransactionType(TransactionType.SendCoins);
                } else {
                    transactionHistory.setTransactionType(TransactionType.ReceiveCoins);
                }
                transactionHistory.setAmount(value.getAmount());
                transactionHistory.setTotalFees(value.getTotalFees());
                walletHistory.setTimeStamp(LocalDateTime.now());

                walletHistoryRepository.save(walletHistory);
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
