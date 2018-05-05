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

}
