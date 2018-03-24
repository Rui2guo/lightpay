import { Injectable } from '@angular/core';
import { Response } from "@angular/http";
import { DispatcherService } from 'app/common/services/dispatcher.service';
import { ApiService } from 'app/common/services/api.service';
import { PaymentAction } from './payment-action';
import { UUID } from 'app/common/utils/uuid';

@Injectable()
export class PaymentActionService {

  static readonly EVENT_PREFIX: string = "PaymentActionService.";
  static readonly DECODE_PAYREQ_EVENT: string = PaymentActionService.EVENT_PREFIX + "decode-payreq";
  static readonly SEND_PAYMENT_EVENT: string = PaymentActionService.EVENT_PREFIX + "send-payment";
  static readonly ADD_INVOICE_EVENT: string = PaymentActionService.EVENT_PREFIX + "add-invoice";

  constructor(
    private dispatcherService: DispatcherService,
    private apiService: ApiService
  ) { }

  decodePayReq(payreqStr: string): string {
    var emitId: string = UUID.v4();
    this.apiService.get("/api/payment/payreq/decode/" + payreqStr, {}).subscribe(
      (res: Response) => {
        var json: PaymentAction.DecodePayReq = res.json();
        this.dispatcherService.emit({
          eventType: PaymentActionService.DECODE_PAYREQ_EVENT,
          data: json,
          emitId: emitId
        });
      },
      (error: Response) => {
        console.log("decodePayReq error");
      }
    );
    return emitId;
  }

  sendPayment(payreqStr: string): string {
    var emitId: string = UUID.v4();
    this.apiService.post("/api/payment/send", {
      "paymentRequest": payreqStr
    }).subscribe(
      (res: Response) => {
        var json: PaymentAction.SendPayment = res.json();
        this.dispatcherService.emit({
          eventType: PaymentActionService.SEND_PAYMENT_EVENT,
          data: json,
          emitId: emitId
        });
      },
      (error: Response) => {
        console.log("sendPayment error");
      }
    );
    return emitId;
  }

  addInvoice(value: number, memo: string): string {
    var emitId: string = UUID.v4();
    this.apiService.post("/api/payment/addinvoice", {
      "value": value,
      "memo": memo
    }).subscribe(
      (res: Response) => {
        var json: PaymentAction.AddInvoice = res.json();
        this.dispatcherService.emit({
          eventType: PaymentActionService.ADD_INVOICE_EVENT,
          data: json,
          emitId: emitId
        });
      },
      (error: Response) => {
        console.log("addInvoice error");
      }
    );
    return emitId;
  }

}
