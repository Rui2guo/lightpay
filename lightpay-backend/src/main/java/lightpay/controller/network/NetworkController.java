package lightpay.controller.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lightpay.network.NetworkService;

@RestController
@RequestMapping("/api/network")
public class NetworkController {

    @Autowired
    private NetworkService networkService;

    @GetMapping("/listchannels")
    public ListChannelsRes listChannels() {
        return networkService.listChannels();
    }

    @GetMapping("/pendingchannels")
    public PendingChannelsRes getPendingChannels() {
        return networkService.getPendingChannels();
    }

    @DeleteMapping("/closechannel/{fundingTxId}/{outputIndex}")
    public CloseChannelRes closeChannel(
        @PathVariable("fundingTxId") String fundingTxId,
        @PathVariable("outputIndex") int outputIndex) {
        return networkService.closeChannel(fundingTxId, outputIndex);
    }

}
