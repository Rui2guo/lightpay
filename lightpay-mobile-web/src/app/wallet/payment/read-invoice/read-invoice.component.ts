import { Component, OnInit, AfterViewInit, ViewChild, ElementRef, OnDestroy, HostBinding } from '@angular/core';
import { platform } from 'app';
import { PageBaseComponent } from 'app/paging/page-base.component';
import { PagingActionService } from '../../../paging/paging-action.service';
import { ConfirmInvoiceComponent } from '../confirm-invoice/confirm-invoice.component';
import { PaymentForm, PaymentComponent } from 'app/wallet/payment/payment.component';
import { Payload } from 'app/common/base/emitter';
import { WalletComponent } from 'app/wallet/wallet.component';
import { PagingAction } from '../../../paging/paging-action';

@Component({
  selector: 'lp-read-invoice',
  templateUrl: './read-invoice.component.html',
  styleUrls: ['./read-invoice.component.scss']
})
export class ReadInvoiceComponent extends PageBaseComponent implements OnInit, AfterViewInit, OnDestroy {

  static readonly READ_INTERVAL: number = 1000;

  static readonly READ_AREA_RATIO: number = 1 / 2;

  @HostBinding('style.display')
  display: string = "flex";

  @ViewChild("videoWrapper")
  _videoWrapperRef: ElementRef;

  @ViewChild("video")
  _videoRef: ElementRef;

  @ViewChild("canvas")
  _canvasRef: ElementRef;

  readRectDisplay: string = "none";

  readRectSize: number = 0;

  readRectPosX: number = 0;

  readRectPosY: number = 0;

  private _videoWrapperEl: HTMLElement;

  private _videoEl: HTMLVideoElement;

  private _canvasEl: HTMLCanvasElement;
  
  private timer: any;

  private videoStreamTrack: MediaStreamTrack;
  private audioStreamTrack: MediaStreamTrack;

  constructor(
    private pagingActionService: PagingActionService
  ) {
    super();
  }

  ngOnInit() {
  }

  ngAfterViewInit(): void {
    this._videoWrapperEl = this._videoWrapperRef.nativeElement;
    this._videoEl = this._videoRef.nativeElement;
    this._canvasEl = this._canvasRef.nativeElement;
    this.startQRReader();
  }

  ngOnDestroy() {
    this.stopQRReader();
  }

  private startQRReader() {
    var videoMediaTrackConstraints: boolean | MediaTrackConstraints;
    if (
      (platform.name.match(/Safari/i) && platform.os.family.match(/iOS/))
      || (platform.name.match(/Chrome/i) && platform.os.family.match(/Android/))
    ) {
      videoMediaTrackConstraints = {
        facingMode: {
          exact: "environment"
        }
      };
    } else {
      videoMediaTrackConstraints = true;
    }

    navigator.mediaDevices.getUserMedia({
      audio: false,
      video: videoMediaTrackConstraints
    })
    .then((stream: MediaStream) => {
      this.videoStreamTrack = stream.getVideoTracks()[0];
      this.audioStreamTrack = stream.getAudioTracks()[0];
      this._videoEl.srcObject = stream;
      this._videoEl.onplay = () => {
        this.readQR();
        this.timer = setInterval(() => {
          this.readQR();
        }, ReadInvoiceComponent.READ_INTERVAL);
        this.readRectDisplay = "block";
      };
    }).catch((reason: any) => {
      console.log(reason);
    });
  }

  private stopQRReader() {
    if (this.timer) {
      clearInterval(this.timer);
      this.timer = null;
    }

    this._videoEl.srcObject = null;

    if (this.videoStreamTrack) {
      this.videoStreamTrack.stop();
      this.videoStreamTrack = null;
    }
    if (this.audioStreamTrack) {
      this.audioStreamTrack.stop();
      this.audioStreamTrack = null;
    }

    this.readRectDisplay = "none";
  }

  private readQR() {
    var videoWidth: number = this._videoEl.videoWidth;
    var videoHeight: number = this._videoEl.videoHeight;

    if (videoWidth == 0 || videoHeight == 0) {
      return;
    }
    
    this._canvasEl.width = videoWidth;
    this._canvasEl.height = videoHeight;
    var wrapperRect: ClientRect = this._videoWrapperEl.getBoundingClientRect();
    var readSize: number = 0;
    var readPosX: number = 0;
    var readPosY: number = 0;

    if (videoWidth < videoHeight) {
      readSize = videoWidth * ReadInvoiceComponent.READ_AREA_RATIO;
      this.readRectSize = wrapperRect.width * ReadInvoiceComponent.READ_AREA_RATIO;
    } else {
      readSize = videoHeight * ReadInvoiceComponent.READ_AREA_RATIO;
      this.readRectSize = wrapperRect.height * ReadInvoiceComponent.READ_AREA_RATIO;
    }
    readPosX = videoWidth / 2 - (readSize / 2);
    this.readRectPosX = wrapperRect.width / 2 - (this.readRectSize / 2);
    readPosY = videoHeight / 2 - (readSize / 2);
    this.readRectPosY = wrapperRect.height / 2 - (this.readRectSize / 2);

    var ctx: CanvasRenderingContext2D = this._canvasEl.getContext("2d");    
    ctx.drawImage(this._videoEl, 0, 0, videoWidth, videoHeight);
    var image: Uint8ClampedArray = ctx.getImageData(readPosX, readPosY, readSize, readSize).data;
    var result = eval("jsQR(image, " + readSize + ", " + readSize + ")");
    
    if (result) {
      this.moveConfirm(result);
    }
  }

  private moveConfirm(result: any) {
    var form: PaymentForm = {
      payreq: result.data
    };
    this.pagingActionService.move(PaymentComponent.PAGING_NAME, ConfirmInvoiceComponent, form, PagingAction.PageAnimation.IMMEDIATE);
  }

}
