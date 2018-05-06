package lightpay.controller.wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lightpay.history.wallet.WalletHistoryService;
import lightpay.wallet.WalletService;

@RestController
@RequestMapping("/api/wallet")
//@PreAuthorize("isAuthenticated()")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @Autowired
    private WalletHistoryService walletHistoryService;

    @GetMapping("/balance")
    public WalletBalanceRes getWalletBalance() {
        return walletService.getWalletBalance();
    }

    @GetMapping("/newaddress")
    public NewAddressRes getNewAddress() {
        return walletService.getNewAddress();
    }

    @PostMapping("/sendcoins")
    public SendCoinsRes sendCoins(@RequestBody SendCoinsReq sendCoinsReq) {
        return walletService.sendCoins(sendCoinsReq);
    }

    @GetMapping("/history")
    public WalletHistoryRes getWalletHistory() {
        return walletHistoryService.getWalletHistory();
    }

}
