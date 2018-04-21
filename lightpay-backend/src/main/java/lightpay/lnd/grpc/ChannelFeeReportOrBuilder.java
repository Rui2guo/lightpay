// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface ChannelFeeReportOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.ChannelFeeReport)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *&#47; The channel that this fee report belongs to.
   * </pre>
   *
   * <code>string chan_point = 1[json_name = "channel_point"];</code>
   */
  java.lang.String getChanPoint();
  /**
   * <pre>
   *&#47; The channel that this fee report belongs to.
   * </pre>
   *
   * <code>string chan_point = 1[json_name = "channel_point"];</code>
   */
  com.google.protobuf.ByteString
      getChanPointBytes();

  /**
   * <pre>
   *&#47; The base fee charged regardless of the number of milli-satoshis sent.
   * </pre>
   *
   * <code>int64 base_fee_msat = 2[json_name = "base_fee_msat"];</code>
   */
  long getBaseFeeMsat();

  /**
   * <pre>
   *&#47; The amount charged per milli-satoshis transferred expressed in millionths of a satoshi.
   * </pre>
   *
   * <code>int64 fee_per_mil = 3[json_name = "fee_per_mil"];</code>
   */
  long getFeePerMil();

  /**
   * <pre>
   *&#47; The effective fee rate in milli-satoshis. Computed by dividing the fee_per_mil value by 1 million.
   * </pre>
   *
   * <code>double fee_rate = 4[json_name = "fee_rate"];</code>
   */
  double getFeeRate();
}