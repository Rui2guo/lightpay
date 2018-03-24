import { Component, OnInit, OnDestroy } from '@angular/core';
import { AuthenticationStoreService } from '../common/services/store/authentication-store.service';
import { AuthenticationActionService } from '../common/services/action/authentication-action.service';
import { Router } from '@angular/router';
import { Payload } from 'app/common/base/emitter';

@Component({
  selector: 'lp-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.scss']
})
export class MainComponent implements OnInit, OnDestroy {

  private firstRefresh: boolean;

  private registerId: string;

  constructor(
    private router: Router,
    private authenticationStoreService: AuthenticationStoreService,
    private authenticationActionService: AuthenticationActionService
  ) { }

  ngOnInit() {
    this.registerId = this.authenticationStoreService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case AuthenticationStoreService.REFRESH_TOKEN_EVENT:
            this.onAuth(payload);
            break;
        }
      }
    );
  }

  ngAfterViewInit() {
    if (this.authenticationStoreService.isRefreshTokenAlive()) {
      this.authenticationActionService.refreshToken(this.authenticationStoreService.refreshToken);
    } else {
      this.router.navigate(['/login']);
    }
  }

  ngOnDestroy() {
    this.authenticationStoreService.unregister(this.registerId);
  }

  onAuth(payload: Payload) {
    if (this.firstRefresh) {
      return;
    }
    
    this.firstRefresh = true;
    this.router.navigate(['/']);
  }

}
