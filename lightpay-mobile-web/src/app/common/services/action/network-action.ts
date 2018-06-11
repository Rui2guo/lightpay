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

  export interface PendingChannels {
    totalLimboBalance: number;
    pendingOpenChannels: PendingOpenChannel[];
    pendingClosingChannels: ClosedChannel[];
    pendingForceClosingChannels: ForceClosedChannel[];
  }

  export interface PendingChannel {
    remoteNodePub: string;
    channelPoint: string;
    capacity: number;
    localBalance: number;
    remoteBalance: number;
  }

  export interface PendingOpenChannel {
    channel: PendingChannel;
    confirmationHeight: number;
    commitFee: number;
    commitWeight: number;
    feePerKw: number;
  }

  export interface ClosedChannel {
    channel: PendingChannel;
    closingTxid: string;
  }

  export interface ForceClosedChannel {
    channel: PendingChannel;
    closingTxid: string;
    limboBalance: number;
    maturityHeight: number;
    blocksTilMaturity: number;
    recoveredBalance: number;
    pendingHTLCs: PendingHTLC[];
  }

  export interface PendingHTLC {
    incoming: boolean;
    amount: number;
    outpoint: string;
    maturityHeight: number;
    blocksTilMaturity: number;
    stage: number;
  }

  export interface OpenChannel {
    fundingTxId: string;
    outputIndex: number;
  }

}
