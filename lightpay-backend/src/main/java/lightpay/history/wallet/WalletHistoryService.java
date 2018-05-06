package lightpay.history.wallet;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lightpay.controller.wallet.WalletHistoryRes;

@Service
public class WalletHistoryService {

    @Autowired
    private PaymentHistoryRepository paymentHistoryRepository;

    @Autowired
    private TransactionHistoryRepository transactionHistoryRepository;

    public WalletHistoryRes getWalletHistory() {
        List<WalletHistory> histories = new ArrayList<>();
        histories.addAll(paymentHistoryRepository.findAll());
        histories.addAll(transactionHistoryRepository.findByTotalFeesIsNotNull());

        histories.sort((h1, h2) -> {
            return h2.getTimeStamp().compareTo(h1.getTimeStamp());
        });

        return WalletHistoryRes.builder()
        .histories(histories)
        .build();
    }

}
