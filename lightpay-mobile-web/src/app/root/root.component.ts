import { Component, OnInit } from '@angular/core';
import { ApiService } from 'app/common/services/api.service';
import { DispatcherService } from 'app/common/services/dispatcher.service';
import { PagingActionService } from 'app/paging/paging-action.service';
import { WalletActionService } from 'app/common/services/action/wallet-action.service';
import { WalletStoreService } from 'app/common/services/store/wallet-store.service';
import { PaymentActionService } from 'app/common/services/action/payment-action.service';
import { PaymentStoreService } from 'app/common/services/store/payment-store.service';
import { WebsocketService } from '../common/services/websocket.service';
import { AuthenticationActionService } from '../common/services/action/authentication-action.service';
import { AuthenticationStoreService } from '../common/services/store/authentication-store.service';
import { AutoRefreshTokenService } from 'app/common/services/auto-refresh-token.service';

@Component({
  selector: 'lp-root',
  templateUrl: './root.component.html',
  styleUrls: ['./root.component.scss']
})
export class RootComponent implements OnInit {

  constructor(
    private apiService: ApiService,
    private websocketService: WebsocketService,
    private dispatcherService: DispatcherService,
    private pagingActionService: PagingActionService,
    private walletActionService: WalletActionService,
    private walletStoreService: WalletStoreService,
    private paymentActionService: PaymentActionService,
    private paymentStoreService: PaymentStoreService,
    private authenticationActionService: AuthenticationActionService,
    private authenticationStoreService: AuthenticationStoreService,
    private autoRefreshTokenService: AutoRefreshTokenService
  ) { }

  ngOnInit() {
  }

}
