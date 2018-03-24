import { TestBed, inject } from '@angular/core/testing';

import { PaymentStoreService } from './payment-store.service';

describe('PaymentStoreService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [PaymentStoreService]
    });
  });

  it('should be created', inject([PaymentStoreService], (service: PaymentStoreService) => {
    expect(service).toBeTruthy();
  }));
});
