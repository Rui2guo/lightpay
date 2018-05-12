package lightpay.controller.wallet;

import java.util.List;

import lightpay.history.wallet.WalletHistory;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WalletHistoryRes {

    private List<WalletHistory> histories;

    private int totalPages;

    private long totalHistories;

}
