import { Injectable } from '@angular/core';
import { Response } from "@angular/http";
import { DispatcherService } from '../dispatcher.service';
import { ApiService } from '../api.service';
import { WalletAction } from './wallet-action';
import { UUID } from 'app/common/utils/uuid';

@Injectable()
export class WalletActionService {

  static readonly EVENT_PREFIX: string = "WalletActionService.";
  static readonly GET_BALANCE_EVENT: string = WalletActionService.EVENT_PREFIX + "get-balance";
  static readonly GET_NEW_ADDRESS_EVENT: string = WalletActionService.EVENT_PREFIX + "get-new-address";
  static readonly SEND_COINS_EVENT: string = WalletActionService.EVENT_PREFIX + "send-coins";
  static readonly GET_WALLET_HISTORY_EVENT: string = WalletActionService.EVENT_PREFIX + "get-wallet-history";

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

  getNewAddress(): string {
    var emitId: string = UUID.v4();
    this.apiService.get("/api/wallet/newaddress", {}).subscribe(
      (res: Response) => {
        var json: WalletAction.NewAddress = res.json();
        this.dispatcherService.emit({
          eventType: WalletActionService.GET_NEW_ADDRESS_EVENT,
          data: json,
          emitId: emitId
        });
      },
      (error: Response) => {
        console.log("getNewAddress error");
      }
    );
    return emitId;
  }

  sendCoins(address: string, amount: number): string {
    var emitId: string = UUID.v4();
    this.apiService.post("/api/wallet/sendcoins", {
      "address": address,
      "amount": amount
    }).subscribe(
      (res: Response) => {
        var json: WalletAction.SendCoins = res.json();
        this.dispatcherService.emit({
          eventType: WalletActionService.SEND_COINS_EVENT,
          data: json,
          emitId: emitId
        });
      },
      (error: Response) => {
        console.log("sendCoins error");
      }
    );
    return emitId;
  }

  getWalletHistory(page: number, size: number, firstId: number = null): string {
    var emitId: string = UUID.v4();

    var params;
    if (firstId === null) {
      params = {"page": page, "size": size};
    } else {
      params = {"page": page, "size": size, "firstId": firstId};
    }

    this.apiService.get("/api/wallet/history", params).subscribe(
      (res: Response) => {
        var json: WalletAction.Histories = res.json();
        this.dispatcherService.emit({
          eventType: WalletActionService.GET_WALLET_HISTORY_EVENT,
          data: json,
          emitId: emitId
        });
      },
      (error: Response) => {
        console.log("getWalletHistory error");
      }
    );
    
    return emitId;
  }

}
