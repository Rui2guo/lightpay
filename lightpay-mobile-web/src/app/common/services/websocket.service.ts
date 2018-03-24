import { Injectable } from '@angular/core';
import { environment } from "environments/environment";
import { DispatcherService } from 'app/common/services/dispatcher.service';
import { AuthenticationStoreService } from 'app/common/services/store/authentication-store.service';
import { Payload } from 'app/common/base/emitter';
import { _s, _ } from 'app';

@Injectable()
export class WebsocketService {

  static readonly EVENT_PREFIX: string = "WebsocketService.";
  static readonly OPEN_EVENT: string = WebsocketService.EVENT_PREFIX + "open";
  static readonly MESSAGE_EVENT: string = WebsocketService.EVENT_PREFIX + "message";
  static readonly ERROR_EVENT: string = WebsocketService.EVENT_PREFIX + "error";
  static readonly CLOSE_EVENT: string = WebsocketService.EVENT_PREFIX + "close";

  static readonly WAIT_TIME: number = 1000;

  private websocketUrl: string;

  private websocket: WebSocket;

  constructor(
    private dispatcherService: DispatcherService,
    private authenticationStoreService: AuthenticationStoreService
  ) {
    if (environment.websocketUrl) {
      this.websocketUrl = _s.trim(environment.websocketUrl, "/");
    }

    this.authenticationStoreService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case AuthenticationStoreService.LOGIN_SUCCESS_EVENT:
          case AuthenticationStoreService.REFRESH_TOKEN_EVENT:
            this.open();
            break;
        }
      }
    );
  }

  private open() {
    if (
      !this.websocketUrl || !this.authenticationStoreService.isAccessTokenAlive() ||
      this.websocket && (this.websocket.readyState == WebSocket.OPEN || this.websocket.readyState == WebSocket.CONNECTING)
    ) {
      return;
    }
    
    this.websocket = new WebSocket(this.websocketUrl + "?accessToken=" + this.authenticationStoreService.accessToken);
    this.websocket.onopen = (event: Event) => {
      this.onOpen(event);
    };
    this.websocket.onmessage = (event: MessageEvent) => {
      this.onMessage(event);
    };
    this.websocket.onerror = (event: Event) => {
      this.onError(event);
    };
    this.websocket.onclose = (event: CloseEvent) => {
      this.onClose(event);
    };
  }

  private onOpen(event: Event) {
    this.dispatcherService.emit({
      eventType: WebsocketService.OPEN_EVENT,
      data: event
    });
  }

  private onMessage(event: MessageEvent) {
    this.dispatcherService.emit({
      eventType: WebsocketService.MESSAGE_EVENT,
      data: JSON.parse(event.data)
    });
  }

  private onError(event: Event) {
    this.dispatcherService.emit({
      eventType: WebsocketService.ERROR_EVENT,
      data: event
    });
  }

  private onClose(event: CloseEvent) {
    this.dispatcherService.emit({
      eventType: WebsocketService.CLOSE_EVENT,
      data: event
    });

    _.delay(() => {
      this.open();
    }, WebsocketService.WAIT_TIME);
  }

}
