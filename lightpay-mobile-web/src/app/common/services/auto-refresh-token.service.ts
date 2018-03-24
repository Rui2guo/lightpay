import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { DispatcherService } from 'app/common/services/dispatcher.service';
import { Payload } from 'app/common/base/emitter';
import { AuthenticationStoreService } from 'app/common/services/store/authentication-store.service';
import { AuthenticationActionService } from 'app/common/services/action/authentication-action.service';

@Injectable()
export class AutoRefreshTokenService {

  static readonly UPDATE_MARGIN: number = 30000;

  private timerId: any;

  constructor(
    private authenticationActionService: AuthenticationActionService,
    private authenticationStoreService: AuthenticationStoreService
  ) {
    this.authenticationStoreService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case AuthenticationStoreService.LOGIN_SUCCESS_EVENT:
          case AuthenticationStoreService.REFRESH_TOKEN_EVENT:
            this.setRefreshTokenCycle();
            break;
        }
      }
    );
  }

  private setRefreshTokenCycle() {
    if (this.timerId) {
      clearTimeout(this.timerId);
      this.timerId = null;
    }

    var now: number = (new Date()).getTime();
    var next: number = this.authenticationStoreService.accessTokenExpirationTime - now - AutoRefreshTokenService.UPDATE_MARGIN;
    if (next <= 0) {
      next = 0;
    }

    this.timerId = setTimeout(() => {
      this.timerId = null;
      this.authenticationActionService.refreshToken(this.authenticationStoreService.refreshToken);
    }, next);
  }

}
