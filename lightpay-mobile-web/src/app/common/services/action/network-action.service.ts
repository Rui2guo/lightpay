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

}
