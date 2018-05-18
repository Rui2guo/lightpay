import { Component, OnInit, AfterViewInit, OnDestroy, HostBinding, HostListener } from '@angular/core';
import { PageBaseComponent } from 'app/paging/page-base.component';
import { DispatcherService } from 'app/common/services/dispatcher.service';
import { WalletComponent } from 'app/wallet/wallet.component';
import { _ } from 'app';

@Component({
  selector: 'lp-wallet-menu',
  templateUrl: './wallet-menu.component.html',
  styleUrls: ['./wallet-menu.component.scss']
})
export class WalletMenuComponent extends PageBaseComponent implements OnInit, AfterViewInit, OnDestroy {

  @HostBinding('style.background-color')
  backgroundColor: string = "rgba(0, 0, 0, 0.4)";

  sideMenuWidth: number = 220;

  sideMenuLeft: number = -220;

  constructor(
    private dispatcherService: DispatcherService
  ) {
    super();
  }

  ngOnInit() {
  }

  ngAfterViewInit() {
    _.delay(() => {
      this.sideMenuLeft = 0;
    }, 0);
  }

  ngOnDestroy() {
  }

  @HostListener('click')
  close() {
    this.sideMenuLeft = -1 * this.sideMenuWidth;

    _.delay(() => {
      this.dispatcherService.emit({
        eventType: WalletComponent.CLOSE_WALLET_MENU_EVENT
      });
    }, 200);
  }

  onClickSideMenu(event: Event) {
    event.stopPropagation();
  }

}
