// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface PayReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.PayReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string destination = 1[json_name = "destination"];</code>
   */
  java.lang.String getDestination();
  /**
   * <code>string destination = 1[json_name = "destination"];</code>
   */
  com.google.protobuf.ByteString
      getDestinationBytes();

  /**
   * <code>string payment_hash = 2[json_name = "payment_hash"];</code>
   */
  java.lang.String getPaymentHash();
  /**
   * <code>string payment_hash = 2[json_name = "payment_hash"];</code>
   */
  com.google.protobuf.ByteString
      getPaymentHashBytes();

  /**
   * <code>int64 num_satoshis = 3[json_name = "num_satoshis"];</code>
   */
  long getNumSatoshis();

  /**
   * <code>int64 timestamp = 4[json_name = "timestamp"];</code>
   */
  long getTimestamp();

  /**
   * <code>int64 expiry = 5[json_name = "expiry"];</code>
   */
  long getExpiry();

  /**
   * <code>string description = 6[json_name = "description"];</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 6[json_name = "description"];</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string description_hash = 7[json_name = "description_hash"];</code>
   */
  java.lang.String getDescriptionHash();
  /**
   * <code>string description_hash = 7[json_name = "description_hash"];</code>
   */
  com.google.protobuf.ByteString
      getDescriptionHashBytes();

  /**
   * <code>string fallback_addr = 8[json_name = "fallback_addr"];</code>
   */
  java.lang.String getFallbackAddr();
  /**
   * <code>string fallback_addr = 8[json_name = "fallback_addr"];</code>
   */
  com.google.protobuf.ByteString
      getFallbackAddrBytes();

  /**
   * <code>int64 cltv_expiry = 9[json_name = "cltv_expiry"];</code>
   */
  long getCltvExpiry();

  /**
   * <code>repeated .lnrpc.RouteHint route_hints = 10[json_name = "route_hints"];</code>
   */
  java.util.List<lightpay.lnd.grpc.RouteHint> 
      getRouteHintsList();
  /**
   * <code>repeated .lnrpc.RouteHint route_hints = 10[json_name = "route_hints"];</code>
   */
  lightpay.lnd.grpc.RouteHint getRouteHints(int index);
  /**
   * <code>repeated .lnrpc.RouteHint route_hints = 10[json_name = "route_hints"];</code>
   */
  int getRouteHintsCount();
  /**
   * <code>repeated .lnrpc.RouteHint route_hints = 10[json_name = "route_hints"];</code>
   */
  java.util.List<? extends lightpay.lnd.grpc.RouteHintOrBuilder> 
      getRouteHintsOrBuilderList();
  /**
   * <code>repeated .lnrpc.RouteHint route_hints = 10[json_name = "route_hints"];</code>
   */
  lightpay.lnd.grpc.RouteHintOrBuilder getRouteHintsOrBuilder(
      int index);
}