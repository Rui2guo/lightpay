import { Component, OnInit, OnDestroy } from '@angular/core';
import { PageBaseComponent } from 'app/paging/page-base.component';
import { NetworkAction } from 'app/common/services/action/network-action';
import { DispatcherService } from 'app/common/services/dispatcher.service';
import { NetworkActionService } from 'app/common/services/action/network-action.service';
import { Payload } from 'app/common/base/emitter';
import { _ } from 'app';
import { ChannelListComponent } from '../channel-list.component';

@Component({
  selector: 'lp-channel-detail',
  templateUrl: './channel-detail.component.html',
  styleUrls: ['./channel-detail.component.scss']
})
export class ChannelDetailComponent extends PageBaseComponent  implements OnInit, OnDestroy {

  closing: boolean = false;

  emitId: string = null;

  private registerId: string;

  constructor(
    private dispatcherService: DispatcherService,
    private networkActionService: NetworkActionService
  ) {
    super();
  }

  ngOnInit() {
    this.registerId = this.dispatcherService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case NetworkActionService.CLOSE_CHANNEL_EVENT:
            this.back(payload);
            break;
        }
      }
    );
  }

  ngOnDestroy() {
    this.dispatcherService.unregister(this.registerId);
  }

  closeChannel() {
    var channel: NetworkAction.Channel = (<ChannelDetailForm>this.pageData).openChannel;
    if (!channel) {
      return;
    }

    this.closing = true;
    var channelPoint: string[] = channel.channelPoint.split(":");
    this.emitId = this.networkActionService.closeChannel(channelPoint[0], Number(channelPoint[1]));
  }

  private back(payload: Payload) {
    if (_.isEmpty(payload.emitId) || payload.emitId !== this.emitId) {
      return;
    }

    this.dispatcherService.emit({ eventType: ChannelListComponent.CLOSE_CHANNEL_DETAIL_PAGE_EVENT });
  }

}

export interface ChannelDetailForm {

  openChannel?: NetworkAction.Channel;

  pendingOpenChannel?: NetworkAction.PendingOpenChannel;

  pendingClosingChannel?: NetworkAction.ClosedChannel;

  pendingForceClosingChannel?: NetworkAction.ForceClosedChannel;

}