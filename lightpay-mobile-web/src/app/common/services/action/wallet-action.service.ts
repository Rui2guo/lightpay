import { Injectable } from '@angular/core';
import { Response } from "@angular/http";
import { DispatcherService } from '../dispatcher.service';
import { ApiService } from '../api.service';
import { WalletAction } from './wallet-action';
import { UUID } from 'app/common/utils/uuid';

@Injectable()
export class WalletActionService {

  static EVENT_PREFIX: string = "WalletActionService.";
  static GET_BALANCE_EVENT: string = WalletActionService.EVENT_PREFIX + "get-balance";

  constructor(
    private dispatcherService: DispatcherService,
    private apiService: ApiService
  ) { }

  getBalance(): string {
    var emitId: string = UUID.v4();
    this.apiService.get("/api/wallet/balance", {}).subscribe(
      (res: Response) => {
        var json: WalletAction.Balance = res.json();
        this.dispatcherService.emit({
          eventType: WalletActionService.GET_BALANCE_EVENT,
          data: json,
          emitId: emitId
        });
      },
      (error: Response) => {
        console.log("getBalance error");
      }
    );
    return emitId;
  }

}
