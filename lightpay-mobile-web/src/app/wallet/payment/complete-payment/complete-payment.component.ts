import { Component, OnInit, OnDestroy } from '@angular/core';
import { PaymentActionService } from '../../../common/services/action/payment-action.service';
import { PagingActionService } from 'app/paging/paging-action.service';
import { DispatcherService } from 'app/common/services/dispatcher.service';
import { PageBaseComponent } from '../../../paging/page-base.component';
import { Payload } from 'app/common/base/emitter';
import { PaymentAction } from 'app/common/services/action/payment-action';
import { PaymentForm, PaymentComponent } from 'app/wallet/payment/payment.component';
import { ReadInvoiceComponent } from '../read-invoice/read-invoice.component';
import { _ } from 'app';
import { PagingAction } from 'app/paging/paging-action';

@Component({
  selector: 'lp-complete-payment',
  templateUrl: './complete-payment.component.html',
  styleUrls: ['./complete-payment.component.scss'],
})
export class CompletePaymentComponent extends PageBaseComponent implements OnInit, OnDestroy {

  readonly loadingName: string = "complete-payment";

  loading: boolean = true;

  checkAnimation: boolean = false;

  private registerId: string;

  private emitId: string;

  private compSound: HTMLAudioElement;

  constructor(
    private paymentActionService: PaymentActionService,
    private pagingActionService: PagingActionService,
    private dispatcherService: DispatcherService
  ) {
    super();
  }

  ngOnInit() {
    this.registerId = this.dispatcherService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case PaymentActionService.SEND_PAYMENT_EVENT:
            this.onCompletePayment(payload);
            break;
        }
      }
    );
  }

  ngAfterViewInit() {
    this.compSound = new Audio("../../../../assets/sound/payment-complete.mp3");
    this.compSound.load();
    this.emitId = this.paymentActionService.sendPayment((<PaymentForm>this.pageData).payreq);
  }

  ngOnDestroy() {
    this.dispatcherService.unregister(this.registerId);
  }

  backReadQR() {
    this.pagingActionService.move(PaymentComponent.PAGING_NAME, ReadInvoiceComponent, null, PagingAction.PageAnimation.BACK);
  }

  private onCompletePayment(payload: Payload) {
    if (_.isEmpty(payload.emitId) || payload.emitId !== this.emitId) {
      return;
    }

    if (this.loading) {
      this.loading = false;
    }
    this.checkAnimation = true;
    this.compSound.currentTime = 0;
    this.compSound.play();
  }

}
