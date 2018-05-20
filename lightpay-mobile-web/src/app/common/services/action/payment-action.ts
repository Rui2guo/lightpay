export module PaymentAction {

  export interface DecodePayReq {
    destination: string,
    paymentHash: string,
    numSatoshis: number,
    timestamp: number,
    expiry: number,
    description: string,
    descriptionHash: string,
    fallbackAddr: string,
    cltvExpiry: number
  }

  export interface SendPayment {
    paymentError: string;
    paymentPreimage: string;
    paymentRoute: Route;
  }

  export interface Route {
    totalTimeLock: number;
    totalAmtMsat: number;
    totalFeesMsat: number;
    hops: Hop[];
  }

  export interface Hop {
    chanId: number;
    chanCapacity: number;
    amtToForwardMsat: number;
    feeMsat: number;
    expiry: number;
  }

  export interface AddInvoice {
    rHash: string;
    paymentRequest: string;
  }

}
