package lightpay.network;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Hex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lightpay.controller.network.ListChannelsRes;
import lightpay.controller.network.ListChannelsRes.Channel;
import lightpay.controller.network.ListChannelsRes.Channel.HTLC;
import lightpay.lnd.LndBlockingStub;
import lightpay.lnd.grpc.ListChannelsRequest;
import lightpay.lnd.grpc.ListChannelsResponse;

@Service
public class NetworkService {

    @Autowired
    private LndBlockingStub lndBlockingStub;

    public ListChannelsRes listChannels() {
        ListChannelsRequest request = ListChannelsRequest.newBuilder().build();

        ListChannelsResponse response = lndBlockingStub.getInstance().listChannels(request);

        List<Channel> channels = new ArrayList<>();
        for (lightpay.lnd.grpc.Channel c : response.getChannelsList()) {
            List<HTLC> hList = new ArrayList<>();
            for (lightpay.lnd.grpc.HTLC h : c.getPendingHtlcsList()) {
                HTLC htlc = HTLC.builder()
                    .incoming(h.getIncoming())
                    .amount(h.getAmount())
                    .hashLock(Hex.encodeHexString(h.getHashLock().toByteArray()))
                    .expirationHeight(h.getExpirationHeight())
                    .build();
                hList.add(htlc);
            }

            Channel channel = Channel.builder()
                .active(c.getActive())
                .remotePubkey(c.getRemotePubkey())
                .channelPoint(c.getChannelPoint())
                .chanId(c.getChanId())
                .capacity(c.getCapacity())
                .localBalance(c.getLocalBalance())
                .remoteBalance(c.getRemoteBalance())
                .commitFee(c.getCommitFee())
                .commitWeight(c.getCommitWeight())
                .feePerKw(c.getFeePerKw())
                .unsettledBalance(c.getUnsettledBalance())
                .totalSatoshisSent(c.getTotalSatoshisSent())
                .totalSatoshisReceived(c.getTotalSatoshisReceived())
                .numUpdates(c.getNumUpdates())
                .pendingHtlcs(hList)
                .csvDelay(c.getCsvDelay())
                .private_(c.getPrivate())
                .build();
            channels.add(channel);
        }

        return ListChannelsRes.builder()
            .channels(channels)
            .build();
    }

}
