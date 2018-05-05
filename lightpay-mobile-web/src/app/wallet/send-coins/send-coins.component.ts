import { Component, OnInit, AfterViewInit, OnDestroy, ViewChild, ElementRef } from '@angular/core';
import { DispatcherService } from 'app/common/services/dispatcher.service';
import { PagingActionService } from 'app/paging/paging-action.service';
import { WalletActionService } from 'app/common/services/action/wallet-action.service';
import { WalletComponent } from 'app/wallet/wallet.component';
import { Payload } from 'app/common/base/emitter';
import { _ } from 'app';
import { FormControl } from '@angular/forms';
import { Subscription } from 'rxjs';

@Component({
  selector: 'lp-send-coins',
  templateUrl: './send-coins.component.html',
  styleUrls: ['./send-coins.component.scss']
})
export class SendCoinsComponent implements OnInit, AfterViewInit, OnDestroy {

  addressFormCtrl: FormControl = new FormControl();

  @ViewChild("addressArea")
  addressAreaRef: ElementRef;

  private addressAreaEl: HTMLElement;

  numSatoshisView: number = 0;

  buttonDisabled: boolean = true;

  sending: boolean = false;

  private inputSatoshis: string = "";

  private registerId: string;

  private emitId: string;

  private changeSubscription: Subscription;

  constructor(
    private dispatcherService: DispatcherService,
    private walletActionService: WalletActionService
  ) { }

  ngOnInit() {
    this.registerId = this.dispatcherService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case WalletActionService.SEND_COINS_EVENT:
            this.sentCoins(payload);
            break;
        }
      }
    );
  }

  ngAfterViewInit() {
    this.addressAreaEl = this.addressAreaRef.nativeElement;
    this.changeSubscription = this.addressFormCtrl.valueChanges.subscribe(
      () => { 
        this.adjustTextAreaSize();
        this.onChangeForm();
      }
    );
  }

  ngOnDestroy() {
    this.dispatcherService.unregister(this.registerId);
    this.changeSubscription.unsubscribe();
  }

  private adjustTextAreaSize() {
    this.addressAreaEl.style.height = 'auto';
    this.addressAreaEl.style.height = (this.addressAreaEl.scrollHeight + 2) + 'px';
  }

  onInputNum(numStr: string) {
    if (numStr === "del") {
      this.inputSatoshis = this.inputSatoshis.substring(0, this.inputSatoshis.length - 1);
    } else {
      this.inputSatoshis = this.inputSatoshis.concat(numStr);
    }

    this.numSatoshisView = Number(this.inputSatoshis);
    if (this.numSatoshisView === 0) {
      this.inputSatoshis = "";
    }

    this.onChangeForm();
  }

  onChangeForm() {
    if (this.numSatoshisView === 0) {
      this.buttonDisabled = true;
      return;
    }
    
    if (!this.addressFormCtrl.value || _.isEmpty(this.addressFormCtrl.value.trim())) {
      this.buttonDisabled = true;
      return;
    }

    this.buttonDisabled = false;
  }

  onSubmit() {
    this.sending = true;
    this.emitId = this.walletActionService.sendCoins(this.addressFormCtrl.value.trim(), Number(this.inputSatoshis));
  }

  private sentCoins(payload: Payload) {
    if (_.isEmpty(payload.emitId) || payload.emitId !== this.emitId) {
      return;
    }

    this.close();
  }

  close() {
    this.dispatcherService.emit({
      eventType: WalletComponent.CLOSE_SEND_COINS_PAGE_EVENT
    });
  }

}
