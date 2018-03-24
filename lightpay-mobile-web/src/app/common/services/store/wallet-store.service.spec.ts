import { TestBed, inject } from '@angular/core/testing';

import { WalletStoreService } from './wallet-store.service';

describe('WalletStoreService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [WalletStoreService]
    });
  });

  it('should be created', inject([WalletStoreService], (service: WalletStoreService) => {
    expect(service).toBeTruthy();
  }));
});
