package lightpay.history.wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import lightpay.controller.wallet.WalletHistoryRes;

@Service
public class WalletHistoryService {

    @Autowired
    private WalletHistoryRepository walletHistoryRepository;

    public WalletHistoryRes getWalletHistory(int page, int size) {
        Page<WalletHistory> histories = walletHistoryRepository
            .findWalletHistory(
                new PageRequest(
                    page,
                    size,
                    new Sort(new Order(Sort.Direction.DESC, "id"))
                    )
                );

        return WalletHistoryRes.builder()
        .histories(histories.getContent())
        .totalPages(histories.getTotalPages())
        .totalHistories(histories.getTotalElements())
        .build();
    }

    public WalletHistoryRes getWalletHistory(int page, int size, Long firstId) {
        Page<WalletHistory> histories = walletHistoryRepository
            .findWalletHistoryByIdLessThanEqual(
                firstId,
                new PageRequest(
                    page,
                    size,
                    new Sort(new Order(Sort.Direction.DESC, "id"))
                    )
                );

        return WalletHistoryRes.builder()
        .histories(histories.getContent())
        .totalPages(histories.getTotalPages())
        .totalHistories(histories.getTotalElements())
        .build();
    }

}
