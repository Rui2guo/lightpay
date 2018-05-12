import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { WalletHistoryDetailComponent } from './wallet-history-detail.component';

describe('WalletHistoryDetailComponent', () => {
  let component: WalletHistoryDetailComponent;
  let fixture: ComponentFixture<WalletHistoryDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WalletHistoryDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WalletHistoryDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
