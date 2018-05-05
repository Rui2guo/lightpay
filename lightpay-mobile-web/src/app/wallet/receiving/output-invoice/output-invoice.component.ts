import { Component, OnInit, AfterViewInit, OnDestroy } from '@angular/core';
import { PageBaseComponent } from '../../../paging/page-base.component';
import { DispatcherService } from '../../../common/services/dispatcher.service';
import { Payload } from 'app/common/base/emitter';
import { PaymentActionService } from 'app/common/services/action/payment-action.service';
import { PaymentAction } from '../../../common/services/action/payment-action';
import { ReceivingForm, ReceivingComponent } from '../receiving.component';
import { WebsocketService } from '../../../common/services/websocket.service';
import { Message, Invoice, MessageType } from 'app/common/services/websocket-message';
import { PagingActionService } from '../../../paging/paging-action.service';
import { InvoiceFormComponent } from '../invoice-form/invoice-form.component';
import { _ } from 'app';
import { PagingAction } from '../../../paging/paging-action';

@Component({
  selector: 'lp-output-invoice',
  templateUrl: './output-invoice.component.html',
  styleUrls: ['./output-invoice.component.scss']
})
export class OutputInvoiceComponent extends PageBaseComponent implements OnInit, AfterViewInit, OnDestroy {

  readonly loadingName: string = "output-invoice";

  loading: boolean = true;

  received: boolean = false;

  checkAnimation: boolean = false;

  paymentRequest: string;

  private registerId: string;

  private emitId: string;

  private compSound: HTMLAudioElement;

  constructor(
    private dispatcherService: DispatcherService,
    private paymentActionService: PaymentActionService,
    private pagingActionService: PagingActionService
  ) {
    super();
  }

  ngOnInit() {
    this.registerId = this.dispatcherService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case PaymentActionService.ADD_INVOICE_EVENT:
            this.updateInvoice(payload);
            break;
          case WebsocketService.MESSAGE_EVENT:
            this.onMessage(<Message>payload.data);
            break;
        }
      }
    );
  }

  ngAfterViewInit() {
    this.compSound = new Audio("../../../../assets/sound/payment-complete.mp3");
    this.compSound.load();
    this.emitId = this.paymentActionService.addInvoice((<ReceivingForm>this.pageData).numSatoshis, null);
  }

  ngOnDestroy() {
    this.dispatcherService.unregister(this.registerId);
  }

  private updateInvoice(payload: Payload) {
    if (_.isEmpty(payload.emitId) || payload.emitId !== this.emitId) {
      return;
    }
    
    this.paymentRequest = (<PaymentAction.AddInvoice>payload.data).paymentRequest;
    
    if (this.loading) {
      this.loading = false;
    }
  }

  private onMessage(message: Message) {
    if (message.messageType !== MessageType.SubscribeInvoices) {
      return;
    }

    var invoice: Invoice = <Invoice>message.body;
    if (invoice.paymentRequest === this.paymentRequest && invoice.settled) {
      this.received = true;
      _.delay(() => {
        this.checkAnimation = true;
        this.compSound.currentTime = 0;
        this.compSound.play();
      }, 100);
    }
  }

  backInvoiceForm() {
    this.pagingActionService.move(ReceivingComponent.PAGING_NAME, InvoiceFormComponent, null, PagingAction.PageAnimation.BACK);
  }

}
