import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReceiveCoinComponent } from './receive-coin.component';

describe('ReceiveCoinComponent', () => {
  let component: ReceiveCoinComponent;
  let fixture: ComponentFixture<ReceiveCoinComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReceiveCoinComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReceiveCoinComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
