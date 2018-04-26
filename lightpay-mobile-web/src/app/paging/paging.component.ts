import { Component, OnInit, ViewChild, ViewContainerRef, ComponentFactoryResolver, AfterViewInit, ComponentFactory, ComponentRef, ElementRef, Input, HostBinding } from '@angular/core';
import { DispatcherService } from '../common/services/dispatcher.service';
import { Payload } from 'app/common/base/emitter';
import { PagingActionService } from './paging-action.service';
import { PagingAction } from './paging-action';
import { PageBaseComponent } from './page-base.component';
import { _ } from 'app';

enum Page {
  A,
  B,
}

@Component({
  selector: 'lp-paging',
  templateUrl: './paging.component.html',
  styleUrls: ['./paging.component.scss']
})
export class PagingComponent implements OnInit, AfterViewInit {

  @Input()
  pagingName: string;

  @ViewChild("vcrA", {read: ViewContainerRef})
  vcrA: ViewContainerRef;

  @ViewChild("vcrB", {read: ViewContainerRef})
  vcrB: ViewContainerRef;

  @Input()
  transitionDuration: number = 200;

  @Input()
  transitionDelay: number = 0;

  @Input()
  transitionTimingFunction: string = "ease";

  _transitionDuration: number = 0;

  _transitionDelay: number = 0;

  displayA: boolean = true;
  displayB: boolean = false;

  topA: number = null;
  leftA: number = null;

  topB: number = null;
  leftB: number = null;

  widthA: number = null;
  heightA: number = null;

  widthB: number = null;
  heightB: number = null;

  zIndexA: number = 2;
  zIndexB: number = 1;

  pageMoved: boolean = true;

  private currentPage: Page = Page.A;

  private htmlElement: HTMLElement;

  constructor(
    private elementRef: ElementRef,
    private componentFactoryResolver: ComponentFactoryResolver,
    private dispatcherService: DispatcherService
  ) { }

  ngOnInit() {
  }

  ngAfterViewInit() {
    this.htmlElement = this.elementRef.nativeElement;

    this.dispatcherService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case PagingActionService.MOVE_PAGE_EVENT:
            this.startMovePage(<PagingAction.Move>payload.data);
            break;
          case PagingActionService.CLEAR_PAGE_EVENT:
            this.clearPage(<PagingAction.Clear>payload.data);
            break;
        }
      }
    );
  }

  private startMovePage(action: PagingAction.Move) {
    if (action.pagingName !== this.pagingName) {
      return;
    }

    if (action.component) {
      var componentFactory: ComponentFactory<{}> = this.componentFactoryResolver.resolveComponentFactory(action.component);
      var componentRef: ComponentRef<{}>;
      if (this.currentPage === Page.A) {
          componentRef = this.vcrB.createComponent(componentFactory);
      } else if (this.currentPage === Page.B) {
          componentRef = this.vcrA.createComponent(componentFactory);
      }
      (<PageBaseComponent>componentRef.instance).pageData = action.pageData;
      componentRef.changeDetectorRef.detectChanges();
    }

    this.pageMoved = false;
    this.displayA = this.displayB = true;
    var width: number = this.htmlElement.offsetWidth;
    var height : number = this.htmlElement.offsetHeight;
    this.widthA = this.widthB = width;
    this.heightA = this.heightB = height;

    switch (action.animation) {
      case PagingAction.PageAnimation.NEXT:
        this.prepareMoveNext(action);
        break;
      case PagingAction.PageAnimation.BACK:
        this.prepareMoveBack(action);
        break;
      case PagingAction.PageAnimation.IMMEDIATE:
        this.prepareMoveImmediate(action);
        break;
    }
  }

  private  prepareMoveNext(action: PagingAction.Move) {
    this._transitionDuration = this.transitionDuration;
    this._transitionDelay = this.transitionDelay;

    if (this.currentPage === Page.A) {
      this.topA = this.leftA = 0;
      this.topB = 0;
      this.leftB = this.widthA;
      this.zIndexA = 1;
      this.zIndexB = 2;
      this.currentPage = Page.B;
    } else if (this.currentPage === Page.B) {
      this.topB = this.leftB = 0;
      this.topA = 0;
      this.leftA = this.widthB;
      this.zIndexA = 2;
      this.zIndexB = 1;
      this.currentPage = Page.A;
    }

    _.delay(() => {
      this.startMoveNext(action);
    }, 0);
  }

  private startMoveNext(action: PagingAction.Move) {
    if (this.currentPage === Page.A) {
      this.leftA = 0;
    } else if (this.currentPage === Page.B) {
      this.leftB = 0;
    }

    _.delay(() => {
      this.endMove(action);
    }, this.transitionDelay + this.transitionDuration);
  }

  private prepareMoveBack(action: PagingAction.Move) {
    this._transitionDuration = this.transitionDuration;
    this._transitionDelay = this.transitionDelay;

    this.topA = this.leftA = 0;
    this.topB = this.leftB = 0;

    if (this.currentPage === Page.A) {
      this.zIndexA = 2;
      this.zIndexB = 1;
      this.currentPage = Page.B;
    } else if (this.currentPage === Page.B) {
      this.zIndexA = 1;
      this.zIndexB = 2;
      this.currentPage = Page.A;
    }

    _.delay(() => {
      this.startMoveBack(action);
    }, 0);
  }

  private startMoveBack(action: PagingAction.Move) {
    if (this.currentPage === Page.A) {
      this.leftB = this.widthB;
    } else if (this.currentPage === Page.B) {
      this.leftA = this.widthA;
    }

    _.delay(() => {
      this.endMove(action);
    }, this.transitionDelay + this.transitionDuration);
  }

  private prepareMoveImmediate(action: PagingAction.Move) {
    this.topA = this.leftA = 0;
    this.topB = this.leftB = 0;

    if (this.currentPage === Page.A) {
      this.zIndexA = 1;
      this.zIndexB = 2;
      this.currentPage = Page.B;
    } else if (this.currentPage === Page.B) {
      this.zIndexA = 2;
      this.zIndexB = 1;
      this.currentPage = Page.A;
    }

    _.delay(() => {
      this.endMove(action);
    }, 0);
  }

  private endMove(action: PagingAction.Move) {
    this.pageMoved = true;
    this.topA = this.topB = this.leftA = this.leftB = null;
    this.widthA = this.heightA = this.widthB = this.heightB = null;
    this._transitionDuration = 0;
    this._transitionDelay = 0;

    if (this.currentPage === Page.A) {
      this.displayA = true;
      this.displayB = false;
      this.vcrB.clear();
    } else if (this.currentPage === Page.B) {
      this.displayA = false;
      this.displayB = true;
      this.vcrA.clear();
    }

    if (action.after) {
      action.after.apply(null);
    }
  }

  private clearPage(action: PagingAction.Clear) {
    if (action.pagingName != this.pagingName) {
      return;
    }

    this.vcrA.clear();
    this.vcrB.clear();
  }

}
