import { TestBed, inject } from '@angular/core/testing';

import { NetworkActionService } from './network-action.service';

describe('NetworkActionService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [NetworkActionService]
    });
  });

  it('should be created', inject([NetworkActionService], (service: NetworkActionService) => {
    expect(service).toBeTruthy();
  }));
});
