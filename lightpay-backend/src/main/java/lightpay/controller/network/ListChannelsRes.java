package lightpay.controller.network;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ListChannelsRes {

    private List<Channel> channels;

    @Builder
    @Data
    public static class Channel {

        private Boolean active;

        private String remotePubkey;

        private String channelPoint;

        private Long chanId;

        private Long capacity;

        private Long localBalance;

        private Long remoteBalance;

        private Long commitFee;

        private Long commitWeight;

        private Long feePerKw;

        private Long unsettledBalance;

        private Long totalSatoshisSent;

        private Long totalSatoshisReceived;

        private Long numUpdates;

        private List<HTLC> pendingHtlcs;

        private Integer csvDelay;

        @JsonProperty("private")
        private Boolean private_;

        @Builder
        @Data
        public static class HTLC {

            private Boolean incoming;

            private Long amount;

            private String hashLock;

            private Integer expirationHeight;

        }

    }

}
