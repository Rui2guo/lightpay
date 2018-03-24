export module PagingAction {

  export enum PageAnimation {
    NEXT,
    BACK,
    IMMEDIATE,
  }

  export interface Move {
    pagingName: string;
    component: any;
    pageData: any;
    animation: PageAnimation;
  }

  export interface Clear {
    pagingName: string;
  }

}