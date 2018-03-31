import { Component, OnInit, AfterViewInit, OnDestroy } from '@angular/core';
import { PageBaseComponent } from 'app/paging/page-base.component';
import { DispatcherService } from '../../common/services/dispatcher.service';
import { PagingActionService } from '../../paging/paging-action.service';
import { ReadInvoiceComponent } from './read-invoice/read-invoice.component';
import { _ } from 'app';
import { Payload } from 'app/common/base/emitter';
import { WalletComponent } from '../wallet.component';
import { PagingAction } from 'app/paging/paging-action';
import { ConfirmInvoiceComponent } from './confirm-invoice/confirm-invoice.component';
import { CompletePaymentComponent } from './complete-payment/complete-payment.component';

@Component({
  selector: 'lp-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.scss']
})
export class PaymentComponent implements OnInit, AfterViewInit, OnDestroy {

  static readonly PAGE_NAME: string = "payment";

  static readonly PAGING_NAME: string = "payment";
  pagingName: string = PaymentComponent.PAGING_NAME;

  private selected: boolean = false;

  private registerId: string;

  readInvoice: boolean = false;
  confirmInvoice: boolean = false;
  completePayment: boolean = false;

  constructor(
    private dispatcherService: DispatcherService,
    private pagingActionService: PagingActionService
  ) { }

  ngOnInit() {
    this.registerId = this.dispatcherService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case WalletComponent.SELECT_PAGE_EVENT:
            this.onSelectPage(payload.data);
            break;
          case PagingActionService.MOVE_PAGE_EVENT:
            this.changeToolbar(<PagingAction.Move>payload.data);
            break;
        }
      }
    );
  }

  ngAfterViewInit() {
  }

  ngOnDestroy() {
    this.dispatcherService.unregister(this.registerId);
  }

  onSelectPage(pageName: string) {
    if (pageName === PaymentComponent.PAGE_NAME) {
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
    this.pagingActionService.move(PaymentComponent.PAGING_NAME, ReadInvoiceComponent, null, PagingAction.PageAnimation.IMMEDIATE);
  }

  private onInActive() {
    this.pagingActionService.clear(PaymentComponent.PAGING_NAME);
  }

  private changeToolbar(action: PagingAction.Move) {
    if (action.component === ReadInvoiceComponent) {
      this.readInvoice = true;
      this.confirmInvoice = false;
      this.completePayment = false;
    } else if (action.component === ConfirmInvoiceComponent) {
      this.readInvoice = false;
      this.confirmInvoice = true;
      this.completePayment = false;
    } else if (action.component === CompletePaymentComponent) {
      this.readInvoice = false;
      this.confirmInvoice = false;
      this.completePayment = true;
    }
  }

  backReadInvoice() {
    this.pagingActionService.move(PaymentComponent.PAGING_NAME, ReadInvoiceComponent, null, PagingAction.PageAnimation.BACK);
  }

}

export interface PaymentForm {
  payreq: string;
}
