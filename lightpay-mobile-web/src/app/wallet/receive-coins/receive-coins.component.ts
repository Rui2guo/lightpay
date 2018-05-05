import { Component, OnInit, ViewChild, ElementRef, AfterViewInit, OnDestroy } from '@angular/core';
import { PageBaseComponent } from 'app/paging/page-base.component';
import { DispatcherService } from '../../common/services/dispatcher.service';
import { Payload } from 'app/common/base/emitter';
import { WalletActionService } from 'app/common/services/action/wallet-action.service';
import { WalletAction } from 'app/common/services/action/wallet-action';
import { _ } from "app";
import { WalletComponent } from 'app/wallet/wallet.component';

@Component({
  selector: 'lp-receive-coins',
  templateUrl: './receive-coins.component.html',
  styleUrls: ['./receive-coins.component.scss']
})
export class ReceiveCoinsComponent extends PageBaseComponent implements OnInit, AfterViewInit, OnDestroy {

  readonly loadingName: string = "receive-coins";

  @ViewChild("addressArea")
  addressAreaRef: ElementRef;

  addressAreaEl: HTMLInputElement;

  loading: boolean = true;

  address: string = "";

  private registerId: string;

  private emitId: string;

  constructor(
    private dispatcherService: DispatcherService,
    private walletActionService: WalletActionService
  ) {
    super();
  }

  ngOnInit() {
    this.registerId = this.dispatcherService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case WalletActionService.GET_NEW_ADDRESS_EVENT:
            this.setAddress(payload);
            break;
        }
      }
    );
  }

  ngAfterViewInit(): void {
    this.addressAreaEl = this.addressAreaRef.nativeElement;
    this.emitId = this.walletActionService.getNewAddress();
  }

  ngOnDestroy() {
    this.dispatcherService.unregister(this.registerId);
  }

  private setAddress(payload: Payload) {
    if (_.isEmpty(payload.emitId) || payload.emitId !== this.emitId) {
      return;
    }

    this.address = (<WalletAction.NewAddress>payload.data).address;
    
    if (this.loading) {
      this.loading = false;
    }
  }

  close() {
    this.dispatcherService.emit({
      eventType: WalletComponent.CLOSE_RECEIVE_COINS_PAGE_EVENT
    });
  }

  copyAddress() {
    this.addressAreaEl.select();
    var result: boolean = document.execCommand("copy");
  }

}
