// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface QueryRoutesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.QueryRoutesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .lnrpc.Route routes = 1[json_name = "routes"];</code>
   */
  java.util.List<lightpay.lnd.grpc.Route> 
      getRoutesList();
  /**
   * <code>repeated .lnrpc.Route routes = 1[json_name = "routes"];</code>
   */
  lightpay.lnd.grpc.Route getRoutes(int index);
  /**
   * <code>repeated .lnrpc.Route routes = 1[json_name = "routes"];</code>
   */
  int getRoutesCount();
  /**
   * <code>repeated .lnrpc.Route routes = 1[json_name = "routes"];</code>
   */
  java.util.List<? extends lightpay.lnd.grpc.RouteOrBuilder> 
      getRoutesOrBuilderList();
  /**
   * <code>repeated .lnrpc.Route routes = 1[json_name = "routes"];</code>
   */
  lightpay.lnd.grpc.RouteOrBuilder getRoutesOrBuilder(
      int index);
}