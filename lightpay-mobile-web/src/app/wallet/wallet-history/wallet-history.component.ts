import { Component, OnInit, AfterViewInit, OnDestroy, ViewChild, ElementRef } from '@angular/core';
import { DispatcherService } from 'app/common/services/dispatcher.service';
import { WalletActionService } from 'app/common/services/action/wallet-action.service';
import { WalletComponent } from 'app/wallet/wallet.component';
import { WalletAction } from '../../common/services/action/wallet-action';
import { Payload } from 'app/common/base/emitter';
import { _ } from 'app';
import { PageBaseComponent } from 'app/paging/page-base.component';
import { PagingActionService } from '../../paging/paging-action.service';
import { PagingAction } from 'app/paging/paging-action';
import { WalletHistoryDetailComponent } from './wallet-history-detail/wallet-history-detail.component';

@Component({
  selector: 'lp-wallet-history',
  templateUrl: './wallet-history.component.html',
  styleUrls: ['./wallet-history.component.scss']
})
export class WalletHistoryComponent extends PageBaseComponent implements OnInit, AfterViewInit, OnDestroy {

  static readonly PAGE_SIZE: number = 20;
  static readonly ROW_MIN_HEIGHT: number = 67;

  static readonly PAGING_NAME: string = "wallet-history";
  pagingName: string = WalletHistoryComponent.PAGING_NAME;

  @ViewChild("scrollContainer")
  scrollContainerRef: ElementRef;

  private scrollContainerEl: HTMLElement;

  histories: WalletAction.WalletHistory[] = [];

  firstHistoryId: number = null;

  currentPageNum: number = -1;

  totalPages: number = 1;

  private registerId: string;

  emitId: string = null;

  displayDetailPaging: boolean;

  constructor(
    private dispatcherService: DispatcherService,
    private walletActionService: WalletActionService,
    private pagingActionService: PagingActionService
  ) {
    super();
  }

  ngOnInit() {
    this.registerId = this.dispatcherService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case WalletActionService.GET_WALLET_HISTORY_EVENT:
            this.addHistories(payload);
            break;
        }
      }
    );
  }

  ngAfterViewInit(): void {
    this.scrollContainerEl = this.scrollContainerRef.nativeElement;
    this.loadNextPages();
  }

  ngOnDestroy(): void {
    this.dispatcherService.unregister(this.registerId);
  }

  loadNextPages() {
    if (this.emitId === null && this.totalPages > this.currentPageNum + 1) {
      this.emitId = this.walletActionService.getWalletHistory(this.currentPageNum + 1, WalletHistoryComponent.PAGE_SIZE, this.firstHistoryId);
    }
  }

  reloadHistory() {
    if (this.emitId !== null) {
      return; 
    }

    this.histories = [];
    this.firstHistoryId = null;
    this.currentPageNum = -1;
    this.totalPages = 1;

    this.loadNextPages();
  }

  onScroll(event: Event) {
    if (this.emitId !== null || this.totalPages <= this.currentPageNum + 1) {
      return;
    }
    
    var scrollTop: number = this.scrollContainerEl.scrollTop;
    var displayHeight: number = this.scrollContainerEl.offsetHeight;
    var totalHeight: number = WalletHistoryComponent.ROW_MIN_HEIGHT * this.histories.length;

    if (scrollTop + displayHeight >= totalHeight) {
      this.loadNextPages();
    }
  }

  private addHistories(payload: Payload) {
    if (_.isEmpty(payload.emitId) || payload.emitId !== this.emitId) {
      return;
    }

    var nextHistories: WalletAction.Histories = <WalletAction.Histories>payload.data;
    if (nextHistories.histories.length !== 0 && this.firstHistoryId === null) {
      this.firstHistoryId = nextHistories.histories[0].id;
    }
    this.histories = this.histories.concat(nextHistories.histories);
    this.currentPageNum += 1;
    this.totalPages = nextHistories.totalPages;
    this.emitId = null;

    if (this.totalPages <= this.currentPageNum + 1) {
      return;
    }
    var scrollTop: number = this.scrollContainerEl.scrollTop;
    var displayHeight: number = this.scrollContainerEl.offsetHeight;
    var totalHeight: number = WalletHistoryComponent.ROW_MIN_HEIGHT * this.histories.length;

    if (scrollTop + displayHeight >= totalHeight) {
      this.loadNextPages();
    }
  }

  toSatoshi(msat: number): number {
    if (msat < 0) {
      return Math.ceil(msat / 1000);
    }

    return Math.floor(msat / 1000);
  }

  close() {
    this.dispatcherService.emit({
      eventType: WalletComponent.CLOSE_WALLET_HISTORY_PAGE_EVENT
    });
  }

  onClickRow(history: WalletAction.WalletHistory) {
    this.displayDetailPaging = true;
    this.pagingActionService.move(WalletHistoryComponent.PAGING_NAME, WalletHistoryDetailComponent, history, PagingAction.PageAnimation.NEXT);
  }

  closeDetailPage() {
    this.pagingActionService.move(WalletHistoryComponent.PAGING_NAME, null, null, PagingAction.PageAnimation.BACK, () => {
      this.displayDetailPaging = false;
    });
  }

}
