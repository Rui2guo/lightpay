// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface PendingUpdateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.PendingUpdate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes txid = 1[json_name = "txid"];</code>
   */
  com.google.protobuf.ByteString getTxid();

  /**
   * <code>uint32 output_index = 2[json_name = "output_index"];</code>
   */
  int getOutputIndex();
}