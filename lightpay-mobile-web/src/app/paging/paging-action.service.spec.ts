import { TestBed, inject } from '@angular/core/testing';

import { PagingActionService } from './paging-action.service';

describe('PagingActionService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [PagingActionService]
    });
  });

  it('should be created', inject([PagingActionService], (service: PagingActionService) => {
    expect(service).toBeTruthy();
  }));
});
