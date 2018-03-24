import { Injectable, forwardRef, Inject } from '@angular/core';
import { Emitter, Payload } from 'app/common/base/emitter';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, CanActivateChild, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { DispatcherService } from 'app/common/services/dispatcher.service';
import { AuthenticationActionService } from '../action/authentication-action.service';
import { AuthenticationAction } from 'app/common/services/action/authentication-action';
import { _ } from 'app';

@Injectable()
export class AuthenticationStoreService extends Emitter<Payload> implements CanActivate, CanActivateChild {

  static readonly EVENT_PREFIX: string = "AuthenticationStoreService.";
  static readonly LOGIN_SUCCESS_EVENT: string = AuthenticationStoreService.EVENT_PREFIX + "login-success";
  static readonly LOGIN_FAILED_EVENT: string = AuthenticationStoreService.EVENT_PREFIX + "login-failed";
  static readonly REFRESH_TOKEN_EVENT: string = AuthenticationStoreService.EVENT_PREFIX + "refresh-token";
  static readonly REFRESH_TOKEN_FAILED_EVENT: string = AuthenticationStoreService.EVENT_PREFIX + "refresh-token-failed";

  static readonly UPDATE_TOKEN_MARGIN: number = 10000;

  private _accessToken: string;

  private _accessTokenExpirationTime: number;

  private _refreshToken: string;

  private _refreshTokenExpirationTime: number;

  private enableLocalStorage: boolean = false;

  constructor(
    private router: Router,
    private dispatcherService: DispatcherService
  ) {
    super();

    if (('localStorage' in window) && (window.localStorage !== null)) {
      this.enableLocalStorage = true;
    } else {
      this.enableLocalStorage = false;
    }

    this.dispatcherService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case AuthenticationActionService.LOGIN_SUCCESS_EVENT:
          case AuthenticationActionService.LOGIN_FAILED_EVENT:
            this.onLogin(<AuthenticationAction.IssuedToken>payload.data);
            break;
          case AuthenticationActionService.REFRESH_TOKEN_EVENT:
          case AuthenticationActionService.REFRESH_TOKEN_FAILED_EVENT:
            this.onRefreshToken(<AuthenticationAction.IssuedToken>payload.data);
            break;
        }
      }
    );
  }

  get accessToken(): string {
    if (!this._accessToken && this.enableLocalStorage) {
      this._accessToken = localStorage.getItem("accessToken");
    }
    return this._accessToken;
  }

  get accessTokenExpirationTime(): number {
    if (this._accessTokenExpirationTime || !this.enableLocalStorage) {
      return this._accessTokenExpirationTime;
    }

    var timeStr: string = localStorage.getItem("accessTokenExpirationTime");
    if (_.isEmpty(timeStr)) {
      return null;
    }

    var timeNum: number = Number(timeStr);
    if (!_.isFinite(timeNum)) {
      return null;
    }

    this._accessTokenExpirationTime = timeNum;
    return this._accessTokenExpirationTime;
  }

  get refreshToken(): string {
    if (!this._refreshToken && this.enableLocalStorage) {
      this._refreshToken = localStorage.getItem("refreshToken");
    }
    return this._refreshToken;
  }

  get refreshTokenExpirationTime(): number {
    if (this._refreshTokenExpirationTime || !this.enableLocalStorage) {
      return this._refreshTokenExpirationTime;
    }

    var timeStr: string = localStorage.getItem("refreshTokenExpirationTime");
    if (_.isEmpty(timeStr)) {
      return null;
    }

    var timeNum: number = Number(timeStr);
    if (!_.isFinite(timeNum)) {
      return null;
    }

    this._refreshTokenExpirationTime = timeNum;
    return this._refreshTokenExpirationTime;
  }

  set accessToken(accessToken: string) {
    this._accessToken = accessToken;
    if (!this.enableLocalStorage) {
      return;
    }
    localStorage.setItem("accessToken", accessToken);
  }

  set accessTokenExpirationTime(accessTokenExpirationTime: number) {
    this._accessTokenExpirationTime = accessTokenExpirationTime;
    if (!this.enableLocalStorage) {
      return;
    }
    localStorage.setItem("accessTokenExpirationTime", accessTokenExpirationTime.toString());
  }

  set refreshToken(refreshToken: string) {
    this._refreshToken = refreshToken;
    if (!this.enableLocalStorage) {
      return;
    }
    localStorage.setItem("refreshToken", refreshToken);
  }

  set refreshTokenExpirationTime(refreshTokenExpirationTime: number) {
    this._refreshTokenExpirationTime = refreshTokenExpirationTime;
    if (!this.enableLocalStorage) {
      return;
    }
    localStorage.setItem("refreshTokenExpirationTime", refreshTokenExpirationTime.toString());
  }

  isAccessTokenAlive(): boolean {
    if (_.isEmpty(this.accessToken)) {
      return false;
    }

    var now: number = (new Date()).getTime();
    if (now > this.accessTokenExpirationTime) {
      return false;
    } else {
      return true;
    }
  }

  isRefreshTokenAlive(): boolean {
    if (_.isEmpty(this.refreshToken)) {
      return false;
    }

    var now: number = (new Date()).getTime();
    if (now > (this.refreshTokenExpirationTime - AuthenticationStoreService.UPDATE_TOKEN_MARGIN)) {
      return false;
    } else {
      return true;
    }
  }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean | Observable<boolean> | Promise<boolean> {
    return this.isAccessTokenAlive();
  }

  canActivateChild(childRoute: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean | Observable<boolean> | Promise<boolean> {
    return this.canActivate(childRoute, state);
  }

  private updateStatus(action: AuthenticationAction.IssuedToken) {
    if (!action) {
      return;
    }

    this.accessToken = action.accessToken;
    this.accessTokenExpirationTime = action.accessTokenExpirationTime;
    this.refreshToken = action.refreshToken;
    this.refreshTokenExpirationTime = action.refreshTokenExpirationTime;
  }

  private onLogin(action: AuthenticationAction.IssuedToken) {
    if (!action) {
      this.emit({ eventType: AuthenticationStoreService.LOGIN_FAILED_EVENT });
      return;
    }

    this.updateStatus(action);
    this.emit({ eventType: AuthenticationStoreService.LOGIN_SUCCESS_EVENT });
  }

  private onRefreshToken(action: AuthenticationAction.IssuedToken) {
    if (!action) {
      this.emit({ eventType: AuthenticationStoreService.REFRESH_TOKEN_FAILED_EVENT });
      return;
    }

    this.updateStatus(action);
    this.emit({ eventType: AuthenticationStoreService.REFRESH_TOKEN_EVENT });
  }

}
