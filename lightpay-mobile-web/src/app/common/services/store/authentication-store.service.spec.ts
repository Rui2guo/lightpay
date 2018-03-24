import { TestBed, inject } from '@angular/core/testing';

import { AuthenticationStoreService } from './authentication-store.service';

describe('AuthenticationStoreService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AuthenticationStoreService]
    });
  });

  it('should be created', inject([AuthenticationStoreService], (service: AuthenticationStoreService) => {
    expect(service).toBeTruthy();
  }));
});
