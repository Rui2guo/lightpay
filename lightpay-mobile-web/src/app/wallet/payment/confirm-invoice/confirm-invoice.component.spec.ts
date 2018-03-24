import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ConfirmInvoiceComponent } from './confirm-invoice.component';

describe('ConfirmInvoiceComponent', () => {
  let component: ConfirmInvoiceComponent;
  let fixture: ComponentFixture<ConfirmInvoiceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ConfirmInvoiceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ConfirmInvoiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
