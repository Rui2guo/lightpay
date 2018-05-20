package lightpay.controller.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
