export module WalletAction {

  export interface Balance {
    blockChain: {
      totalBalance: number;
      confirmedBalance: number;
      unconfirmedBalance: number;
    };  
    channels: {
      balance: number;
    };
  }

  export interface NewAddress {
    address: string;
  }

  export interface SendCoins {
    txid: string;
  }

  export interface Histories {
    histories: WalletHistory[];
    pageNum: number;
    totalPages: number;
    totalHistories: number;
  }

  export interface WalletHistory {
    id: number;
    timeStamp: number;
    paymentHistory: PaymentHistory;
    transactionHistory: TransactionHistory;
  }

  export interface PaymentHistory {
    id: number;
    direction: string;
    destination: string;
    totalAmountMsat: number;
    totalFeesMsat: number;
  }

  export interface TransactionHistory {
    id: number;
    txHash: string;
    blockHash: string;
    transactionType: string;
    destAddress: string;
    amount: number;
    totalFees: number;
  }

}
