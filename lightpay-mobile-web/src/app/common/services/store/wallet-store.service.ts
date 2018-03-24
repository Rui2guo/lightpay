import { Injectable } from '@angular/core';
import { Payload, Emitter } from 'app/common/base/emitter';
import { DispatcherService } from '../dispatcher.service';
import { WalletActionService } from '../action/wallet-action.service';
import { WalletAction } from '../action/wallet-action';
import { _ } from 'app';

@Injectable()
export class WalletStoreService extends Emitter<Payload> {

  static EVENT_PREFIX: string = "WalletStoreService.";
  static GET_BALANCE_EVENT: string = WalletStoreService.EVENT_PREFIX + "get-balance";

  private balance: WalletAction.Balance;

  constructor(
    private dispatcherService: DispatcherService
  ) {
    super();
    this.dispatcherService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case WalletActionService.GET_BALANCE_EVENT:
            this.updateBalance(<WalletAction.Balance>payload.data);
            break;
        }
      }
    );
  }

  getBalance(): WalletAction.Balance {
    return _.cloneDeep(this.balance);
  }

  private updateBalance(action: WalletAction.Balance) {
    this.balance = action;
    this.emit({ eventType: WalletStoreService.GET_BALANCE_EVENT });
  }

}
