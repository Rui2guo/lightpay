import { Injectable } from '@angular/core';
import { DispatcherService } from 'app/common/services/dispatcher.service';
import { PagingAction } from './paging-action';
import { PageBaseComponent } from 'app/paging/page-base.component';

@Injectable()
export class PagingActionService {

  static EVENT_PREFIX: string = "PagingActionService.";
  static MOVE_PAGE_EVENT: string = PagingActionService.EVENT_PREFIX + "move";
  static CLEAR_PAGE_EVENT: string = PagingActionService.EVENT_PREFIX + "clear";

  constructor(
    private dispatcherService: DispatcherService,
  ) { }

  move(pagingName: string, component: any, pageData: any, animation: PagingAction.PageAnimation, after: () => void = null) {
    var action: PagingAction.Move = {
      pagingName: pagingName,
      component: component,
      pageData: pageData,
      animation: animation,
      after: after
    }

    this.dispatcherService.emit({
      eventType: PagingActionService.MOVE_PAGE_EVENT,
      data: action
    });
  }

  clear(pagingName: string) {
    var action: PagingAction.Clear = {
      pagingName: pagingName
    }

    this.dispatcherService.emit({
      eventType: PagingActionService.CLEAR_PAGE_EVENT,
      data: action
    });
  }

}
