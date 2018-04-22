import { Component, OnInit, Input, ViewChild, AfterViewInit, OnDestroy } from '@angular/core';
import { PageBaseComponent } from '../../paging/page-base.component';
import { LoadingMaskComponent } from '../../loading-mask/loading-mask.component';
import { ApiService } from '../../common/services/api.service';
import { WalletActionService } from '../../common/services/action/wallet-action.service';
import { Payload } from 'app/common/base/emitter';
import { WalletStoreService } from '../../common/services/store/wallet-store.service';
import { WalletAction } from '../../common/services/action/wallet-action';
import { DispatcherService } from '../../common/services/dispatcher.service';
import { WalletComponent } from 'app/wallet/wallet.component';

@Component({
  selector: 'lp-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.scss']
})
export class AccountComponent implements OnInit, AfterViewInit, OnDestroy {

  static readonly PAGE_NAME: string = "account";

  @ViewChild(LoadingMaskComponent)
  loadingMaskComponent: LoadingMaskComponent;

  loading: boolean = false;

  balance: WalletAction.Balance;

  private selected: boolean = false;

  private storeRegisterId: string;

  private dispatcherRegisterId: string;

  constructor(
    private walletActionService: WalletActionService,
    private walletStoreService: WalletStoreService,
    private dispatcherService: DispatcherService
  ) { }

  ngOnInit() {
    this.storeRegisterId = this.walletStoreService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case WalletStoreService.GET_BALANCE_EVENT:
            this.updateBalance();
            break;
        }
      }
    );

    this.dispatcherRegisterId = this.dispatcherService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case WalletComponent.SELECT_PAGE_EVENT:
          this.onSelectPage(payload.data);
          break;
        }
      }
    );
  }

  ngAfterViewInit() {
  }

  ngOnDestroy() {
    this.walletStoreService.unregister(this.storeRegisterId);
    this.dispatcherService.unregister(this.dispatcherRegisterId);
  }

  moveReceiveCoinPage() {
    this.dispatcherService.emit({
      eventType: WalletComponent.MOVE_RECEIVE_COIN_PAGE_EVENT
    });
  }

  private onSelectPage(pageName: string) {
    if (pageName == "account") {
      if (!this.selected) {
        this.onActive();
      }
      this.selected = true;
    } else {
      if (this.selected) {
        this.onInActive();
      }
      this.selected = false;
    }
  }

  private onActive() {
    this.loading = true;
    this.walletActionService.getBalance();
  }

  private onInActive() {
    this.loading = true;
  }

  private updateBalance() {
    this.balance = this.walletStoreService.getBalance();
    if (this.loading && this.selected) {
      this.loading = false;
    }
  }

}
