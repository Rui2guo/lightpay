import { Component, OnInit, OnDestroy } from '@angular/core';
import { PageBaseComponent } from '../../paging/page-base.component';
import { DispatcherService } from 'app/common/services/dispatcher.service';
import { PagingActionService } from 'app/paging/paging-action.service';
import { Payload } from 'app/common/base/emitter';
import { WalletComponent } from 'app/wallet/wallet.component';
import { InvoiceFormComponent } from './invoice-form/invoice-form.component';
import { PagingAction } from 'app/paging/paging-action';
import { OutputInvoiceComponent } from './output-invoice/output-invoice.component';

@Component({
  selector: 'lp-receiving',
  templateUrl: './receiving.component.html',
  styleUrls: ['./receiving.component.scss']
})
export class ReceivingComponent implements OnInit, OnDestroy {

  static readonly PAGE_NAME: string = "receiving";

  static readonly PAGING_NAME: string = "receiving";
  pagingName: string = ReceivingComponent.PAGING_NAME;

  invoiceForm: boolean = false;
  outputInvoice: boolean = false;

  private selected: boolean = false;

  private registerId: string;

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

  ngOnDestroy() {
    this.dispatcherService.unregister(this.registerId);
  }

  private onSelectPage(pageName: string) {
    if (pageName == ReceivingComponent.PAGE_NAME) {
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
    this.pagingActionService.move(ReceivingComponent.PAGING_NAME, InvoiceFormComponent, null, PagingAction.PageAnimation.IMMEDIATE);
  }

  private onInActive() {
    this.pagingActionService.clear(ReceivingComponent.PAGING_NAME);
  }

  private changeToolbar(action: PagingAction.Move) {
    if (action.component === InvoiceFormComponent) {
      this.invoiceForm = true;
      this.outputInvoice = false;
    } else if (action.component === OutputInvoiceComponent) {
      this.invoiceForm = false;
      this.outputInvoice = true;
    }
  }

  backInvoiceForm() {
    this.pagingActionService.move(ReceivingComponent.PAGING_NAME, InvoiceFormComponent, null, PagingAction.PageAnimation.BACK);
  }

}

export interface ReceivingForm {
  numSatoshis: number;
}
