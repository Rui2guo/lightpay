import { Component, OnInit, AfterViewInit, ViewChild, OnDestroy } from '@angular/core';
import { PaymentActionService } from 'app/common/services/action/payment-action.service';
import { Payload } from 'app/common/base/emitter';
import { PageBaseComponent } from '../../../paging/page-base.component';
import { PaymentForm, PaymentComponent } from '../payment.component';
import { LoadingMaskComponent } from 'app/loading-mask/loading-mask.component';
import { PaymentAction } from '../../../common/services/action/payment-action';
import { DispatcherService } from '../../../common/services/dispatcher.service';
import { PagingActionService } from 'app/paging/paging-action.service';
import { CompletePaymentComponent } from '../complete-payment/complete-payment.component';
import { _ } from 'app';
import { PagingAction } from 'app/paging/paging-action';

@Component({
  selector: 'lp-confirm-invoice',
  templateUrl: './confirm-invoice.component.html',
  styleUrls: ['./confirm-invoice.component.scss']
})
export class ConfirmInvoiceComponent extends PageBaseComponent implements OnInit, AfterViewInit, OnDestroy {

  readonly loadingName: string = "confirm-invoice";

  loading: boolean = true;

  currentPayReq: PaymentAction.DecodePayReq;

  private registerId: string;

  private emitId: string;

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
          case PaymentActionService.DECODE_PAYREQ_EVENT:
            this.updateCurrentPayReq(payload);
            break;
        }
      }
    );
  }

  ngAfterViewInit() {
    this.emitId = this.paymentActionService.decodePayReq((<PaymentForm>this.pageData).payreq);
  }

  ngOnDestroy() {
    this.dispatcherService.unregister(this.registerId);
  }

  onSubmit() {
    this.pagingActionService.move(PaymentComponent.PAGING_NAME, CompletePaymentComponent, this.pageData, PagingAction.PageAnimation.NEXT);
  }

  private updateCurrentPayReq(payload: Payload) {
    if (_.isEmpty(payload.emitId) || payload.emitId !== this.emitId) {
      return;
    }

    this.currentPayReq = <PaymentAction.DecodePayReq>payload.data;
    
    if (this.loading) {
      this.loading = false;
    }
  }

}
