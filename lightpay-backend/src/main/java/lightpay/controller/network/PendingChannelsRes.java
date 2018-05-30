package lightpay.controller.network;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PendingChannelsRes {

    private Long totalLimboBalance;

    private List<PendingOpenChannel> pendingOpenChannels;

    private List<ClosedChannel> pendingClosingChannels;

    private List<ForceClosedChannel> pendingForceClosingChannels;

    @Builder
    @Data
    public static class PendingChannel {

        private String remoteNodePub;

        private String channelPoint;

        private Long capacity;

        private Long localBalance;

        private Long remoteBalance;

    }

    @Builder
    @Data
    public static class PendingOpenChannel {

        private PendingChannel channel;

        private Integer confirmationHeight;

        private Long commitFee;

        private Long commitWeight;

        private Long feePerKw;

    }

    @Builder
    @Data
    public static class ClosedChannel {

        private PendingChannel channel;

        private String closingTxid;

    }

    @Builder
    @Data
    public static class ForceClosedChannel {

        private PendingChannel channel;

        private String closingTxid;

        private Long limboBalance;

        private Integer maturityHeight;

        private Integer blocksTilMaturity;

        private Long recoveredBalance;

        private List<PendingHTLC> pendingHTLCs;

    }


    @Builder
    @Data
    public static class PendingHTLC {

        private Boolean incoming;

        private Long amount;

        private String outpoint;

        private Integer maturityHeight;

        private Integer blocksTilMaturity;

        private Integer stage;

    }

}
