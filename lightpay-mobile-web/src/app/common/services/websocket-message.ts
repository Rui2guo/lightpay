export module MessageType {
  export const SubscribeInvoices: string = "SubscribeInvoices";
}

export interface Message {
  messageType: string;
  body: any;
}

export interface Invoice {
  memo: string;
  receipt: string;
  rPreimage: string;
  rHash: string;
  value: number;
  settled: boolean;
  creationDate: number;
  settleDate: number;
  paymentRequest: string;
  descriptionHash: string;
  expiry: number;
  fallbackAddr: string;
  cltvExpiry: number;
}
