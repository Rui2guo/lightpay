// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface GetInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.GetInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *&#47; The identity pubkey of the current node.
   * </pre>
   *
   * <code>string identity_pubkey = 1[json_name = "identity_pubkey"];</code>
   */
  java.lang.String getIdentityPubkey();
  /**
   * <pre>
   *&#47; The identity pubkey of the current node.
   * </pre>
   *
   * <code>string identity_pubkey = 1[json_name = "identity_pubkey"];</code>
   */
  com.google.protobuf.ByteString
      getIdentityPubkeyBytes();

  /**
   * <pre>
   *&#47; If applicable, the alias of the current node, e.g. "bob"
   * </pre>
   *
   * <code>string alias = 2[json_name = "alias"];</code>
   */
  java.lang.String getAlias();
  /**
   * <pre>
   *&#47; If applicable, the alias of the current node, e.g. "bob"
   * </pre>
   *
   * <code>string alias = 2[json_name = "alias"];</code>
   */
  com.google.protobuf.ByteString
      getAliasBytes();

  /**
   * <pre>
   *&#47; Number of pending channels
   * </pre>
   *
   * <code>uint32 num_pending_channels = 3[json_name = "num_pending_channels"];</code>
   */
  int getNumPendingChannels();

  /**
   * <pre>
   *&#47; Number of active channels
   * </pre>
   *
   * <code>uint32 num_active_channels = 4[json_name = "num_active_channels"];</code>
   */
  int getNumActiveChannels();

  /**
   * <pre>
   *&#47; Number of peers
   * </pre>
   *
   * <code>uint32 num_peers = 5[json_name = "num_peers"];</code>
   */
  int getNumPeers();

  /**
   * <pre>
   *&#47; The node's current view of the height of the best block
   * </pre>
   *
   * <code>uint32 block_height = 6[json_name = "block_height"];</code>
   */
  int getBlockHeight();

  /**
   * <pre>
   *&#47; The node's current view of the hash of the best block
   * </pre>
   *
   * <code>string block_hash = 8[json_name = "block_hash"];</code>
   */
  java.lang.String getBlockHash();
  /**
   * <pre>
   *&#47; The node's current view of the hash of the best block
   * </pre>
   *
   * <code>string block_hash = 8[json_name = "block_hash"];</code>
   */
  com.google.protobuf.ByteString
      getBlockHashBytes();

  /**
   * <pre>
   *&#47; Whether the wallet's view is synced to the main chain
   * </pre>
   *
   * <code>bool synced_to_chain = 9[json_name = "synced_to_chain"];</code>
   */
  boolean getSyncedToChain();

  /**
   * <pre>
   *&#47; Whether the current node is connected to testnet
   * </pre>
   *
   * <code>bool testnet = 10[json_name = "testnet"];</code>
   */
  boolean getTestnet();

  /**
   * <pre>
   *&#47; A list of active chains the node is connected to
   * </pre>
   *
   * <code>repeated string chains = 11[json_name = "chains"];</code>
   */
  java.util.List<java.lang.String>
      getChainsList();
  /**
   * <pre>
   *&#47; A list of active chains the node is connected to
   * </pre>
   *
   * <code>repeated string chains = 11[json_name = "chains"];</code>
   */
  int getChainsCount();
  /**
   * <pre>
   *&#47; A list of active chains the node is connected to
   * </pre>
   *
   * <code>repeated string chains = 11[json_name = "chains"];</code>
   */
  java.lang.String getChains(int index);
  /**
   * <pre>
   *&#47; A list of active chains the node is connected to
   * </pre>
   *
   * <code>repeated string chains = 11[json_name = "chains"];</code>
   */
  com.google.protobuf.ByteString
      getChainsBytes(int index);

  /**
   * <pre>
   *&#47; The URIs of the current node.
   * </pre>
   *
   * <code>repeated string uris = 12[json_name = "uris"];</code>
   */
  java.util.List<java.lang.String>
      getUrisList();
  /**
   * <pre>
   *&#47; The URIs of the current node.
   * </pre>
   *
   * <code>repeated string uris = 12[json_name = "uris"];</code>
   */
  int getUrisCount();
  /**
   * <pre>
   *&#47; The URIs of the current node.
   * </pre>
   *
   * <code>repeated string uris = 12[json_name = "uris"];</code>
   */
  java.lang.String getUris(int index);
  /**
   * <pre>
   *&#47; The URIs of the current node.
   * </pre>
   *
   * <code>repeated string uris = 12[json_name = "uris"];</code>
   */
  com.google.protobuf.ByteString
      getUrisBytes(int index);

  /**
   * <pre>
   *&#47; Timestamp of the block best known to the wallet
   * </pre>
   *
   * <code>int64 best_header_timestamp = 13[json_name = "best_header_timestamp"];</code>
   */
  long getBestHeaderTimestamp();

  /**
   * <pre>
   *&#47; The version of the LND software that the node is running.
   * </pre>
   *
   * <code>string version = 14[json_name = "version"];</code>
   */
  java.lang.String getVersion();
  /**
   * <pre>
   *&#47; The version of the LND software that the node is running.
   * </pre>
   *
   * <code>string version = 14[json_name = "version"];</code>
   */
  com.google.protobuf.ByteString
      getVersionBytes();
}