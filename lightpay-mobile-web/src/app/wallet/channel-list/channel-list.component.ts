import { Component, OnInit, OnDestroy, AfterViewInit } from '@angular/core';
import { PageBaseComponent } from 'app/paging/page-base.component';
import { NetworkAction } from '../../common/services/action/network-action';
import { DispatcherService } from 'app/common/services/dispatcher.service';
import { NetworkActionService } from 'app/common/services/action/network-action.service';
import { PagingActionService } from 'app/paging/paging-action.service';
import { Payload } from 'app/common/base/emitter';
import { _ } from 'app';
import { WalletComponent } from '../wallet.component';
import { ChannelDetailComponent } from './channel-detail/channel-detail.component';
import { PagingAction } from 'app/paging/paging-action';
import { OpenChannelComponent } from './open-channel/open-channel.component';

@Component({
  selector: 'lp-channel-list',
  templateUrl: './channel-list.component.html',
  styleUrls: ['./channel-list.component.scss']
})
export class ChannelListComponent extends PageBaseComponent implements OnInit, AfterViewInit, OnDestroy {

  static readonly PAGING_NAME: string = "channel-list";
  pagingName: string = ChannelListComponent.PAGING_NAME;

  channels: NetworkAction.Channel[] = [];

  private registerId: string;

  emitId: string = null;

  displayDetailPaging: boolean = false;

  displayNewChannelPaging: boolean = false;

  isSelectedOpen: boolean = true;
  isSelectedPending: boolean = false;

  constructor(
    private dispatcherService: DispatcherService,
    private networkActionService: NetworkActionService,
    private pagingActionService: PagingActionService
  ) {
    super();
  }

  ngOnInit() {
    this.registerId = this.dispatcherService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case NetworkActionService.LIST_CHANNELS_EVENT:
            this.updateChannels(payload);
            break;
        }
      }
    );
  }

  ngAfterViewInit() {
    this.emitId = this.networkActionService.listChannels();
  }

  ngOnDestroy() {
    this.dispatcherService.unregister(this.registerId);
  }

  private updateChannels(payload: Payload) {
    if (_.isEmpty(payload.emitId) || payload.emitId !== this.emitId) {
      return;
    }

    this.channels = (<NetworkAction.ListChannels>payload.data).channels;
    this.emitId = null;
  }

  close() {
    this.dispatcherService.emit({ eventType: WalletComponent.CLOSE_CHANNEL_LIST_PAGE_EVENT });
  }

  onClickRow(channel: NetworkAction.Channel) {
    this.displayDetailPaging = true;
    this.displayNewChannelPaging = false;
    this.pagingActionService.move(ChannelListComponent.PAGING_NAME, ChannelDetailComponent, channel, PagingAction.PageAnimation.NEXT);
  }

  closeDetailPage() {
    this.pagingActionService.move(ChannelListComponent.PAGING_NAME, null, null, PagingAction.PageAnimation.BACK, () => {
      this.displayDetailPaging = false;
      this.displayNewChannelPaging = false;
    });
  }

  calcLocalBalanceMeter(channel: NetworkAction.Channel): number {
    return Math.round(channel.localBalance / (channel.localBalance + channel.remoteBalance) * 100);
  }

  calcRemoteBalanceMeter(channel: NetworkAction.Channel): number {
    return 100 - this.calcLocalBalanceMeter(channel);
  }

  onClickOpen() {
    this.isSelectedOpen = true;
    this.isSelectedPending = false;
  }

  onClickPending() {
    this.isSelectedOpen = false;
    this.isSelectedPending = true;
  }

  openChannel() {
    this.displayDetailPaging = false;
    this.displayNewChannelPaging = true;
    this.pagingActionService.move(ChannelListComponent.PAGING_NAME, OpenChannelComponent, null, PagingAction.PageAnimation.NEXT);
  }

  closeOpenChannelPage() {
    this.pagingActionService.move(ChannelListComponent.PAGING_NAME, null, null, PagingAction.PageAnimation.BACK, () => {
      this.displayDetailPaging = false;
      this.displayNewChannelPaging = false;
    });
  }

}
