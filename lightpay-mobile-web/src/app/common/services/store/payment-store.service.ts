import { Injectable } from '@angular/core';
import { PaymentAction } from '../action/payment-action';
import { DispatcherService } from 'app/common/services/dispatcher.service';
import { Emitter, Payload } from 'app/common/base/emitter';
import { PaymentActionService } from 'app/common/services/action/payment-action.service';
import { _ } from 'app';

@Injectable()
export class PaymentStoreService extends Emitter<Payload> {

  constructor(
    private dispatcherService: DispatcherService
  ) {
    super();
    this.dispatcherService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          
        }
      }
    );
  }

}
