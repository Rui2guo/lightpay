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
      totalAmt: number;
      hops: [
        { 
          chanId: number;
          chanCapacity: number;
          amtToForward: number;
          fee: number;
          expiry: number;
        }
      ];
      totalFees: number;
    };
  }

  export interface AddInvoice {
    rHash: string;
    paymentRequest: string;
  }

}
