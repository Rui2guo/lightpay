import { Component, OnInit, AfterViewInit, ViewChild } from '@angular/core';
import { PagingActionService } from '../paging/paging-action.service';
import { PaymentComponent } from './payment/payment.component';
import { BalanceComponent } from './balance/balance.component';
import { ReceivingComponent } from './receiving/receiving.component';
import { DispatcherService } from '../common/services/dispatcher.service';
import { _ } from 'app';

@Component({
  selector: 'lp-wallet',
  templateUrl: './wallet.component.html',
  styleUrls: ['./wallet.component.scss']
})
export class WalletComponent implements OnInit, AfterViewInit {

  static EVENT_PREFIX: string = "WalletComponent.";
  static SELECT_PAGE_EVENT: string = WalletComponent.EVENT_PREFIX + "select-page";

  @ViewChild(ReceivingComponent)
  receivingComponent: ReceivingComponent;

  @ViewChild(PaymentComponent)
  paymentComponent: PaymentComponent;

  @ViewChild(BalanceComponent)
  balanceComponent: BalanceComponent;

  pageNameBalance: string = BalanceComponent.PAGE_NAME;
  pageNamePayment: string = PaymentComponent.PAGE_NAME;
  pageNameReceiving: string = ReceivingComponent.PAGE_NAME;

  currentPage: string;

  constructor(
    private dispatcherService: DispatcherService
  ) { }

  ngOnInit() {
  }

  ngAfterViewInit() {
    _.defer(() => {
      this.selectBalance();
    });
  }

  selectBalance() {
    this.currentPage = BalanceComponent.PAGE_NAME;
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

}
