// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface PendingHTLCOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.PendingHTLC)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *&#47; The direction within the channel that the htlc was sent
   * </pre>
   *
   * <code>bool incoming = 1[json_name = "incoming"];</code>
   */
  boolean getIncoming();

  /**
   * <pre>
   *&#47; The total value of the htlc
   * </pre>
   *
   * <code>int64 amount = 2[json_name = "amount"];</code>
   */
  long getAmount();

  /**
   * <pre>
   *&#47; The final output to be swept back to the user's wallet
   * </pre>
   *
   * <code>string outpoint = 3[json_name = "outpoint"];</code>
   */
  java.lang.String getOutpoint();
  /**
   * <pre>
   *&#47; The final output to be swept back to the user's wallet
   * </pre>
   *
   * <code>string outpoint = 3[json_name = "outpoint"];</code>
   */
  com.google.protobuf.ByteString
      getOutpointBytes();

  /**
   * <pre>
   *&#47; The next block height at which we can spend the current stage
   * </pre>
   *
   * <code>uint32 maturity_height = 4[json_name = "maturity_height"];</code>
   */
  int getMaturityHeight();

  /**
   * <pre>
   **
   *The number of blocks remaining until the current stage can be swept.
   *Negative values indicate how many blocks have passed since becoming
   *mature.
   * </pre>
   *
   * <code>int32 blocks_til_maturity = 5[json_name = "blocks_til_maturity"];</code>
   */
  int getBlocksTilMaturity();

  /**
   * <pre>
   *&#47; Indicates whether the htlc is in its first or second stage of recovery
   * </pre>
   *
   * <code>uint32 stage = 6[json_name = "stage"];</code>
   */
  int getStage();
}
