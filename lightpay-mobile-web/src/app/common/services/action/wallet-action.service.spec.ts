import { TestBed, inject } from '@angular/core/testing';

import { WalletActionService } from './wallet-action.service';

describe('WalletActionService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [WalletActionService]
    });
  });

  it('should be created', inject([WalletActionService], (service: WalletActionService) => {
    expect(service).toBeTruthy();
  }));
});
