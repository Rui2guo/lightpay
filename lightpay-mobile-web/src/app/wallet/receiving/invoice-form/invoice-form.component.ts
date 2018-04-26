import { Component, OnInit } from '@angular/core';
import { PagingActionService } from 'app/paging/paging-action.service';
import { ReceivingComponent, ReceivingForm } from '../receiving.component';
import { OutputInvoiceComponent } from '../output-invoice/output-invoice.component';
import { PageBaseComponent } from '../../../paging/page-base.component';
import { _s } from 'app';
import { PagingAction } from 'app/paging/paging-action';

@Component({
  selector: 'lp-invoice-form',
  templateUrl: './invoice-form.component.html',
  styleUrls: ['./invoice-form.component.scss']
})
export class InvoiceFormComponent extends PageBaseComponent implements OnInit {

  numSatoshisView: number = 0;

  buttonDisabled: boolean = true;

  private inputSatoshis: string = "";

  constructor(
    private pagingActionService: PagingActionService
  ) {
    super();
  }

  ngOnInit() {
  }

  onInputNum(numStr: string) {
    if (numStr === "del") {
      this.inputSatoshis = this.inputSatoshis.substring(0, this.inputSatoshis.length - 1);
    } else {
      this.inputSatoshis = this.inputSatoshis.concat(numStr);
    }

    this.numSatoshisView = Number(this.inputSatoshis);

    if (this.numSatoshisView == 0) {
      this.buttonDisabled = true;
      this.inputSatoshis = "";
    } else {
      this.buttonDisabled = false;
    }
  }

  onSubmit() {
    var form: ReceivingForm = {
      numSatoshis: Number(this.inputSatoshis)
    };
    this.pagingActionService.move(ReceivingComponent.PAGING_NAME, OutputInvoiceComponent, form, PagingAction.PageAnimation.NEXT);
  }

}
