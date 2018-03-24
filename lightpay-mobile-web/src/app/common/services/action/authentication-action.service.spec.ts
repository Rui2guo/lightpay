import { TestBed, inject } from '@angular/core/testing';

import { AuthenticationActionService } from './authentication-action.service';

describe('AuthenticationActionService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AuthenticationActionService]
    });
  });

  it('should be created', inject([AuthenticationActionService], (service: AuthenticationActionService) => {
    expect(service).toBeTruthy();
  }));
});
