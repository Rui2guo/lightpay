export module NetworkAction {

  export interface ListChannels {
    channels: Channel[];
  }

  export interface Channel {
    active: boolean;
    remotePubkey: string;
    channelPoint: string;
    chanId: number;
    capacity: number;
    localBalance: number;
    remoteBalance: number;
    commitFee: number;
    commitWeight: number;
    feePerKw: number;
    unsettledBalance: number;
    totalSatoshisSent: number;
    totalSatoshisReceived: number;
    numUpdates: number;
    pendingHtlcs: HTLC[];
    csvDelay: number;
    private: boolean;
  }

  export interface HTLC {
    incoming: boolean;
    amount: number;
    hashLock: string;
    expirationHeight: number;
  }

  export interface CloseChannel {
    fundingTxId: string;
    outputIndex: number;
  }

}
