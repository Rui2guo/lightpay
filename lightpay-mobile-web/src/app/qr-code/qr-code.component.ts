import { Component, OnInit, OnChanges, ViewChild, ElementRef, AfterViewInit, Input, SimpleChanges } from '@angular/core';

@Component({
  selector: 'lp-qr-code',
  templateUrl: './qr-code.component.html',
  styleUrls: ['./qr-code.component.scss']
})
export class QrCodeComponent implements OnInit, AfterViewInit, OnChanges {

  @Input() background: string = "white";

  @Input() backgroundAlpha: number = 1.0;

  @Input() foreground: string = "black";

  @Input() foregroundAlpha: number = 1.0;

  @Input() level: string = "L";

  @Input() mime: string = "image/png";

  @Input() padding: number = null;

  @Input() size: number = 100;

  @Input() value: string = "";

  private elementEl: HTMLElement;

  constructor(
    private elementRef: ElementRef
  ) { }

  ngOnInit() {
  }

  ngAfterViewInit() {
    this.elementEl = this.elementRef.nativeElement;
    this.updateQRCode();
  }

  ngOnChanges(simpleChanges: SimpleChanges) {
    if (!this.elementEl) {
      return;
    }

    if ('background' in simpleChanges ||
      'backgroundAlpha' in simpleChanges ||
      'foreground' in simpleChanges ||
      'foregroundAlpha' in simpleChanges ||
      'level' in simpleChanges ||
      'mime' in simpleChanges ||
      'padding' in simpleChanges ||
      'size' in simpleChanges ||
      'value' in simpleChanges) {
      this.updateQRCode();
    }
  }

  updateQRCode() {
    try {
      this.elementEl.innerHTML = "";
      
      var qr = new QRious({
        background: this.background,
        backgroundAlpha: this.backgroundAlpha,
        foreground: this.foreground,
        foregroundAlpha: this.foregroundAlpha,
        level: this.level,
        mime: this.mime,
        padding: this.padding,
        size: this.size,
        value: this.value
      });

      this.elementEl.appendChild(qr.canvas);
    } catch (e) {
      console.error(e);
    }
  }

}
