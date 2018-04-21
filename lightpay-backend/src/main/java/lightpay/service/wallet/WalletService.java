package lightpay.service.wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lightpay.controller.wallet.WalletBalanceRes;
import lightpay.lnd.LndBlockingStub;
import lightpay.lnd.grpc.ChannelBalanceRequest;
import lightpay.lnd.grpc.ChannelBalanceResponse;
import lightpay.lnd.grpc.WalletBalanceRequest;
import lightpay.lnd.grpc.WalletBalanceResponse;

@Service
public class WalletService {

    @Autowired
    private LndBlockingStub lndBlockingStub;

    public WalletBalanceRes getWalletBalance() {
        WalletBalanceRequest walletBalanceRequest = WalletBalanceRequest.newBuilder()
            .build();

        WalletBalanceResponse walletBalanceResponse = lndBlockingStub.getInstance()
            .walletBalance(walletBalanceRequest);

        ChannelBalanceRequest channelBalanceRequest = ChannelBalanceRequest.newBuilder()
            .build();

        ChannelBalanceResponse channelBalanceResponse = lndBlockingStub.getInstance()
            .channelBalance(channelBalanceRequest);

        WalletBalanceRes.BlockChain blockChain = WalletBalanceRes.BlockChain.builder()
            .totalBalance(walletBalanceResponse.getTotalBalance())
            .confirmedBalance(walletBalanceResponse.getConfirmedBalance())
            .unconfirmedBalance(walletBalanceResponse.getUnconfirmedBalance())
            .build();

        WalletBalanceRes.Channels channels = WalletBalanceRes.Channels.builder()
            .balance(channelBalanceResponse.getBalance())
            .build();

        return WalletBalanceRes.builder()
            .blockChain(blockChain)
            .channels(channels)
            .build();
    }



}
