// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface ListInvoiceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.ListInvoiceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .lnrpc.Invoice invoices = 1[json_name = "invoices"];</code>
   */
  java.util.List<lightpay.lnd.grpc.Invoice> 
      getInvoicesList();
  /**
   * <code>repeated .lnrpc.Invoice invoices = 1[json_name = "invoices"];</code>
   */
  lightpay.lnd.grpc.Invoice getInvoices(int index);
  /**
   * <code>repeated .lnrpc.Invoice invoices = 1[json_name = "invoices"];</code>
   */
  int getInvoicesCount();
  /**
   * <code>repeated .lnrpc.Invoice invoices = 1[json_name = "invoices"];</code>
   */
  java.util.List<? extends lightpay.lnd.grpc.InvoiceOrBuilder> 
      getInvoicesOrBuilderList();
  /**
   * <code>repeated .lnrpc.Invoice invoices = 1[json_name = "invoices"];</code>
   */
  lightpay.lnd.grpc.InvoiceOrBuilder getInvoicesOrBuilder(
      int index);
}
