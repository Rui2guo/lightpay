import { Component, OnInit, OnDestroy, AfterViewInit } from '@angular/core';
import { PageBaseComponent } from 'app/paging/page-base.component';
import { NetworkAction } from '../../common/services/action/network-action';
import { DispatcherService } from 'app/common/services/dispatcher.service';
import { NetworkActionService } from 'app/common/services/action/network-action.service';
import { PagingActionService } from 'app/paging/paging-action.service';
import { Payload } from 'app/common/base/emitter';
import { _ } from 'app';
import { WalletComponent } from '../wallet.component';
import { ChannelDetailComponent, ChannelDetailForm } from './channel-detail/channel-detail.component';
import { PagingAction } from 'app/paging/paging-action';
import { OpenChannelComponent } from './open-channel/open-channel.component';

@Component({
  selector: 'lp-channel-list',
  templateUrl: './channel-list.component.html',
  styleUrls: ['./channel-list.component.scss']
})
export class ChannelListComponent extends PageBaseComponent implements OnInit, AfterViewInit, OnDestroy {

  static readonly EVENT_PREFIX: string = "ChannelListComponent.";
  static readonly CLOSE_CHANNEL_DETAIL_PAGE_EVENT: string = ChannelListComponent.EVENT_PREFIX + "close-channel-detail-page";

  static readonly PAGE_NAME: string = "channel-list";

  static readonly PAGING_NAME: string = "channel-list";
  pagingName: string = ChannelListComponent.PAGING_NAME;

  channels: NetworkAction.Channel[] = [];

  private registerId: string;

  emitId: string = null;

  currentPageName: string = ChannelListComponent.PAGE_NAME;

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
          case ChannelListComponent.CLOSE_CHANNEL_DETAIL_PAGE_EVENT:
            this.closeDetailPage();
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
    this.currentPageName = "channel-detail";
    var form :ChannelDetailForm = {
      openChannel: channel
    };
    this.pagingActionService.move(ChannelListComponent.PAGING_NAME, ChannelDetailComponent, form, PagingAction.PageAnimation.NEXT);
  }

  closeDetailPage() {
    this.pagingActionService.move(ChannelListComponent.PAGING_NAME, null, null, PagingAction.PageAnimation.BACK, () => {
      this.currentPageName = "channel-list";
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
    this.currentPageName = "open-channel";
    this.pagingActionService.move(ChannelListComponent.PAGING_NAME, OpenChannelComponent, null, PagingAction.PageAnimation.NEXT);
  }

  closeOpenChannelPage() {
    this.pagingActionService.move(ChannelListComponent.PAGING_NAME, null, null, PagingAction.PageAnimation.BACK, () => {
      this.currentPageName = "channel-list";
    });
  }

}
