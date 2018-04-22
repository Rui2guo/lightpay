import { Component, OnInit, AfterViewInit, ViewChild, OnDestroy } from '@angular/core';
import { PagingActionService } from '../paging/paging-action.service';
import { PaymentComponent } from './payment/payment.component';
import { AccountComponent } from './account/account.component';
import { ReceivingComponent } from './receiving/receiving.component';
import { DispatcherService } from '../common/services/dispatcher.service';
import { _ } from 'app';
import { Payload } from 'app/common/base/emitter';
import { ReceiveCoinComponent } from './receive-coin/receive-coin.component';
import { PagingAction } from 'app/paging/paging-action';

@Component({
  selector: 'lp-wallet',
  templateUrl: './wallet.component.html',
  styleUrls: ['./wallet.component.scss']
})
export class WalletComponent implements OnInit, AfterViewInit, OnDestroy {

  static readonly EVENT_PREFIX: string = "WalletComponent.";
  static readonly SELECT_PAGE_EVENT: string = WalletComponent.EVENT_PREFIX + "select-page";
  static readonly MOVE_RECEIVE_COIN_PAGE_EVENT: string = WalletComponent.EVENT_PREFIX + "move-receive-coin-page-event";
  static readonly CLOSE_RECEIVE_COIN_PAGE_EVENT: string = WalletComponent.EVENT_PREFIX + "close-receive-coin-page-event";

  static readonly PAGING_NAME: string = "wallet";
  pagingName: string = WalletComponent.PAGING_NAME;

  @ViewChild(ReceivingComponent)
  receivingComponent: ReceivingComponent;

  @ViewChild(PaymentComponent)
  paymentComponent: PaymentComponent;

  @ViewChild(AccountComponent)
  accountComponent: AccountComponent;

  pageNameAccount: string = AccountComponent.PAGE_NAME;
  pageNamePayment: string = PaymentComponent.PAGE_NAME;
  pageNameReceiving: string = ReceivingComponent.PAGE_NAME;

  currentPage: string;

  displayPaging: boolean;

  private registerId: string;

  constructor(
    private dispatcherService: DispatcherService,
    private pagingActionService: PagingActionService
  ) { }

  ngOnInit() {
    this.registerId = this.dispatcherService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case WalletComponent.MOVE_RECEIVE_COIN_PAGE_EVENT:
            this.moveReceiveCoinPage();
            break;
          case WalletComponent.CLOSE_RECEIVE_COIN_PAGE_EVENT:
            this.closeReceiveCoinPage();
            break;
        }
      }
    );
  }

  ngOnDestroy() {
    this.dispatcherService.unregister(this.registerId);
  }

  ngAfterViewInit() {
    _.defer(() => {
      this.selectAccount();
    });
  }

  selectAccount() {
    this.currentPage = AccountComponent.PAGE_NAME;
    this.dispatcherService.emit({
      eventType: WalletComponent.SELECT_PAGE_EVENT,
      data: this.currentPage
    });
  }

  selectPayment() {
    this.currentPage = PaymentComponent.PAGE_NAME;
    this.dispatcherService.emit({
      eventType: WalletComponent.SELECT_PAGE_EVENT,
      data: this.currentPage
    });
  }

  selectReceiving() {
    this.currentPage = ReceivingComponent.PAGE_NAME;
    this.dispatcherService.emit({
      eventType: WalletComponent.SELECT_PAGE_EVENT,
      data: this.currentPage
    });
  }

  private moveReceiveCoinPage() {
    this.displayPaging = true;
    this.pagingActionService.move(WalletComponent.PAGING_NAME, ReceiveCoinComponent, null, PagingAction.PageAnimation.NEXT);
  }

  private closeReceiveCoinPage() {
    this.displayPaging = false;
    this.pagingActionService.clear(WalletComponent.PAGING_NAME);
  }

}
