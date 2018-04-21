// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface LightningAddressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.LightningAddress)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *&#47; The identity pubkey of the Lightning node
   * </pre>
   *
   * <code>string pubkey = 1[json_name = "pubkey"];</code>
   */
  java.lang.String getPubkey();
  /**
   * <pre>
   *&#47; The identity pubkey of the Lightning node
   * </pre>
   *
   * <code>string pubkey = 1[json_name = "pubkey"];</code>
   */
  com.google.protobuf.ByteString
      getPubkeyBytes();

  /**
   * <pre>
   *&#47; The network location of the lightning node, e.g. `69.69.69.69:1337` or `localhost:10011`
   * </pre>
   *
   * <code>string host = 2[json_name = "host"];</code>
   */
  java.lang.String getHost();
  /**
   * <pre>
   *&#47; The network location of the lightning node, e.g. `69.69.69.69:1337` or `localhost:10011`
   * </pre>
   *
   * <code>string host = 2[json_name = "host"];</code>
   */
  com.google.protobuf.ByteString
      getHostBytes();
}