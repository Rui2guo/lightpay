import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OutputInvoiceComponent } from './output-invoice.component';

describe('OutputInvoiceComponent', () => {
  let component: OutputInvoiceComponent;
  let fixture: ComponentFixture<OutputInvoiceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OutputInvoiceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OutputInvoiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
