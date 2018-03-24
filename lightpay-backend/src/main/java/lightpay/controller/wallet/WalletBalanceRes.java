package lightpay.controller.wallet;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class WalletBalanceRes {

    private BlockChain blockChain;

    private Channels channels;

    @Builder
    @Data
    public static class BlockChain {

        private long totalBalance;

        private long confirmedBalance;

        private long unconfirmedBalance;

    }

    @Builder
    @Data
    public static class Channels {

        private long balance;

    }

}
