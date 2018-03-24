import { Component, OnInit, OnDestroy } from '@angular/core';
import { AuthenticationActionService } from '../common/services/action/authentication-action.service';
import { AuthenticationStoreService } from '../common/services/store/authentication-store.service';
import { Router } from '@angular/router';
import { Payload } from 'app/common/base/emitter';

@Component({
  selector: 'lp-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit, OnDestroy {

  form: { userName: string, password: string } = {
    userName: "admin",
    password: ""
  };

  submitDisabled: boolean = false;

  private registerId: string;

  constructor(
    private router: Router,
    private authenticationActionService: AuthenticationActionService,
    private authenticationStoreService: AuthenticationStoreService
  ) { }

  ngOnInit() {
    this.registerId = this.authenticationStoreService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case AuthenticationStoreService.LOGIN_SUCCESS_EVENT:
            this.onSuccess();
            break;
          case AuthenticationStoreService.LOGIN_FAILED_EVENT:
            this.onFailed();
            break;
        }
      }
    );
  }

  ngOnDestroy() {
    this.authenticationStoreService.unregister(this.registerId);
  }

  onSubmit(event: Event) {
    event.preventDefault();
    this.submitDisabled = true;
    this.authenticationActionService.login(this.form.userName, this.form.password);
  }

  onSuccess() {
    this.router.navigate(["/"]);
  }

  onFailed() {
    this.submitDisabled = false;
  }

}
