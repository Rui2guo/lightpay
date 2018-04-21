package lightpay.controller.wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lightpay.service.wallet.WalletService;

@RestController
@RequestMapping("/api/wallet")
@PreAuthorize("isAuthenticated()")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @GetMapping("/balance")
    public WalletBalanceRes getWalletBalance() {
        return walletService.getWalletBalance();
    }

}