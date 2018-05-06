package lightpay.wallet;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lightpay.controller.wallet.NewAddressRes;
import lightpay.controller.wallet.SendCoinsReq;
import lightpay.controller.wallet.SendCoinsRes;
import lightpay.controller.wallet.WalletBalanceRes;
import lightpay.history.wallet.TransactionHistory;
import lightpay.history.wallet.TransactionHistory.TransactionType;
import lightpay.history.wallet.TransactionHistoryRepository;
import lightpay.lnd.LndBlockingStub;
import lightpay.lnd.grpc.ChannelBalanceRequest;
import lightpay.lnd.grpc.ChannelBalanceResponse;
import lightpay.lnd.grpc.NewAddressRequest;
import lightpay.lnd.grpc.NewAddressRequest.AddressType;
import lightpay.lnd.grpc.NewAddressResponse;
import lightpay.lnd.grpc.SendCoinsRequest;
import lightpay.lnd.grpc.SendCoinsResponse;
import lightpay.lnd.grpc.WalletBalanceRequest;
import lightpay.lnd.grpc.WalletBalanceResponse;

@Service
public class WalletService {

    public static final AddressType DEFAULT_ADDRESS_TYPE = AddressType.NESTED_PUBKEY_HASH;

    @Autowired
    private LndBlockingStub lndBlockingStub;

    @Autowired
    private TransactionHistoryRepository transactionHistoryRepository;

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

    public NewAddressRes getNewAddress() {
        NewAddressRequest newAddressRequest = NewAddressRequest.newBuilder()
            .setType(DEFAULT_ADDRESS_TYPE)
            .build();

        NewAddressResponse newAddressResponse = lndBlockingStub.getInstance()
            .newAddress(newAddressRequest);

        return NewAddressRes.builder()
            .address(newAddressResponse.getAddress())
            .build();
    }

    public SendCoinsRes sendCoins(SendCoinsReq sendCoinsReq) {
        SendCoinsRequest sendCoinsRequest = SendCoinsRequest.newBuilder()
            .setAddr(sendCoinsReq.getAddress())
            .setAmount(sendCoinsReq.getAmount())
            .build();

        SendCoinsResponse sendCoinsResponse = lndBlockingStub.getInstance()
            .sendCoins(sendCoinsRequest);

        writePaymentHistory(sendCoinsReq, sendCoinsResponse);

        return SendCoinsRes.builder()
            .txid(sendCoinsResponse.getTxid())
            .build();
    }

    private void writePaymentHistory(SendCoinsReq sendCoinsReq, SendCoinsResponse sendCoinsResponse) {
        TransactionHistory history = new TransactionHistory();
        history.setTxHash(sendCoinsResponse.getTxid());
        history.setTransactionType(TransactionType.SendCoins);
        history.setDestAddress(sendCoinsReq.getAddress());
        history.setTimeStamp(LocalDateTime.now());

        transactionHistoryRepository.save(history);
    }

}
