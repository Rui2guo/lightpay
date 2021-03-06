// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface ConnectPeerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.ConnectPeerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *&#47; Lightning address of the peer, in the format `&lt;pubkey&gt;&#64;host`
   * </pre>
   *
   * <code>.lnrpc.LightningAddress addr = 1;</code>
   */
  boolean hasAddr();
  /**
   * <pre>
   *&#47; Lightning address of the peer, in the format `&lt;pubkey&gt;&#64;host`
   * </pre>
   *
   * <code>.lnrpc.LightningAddress addr = 1;</code>
   */
  lightpay.lnd.grpc.LightningAddress getAddr();
  /**
   * <pre>
   *&#47; Lightning address of the peer, in the format `&lt;pubkey&gt;&#64;host`
   * </pre>
   *
   * <code>.lnrpc.LightningAddress addr = 1;</code>
   */
  lightpay.lnd.grpc.LightningAddressOrBuilder getAddrOrBuilder();

  /**
   * <pre>
   ** If set, the daemon will attempt to persistently connect to the target
   * peer.  Otherwise, the call will be synchronous. 
   * </pre>
   *
   * <code>bool perm = 2;</code>
   */
  boolean getPerm();
}
