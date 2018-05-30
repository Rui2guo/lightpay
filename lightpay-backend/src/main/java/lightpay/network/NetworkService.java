package lightpay.network;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Hex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lightpay.controller.network.CloseChannelRes;
import lightpay.controller.network.ListChannelsRes;
import lightpay.controller.network.ListChannelsRes.Channel;
import lightpay.controller.network.ListChannelsRes.Channel.HTLC;
import lightpay.controller.network.PendingChannelsRes;
import lightpay.controller.network.PendingChannelsRes.ClosedChannel;
import lightpay.controller.network.PendingChannelsRes.ForceClosedChannel;
import lightpay.controller.network.PendingChannelsRes.PendingChannel;
import lightpay.controller.network.PendingChannelsRes.PendingHTLC;
import lightpay.controller.network.PendingChannelsRes.PendingOpenChannel;
import lightpay.lnd.LndBlockingStub;
import lightpay.lnd.grpc.ChannelPoint;
import lightpay.lnd.grpc.CloseChannelRequest;
import lightpay.lnd.grpc.ListChannelsRequest;
import lightpay.lnd.grpc.ListChannelsResponse;
import lightpay.lnd.grpc.PendingChannelsRequest;
import lightpay.lnd.grpc.PendingChannelsResponse;

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

    public PendingChannelsRes getPendingChannels() {
        PendingChannelsRequest request = PendingChannelsRequest.newBuilder()
            .build();

        PendingChannelsResponse response = lndBlockingStub.getInstance().pendingChannels(request);

        List<PendingOpenChannel> pendingOpenChannels = new ArrayList<>();
        for (lightpay.lnd.grpc.PendingChannelsResponse.PendingOpenChannel poc : response.getPendingOpenChannelsList()) {
            PendingChannel pendingChannel = PendingChannel.builder()
                .remoteNodePub(poc.getChannel().getRemoteNodePub())
                .channelPoint(poc.getChannel().getChannelPoint())
                .capacity(poc.getChannel().getCapacity())
                .localBalance(poc.getChannel().getLocalBalance())
                .remoteBalance(poc.getChannel().getRemoteBalance())
                .build();
            PendingOpenChannel pendingOpenChannel = PendingOpenChannel.builder()
                .channel(pendingChannel)
                .confirmationHeight(poc.getConfirmationHeight())
                .commitFee(poc.getCommitFee())
                .commitWeight(poc.getCommitWeight())
                .feePerKw(poc.getFeePerKw())
                .build();
            pendingOpenChannels.add(pendingOpenChannel);
        }

        List<ClosedChannel> pendingClosingChannels = new ArrayList<>();
        for (lightpay.lnd.grpc.PendingChannelsResponse.ClosedChannel cc : response.getPendingClosingChannelsList()) {
            PendingChannel pendingChannel = PendingChannel.builder()
                .remoteNodePub(cc.getChannel().getRemoteNodePub())
                .channelPoint(cc.getChannel().getChannelPoint())
                .capacity(cc.getChannel().getCapacity())
                .localBalance(cc.getChannel().getLocalBalance())
                .remoteBalance(cc.getChannel().getRemoteBalance())
                .build();
            ClosedChannel closedChannel = ClosedChannel.builder()
                .channel(pendingChannel)
                .closingTxid(cc.getClosingTxid())
                .build();
            pendingClosingChannels.add(closedChannel);
        }

        List<ForceClosedChannel> pendingForceClosingChannels = new ArrayList<>();
        for (lightpay.lnd.grpc.PendingChannelsResponse.ForceClosedChannel fcc : response.getPendingForceClosingChannelsList()) {
            PendingChannel pendingChannel = PendingChannel.builder()
                .remoteNodePub(fcc.getChannel().getRemoteNodePub())
                .channelPoint(fcc.getChannel().getChannelPoint())
                .capacity(fcc.getChannel().getCapacity())
                .localBalance(fcc.getChannel().getLocalBalance())
                .remoteBalance(fcc.getChannel().getRemoteBalance())
                .build();
            List<PendingHTLC> pendingHTLCs = new ArrayList<>();
            for (lightpay.lnd.grpc.PendingHTLC phtlc : fcc.getPendingHtlcsList()) {
                PendingHTLC pendingHTLC = PendingHTLC.builder()
                    .incoming(phtlc.getIncoming())
                    .amount(phtlc.getAmount())
                    .outpoint(phtlc.getOutpoint())
                    .maturityHeight(phtlc.getMaturityHeight())
                    .blocksTilMaturity(phtlc.getBlocksTilMaturity())
                    .stage(phtlc.getStage())
                    .build();
                pendingHTLCs.add(pendingHTLC);
            }
            ForceClosedChannel forceClosedChannel = ForceClosedChannel.builder()
                .channel(pendingChannel)
                .closingTxid(fcc.getClosingTxid())
                .limboBalance(fcc.getLimboBalance())
                .maturityHeight(fcc.getMaturityHeight())
                .blocksTilMaturity(fcc.getBlocksTilMaturity())
                .recoveredBalance(fcc.getRecoveredBalance())
                .pendingHTLCs(pendingHTLCs)
                .build();
            pendingForceClosingChannels.add(forceClosedChannel);
        }

        return PendingChannelsRes.builder()
            .pendingOpenChannels(pendingOpenChannels)
            .pendingClosingChannels(pendingClosingChannels)
            .pendingForceClosingChannels(pendingForceClosingChannels)
            .totalLimboBalance(response.getTotalLimboBalance())
            .build();
    }

    public CloseChannelRes closeChannel(String fundingTxId, int outputIndex) {
        ChannelPoint channelPoint = ChannelPoint.newBuilder()
            .setFundingTxidStr(fundingTxId)
            .setOutputIndex(outputIndex)
            .build();

        CloseChannelRequest request = CloseChannelRequest.newBuilder()
            .setChannelPoint(channelPoint)
            .build();

        lndBlockingStub.getInstance().closeChannel(request);

        return CloseChannelRes.builder()
            .fundingTxId(fundingTxId)
            .outputIndex(outputIndex)
            .build();
    }

}
