import { Component, OnInit } from '@angular/core';
import { PageBaseComponent } from 'app/paging/page-base.component';

@Component({
  selector: 'lp-wallet-history-detail',
  templateUrl: './wallet-history-detail.component.html',
  styleUrls: ['./wallet-history-detail.component.scss']
})
export class WalletHistoryDetailComponent extends PageBaseComponent implements OnInit {

  constructor() {
    super();
  }

  ngOnInit() {
  }

  toHistoryType(type: string): string {
    switch (type) {
      case "Send":
        return "支払い";
      case "Receive":
        return "受取り";
      case "SendCoins":
        return "ビットコイン送付";
      case "ReceiveCoins":
        return "ビットコイン受取り";
      default:
        return "";
    }
  }

  toSatoshi(msat: number): number {
    if (msat < 0) {
      return Math.ceil(msat / 1000);
    }

    return Math.floor(msat / 1000);
  }

}
