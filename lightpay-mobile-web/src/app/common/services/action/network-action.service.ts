import { Injectable } from '@angular/core';
import { Response } from "@angular/http";
import { DispatcherService } from 'app/common/services/dispatcher.service';
import { ApiService } from 'app/common/services/api.service';
import { UUID } from 'app/common/utils/uuid';
import { NetworkAction } from './network-action';

@Injectable()
export class NetworkActionService {

  static readonly EVENT_PREFIX: string = "NetworkActionService.";
  static readonly LIST_CHANNELS_EVENT: string = NetworkActionService.EVENT_PREFIX + "list-channels";
  static readonly GET_PENDING_CHANNEL_EVENT: string = NetworkActionService.EVENT_PREFIX + "get-pending-channel";
  static readonly CLOSE_CHANNEL_EVENT: string = NetworkActionService.EVENT_PREFIX + "close-channel";

  constructor(
    private dispatcherService: DispatcherService,
    private apiService: ApiService
  ) { }

  listChannels(): string {
    var emitId: string = UUID.v4();
    this.apiService.get("/api/network/listchannels", {}).subscribe(
      (res: Response) => {
        var json: NetworkAction.ListChannels = res.json();
        this.dispatcherService.emit({
          eventType: NetworkActionService.LIST_CHANNELS_EVENT,
          data: json,
          emitId: emitId
        });
      },
      (error: Response) => {
        console.log("listChannels error");
      }
    );
    return emitId;
  }

  getPendingChannels(): string {
    var emitId: string = UUID.v4();
    this.apiService.get("/api/network/pendingchannels", {}).subscribe(
      (res: Response) => {
        var json: NetworkAction.PendingChannels = res.json();
        this.dispatcherService.emit({
          eventType: NetworkActionService.GET_PENDING_CHANNEL_EVENT,
          data: json,
          emitId: emitId
        });
      },
      (error: Response) => {
        console.log("getPendingChannels error");
      }
    );
    return emitId;
  }

  closeChannel(fundingTxId: string, outputIndex: number): string {
    var emitId: string = UUID.v4();
    this.apiService.delete("/api/network/closechannel/" + fundingTxId + "/" + outputIndex.toString(), {}).subscribe(
      (res: Response) => {
        var json: NetworkAction.CloseChannel = res.json();
        this.dispatcherService.emit({
          eventType: NetworkActionService.CLOSE_CHANNEL_EVENT,
          data: json,
          emitId: emitId
        });
      },
      (error: Response) => {
        console.log("closeChannel error");
      }
    );
    return emitId;
  }

}
