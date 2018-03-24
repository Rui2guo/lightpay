import { TestBed, inject } from '@angular/core/testing';

import { PaymentActionService } from './payment-action.service';

describe('PaymentActionService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [PaymentActionService]
    });
  });

  it('should be created', inject([PaymentActionService], (service: PaymentActionService) => {
    expect(service).toBeTruthy();
  }));
});
