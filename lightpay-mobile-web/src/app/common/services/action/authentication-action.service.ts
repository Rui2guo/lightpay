import { Injectable, forwardRef, Inject } from '@angular/core';
import { Response } from "@angular/http";
import { ApiService } from 'app/common/services/api.service';
import { DispatcherService } from 'app/common/services/dispatcher.service';
import { AuthenticationAction } from './authentication-action';
import { AuthenticationStoreService } from 'app/common/services/store/authentication-store.service';
import { UUID } from 'app/common/utils/uuid';

@Injectable()
export class AuthenticationActionService {

  static EVENT_PREFIX: string = "AuthenticationActionService.";
  static LOGIN_SUCCESS_EVENT: string = AuthenticationActionService.EVENT_PREFIX + "login-success";
  static LOGIN_FAILED_EVENT: string = AuthenticationActionService.EVENT_PREFIX + "login-failed";
  static REFRESH_TOKEN_EVENT: string = AuthenticationActionService.EVENT_PREFIX + "refresh-token";
  static REFRESH_TOKEN_FAILED_EVENT: string = AuthenticationActionService.EVENT_PREFIX + "refresh-token-failed";

  constructor(
    @Inject(forwardRef(() => ApiService)) private apiService: ApiService,
    private dispatcherService: DispatcherService
  ) { }

  login(userName: string, password: string): string {
    var emitId: string = UUID.v4();
    this.apiService.post("/api/token/issue", {
      userName: userName,
      password: password
    }, null, {ignoreAuthentication: true}).subscribe(
      (res: Response) => {
        var json: AuthenticationAction.IssuedToken = res.json();
        this.dispatcherService.emit({
          eventType: AuthenticationActionService.LOGIN_SUCCESS_EVENT,
          data: json,
          emitId: emitId
        });
      },
      (error: Response) => {
        this.dispatcherService.emit({
          eventType: AuthenticationActionService.LOGIN_FAILED_EVENT
        });
      }
      );
      return emitId;
  }

  refreshToken(refreshToken: string): string {
    var emitId: string = UUID.v4();
    this.apiService.post("/api/token/refresh", {
      refreshToken: refreshToken
    }, null, {ignoreAuthentication: true}).subscribe(
      (res: Response) => {
        var json: AuthenticationAction.IssuedToken = res.json();
        this.dispatcherService.emit({
          eventType: AuthenticationActionService.REFRESH_TOKEN_EVENT,
          data: json,
          emitId
        });
      },
      (error: Response) => {
        this.dispatcherService.emit({
          eventType: AuthenticationActionService.REFRESH_TOKEN_FAILED_EVENT
        });
      }
      );
      return emitId;
  }

}
