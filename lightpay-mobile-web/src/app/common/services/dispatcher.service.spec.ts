import { TestBed, inject } from '@angular/core/testing';

import { DispatcherService } from './dispatcher.service';

describe('DispatcherService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [DispatcherService]
    });
  });

  it('should ...', inject([DispatcherService], (service: DispatcherService) => {
    expect(service).toBeTruthy();
  }));
});
