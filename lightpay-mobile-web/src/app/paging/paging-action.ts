export module PagingAction {

  export enum PageAnimation {
    NEXT,
    BACK,
    IMMEDIATE,
    UP,
    DOWN
  }

  export interface Move {
    pagingName: string;
    component: any;
    pageData: any;
    animation: PageAnimation;
    after: () => void;
  }

  export interface Clear {
    pagingName: string;
  }

}