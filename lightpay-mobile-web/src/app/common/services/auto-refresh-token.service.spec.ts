import { TestBed, inject } from '@angular/core/testing';

import { AutoRefreshTokenService } from './auto-refresh-token.service';

describe('AutoRefreshTokenService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AutoRefreshTokenService]
    });
  });

  it('should be created', inject([AutoRefreshTokenService], (service: AutoRefreshTokenService) => {
    expect(service).toBeTruthy();
  }));
});
