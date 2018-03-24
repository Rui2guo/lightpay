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

}
