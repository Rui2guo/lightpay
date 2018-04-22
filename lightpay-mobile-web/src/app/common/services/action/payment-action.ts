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
    paymentRoute: {
      totalTimeLock: number;
      totalAmtMsat: number;
      hops: [
        { 
          chanId: number;
          chanCapacity: number;
          amtToForwardMsat: number;
          feeMsat: number;
          expiry: number;
        }
      ];
      totalFeesMsat: number;
    };
  }

  export interface AddInvoice {
    rHash: string;
    paymentRequest: string;
  }

}
