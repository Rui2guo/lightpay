package lightpay.history.wallet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import lightpay.controller.wallet.WalletHistoryRes;

@Service
public class WalletHistoryService {

    @Autowired
    private WalletHistoryRepository walletHistoryRepository;

    public WalletHistoryRes getWalletHistory() {
        List<WalletHistory> histories = walletHistoryRepository.findWalletHistoryByTimeStampIsNotNull(new Sort(new Order(Sort.Direction.DESC, "timeStamp")));

        return WalletHistoryRes.builder()
        .histories(histories)
        .build();
    }

}
