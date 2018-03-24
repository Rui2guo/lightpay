package lightpay.lnd.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: rpc.proto")
public final class LightningGrpc {

  private LightningGrpc() {}

  public static final String SERVICE_NAME = "lnrpc.Lightning";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getWalletBalanceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.WalletBalanceRequest,
      lightpay.lnd.grpc.WalletBalanceResponse> METHOD_WALLET_BALANCE = getWalletBalanceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.WalletBalanceRequest,
      lightpay.lnd.grpc.WalletBalanceResponse> getWalletBalanceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.WalletBalanceRequest,
      lightpay.lnd.grpc.WalletBalanceResponse> getWalletBalanceMethod() {
    return getWalletBalanceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.WalletBalanceRequest,
      lightpay.lnd.grpc.WalletBalanceResponse> getWalletBalanceMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.WalletBalanceRequest, lightpay.lnd.grpc.WalletBalanceResponse> getWalletBalanceMethod;
    if ((getWalletBalanceMethod = LightningGrpc.getWalletBalanceMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getWalletBalanceMethod = LightningGrpc.getWalletBalanceMethod) == null) {
          LightningGrpc.getWalletBalanceMethod = getWalletBalanceMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.WalletBalanceRequest, lightpay.lnd.grpc.WalletBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "WalletBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.WalletBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.WalletBalanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("WalletBalance"))
                  .build();
          }
        }
     }
     return getWalletBalanceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getChannelBalanceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.ChannelBalanceRequest,
      lightpay.lnd.grpc.ChannelBalanceResponse> METHOD_CHANNEL_BALANCE = getChannelBalanceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.ChannelBalanceRequest,
      lightpay.lnd.grpc.ChannelBalanceResponse> getChannelBalanceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.ChannelBalanceRequest,
      lightpay.lnd.grpc.ChannelBalanceResponse> getChannelBalanceMethod() {
    return getChannelBalanceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.ChannelBalanceRequest,
      lightpay.lnd.grpc.ChannelBalanceResponse> getChannelBalanceMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.ChannelBalanceRequest, lightpay.lnd.grpc.ChannelBalanceResponse> getChannelBalanceMethod;
    if ((getChannelBalanceMethod = LightningGrpc.getChannelBalanceMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getChannelBalanceMethod = LightningGrpc.getChannelBalanceMethod) == null) {
          LightningGrpc.getChannelBalanceMethod = getChannelBalanceMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.ChannelBalanceRequest, lightpay.lnd.grpc.ChannelBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "ChannelBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.ChannelBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.ChannelBalanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("ChannelBalance"))
                  .build();
          }
        }
     }
     return getChannelBalanceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetTransactionsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.GetTransactionsRequest,
      lightpay.lnd.grpc.TransactionDetails> METHOD_GET_TRANSACTIONS = getGetTransactionsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.GetTransactionsRequest,
      lightpay.lnd.grpc.TransactionDetails> getGetTransactionsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.GetTransactionsRequest,
      lightpay.lnd.grpc.TransactionDetails> getGetTransactionsMethod() {
    return getGetTransactionsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.GetTransactionsRequest,
      lightpay.lnd.grpc.TransactionDetails> getGetTransactionsMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.GetTransactionsRequest, lightpay.lnd.grpc.TransactionDetails> getGetTransactionsMethod;
    if ((getGetTransactionsMethod = LightningGrpc.getGetTransactionsMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getGetTransactionsMethod = LightningGrpc.getGetTransactionsMethod) == null) {
          LightningGrpc.getGetTransactionsMethod = getGetTransactionsMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.GetTransactionsRequest, lightpay.lnd.grpc.TransactionDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "GetTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.GetTransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.TransactionDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("GetTransactions"))
                  .build();
          }
        }
     }
     return getGetTransactionsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSendCoinsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendCoinsRequest,
      lightpay.lnd.grpc.SendCoinsResponse> METHOD_SEND_COINS = getSendCoinsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendCoinsRequest,
      lightpay.lnd.grpc.SendCoinsResponse> getSendCoinsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendCoinsRequest,
      lightpay.lnd.grpc.SendCoinsResponse> getSendCoinsMethod() {
    return getSendCoinsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendCoinsRequest,
      lightpay.lnd.grpc.SendCoinsResponse> getSendCoinsMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendCoinsRequest, lightpay.lnd.grpc.SendCoinsResponse> getSendCoinsMethod;
    if ((getSendCoinsMethod = LightningGrpc.getSendCoinsMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getSendCoinsMethod = LightningGrpc.getSendCoinsMethod) == null) {
          LightningGrpc.getSendCoinsMethod = getSendCoinsMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.SendCoinsRequest, lightpay.lnd.grpc.SendCoinsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "SendCoins"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.SendCoinsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.SendCoinsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("SendCoins"))
                  .build();
          }
        }
     }
     return getSendCoinsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSubscribeTransactionsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.GetTransactionsRequest,
      lightpay.lnd.grpc.Transaction> METHOD_SUBSCRIBE_TRANSACTIONS = getSubscribeTransactionsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.GetTransactionsRequest,
      lightpay.lnd.grpc.Transaction> getSubscribeTransactionsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.GetTransactionsRequest,
      lightpay.lnd.grpc.Transaction> getSubscribeTransactionsMethod() {
    return getSubscribeTransactionsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.GetTransactionsRequest,
      lightpay.lnd.grpc.Transaction> getSubscribeTransactionsMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.GetTransactionsRequest, lightpay.lnd.grpc.Transaction> getSubscribeTransactionsMethod;
    if ((getSubscribeTransactionsMethod = LightningGrpc.getSubscribeTransactionsMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getSubscribeTransactionsMethod = LightningGrpc.getSubscribeTransactionsMethod) == null) {
          LightningGrpc.getSubscribeTransactionsMethod = getSubscribeTransactionsMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.GetTransactionsRequest, lightpay.lnd.grpc.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "SubscribeTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.GetTransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("SubscribeTransactions"))
                  .build();
          }
        }
     }
     return getSubscribeTransactionsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSendManyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendManyRequest,
      lightpay.lnd.grpc.SendManyResponse> METHOD_SEND_MANY = getSendManyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendManyRequest,
      lightpay.lnd.grpc.SendManyResponse> getSendManyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendManyRequest,
      lightpay.lnd.grpc.SendManyResponse> getSendManyMethod() {
    return getSendManyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendManyRequest,
      lightpay.lnd.grpc.SendManyResponse> getSendManyMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendManyRequest, lightpay.lnd.grpc.SendManyResponse> getSendManyMethod;
    if ((getSendManyMethod = LightningGrpc.getSendManyMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getSendManyMethod = LightningGrpc.getSendManyMethod) == null) {
          LightningGrpc.getSendManyMethod = getSendManyMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.SendManyRequest, lightpay.lnd.grpc.SendManyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "SendMany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.SendManyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.SendManyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("SendMany"))
                  .build();
          }
        }
     }
     return getSendManyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getNewAddressMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.NewAddressRequest,
      lightpay.lnd.grpc.NewAddressResponse> METHOD_NEW_ADDRESS = getNewAddressMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.NewAddressRequest,
      lightpay.lnd.grpc.NewAddressResponse> getNewAddressMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.NewAddressRequest,
      lightpay.lnd.grpc.NewAddressResponse> getNewAddressMethod() {
    return getNewAddressMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.NewAddressRequest,
      lightpay.lnd.grpc.NewAddressResponse> getNewAddressMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.NewAddressRequest, lightpay.lnd.grpc.NewAddressResponse> getNewAddressMethod;
    if ((getNewAddressMethod = LightningGrpc.getNewAddressMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getNewAddressMethod = LightningGrpc.getNewAddressMethod) == null) {
          LightningGrpc.getNewAddressMethod = getNewAddressMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.NewAddressRequest, lightpay.lnd.grpc.NewAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "NewAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.NewAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.NewAddressResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("NewAddress"))
                  .build();
          }
        }
     }
     return getNewAddressMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getNewWitnessAddressMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.NewWitnessAddressRequest,
      lightpay.lnd.grpc.NewAddressResponse> METHOD_NEW_WITNESS_ADDRESS = getNewWitnessAddressMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.NewWitnessAddressRequest,
      lightpay.lnd.grpc.NewAddressResponse> getNewWitnessAddressMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.NewWitnessAddressRequest,
      lightpay.lnd.grpc.NewAddressResponse> getNewWitnessAddressMethod() {
    return getNewWitnessAddressMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.NewWitnessAddressRequest,
      lightpay.lnd.grpc.NewAddressResponse> getNewWitnessAddressMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.NewWitnessAddressRequest, lightpay.lnd.grpc.NewAddressResponse> getNewWitnessAddressMethod;
    if ((getNewWitnessAddressMethod = LightningGrpc.getNewWitnessAddressMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getNewWitnessAddressMethod = LightningGrpc.getNewWitnessAddressMethod) == null) {
          LightningGrpc.getNewWitnessAddressMethod = getNewWitnessAddressMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.NewWitnessAddressRequest, lightpay.lnd.grpc.NewAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "NewWitnessAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.NewWitnessAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.NewAddressResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("NewWitnessAddress"))
                  .build();
          }
        }
     }
     return getNewWitnessAddressMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSignMessageMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.SignMessageRequest,
      lightpay.lnd.grpc.SignMessageResponse> METHOD_SIGN_MESSAGE = getSignMessageMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.SignMessageRequest,
      lightpay.lnd.grpc.SignMessageResponse> getSignMessageMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.SignMessageRequest,
      lightpay.lnd.grpc.SignMessageResponse> getSignMessageMethod() {
    return getSignMessageMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.SignMessageRequest,
      lightpay.lnd.grpc.SignMessageResponse> getSignMessageMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.SignMessageRequest, lightpay.lnd.grpc.SignMessageResponse> getSignMessageMethod;
    if ((getSignMessageMethod = LightningGrpc.getSignMessageMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getSignMessageMethod = LightningGrpc.getSignMessageMethod) == null) {
          LightningGrpc.getSignMessageMethod = getSignMessageMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.SignMessageRequest, lightpay.lnd.grpc.SignMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "SignMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.SignMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.SignMessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("SignMessage"))
                  .build();
          }
        }
     }
     return getSignMessageMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getVerifyMessageMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.VerifyMessageRequest,
      lightpay.lnd.grpc.VerifyMessageResponse> METHOD_VERIFY_MESSAGE = getVerifyMessageMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.VerifyMessageRequest,
      lightpay.lnd.grpc.VerifyMessageResponse> getVerifyMessageMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.VerifyMessageRequest,
      lightpay.lnd.grpc.VerifyMessageResponse> getVerifyMessageMethod() {
    return getVerifyMessageMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.VerifyMessageRequest,
      lightpay.lnd.grpc.VerifyMessageResponse> getVerifyMessageMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.VerifyMessageRequest, lightpay.lnd.grpc.VerifyMessageResponse> getVerifyMessageMethod;
    if ((getVerifyMessageMethod = LightningGrpc.getVerifyMessageMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getVerifyMessageMethod = LightningGrpc.getVerifyMessageMethod) == null) {
          LightningGrpc.getVerifyMessageMethod = getVerifyMessageMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.VerifyMessageRequest, lightpay.lnd.grpc.VerifyMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "VerifyMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.VerifyMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.VerifyMessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("VerifyMessage"))
                  .build();
          }
        }
     }
     return getVerifyMessageMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getConnectPeerMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.ConnectPeerRequest,
      lightpay.lnd.grpc.ConnectPeerResponse> METHOD_CONNECT_PEER = getConnectPeerMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.ConnectPeerRequest,
      lightpay.lnd.grpc.ConnectPeerResponse> getConnectPeerMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.ConnectPeerRequest,
      lightpay.lnd.grpc.ConnectPeerResponse> getConnectPeerMethod() {
    return getConnectPeerMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.ConnectPeerRequest,
      lightpay.lnd.grpc.ConnectPeerResponse> getConnectPeerMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.ConnectPeerRequest, lightpay.lnd.grpc.ConnectPeerResponse> getConnectPeerMethod;
    if ((getConnectPeerMethod = LightningGrpc.getConnectPeerMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getConnectPeerMethod = LightningGrpc.getConnectPeerMethod) == null) {
          LightningGrpc.getConnectPeerMethod = getConnectPeerMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.ConnectPeerRequest, lightpay.lnd.grpc.ConnectPeerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "ConnectPeer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.ConnectPeerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.ConnectPeerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("ConnectPeer"))
                  .build();
          }
        }
     }
     return getConnectPeerMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDisconnectPeerMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.DisconnectPeerRequest,
      lightpay.lnd.grpc.DisconnectPeerResponse> METHOD_DISCONNECT_PEER = getDisconnectPeerMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.DisconnectPeerRequest,
      lightpay.lnd.grpc.DisconnectPeerResponse> getDisconnectPeerMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.DisconnectPeerRequest,
      lightpay.lnd.grpc.DisconnectPeerResponse> getDisconnectPeerMethod() {
    return getDisconnectPeerMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.DisconnectPeerRequest,
      lightpay.lnd.grpc.DisconnectPeerResponse> getDisconnectPeerMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.DisconnectPeerRequest, lightpay.lnd.grpc.DisconnectPeerResponse> getDisconnectPeerMethod;
    if ((getDisconnectPeerMethod = LightningGrpc.getDisconnectPeerMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getDisconnectPeerMethod = LightningGrpc.getDisconnectPeerMethod) == null) {
          LightningGrpc.getDisconnectPeerMethod = getDisconnectPeerMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.DisconnectPeerRequest, lightpay.lnd.grpc.DisconnectPeerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "DisconnectPeer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.DisconnectPeerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.DisconnectPeerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("DisconnectPeer"))
                  .build();
          }
        }
     }
     return getDisconnectPeerMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListPeersMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListPeersRequest,
      lightpay.lnd.grpc.ListPeersResponse> METHOD_LIST_PEERS = getListPeersMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListPeersRequest,
      lightpay.lnd.grpc.ListPeersResponse> getListPeersMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListPeersRequest,
      lightpay.lnd.grpc.ListPeersResponse> getListPeersMethod() {
    return getListPeersMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListPeersRequest,
      lightpay.lnd.grpc.ListPeersResponse> getListPeersMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListPeersRequest, lightpay.lnd.grpc.ListPeersResponse> getListPeersMethod;
    if ((getListPeersMethod = LightningGrpc.getListPeersMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getListPeersMethod = LightningGrpc.getListPeersMethod) == null) {
          LightningGrpc.getListPeersMethod = getListPeersMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.ListPeersRequest, lightpay.lnd.grpc.ListPeersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "ListPeers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.ListPeersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.ListPeersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("ListPeers"))
                  .build();
          }
        }
     }
     return getListPeersMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetInfoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.GetInfoRequest,
      lightpay.lnd.grpc.GetInfoResponse> METHOD_GET_INFO = getGetInfoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.GetInfoRequest,
      lightpay.lnd.grpc.GetInfoResponse> getGetInfoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.GetInfoRequest,
      lightpay.lnd.grpc.GetInfoResponse> getGetInfoMethod() {
    return getGetInfoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.GetInfoRequest,
      lightpay.lnd.grpc.GetInfoResponse> getGetInfoMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.GetInfoRequest, lightpay.lnd.grpc.GetInfoResponse> getGetInfoMethod;
    if ((getGetInfoMethod = LightningGrpc.getGetInfoMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getGetInfoMethod = LightningGrpc.getGetInfoMethod) == null) {
          LightningGrpc.getGetInfoMethod = getGetInfoMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.GetInfoRequest, lightpay.lnd.grpc.GetInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "GetInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.GetInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.GetInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("GetInfo"))
                  .build();
          }
        }
     }
     return getGetInfoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPendingChannelsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.PendingChannelsRequest,
      lightpay.lnd.grpc.PendingChannelsResponse> METHOD_PENDING_CHANNELS = getPendingChannelsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.PendingChannelsRequest,
      lightpay.lnd.grpc.PendingChannelsResponse> getPendingChannelsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.PendingChannelsRequest,
      lightpay.lnd.grpc.PendingChannelsResponse> getPendingChannelsMethod() {
    return getPendingChannelsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.PendingChannelsRequest,
      lightpay.lnd.grpc.PendingChannelsResponse> getPendingChannelsMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.PendingChannelsRequest, lightpay.lnd.grpc.PendingChannelsResponse> getPendingChannelsMethod;
    if ((getPendingChannelsMethod = LightningGrpc.getPendingChannelsMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getPendingChannelsMethod = LightningGrpc.getPendingChannelsMethod) == null) {
          LightningGrpc.getPendingChannelsMethod = getPendingChannelsMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.PendingChannelsRequest, lightpay.lnd.grpc.PendingChannelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "PendingChannels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.PendingChannelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.PendingChannelsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("PendingChannels"))
                  .build();
          }
        }
     }
     return getPendingChannelsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListChannelsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListChannelsRequest,
      lightpay.lnd.grpc.ListChannelsResponse> METHOD_LIST_CHANNELS = getListChannelsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListChannelsRequest,
      lightpay.lnd.grpc.ListChannelsResponse> getListChannelsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListChannelsRequest,
      lightpay.lnd.grpc.ListChannelsResponse> getListChannelsMethod() {
    return getListChannelsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListChannelsRequest,
      lightpay.lnd.grpc.ListChannelsResponse> getListChannelsMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListChannelsRequest, lightpay.lnd.grpc.ListChannelsResponse> getListChannelsMethod;
    if ((getListChannelsMethod = LightningGrpc.getListChannelsMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getListChannelsMethod = LightningGrpc.getListChannelsMethod) == null) {
          LightningGrpc.getListChannelsMethod = getListChannelsMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.ListChannelsRequest, lightpay.lnd.grpc.ListChannelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "ListChannels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.ListChannelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.ListChannelsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("ListChannels"))
                  .build();
          }
        }
     }
     return getListChannelsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getOpenChannelSyncMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.OpenChannelRequest,
      lightpay.lnd.grpc.ChannelPoint> METHOD_OPEN_CHANNEL_SYNC = getOpenChannelSyncMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.OpenChannelRequest,
      lightpay.lnd.grpc.ChannelPoint> getOpenChannelSyncMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.OpenChannelRequest,
      lightpay.lnd.grpc.ChannelPoint> getOpenChannelSyncMethod() {
    return getOpenChannelSyncMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.OpenChannelRequest,
      lightpay.lnd.grpc.ChannelPoint> getOpenChannelSyncMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.OpenChannelRequest, lightpay.lnd.grpc.ChannelPoint> getOpenChannelSyncMethod;
    if ((getOpenChannelSyncMethod = LightningGrpc.getOpenChannelSyncMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getOpenChannelSyncMethod = LightningGrpc.getOpenChannelSyncMethod) == null) {
          LightningGrpc.getOpenChannelSyncMethod = getOpenChannelSyncMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.OpenChannelRequest, lightpay.lnd.grpc.ChannelPoint>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "OpenChannelSync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.OpenChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.ChannelPoint.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("OpenChannelSync"))
                  .build();
          }
        }
     }
     return getOpenChannelSyncMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getOpenChannelMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.OpenChannelRequest,
      lightpay.lnd.grpc.OpenStatusUpdate> METHOD_OPEN_CHANNEL = getOpenChannelMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.OpenChannelRequest,
      lightpay.lnd.grpc.OpenStatusUpdate> getOpenChannelMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.OpenChannelRequest,
      lightpay.lnd.grpc.OpenStatusUpdate> getOpenChannelMethod() {
    return getOpenChannelMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.OpenChannelRequest,
      lightpay.lnd.grpc.OpenStatusUpdate> getOpenChannelMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.OpenChannelRequest, lightpay.lnd.grpc.OpenStatusUpdate> getOpenChannelMethod;
    if ((getOpenChannelMethod = LightningGrpc.getOpenChannelMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getOpenChannelMethod = LightningGrpc.getOpenChannelMethod) == null) {
          LightningGrpc.getOpenChannelMethod = getOpenChannelMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.OpenChannelRequest, lightpay.lnd.grpc.OpenStatusUpdate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "OpenChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.OpenChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.OpenStatusUpdate.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("OpenChannel"))
                  .build();
          }
        }
     }
     return getOpenChannelMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCloseChannelMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.CloseChannelRequest,
      lightpay.lnd.grpc.CloseStatusUpdate> METHOD_CLOSE_CHANNEL = getCloseChannelMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.CloseChannelRequest,
      lightpay.lnd.grpc.CloseStatusUpdate> getCloseChannelMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.CloseChannelRequest,
      lightpay.lnd.grpc.CloseStatusUpdate> getCloseChannelMethod() {
    return getCloseChannelMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.CloseChannelRequest,
      lightpay.lnd.grpc.CloseStatusUpdate> getCloseChannelMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.CloseChannelRequest, lightpay.lnd.grpc.CloseStatusUpdate> getCloseChannelMethod;
    if ((getCloseChannelMethod = LightningGrpc.getCloseChannelMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getCloseChannelMethod = LightningGrpc.getCloseChannelMethod) == null) {
          LightningGrpc.getCloseChannelMethod = getCloseChannelMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.CloseChannelRequest, lightpay.lnd.grpc.CloseStatusUpdate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "CloseChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.CloseChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.CloseStatusUpdate.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("CloseChannel"))
                  .build();
          }
        }
     }
     return getCloseChannelMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSendPaymentMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendRequest,
      lightpay.lnd.grpc.SendResponse> METHOD_SEND_PAYMENT = getSendPaymentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendRequest,
      lightpay.lnd.grpc.SendResponse> getSendPaymentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendRequest,
      lightpay.lnd.grpc.SendResponse> getSendPaymentMethod() {
    return getSendPaymentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendRequest,
      lightpay.lnd.grpc.SendResponse> getSendPaymentMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendRequest, lightpay.lnd.grpc.SendResponse> getSendPaymentMethod;
    if ((getSendPaymentMethod = LightningGrpc.getSendPaymentMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getSendPaymentMethod = LightningGrpc.getSendPaymentMethod) == null) {
          LightningGrpc.getSendPaymentMethod = getSendPaymentMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.SendRequest, lightpay.lnd.grpc.SendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "SendPayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.SendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.SendResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("SendPayment"))
                  .build();
          }
        }
     }
     return getSendPaymentMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSendPaymentSyncMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendRequest,
      lightpay.lnd.grpc.SendResponse> METHOD_SEND_PAYMENT_SYNC = getSendPaymentSyncMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendRequest,
      lightpay.lnd.grpc.SendResponse> getSendPaymentSyncMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendRequest,
      lightpay.lnd.grpc.SendResponse> getSendPaymentSyncMethod() {
    return getSendPaymentSyncMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendRequest,
      lightpay.lnd.grpc.SendResponse> getSendPaymentSyncMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.SendRequest, lightpay.lnd.grpc.SendResponse> getSendPaymentSyncMethod;
    if ((getSendPaymentSyncMethod = LightningGrpc.getSendPaymentSyncMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getSendPaymentSyncMethod = LightningGrpc.getSendPaymentSyncMethod) == null) {
          LightningGrpc.getSendPaymentSyncMethod = getSendPaymentSyncMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.SendRequest, lightpay.lnd.grpc.SendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "SendPaymentSync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.SendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.SendResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("SendPaymentSync"))
                  .build();
          }
        }
     }
     return getSendPaymentSyncMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAddInvoiceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.Invoice,
      lightpay.lnd.grpc.AddInvoiceResponse> METHOD_ADD_INVOICE = getAddInvoiceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.Invoice,
      lightpay.lnd.grpc.AddInvoiceResponse> getAddInvoiceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.Invoice,
      lightpay.lnd.grpc.AddInvoiceResponse> getAddInvoiceMethod() {
    return getAddInvoiceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.Invoice,
      lightpay.lnd.grpc.AddInvoiceResponse> getAddInvoiceMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.Invoice, lightpay.lnd.grpc.AddInvoiceResponse> getAddInvoiceMethod;
    if ((getAddInvoiceMethod = LightningGrpc.getAddInvoiceMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getAddInvoiceMethod = LightningGrpc.getAddInvoiceMethod) == null) {
          LightningGrpc.getAddInvoiceMethod = getAddInvoiceMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.Invoice, lightpay.lnd.grpc.AddInvoiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "AddInvoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.Invoice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.AddInvoiceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("AddInvoice"))
                  .build();
          }
        }
     }
     return getAddInvoiceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListInvoicesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListInvoiceRequest,
      lightpay.lnd.grpc.ListInvoiceResponse> METHOD_LIST_INVOICES = getListInvoicesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListInvoiceRequest,
      lightpay.lnd.grpc.ListInvoiceResponse> getListInvoicesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListInvoiceRequest,
      lightpay.lnd.grpc.ListInvoiceResponse> getListInvoicesMethod() {
    return getListInvoicesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListInvoiceRequest,
      lightpay.lnd.grpc.ListInvoiceResponse> getListInvoicesMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListInvoiceRequest, lightpay.lnd.grpc.ListInvoiceResponse> getListInvoicesMethod;
    if ((getListInvoicesMethod = LightningGrpc.getListInvoicesMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getListInvoicesMethod = LightningGrpc.getListInvoicesMethod) == null) {
          LightningGrpc.getListInvoicesMethod = getListInvoicesMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.ListInvoiceRequest, lightpay.lnd.grpc.ListInvoiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "ListInvoices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.ListInvoiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.ListInvoiceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("ListInvoices"))
                  .build();
          }
        }
     }
     return getListInvoicesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLookupInvoiceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.PaymentHash,
      lightpay.lnd.grpc.Invoice> METHOD_LOOKUP_INVOICE = getLookupInvoiceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.PaymentHash,
      lightpay.lnd.grpc.Invoice> getLookupInvoiceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.PaymentHash,
      lightpay.lnd.grpc.Invoice> getLookupInvoiceMethod() {
    return getLookupInvoiceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.PaymentHash,
      lightpay.lnd.grpc.Invoice> getLookupInvoiceMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.PaymentHash, lightpay.lnd.grpc.Invoice> getLookupInvoiceMethod;
    if ((getLookupInvoiceMethod = LightningGrpc.getLookupInvoiceMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getLookupInvoiceMethod = LightningGrpc.getLookupInvoiceMethod) == null) {
          LightningGrpc.getLookupInvoiceMethod = getLookupInvoiceMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.PaymentHash, lightpay.lnd.grpc.Invoice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "LookupInvoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.PaymentHash.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.Invoice.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("LookupInvoice"))
                  .build();
          }
        }
     }
     return getLookupInvoiceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSubscribeInvoicesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.InvoiceSubscription,
      lightpay.lnd.grpc.Invoice> METHOD_SUBSCRIBE_INVOICES = getSubscribeInvoicesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.InvoiceSubscription,
      lightpay.lnd.grpc.Invoice> getSubscribeInvoicesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.InvoiceSubscription,
      lightpay.lnd.grpc.Invoice> getSubscribeInvoicesMethod() {
    return getSubscribeInvoicesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.InvoiceSubscription,
      lightpay.lnd.grpc.Invoice> getSubscribeInvoicesMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.InvoiceSubscription, lightpay.lnd.grpc.Invoice> getSubscribeInvoicesMethod;
    if ((getSubscribeInvoicesMethod = LightningGrpc.getSubscribeInvoicesMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getSubscribeInvoicesMethod = LightningGrpc.getSubscribeInvoicesMethod) == null) {
          LightningGrpc.getSubscribeInvoicesMethod = getSubscribeInvoicesMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.InvoiceSubscription, lightpay.lnd.grpc.Invoice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "SubscribeInvoices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.InvoiceSubscription.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.Invoice.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("SubscribeInvoices"))
                  .build();
          }
        }
     }
     return getSubscribeInvoicesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDecodePayReqMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.PayReqString,
      lightpay.lnd.grpc.PayReq> METHOD_DECODE_PAY_REQ = getDecodePayReqMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.PayReqString,
      lightpay.lnd.grpc.PayReq> getDecodePayReqMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.PayReqString,
      lightpay.lnd.grpc.PayReq> getDecodePayReqMethod() {
    return getDecodePayReqMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.PayReqString,
      lightpay.lnd.grpc.PayReq> getDecodePayReqMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.PayReqString, lightpay.lnd.grpc.PayReq> getDecodePayReqMethod;
    if ((getDecodePayReqMethod = LightningGrpc.getDecodePayReqMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getDecodePayReqMethod = LightningGrpc.getDecodePayReqMethod) == null) {
          LightningGrpc.getDecodePayReqMethod = getDecodePayReqMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.PayReqString, lightpay.lnd.grpc.PayReq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "DecodePayReq"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.PayReqString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.PayReq.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("DecodePayReq"))
                  .build();
          }
        }
     }
     return getDecodePayReqMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListPaymentsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListPaymentsRequest,
      lightpay.lnd.grpc.ListPaymentsResponse> METHOD_LIST_PAYMENTS = getListPaymentsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListPaymentsRequest,
      lightpay.lnd.grpc.ListPaymentsResponse> getListPaymentsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListPaymentsRequest,
      lightpay.lnd.grpc.ListPaymentsResponse> getListPaymentsMethod() {
    return getListPaymentsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListPaymentsRequest,
      lightpay.lnd.grpc.ListPaymentsResponse> getListPaymentsMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.ListPaymentsRequest, lightpay.lnd.grpc.ListPaymentsResponse> getListPaymentsMethod;
    if ((getListPaymentsMethod = LightningGrpc.getListPaymentsMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getListPaymentsMethod = LightningGrpc.getListPaymentsMethod) == null) {
          LightningGrpc.getListPaymentsMethod = getListPaymentsMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.ListPaymentsRequest, lightpay.lnd.grpc.ListPaymentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "ListPayments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.ListPaymentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.ListPaymentsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("ListPayments"))
                  .build();
          }
        }
     }
     return getListPaymentsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteAllPaymentsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.DeleteAllPaymentsRequest,
      lightpay.lnd.grpc.DeleteAllPaymentsResponse> METHOD_DELETE_ALL_PAYMENTS = getDeleteAllPaymentsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.DeleteAllPaymentsRequest,
      lightpay.lnd.grpc.DeleteAllPaymentsResponse> getDeleteAllPaymentsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.DeleteAllPaymentsRequest,
      lightpay.lnd.grpc.DeleteAllPaymentsResponse> getDeleteAllPaymentsMethod() {
    return getDeleteAllPaymentsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.DeleteAllPaymentsRequest,
      lightpay.lnd.grpc.DeleteAllPaymentsResponse> getDeleteAllPaymentsMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.DeleteAllPaymentsRequest, lightpay.lnd.grpc.DeleteAllPaymentsResponse> getDeleteAllPaymentsMethod;
    if ((getDeleteAllPaymentsMethod = LightningGrpc.getDeleteAllPaymentsMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getDeleteAllPaymentsMethod = LightningGrpc.getDeleteAllPaymentsMethod) == null) {
          LightningGrpc.getDeleteAllPaymentsMethod = getDeleteAllPaymentsMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.DeleteAllPaymentsRequest, lightpay.lnd.grpc.DeleteAllPaymentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "DeleteAllPayments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.DeleteAllPaymentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.DeleteAllPaymentsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("DeleteAllPayments"))
                  .build();
          }
        }
     }
     return getDeleteAllPaymentsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDescribeGraphMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.ChannelGraphRequest,
      lightpay.lnd.grpc.ChannelGraph> METHOD_DESCRIBE_GRAPH = getDescribeGraphMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.ChannelGraphRequest,
      lightpay.lnd.grpc.ChannelGraph> getDescribeGraphMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.ChannelGraphRequest,
      lightpay.lnd.grpc.ChannelGraph> getDescribeGraphMethod() {
    return getDescribeGraphMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.ChannelGraphRequest,
      lightpay.lnd.grpc.ChannelGraph> getDescribeGraphMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.ChannelGraphRequest, lightpay.lnd.grpc.ChannelGraph> getDescribeGraphMethod;
    if ((getDescribeGraphMethod = LightningGrpc.getDescribeGraphMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getDescribeGraphMethod = LightningGrpc.getDescribeGraphMethod) == null) {
          LightningGrpc.getDescribeGraphMethod = getDescribeGraphMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.ChannelGraphRequest, lightpay.lnd.grpc.ChannelGraph>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "DescribeGraph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.ChannelGraphRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.ChannelGraph.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("DescribeGraph"))
                  .build();
          }
        }
     }
     return getDescribeGraphMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetChanInfoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.ChanInfoRequest,
      lightpay.lnd.grpc.ChannelEdge> METHOD_GET_CHAN_INFO = getGetChanInfoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.ChanInfoRequest,
      lightpay.lnd.grpc.ChannelEdge> getGetChanInfoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.ChanInfoRequest,
      lightpay.lnd.grpc.ChannelEdge> getGetChanInfoMethod() {
    return getGetChanInfoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.ChanInfoRequest,
      lightpay.lnd.grpc.ChannelEdge> getGetChanInfoMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.ChanInfoRequest, lightpay.lnd.grpc.ChannelEdge> getGetChanInfoMethod;
    if ((getGetChanInfoMethod = LightningGrpc.getGetChanInfoMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getGetChanInfoMethod = LightningGrpc.getGetChanInfoMethod) == null) {
          LightningGrpc.getGetChanInfoMethod = getGetChanInfoMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.ChanInfoRequest, lightpay.lnd.grpc.ChannelEdge>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "GetChanInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.ChanInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.ChannelEdge.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("GetChanInfo"))
                  .build();
          }
        }
     }
     return getGetChanInfoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetNodeInfoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.NodeInfoRequest,
      lightpay.lnd.grpc.NodeInfo> METHOD_GET_NODE_INFO = getGetNodeInfoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.NodeInfoRequest,
      lightpay.lnd.grpc.NodeInfo> getGetNodeInfoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.NodeInfoRequest,
      lightpay.lnd.grpc.NodeInfo> getGetNodeInfoMethod() {
    return getGetNodeInfoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.NodeInfoRequest,
      lightpay.lnd.grpc.NodeInfo> getGetNodeInfoMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.NodeInfoRequest, lightpay.lnd.grpc.NodeInfo> getGetNodeInfoMethod;
    if ((getGetNodeInfoMethod = LightningGrpc.getGetNodeInfoMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getGetNodeInfoMethod = LightningGrpc.getGetNodeInfoMethod) == null) {
          LightningGrpc.getGetNodeInfoMethod = getGetNodeInfoMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.NodeInfoRequest, lightpay.lnd.grpc.NodeInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "GetNodeInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.NodeInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.NodeInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("GetNodeInfo"))
                  .build();
          }
        }
     }
     return getGetNodeInfoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getQueryRoutesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.QueryRoutesRequest,
      lightpay.lnd.grpc.QueryRoutesResponse> METHOD_QUERY_ROUTES = getQueryRoutesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.QueryRoutesRequest,
      lightpay.lnd.grpc.QueryRoutesResponse> getQueryRoutesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.QueryRoutesRequest,
      lightpay.lnd.grpc.QueryRoutesResponse> getQueryRoutesMethod() {
    return getQueryRoutesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.QueryRoutesRequest,
      lightpay.lnd.grpc.QueryRoutesResponse> getQueryRoutesMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.QueryRoutesRequest, lightpay.lnd.grpc.QueryRoutesResponse> getQueryRoutesMethod;
    if ((getQueryRoutesMethod = LightningGrpc.getQueryRoutesMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getQueryRoutesMethod = LightningGrpc.getQueryRoutesMethod) == null) {
          LightningGrpc.getQueryRoutesMethod = getQueryRoutesMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.QueryRoutesRequest, lightpay.lnd.grpc.QueryRoutesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "QueryRoutes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.QueryRoutesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.QueryRoutesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("QueryRoutes"))
                  .build();
          }
        }
     }
     return getQueryRoutesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetNetworkInfoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.NetworkInfoRequest,
      lightpay.lnd.grpc.NetworkInfo> METHOD_GET_NETWORK_INFO = getGetNetworkInfoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.NetworkInfoRequest,
      lightpay.lnd.grpc.NetworkInfo> getGetNetworkInfoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.NetworkInfoRequest,
      lightpay.lnd.grpc.NetworkInfo> getGetNetworkInfoMethod() {
    return getGetNetworkInfoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.NetworkInfoRequest,
      lightpay.lnd.grpc.NetworkInfo> getGetNetworkInfoMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.NetworkInfoRequest, lightpay.lnd.grpc.NetworkInfo> getGetNetworkInfoMethod;
    if ((getGetNetworkInfoMethod = LightningGrpc.getGetNetworkInfoMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getGetNetworkInfoMethod = LightningGrpc.getGetNetworkInfoMethod) == null) {
          LightningGrpc.getGetNetworkInfoMethod = getGetNetworkInfoMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.NetworkInfoRequest, lightpay.lnd.grpc.NetworkInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "GetNetworkInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.NetworkInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.NetworkInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("GetNetworkInfo"))
                  .build();
          }
        }
     }
     return getGetNetworkInfoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getStopDaemonMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.StopRequest,
      lightpay.lnd.grpc.StopResponse> METHOD_STOP_DAEMON = getStopDaemonMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.StopRequest,
      lightpay.lnd.grpc.StopResponse> getStopDaemonMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.StopRequest,
      lightpay.lnd.grpc.StopResponse> getStopDaemonMethod() {
    return getStopDaemonMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.StopRequest,
      lightpay.lnd.grpc.StopResponse> getStopDaemonMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.StopRequest, lightpay.lnd.grpc.StopResponse> getStopDaemonMethod;
    if ((getStopDaemonMethod = LightningGrpc.getStopDaemonMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getStopDaemonMethod = LightningGrpc.getStopDaemonMethod) == null) {
          LightningGrpc.getStopDaemonMethod = getStopDaemonMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.StopRequest, lightpay.lnd.grpc.StopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "StopDaemon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.StopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.StopResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("StopDaemon"))
                  .build();
          }
        }
     }
     return getStopDaemonMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSubscribeChannelGraphMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.GraphTopologySubscription,
      lightpay.lnd.grpc.GraphTopologyUpdate> METHOD_SUBSCRIBE_CHANNEL_GRAPH = getSubscribeChannelGraphMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.GraphTopologySubscription,
      lightpay.lnd.grpc.GraphTopologyUpdate> getSubscribeChannelGraphMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.GraphTopologySubscription,
      lightpay.lnd.grpc.GraphTopologyUpdate> getSubscribeChannelGraphMethod() {
    return getSubscribeChannelGraphMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.GraphTopologySubscription,
      lightpay.lnd.grpc.GraphTopologyUpdate> getSubscribeChannelGraphMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.GraphTopologySubscription, lightpay.lnd.grpc.GraphTopologyUpdate> getSubscribeChannelGraphMethod;
    if ((getSubscribeChannelGraphMethod = LightningGrpc.getSubscribeChannelGraphMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getSubscribeChannelGraphMethod = LightningGrpc.getSubscribeChannelGraphMethod) == null) {
          LightningGrpc.getSubscribeChannelGraphMethod = getSubscribeChannelGraphMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.GraphTopologySubscription, lightpay.lnd.grpc.GraphTopologyUpdate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "SubscribeChannelGraph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.GraphTopologySubscription.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.GraphTopologyUpdate.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("SubscribeChannelGraph"))
                  .build();
          }
        }
     }
     return getSubscribeChannelGraphMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDebugLevelMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.DebugLevelRequest,
      lightpay.lnd.grpc.DebugLevelResponse> METHOD_DEBUG_LEVEL = getDebugLevelMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.DebugLevelRequest,
      lightpay.lnd.grpc.DebugLevelResponse> getDebugLevelMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.DebugLevelRequest,
      lightpay.lnd.grpc.DebugLevelResponse> getDebugLevelMethod() {
    return getDebugLevelMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.DebugLevelRequest,
      lightpay.lnd.grpc.DebugLevelResponse> getDebugLevelMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.DebugLevelRequest, lightpay.lnd.grpc.DebugLevelResponse> getDebugLevelMethod;
    if ((getDebugLevelMethod = LightningGrpc.getDebugLevelMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getDebugLevelMethod = LightningGrpc.getDebugLevelMethod) == null) {
          LightningGrpc.getDebugLevelMethod = getDebugLevelMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.DebugLevelRequest, lightpay.lnd.grpc.DebugLevelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "DebugLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.DebugLevelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.DebugLevelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("DebugLevel"))
                  .build();
          }
        }
     }
     return getDebugLevelMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFeeReportMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.FeeReportRequest,
      lightpay.lnd.grpc.FeeReportResponse> METHOD_FEE_REPORT = getFeeReportMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.FeeReportRequest,
      lightpay.lnd.grpc.FeeReportResponse> getFeeReportMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.FeeReportRequest,
      lightpay.lnd.grpc.FeeReportResponse> getFeeReportMethod() {
    return getFeeReportMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.FeeReportRequest,
      lightpay.lnd.grpc.FeeReportResponse> getFeeReportMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.FeeReportRequest, lightpay.lnd.grpc.FeeReportResponse> getFeeReportMethod;
    if ((getFeeReportMethod = LightningGrpc.getFeeReportMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getFeeReportMethod = LightningGrpc.getFeeReportMethod) == null) {
          LightningGrpc.getFeeReportMethod = getFeeReportMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.FeeReportRequest, lightpay.lnd.grpc.FeeReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "FeeReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.FeeReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.FeeReportResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("FeeReport"))
                  .build();
          }
        }
     }
     return getFeeReportMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateChannelPolicyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.PolicyUpdateRequest,
      lightpay.lnd.grpc.PolicyUpdateResponse> METHOD_UPDATE_CHANNEL_POLICY = getUpdateChannelPolicyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.PolicyUpdateRequest,
      lightpay.lnd.grpc.PolicyUpdateResponse> getUpdateChannelPolicyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.PolicyUpdateRequest,
      lightpay.lnd.grpc.PolicyUpdateResponse> getUpdateChannelPolicyMethod() {
    return getUpdateChannelPolicyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.PolicyUpdateRequest,
      lightpay.lnd.grpc.PolicyUpdateResponse> getUpdateChannelPolicyMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.PolicyUpdateRequest, lightpay.lnd.grpc.PolicyUpdateResponse> getUpdateChannelPolicyMethod;
    if ((getUpdateChannelPolicyMethod = LightningGrpc.getUpdateChannelPolicyMethod) == null) {
      synchronized (LightningGrpc.class) {
        if ((getUpdateChannelPolicyMethod = LightningGrpc.getUpdateChannelPolicyMethod) == null) {
          LightningGrpc.getUpdateChannelPolicyMethod = getUpdateChannelPolicyMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.PolicyUpdateRequest, lightpay.lnd.grpc.PolicyUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.Lightning", "UpdateChannelPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.PolicyUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.PolicyUpdateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightningMethodDescriptorSupplier("UpdateChannelPolicy"))
                  .build();
          }
        }
     }
     return getUpdateChannelPolicyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LightningStub newStub(io.grpc.Channel channel) {
    return new LightningStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LightningBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LightningBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LightningFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LightningFutureStub(channel);
  }

  /**
   */
  public static abstract class LightningImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     ** lncli: `walletbalance`
     *WalletBalance returns total unspent outputs(confirmed and unconfirmed), all confirmed unspent outputs and all unconfirmed unspent outputs under control
     *by the wallet. This method can be modified by having the request specify
     *only witness outputs should be factored into the final output sum.
     * </pre>
     */
    public void walletBalance(lightpay.lnd.grpc.WalletBalanceRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.WalletBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWalletBalanceMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `channelbalance`
     *ChannelBalance returns the total funds available across all open channels
     *in satoshis.
     * </pre>
     */
    public void channelBalance(lightpay.lnd.grpc.ChannelBalanceRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ChannelBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChannelBalanceMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `listchaintxns`
     *GetTransactions returns a list describing all the known transactions
     *relevant to the wallet.
     * </pre>
     */
    public void getTransactions(lightpay.lnd.grpc.GetTransactionsRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.TransactionDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `sendcoins`
     *SendCoins executes a request to send coins to a particular address. Unlike
     *SendMany, this RPC call only allows creating a single output at a time. If
     *neither target_conf, or sat_per_byte are set, then the internal wallet will
     *consult its fee model to determine a fee for the default confirmation
     *target.
     * </pre>
     */
    public void sendCoins(lightpay.lnd.grpc.SendCoinsRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.SendCoinsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendCoinsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     *SubscribeTransactions creates a uni-directional stream from the server to
     *the client in which any newly discovered transactions relevant to the
     *wallet are sent over.
     * </pre>
     */
    public void subscribeTransactions(lightpay.lnd.grpc.GetTransactionsRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeTransactionsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `sendmany`
     *SendMany handles a request for a transaction that creates multiple specified
     *outputs in parallel. If neither target_conf, or sat_per_byte are set, then
     *the internal wallet will consult its fee model to determine a fee for the
     *default confirmation target.
     * </pre>
     */
    public void sendMany(lightpay.lnd.grpc.SendManyRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.SendManyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendManyMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `newaddress`
     *NewAddress creates a new address under control of the local wallet.
     * </pre>
     */
    public void newAddress(lightpay.lnd.grpc.NewAddressRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.NewAddressResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNewAddressMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     *NewWitnessAddress creates a new witness address under control of the local wallet.
     * </pre>
     */
    public void newWitnessAddress(lightpay.lnd.grpc.NewWitnessAddressRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.NewAddressResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNewWitnessAddressMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `signmessage`
     *SignMessage signs a message with this node's private key. The returned
     *signature string is `zbase32` encoded and pubkey recoverable, meaning that
     *only the message digest and signature are needed for verification.
     * </pre>
     */
    public void signMessage(lightpay.lnd.grpc.SignMessageRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.SignMessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSignMessageMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `verifymessage`
     *VerifyMessage verifies a signature over a msg. The signature must be
     *zbase32 encoded and signed by an active node in the resident node's
     *channel database. In addition to returning the validity of the signature,
     *VerifyMessage also returns the recovered pubkey from the signature.
     * </pre>
     */
    public void verifyMessage(lightpay.lnd.grpc.VerifyMessageRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.VerifyMessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVerifyMessageMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `connect`
     *ConnectPeer attempts to establish a connection to a remote peer. This is at
     *the networking level, and is used for communication between nodes. This is
     *distinct from establishing a channel with a peer.
     * </pre>
     */
    public void connectPeer(lightpay.lnd.grpc.ConnectPeerRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ConnectPeerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConnectPeerMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `disconnect`
     *DisconnectPeer attempts to disconnect one peer from another identified by a
     *given pubKey. In the case that we currently have a pending or active channel
     *with the target peer, then this action will be not be allowed.
     * </pre>
     */
    public void disconnectPeer(lightpay.lnd.grpc.DisconnectPeerRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.DisconnectPeerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDisconnectPeerMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `listpeers`
     *ListPeers returns a verbose listing of all currently active peers.
     * </pre>
     */
    public void listPeers(lightpay.lnd.grpc.ListPeersRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ListPeersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListPeersMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `getinfo`
     *GetInfo returns general information concerning the lightning node including
     *it's identity pubkey, alias, the chains it is connected to, and information
     *concerning the number of open+pending channels.
     * </pre>
     */
    public void getInfo(lightpay.lnd.grpc.GetInfoRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.GetInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInfoMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `pendingchannels`
     *PendingChannels returns a list of all the channels that are currently
     *considered "pending". A channel is pending if it has finished the funding
     *workflow and is waiting for confirmations for the funding txn, or is in the
     *process of closure, either initiated cooperatively or non-cooperatively.
     * </pre>
     */
    public void pendingChannels(lightpay.lnd.grpc.PendingChannelsRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.PendingChannelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPendingChannelsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `listchannels`
     *ListChannels returns a description of all the open channels that this node
     *is a participant in.
     * </pre>
     */
    public void listChannels(lightpay.lnd.grpc.ListChannelsRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ListChannelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListChannelsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     *OpenChannelSync is a synchronous version of the OpenChannel RPC call. This
     *call is meant to be consumed by clients to the REST proxy. As with all
     *other sync calls, all byte slices are intended to be populated as hex
     *encoded strings.
     * </pre>
     */
    public void openChannelSync(lightpay.lnd.grpc.OpenChannelRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ChannelPoint> responseObserver) {
      asyncUnimplementedUnaryCall(getOpenChannelSyncMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `openchannel`
     *OpenChannel attempts to open a singly funded channel specified in the
     *request to a remote peer. Users are able to specify a target number of
     *blocks that the funding transaction should be confirmed in, or a manual fee
     *rate to us for the funding transaction. If neither are specified, then a
     *lax block confirmation target is used.
     * </pre>
     */
    public void openChannel(lightpay.lnd.grpc.OpenChannelRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.OpenStatusUpdate> responseObserver) {
      asyncUnimplementedUnaryCall(getOpenChannelMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `closechannel`
     *CloseChannel attempts to close an active channel identified by its channel
     *outpoint (ChannelPoint). The actions of this method can additionally be
     *augmented to attempt a force close after a timeout period in the case of an
     *inactive peer. If a non-force close (cooperative closure) is requested,
     *then the user can specify either a target number of blocks until the
     *closure transaction is confirmed, or a manual fee rate. If neither are
     *specified, then a default lax, block confirmation target is used.
     * </pre>
     */
    public void closeChannel(lightpay.lnd.grpc.CloseChannelRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.CloseStatusUpdate> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseChannelMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `sendpayment`
     *SendPayment dispatches a bi-directional streaming RPC for sending payments
     *through the Lightning Network. A single RPC invocation creates a persistent
     *bi-directional stream allowing clients to rapidly send payments through the
     *Lightning Network with a single persistent connection.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<lightpay.lnd.grpc.SendRequest> sendPayment(
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.SendResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendPaymentMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     *SendPaymentSync is the synchronous non-streaming version of SendPayment.
     *This RPC is intended to be consumed by clients of the REST proxy.
     *Additionally, this RPC expects the destination's public key and the payment
     *hash (if any) to be encoded as hex strings.
     * </pre>
     */
    public void sendPaymentSync(lightpay.lnd.grpc.SendRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.SendResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendPaymentSyncMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `addinvoice`
     *AddInvoice attempts to add a new invoice to the invoice database. Any
     *duplicated invoices are rejected, therefore all invoices *must* have a
     *unique payment preimage.
     * </pre>
     */
    public void addInvoice(lightpay.lnd.grpc.Invoice request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.AddInvoiceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddInvoiceMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `listinvoices`
     *ListInvoices returns a list of all the invoices currently stored within the
     *database. Any active debug invoices are ignored.
     * </pre>
     */
    public void listInvoices(lightpay.lnd.grpc.ListInvoiceRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ListInvoiceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListInvoicesMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `lookupinvoice`
     *LookupInvoice attempts to look up an invoice according to its payment hash.
     *The passed payment hash *must* be exactly 32 bytes, if not, an error is
     *returned.
     * </pre>
     */
    public void lookupInvoice(lightpay.lnd.grpc.PaymentHash request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.Invoice> responseObserver) {
      asyncUnimplementedUnaryCall(getLookupInvoiceMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     *SubscribeInvoices returns a uni-directional stream (sever -&gt; client) for
     *notifying the client of newly added/settled invoices.
     * </pre>
     */
    public void subscribeInvoices(lightpay.lnd.grpc.InvoiceSubscription request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.Invoice> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeInvoicesMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `decodepayreq`
     *DecodePayReq takes an encoded payment request string and attempts to decode
     *it, returning a full description of the conditions encoded within the
     *payment request.
     * </pre>
     */
    public void decodePayReq(lightpay.lnd.grpc.PayReqString request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.PayReq> responseObserver) {
      asyncUnimplementedUnaryCall(getDecodePayReqMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `listpayments`
     *ListPayments returns a list of all outgoing payments.
     * </pre>
     */
    public void listPayments(lightpay.lnd.grpc.ListPaymentsRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ListPaymentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListPaymentsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     *DeleteAllPayments deletes all outgoing payments from DB.
     * </pre>
     */
    public void deleteAllPayments(lightpay.lnd.grpc.DeleteAllPaymentsRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.DeleteAllPaymentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAllPaymentsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `describegraph`
     *DescribeGraph returns a description of the latest graph state from the
     *point of view of the node. The graph information is partitioned into two
     *components: all the nodes/vertexes, and all the edges that connect the
     *vertexes themselves.  As this is a directed graph, the edges also contain
     *the node directional specific routing policy which includes: the time lock
     *delta, fee information, etc.
     * </pre>
     */
    public void describeGraph(lightpay.lnd.grpc.ChannelGraphRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ChannelGraph> responseObserver) {
      asyncUnimplementedUnaryCall(getDescribeGraphMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `getchaninfo`
     *GetChanInfo returns the latest authenticated network announcement for the
     *given channel identified by its channel ID: an 8-byte integer which
     *uniquely identifies the location of transaction's funding output within the
     *blockchain.
     * </pre>
     */
    public void getChanInfo(lightpay.lnd.grpc.ChanInfoRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ChannelEdge> responseObserver) {
      asyncUnimplementedUnaryCall(getGetChanInfoMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `getnodeinfo`
     *GetNodeInfo returns the latest advertised, aggregated, and authenticated
     *channel information for the specified node identified by its public key.
     * </pre>
     */
    public void getNodeInfo(lightpay.lnd.grpc.NodeInfoRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.NodeInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNodeInfoMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `queryroutes`
     *QueryRoutes attempts to query the daemon's Channel Router for a possible
     *route to a target destination capable of carrying a specific amount of
     *satoshis. The retuned route contains the full details required to craft and
     *send an HTLC, also including the necessary information that should be
     *present within the Sphinx packet encapsulated within the HTLC.
     * </pre>
     */
    public void queryRoutes(lightpay.lnd.grpc.QueryRoutesRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.QueryRoutesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryRoutesMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `getnetworkinfo`
     *GetNetworkInfo returns some basic stats about the known channel graph from
     *the point of view of the node.
     * </pre>
     */
    public void getNetworkInfo(lightpay.lnd.grpc.NetworkInfoRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.NetworkInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNetworkInfoMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `stop`
     *StopDaemon will send a shutdown request to the interrupt handler, triggering
     *a graceful shutdown of the daemon.
     * </pre>
     */
    public void stopDaemon(lightpay.lnd.grpc.StopRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.StopResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStopDaemonMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     *SubscribeChannelGraph launches a streaming RPC that allows the caller to
     *receive notifications upon any changes to the channel graph topology from
     *the point of view of the responding node. Events notified include: new
     *nodes coming online, nodes updating their authenticated attributes, new
     *channels being advertised, updates in the routing policy for a directional
     *channel edge, and when channels are closed on-chain.
     * </pre>
     */
    public void subscribeChannelGraph(lightpay.lnd.grpc.GraphTopologySubscription request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.GraphTopologyUpdate> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeChannelGraphMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `debuglevel`
     *DebugLevel allows a caller to programmatically set the logging verbosity of
     *lnd. The logging can be targeted according to a coarse daemon-wide logging
     *level, or in a granular fashion to specify the logging for a target
     *sub-system.
     * </pre>
     */
    public void debugLevel(lightpay.lnd.grpc.DebugLevelRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.DebugLevelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDebugLevelMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `feereport`
     *FeeReport allows the caller to obtain a report detailing the current fee
     *schedule enforced by the node globally for each channel.
     * </pre>
     */
    public void feeReport(lightpay.lnd.grpc.FeeReportRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.FeeReportResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFeeReportMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `updatechanpolicy`
     *UpdateChannelPolicy allows the caller to update the fee schedule and
     *channel policies for all channels globally, or a particular channel.
     * </pre>
     */
    public void updateChannelPolicy(lightpay.lnd.grpc.PolicyUpdateRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.PolicyUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateChannelPolicyMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWalletBalanceMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.WalletBalanceRequest,
                lightpay.lnd.grpc.WalletBalanceResponse>(
                  this, METHODID_WALLET_BALANCE)))
          .addMethod(
            getChannelBalanceMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.ChannelBalanceRequest,
                lightpay.lnd.grpc.ChannelBalanceResponse>(
                  this, METHODID_CHANNEL_BALANCE)))
          .addMethod(
            getGetTransactionsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.GetTransactionsRequest,
                lightpay.lnd.grpc.TransactionDetails>(
                  this, METHODID_GET_TRANSACTIONS)))
          .addMethod(
            getSendCoinsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.SendCoinsRequest,
                lightpay.lnd.grpc.SendCoinsResponse>(
                  this, METHODID_SEND_COINS)))
          .addMethod(
            getSubscribeTransactionsMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                lightpay.lnd.grpc.GetTransactionsRequest,
                lightpay.lnd.grpc.Transaction>(
                  this, METHODID_SUBSCRIBE_TRANSACTIONS)))
          .addMethod(
            getSendManyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.SendManyRequest,
                lightpay.lnd.grpc.SendManyResponse>(
                  this, METHODID_SEND_MANY)))
          .addMethod(
            getNewAddressMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.NewAddressRequest,
                lightpay.lnd.grpc.NewAddressResponse>(
                  this, METHODID_NEW_ADDRESS)))
          .addMethod(
            getNewWitnessAddressMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.NewWitnessAddressRequest,
                lightpay.lnd.grpc.NewAddressResponse>(
                  this, METHODID_NEW_WITNESS_ADDRESS)))
          .addMethod(
            getSignMessageMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.SignMessageRequest,
                lightpay.lnd.grpc.SignMessageResponse>(
                  this, METHODID_SIGN_MESSAGE)))
          .addMethod(
            getVerifyMessageMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.VerifyMessageRequest,
                lightpay.lnd.grpc.VerifyMessageResponse>(
                  this, METHODID_VERIFY_MESSAGE)))
          .addMethod(
            getConnectPeerMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.ConnectPeerRequest,
                lightpay.lnd.grpc.ConnectPeerResponse>(
                  this, METHODID_CONNECT_PEER)))
          .addMethod(
            getDisconnectPeerMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.DisconnectPeerRequest,
                lightpay.lnd.grpc.DisconnectPeerResponse>(
                  this, METHODID_DISCONNECT_PEER)))
          .addMethod(
            getListPeersMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.ListPeersRequest,
                lightpay.lnd.grpc.ListPeersResponse>(
                  this, METHODID_LIST_PEERS)))
          .addMethod(
            getGetInfoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.GetInfoRequest,
                lightpay.lnd.grpc.GetInfoResponse>(
                  this, METHODID_GET_INFO)))
          .addMethod(
            getPendingChannelsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.PendingChannelsRequest,
                lightpay.lnd.grpc.PendingChannelsResponse>(
                  this, METHODID_PENDING_CHANNELS)))
          .addMethod(
            getListChannelsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.ListChannelsRequest,
                lightpay.lnd.grpc.ListChannelsResponse>(
                  this, METHODID_LIST_CHANNELS)))
          .addMethod(
            getOpenChannelSyncMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.OpenChannelRequest,
                lightpay.lnd.grpc.ChannelPoint>(
                  this, METHODID_OPEN_CHANNEL_SYNC)))
          .addMethod(
            getOpenChannelMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                lightpay.lnd.grpc.OpenChannelRequest,
                lightpay.lnd.grpc.OpenStatusUpdate>(
                  this, METHODID_OPEN_CHANNEL)))
          .addMethod(
            getCloseChannelMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                lightpay.lnd.grpc.CloseChannelRequest,
                lightpay.lnd.grpc.CloseStatusUpdate>(
                  this, METHODID_CLOSE_CHANNEL)))
          .addMethod(
            getSendPaymentMethodHelper(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                lightpay.lnd.grpc.SendRequest,
                lightpay.lnd.grpc.SendResponse>(
                  this, METHODID_SEND_PAYMENT)))
          .addMethod(
            getSendPaymentSyncMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.SendRequest,
                lightpay.lnd.grpc.SendResponse>(
                  this, METHODID_SEND_PAYMENT_SYNC)))
          .addMethod(
            getAddInvoiceMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.Invoice,
                lightpay.lnd.grpc.AddInvoiceResponse>(
                  this, METHODID_ADD_INVOICE)))
          .addMethod(
            getListInvoicesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.ListInvoiceRequest,
                lightpay.lnd.grpc.ListInvoiceResponse>(
                  this, METHODID_LIST_INVOICES)))
          .addMethod(
            getLookupInvoiceMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.PaymentHash,
                lightpay.lnd.grpc.Invoice>(
                  this, METHODID_LOOKUP_INVOICE)))
          .addMethod(
            getSubscribeInvoicesMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                lightpay.lnd.grpc.InvoiceSubscription,
                lightpay.lnd.grpc.Invoice>(
                  this, METHODID_SUBSCRIBE_INVOICES)))
          .addMethod(
            getDecodePayReqMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.PayReqString,
                lightpay.lnd.grpc.PayReq>(
                  this, METHODID_DECODE_PAY_REQ)))
          .addMethod(
            getListPaymentsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.ListPaymentsRequest,
                lightpay.lnd.grpc.ListPaymentsResponse>(
                  this, METHODID_LIST_PAYMENTS)))
          .addMethod(
            getDeleteAllPaymentsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.DeleteAllPaymentsRequest,
                lightpay.lnd.grpc.DeleteAllPaymentsResponse>(
                  this, METHODID_DELETE_ALL_PAYMENTS)))
          .addMethod(
            getDescribeGraphMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.ChannelGraphRequest,
                lightpay.lnd.grpc.ChannelGraph>(
                  this, METHODID_DESCRIBE_GRAPH)))
          .addMethod(
            getGetChanInfoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.ChanInfoRequest,
                lightpay.lnd.grpc.ChannelEdge>(
                  this, METHODID_GET_CHAN_INFO)))
          .addMethod(
            getGetNodeInfoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.NodeInfoRequest,
                lightpay.lnd.grpc.NodeInfo>(
                  this, METHODID_GET_NODE_INFO)))
          .addMethod(
            getQueryRoutesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.QueryRoutesRequest,
                lightpay.lnd.grpc.QueryRoutesResponse>(
                  this, METHODID_QUERY_ROUTES)))
          .addMethod(
            getGetNetworkInfoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.NetworkInfoRequest,
                lightpay.lnd.grpc.NetworkInfo>(
                  this, METHODID_GET_NETWORK_INFO)))
          .addMethod(
            getStopDaemonMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.StopRequest,
                lightpay.lnd.grpc.StopResponse>(
                  this, METHODID_STOP_DAEMON)))
          .addMethod(
            getSubscribeChannelGraphMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                lightpay.lnd.grpc.GraphTopologySubscription,
                lightpay.lnd.grpc.GraphTopologyUpdate>(
                  this, METHODID_SUBSCRIBE_CHANNEL_GRAPH)))
          .addMethod(
            getDebugLevelMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.DebugLevelRequest,
                lightpay.lnd.grpc.DebugLevelResponse>(
                  this, METHODID_DEBUG_LEVEL)))
          .addMethod(
            getFeeReportMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.FeeReportRequest,
                lightpay.lnd.grpc.FeeReportResponse>(
                  this, METHODID_FEE_REPORT)))
          .addMethod(
            getUpdateChannelPolicyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.PolicyUpdateRequest,
                lightpay.lnd.grpc.PolicyUpdateResponse>(
                  this, METHODID_UPDATE_CHANNEL_POLICY)))
          .build();
    }
  }

  /**
   */
  public static final class LightningStub extends io.grpc.stub.AbstractStub<LightningStub> {
    private LightningStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightningStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightningStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightningStub(channel, callOptions);
    }

    /**
     * <pre>
     ** lncli: `walletbalance`
     *WalletBalance returns total unspent outputs(confirmed and unconfirmed), all confirmed unspent outputs and all unconfirmed unspent outputs under control
     *by the wallet. This method can be modified by having the request specify
     *only witness outputs should be factored into the final output sum.
     * </pre>
     */
    public void walletBalance(lightpay.lnd.grpc.WalletBalanceRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.WalletBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWalletBalanceMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `channelbalance`
     *ChannelBalance returns the total funds available across all open channels
     *in satoshis.
     * </pre>
     */
    public void channelBalance(lightpay.lnd.grpc.ChannelBalanceRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ChannelBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChannelBalanceMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `listchaintxns`
     *GetTransactions returns a list describing all the known transactions
     *relevant to the wallet.
     * </pre>
     */
    public void getTransactions(lightpay.lnd.grpc.GetTransactionsRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.TransactionDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `sendcoins`
     *SendCoins executes a request to send coins to a particular address. Unlike
     *SendMany, this RPC call only allows creating a single output at a time. If
     *neither target_conf, or sat_per_byte are set, then the internal wallet will
     *consult its fee model to determine a fee for the default confirmation
     *target.
     * </pre>
     */
    public void sendCoins(lightpay.lnd.grpc.SendCoinsRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.SendCoinsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendCoinsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *SubscribeTransactions creates a uni-directional stream from the server to
     *the client in which any newly discovered transactions relevant to the
     *wallet are sent over.
     * </pre>
     */
    public void subscribeTransactions(lightpay.lnd.grpc.GetTransactionsRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.Transaction> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeTransactionsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `sendmany`
     *SendMany handles a request for a transaction that creates multiple specified
     *outputs in parallel. If neither target_conf, or sat_per_byte are set, then
     *the internal wallet will consult its fee model to determine a fee for the
     *default confirmation target.
     * </pre>
     */
    public void sendMany(lightpay.lnd.grpc.SendManyRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.SendManyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendManyMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `newaddress`
     *NewAddress creates a new address under control of the local wallet.
     * </pre>
     */
    public void newAddress(lightpay.lnd.grpc.NewAddressRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.NewAddressResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewAddressMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *NewWitnessAddress creates a new witness address under control of the local wallet.
     * </pre>
     */
    public void newWitnessAddress(lightpay.lnd.grpc.NewWitnessAddressRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.NewAddressResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewWitnessAddressMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `signmessage`
     *SignMessage signs a message with this node's private key. The returned
     *signature string is `zbase32` encoded and pubkey recoverable, meaning that
     *only the message digest and signature are needed for verification.
     * </pre>
     */
    public void signMessage(lightpay.lnd.grpc.SignMessageRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.SignMessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignMessageMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `verifymessage`
     *VerifyMessage verifies a signature over a msg. The signature must be
     *zbase32 encoded and signed by an active node in the resident node's
     *channel database. In addition to returning the validity of the signature,
     *VerifyMessage also returns the recovered pubkey from the signature.
     * </pre>
     */
    public void verifyMessage(lightpay.lnd.grpc.VerifyMessageRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.VerifyMessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerifyMessageMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `connect`
     *ConnectPeer attempts to establish a connection to a remote peer. This is at
     *the networking level, and is used for communication between nodes. This is
     *distinct from establishing a channel with a peer.
     * </pre>
     */
    public void connectPeer(lightpay.lnd.grpc.ConnectPeerRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ConnectPeerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConnectPeerMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `disconnect`
     *DisconnectPeer attempts to disconnect one peer from another identified by a
     *given pubKey. In the case that we currently have a pending or active channel
     *with the target peer, then this action will be not be allowed.
     * </pre>
     */
    public void disconnectPeer(lightpay.lnd.grpc.DisconnectPeerRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.DisconnectPeerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisconnectPeerMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `listpeers`
     *ListPeers returns a verbose listing of all currently active peers.
     * </pre>
     */
    public void listPeers(lightpay.lnd.grpc.ListPeersRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ListPeersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPeersMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `getinfo`
     *GetInfo returns general information concerning the lightning node including
     *it's identity pubkey, alias, the chains it is connected to, and information
     *concerning the number of open+pending channels.
     * </pre>
     */
    public void getInfo(lightpay.lnd.grpc.GetInfoRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.GetInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInfoMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `pendingchannels`
     *PendingChannels returns a list of all the channels that are currently
     *considered "pending". A channel is pending if it has finished the funding
     *workflow and is waiting for confirmations for the funding txn, or is in the
     *process of closure, either initiated cooperatively or non-cooperatively.
     * </pre>
     */
    public void pendingChannels(lightpay.lnd.grpc.PendingChannelsRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.PendingChannelsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPendingChannelsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `listchannels`
     *ListChannels returns a description of all the open channels that this node
     *is a participant in.
     * </pre>
     */
    public void listChannels(lightpay.lnd.grpc.ListChannelsRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ListChannelsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListChannelsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *OpenChannelSync is a synchronous version of the OpenChannel RPC call. This
     *call is meant to be consumed by clients to the REST proxy. As with all
     *other sync calls, all byte slices are intended to be populated as hex
     *encoded strings.
     * </pre>
     */
    public void openChannelSync(lightpay.lnd.grpc.OpenChannelRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ChannelPoint> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOpenChannelSyncMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `openchannel`
     *OpenChannel attempts to open a singly funded channel specified in the
     *request to a remote peer. Users are able to specify a target number of
     *blocks that the funding transaction should be confirmed in, or a manual fee
     *rate to us for the funding transaction. If neither are specified, then a
     *lax block confirmation target is used.
     * </pre>
     */
    public void openChannel(lightpay.lnd.grpc.OpenChannelRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.OpenStatusUpdate> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getOpenChannelMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `closechannel`
     *CloseChannel attempts to close an active channel identified by its channel
     *outpoint (ChannelPoint). The actions of this method can additionally be
     *augmented to attempt a force close after a timeout period in the case of an
     *inactive peer. If a non-force close (cooperative closure) is requested,
     *then the user can specify either a target number of blocks until the
     *closure transaction is confirmed, or a manual fee rate. If neither are
     *specified, then a default lax, block confirmation target is used.
     * </pre>
     */
    public void closeChannel(lightpay.lnd.grpc.CloseChannelRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.CloseStatusUpdate> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCloseChannelMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `sendpayment`
     *SendPayment dispatches a bi-directional streaming RPC for sending payments
     *through the Lightning Network. A single RPC invocation creates a persistent
     *bi-directional stream allowing clients to rapidly send payments through the
     *Lightning Network with a single persistent connection.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<lightpay.lnd.grpc.SendRequest> sendPayment(
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.SendResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendPaymentMethodHelper(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     **
     *SendPaymentSync is the synchronous non-streaming version of SendPayment.
     *This RPC is intended to be consumed by clients of the REST proxy.
     *Additionally, this RPC expects the destination's public key and the payment
     *hash (if any) to be encoded as hex strings.
     * </pre>
     */
    public void sendPaymentSync(lightpay.lnd.grpc.SendRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.SendResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendPaymentSyncMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `addinvoice`
     *AddInvoice attempts to add a new invoice to the invoice database. Any
     *duplicated invoices are rejected, therefore all invoices *must* have a
     *unique payment preimage.
     * </pre>
     */
    public void addInvoice(lightpay.lnd.grpc.Invoice request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.AddInvoiceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddInvoiceMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `listinvoices`
     *ListInvoices returns a list of all the invoices currently stored within the
     *database. Any active debug invoices are ignored.
     * </pre>
     */
    public void listInvoices(lightpay.lnd.grpc.ListInvoiceRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ListInvoiceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListInvoicesMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `lookupinvoice`
     *LookupInvoice attempts to look up an invoice according to its payment hash.
     *The passed payment hash *must* be exactly 32 bytes, if not, an error is
     *returned.
     * </pre>
     */
    public void lookupInvoice(lightpay.lnd.grpc.PaymentHash request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.Invoice> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLookupInvoiceMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *SubscribeInvoices returns a uni-directional stream (sever -&gt; client) for
     *notifying the client of newly added/settled invoices.
     * </pre>
     */
    public void subscribeInvoices(lightpay.lnd.grpc.InvoiceSubscription request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.Invoice> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeInvoicesMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `decodepayreq`
     *DecodePayReq takes an encoded payment request string and attempts to decode
     *it, returning a full description of the conditions encoded within the
     *payment request.
     * </pre>
     */
    public void decodePayReq(lightpay.lnd.grpc.PayReqString request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.PayReq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDecodePayReqMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `listpayments`
     *ListPayments returns a list of all outgoing payments.
     * </pre>
     */
    public void listPayments(lightpay.lnd.grpc.ListPaymentsRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ListPaymentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPaymentsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *DeleteAllPayments deletes all outgoing payments from DB.
     * </pre>
     */
    public void deleteAllPayments(lightpay.lnd.grpc.DeleteAllPaymentsRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.DeleteAllPaymentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAllPaymentsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `describegraph`
     *DescribeGraph returns a description of the latest graph state from the
     *point of view of the node. The graph information is partitioned into two
     *components: all the nodes/vertexes, and all the edges that connect the
     *vertexes themselves.  As this is a directed graph, the edges also contain
     *the node directional specific routing policy which includes: the time lock
     *delta, fee information, etc.
     * </pre>
     */
    public void describeGraph(lightpay.lnd.grpc.ChannelGraphRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ChannelGraph> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDescribeGraphMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `getchaninfo`
     *GetChanInfo returns the latest authenticated network announcement for the
     *given channel identified by its channel ID: an 8-byte integer which
     *uniquely identifies the location of transaction's funding output within the
     *blockchain.
     * </pre>
     */
    public void getChanInfo(lightpay.lnd.grpc.ChanInfoRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ChannelEdge> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetChanInfoMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `getnodeinfo`
     *GetNodeInfo returns the latest advertised, aggregated, and authenticated
     *channel information for the specified node identified by its public key.
     * </pre>
     */
    public void getNodeInfo(lightpay.lnd.grpc.NodeInfoRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.NodeInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNodeInfoMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `queryroutes`
     *QueryRoutes attempts to query the daemon's Channel Router for a possible
     *route to a target destination capable of carrying a specific amount of
     *satoshis. The retuned route contains the full details required to craft and
     *send an HTLC, also including the necessary information that should be
     *present within the Sphinx packet encapsulated within the HTLC.
     * </pre>
     */
    public void queryRoutes(lightpay.lnd.grpc.QueryRoutesRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.QueryRoutesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryRoutesMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `getnetworkinfo`
     *GetNetworkInfo returns some basic stats about the known channel graph from
     *the point of view of the node.
     * </pre>
     */
    public void getNetworkInfo(lightpay.lnd.grpc.NetworkInfoRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.NetworkInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNetworkInfoMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `stop`
     *StopDaemon will send a shutdown request to the interrupt handler, triggering
     *a graceful shutdown of the daemon.
     * </pre>
     */
    public void stopDaemon(lightpay.lnd.grpc.StopRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.StopResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopDaemonMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *SubscribeChannelGraph launches a streaming RPC that allows the caller to
     *receive notifications upon any changes to the channel graph topology from
     *the point of view of the responding node. Events notified include: new
     *nodes coming online, nodes updating their authenticated attributes, new
     *channels being advertised, updates in the routing policy for a directional
     *channel edge, and when channels are closed on-chain.
     * </pre>
     */
    public void subscribeChannelGraph(lightpay.lnd.grpc.GraphTopologySubscription request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.GraphTopologyUpdate> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeChannelGraphMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `debuglevel`
     *DebugLevel allows a caller to programmatically set the logging verbosity of
     *lnd. The logging can be targeted according to a coarse daemon-wide logging
     *level, or in a granular fashion to specify the logging for a target
     *sub-system.
     * </pre>
     */
    public void debugLevel(lightpay.lnd.grpc.DebugLevelRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.DebugLevelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDebugLevelMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `feereport`
     *FeeReport allows the caller to obtain a report detailing the current fee
     *schedule enforced by the node globally for each channel.
     * </pre>
     */
    public void feeReport(lightpay.lnd.grpc.FeeReportRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.FeeReportResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFeeReportMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `updatechanpolicy`
     *UpdateChannelPolicy allows the caller to update the fee schedule and
     *channel policies for all channels globally, or a particular channel.
     * </pre>
     */
    public void updateChannelPolicy(lightpay.lnd.grpc.PolicyUpdateRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.PolicyUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateChannelPolicyMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LightningBlockingStub extends io.grpc.stub.AbstractStub<LightningBlockingStub> {
    private LightningBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightningBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightningBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightningBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     ** lncli: `walletbalance`
     *WalletBalance returns total unspent outputs(confirmed and unconfirmed), all confirmed unspent outputs and all unconfirmed unspent outputs under control
     *by the wallet. This method can be modified by having the request specify
     *only witness outputs should be factored into the final output sum.
     * </pre>
     */
    public lightpay.lnd.grpc.WalletBalanceResponse walletBalance(lightpay.lnd.grpc.WalletBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getWalletBalanceMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `channelbalance`
     *ChannelBalance returns the total funds available across all open channels
     *in satoshis.
     * </pre>
     */
    public lightpay.lnd.grpc.ChannelBalanceResponse channelBalance(lightpay.lnd.grpc.ChannelBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getChannelBalanceMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `listchaintxns`
     *GetTransactions returns a list describing all the known transactions
     *relevant to the wallet.
     * </pre>
     */
    public lightpay.lnd.grpc.TransactionDetails getTransactions(lightpay.lnd.grpc.GetTransactionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `sendcoins`
     *SendCoins executes a request to send coins to a particular address. Unlike
     *SendMany, this RPC call only allows creating a single output at a time. If
     *neither target_conf, or sat_per_byte are set, then the internal wallet will
     *consult its fee model to determine a fee for the default confirmation
     *target.
     * </pre>
     */
    public lightpay.lnd.grpc.SendCoinsResponse sendCoins(lightpay.lnd.grpc.SendCoinsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendCoinsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *SubscribeTransactions creates a uni-directional stream from the server to
     *the client in which any newly discovered transactions relevant to the
     *wallet are sent over.
     * </pre>
     */
    public java.util.Iterator<lightpay.lnd.grpc.Transaction> subscribeTransactions(
        lightpay.lnd.grpc.GetTransactionsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeTransactionsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `sendmany`
     *SendMany handles a request for a transaction that creates multiple specified
     *outputs in parallel. If neither target_conf, or sat_per_byte are set, then
     *the internal wallet will consult its fee model to determine a fee for the
     *default confirmation target.
     * </pre>
     */
    public lightpay.lnd.grpc.SendManyResponse sendMany(lightpay.lnd.grpc.SendManyRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendManyMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `newaddress`
     *NewAddress creates a new address under control of the local wallet.
     * </pre>
     */
    public lightpay.lnd.grpc.NewAddressResponse newAddress(lightpay.lnd.grpc.NewAddressRequest request) {
      return blockingUnaryCall(
          getChannel(), getNewAddressMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *NewWitnessAddress creates a new witness address under control of the local wallet.
     * </pre>
     */
    public lightpay.lnd.grpc.NewAddressResponse newWitnessAddress(lightpay.lnd.grpc.NewWitnessAddressRequest request) {
      return blockingUnaryCall(
          getChannel(), getNewWitnessAddressMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `signmessage`
     *SignMessage signs a message with this node's private key. The returned
     *signature string is `zbase32` encoded and pubkey recoverable, meaning that
     *only the message digest and signature are needed for verification.
     * </pre>
     */
    public lightpay.lnd.grpc.SignMessageResponse signMessage(lightpay.lnd.grpc.SignMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getSignMessageMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `verifymessage`
     *VerifyMessage verifies a signature over a msg. The signature must be
     *zbase32 encoded and signed by an active node in the resident node's
     *channel database. In addition to returning the validity of the signature,
     *VerifyMessage also returns the recovered pubkey from the signature.
     * </pre>
     */
    public lightpay.lnd.grpc.VerifyMessageResponse verifyMessage(lightpay.lnd.grpc.VerifyMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getVerifyMessageMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `connect`
     *ConnectPeer attempts to establish a connection to a remote peer. This is at
     *the networking level, and is used for communication between nodes. This is
     *distinct from establishing a channel with a peer.
     * </pre>
     */
    public lightpay.lnd.grpc.ConnectPeerResponse connectPeer(lightpay.lnd.grpc.ConnectPeerRequest request) {
      return blockingUnaryCall(
          getChannel(), getConnectPeerMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `disconnect`
     *DisconnectPeer attempts to disconnect one peer from another identified by a
     *given pubKey. In the case that we currently have a pending or active channel
     *with the target peer, then this action will be not be allowed.
     * </pre>
     */
    public lightpay.lnd.grpc.DisconnectPeerResponse disconnectPeer(lightpay.lnd.grpc.DisconnectPeerRequest request) {
      return blockingUnaryCall(
          getChannel(), getDisconnectPeerMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `listpeers`
     *ListPeers returns a verbose listing of all currently active peers.
     * </pre>
     */
    public lightpay.lnd.grpc.ListPeersResponse listPeers(lightpay.lnd.grpc.ListPeersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListPeersMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `getinfo`
     *GetInfo returns general information concerning the lightning node including
     *it's identity pubkey, alias, the chains it is connected to, and information
     *concerning the number of open+pending channels.
     * </pre>
     */
    public lightpay.lnd.grpc.GetInfoResponse getInfo(lightpay.lnd.grpc.GetInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInfoMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `pendingchannels`
     *PendingChannels returns a list of all the channels that are currently
     *considered "pending". A channel is pending if it has finished the funding
     *workflow and is waiting for confirmations for the funding txn, or is in the
     *process of closure, either initiated cooperatively or non-cooperatively.
     * </pre>
     */
    public lightpay.lnd.grpc.PendingChannelsResponse pendingChannels(lightpay.lnd.grpc.PendingChannelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPendingChannelsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `listchannels`
     *ListChannels returns a description of all the open channels that this node
     *is a participant in.
     * </pre>
     */
    public lightpay.lnd.grpc.ListChannelsResponse listChannels(lightpay.lnd.grpc.ListChannelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListChannelsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *OpenChannelSync is a synchronous version of the OpenChannel RPC call. This
     *call is meant to be consumed by clients to the REST proxy. As with all
     *other sync calls, all byte slices are intended to be populated as hex
     *encoded strings.
     * </pre>
     */
    public lightpay.lnd.grpc.ChannelPoint openChannelSync(lightpay.lnd.grpc.OpenChannelRequest request) {
      return blockingUnaryCall(
          getChannel(), getOpenChannelSyncMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `openchannel`
     *OpenChannel attempts to open a singly funded channel specified in the
     *request to a remote peer. Users are able to specify a target number of
     *blocks that the funding transaction should be confirmed in, or a manual fee
     *rate to us for the funding transaction. If neither are specified, then a
     *lax block confirmation target is used.
     * </pre>
     */
    public java.util.Iterator<lightpay.lnd.grpc.OpenStatusUpdate> openChannel(
        lightpay.lnd.grpc.OpenChannelRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getOpenChannelMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `closechannel`
     *CloseChannel attempts to close an active channel identified by its channel
     *outpoint (ChannelPoint). The actions of this method can additionally be
     *augmented to attempt a force close after a timeout period in the case of an
     *inactive peer. If a non-force close (cooperative closure) is requested,
     *then the user can specify either a target number of blocks until the
     *closure transaction is confirmed, or a manual fee rate. If neither are
     *specified, then a default lax, block confirmation target is used.
     * </pre>
     */
    public java.util.Iterator<lightpay.lnd.grpc.CloseStatusUpdate> closeChannel(
        lightpay.lnd.grpc.CloseChannelRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getCloseChannelMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *SendPaymentSync is the synchronous non-streaming version of SendPayment.
     *This RPC is intended to be consumed by clients of the REST proxy.
     *Additionally, this RPC expects the destination's public key and the payment
     *hash (if any) to be encoded as hex strings.
     * </pre>
     */
    public lightpay.lnd.grpc.SendResponse sendPaymentSync(lightpay.lnd.grpc.SendRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendPaymentSyncMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `addinvoice`
     *AddInvoice attempts to add a new invoice to the invoice database. Any
     *duplicated invoices are rejected, therefore all invoices *must* have a
     *unique payment preimage.
     * </pre>
     */
    public lightpay.lnd.grpc.AddInvoiceResponse addInvoice(lightpay.lnd.grpc.Invoice request) {
      return blockingUnaryCall(
          getChannel(), getAddInvoiceMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `listinvoices`
     *ListInvoices returns a list of all the invoices currently stored within the
     *database. Any active debug invoices are ignored.
     * </pre>
     */
    public lightpay.lnd.grpc.ListInvoiceResponse listInvoices(lightpay.lnd.grpc.ListInvoiceRequest request) {
      return blockingUnaryCall(
          getChannel(), getListInvoicesMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `lookupinvoice`
     *LookupInvoice attempts to look up an invoice according to its payment hash.
     *The passed payment hash *must* be exactly 32 bytes, if not, an error is
     *returned.
     * </pre>
     */
    public lightpay.lnd.grpc.Invoice lookupInvoice(lightpay.lnd.grpc.PaymentHash request) {
      return blockingUnaryCall(
          getChannel(), getLookupInvoiceMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *SubscribeInvoices returns a uni-directional stream (sever -&gt; client) for
     *notifying the client of newly added/settled invoices.
     * </pre>
     */
    public java.util.Iterator<lightpay.lnd.grpc.Invoice> subscribeInvoices(
        lightpay.lnd.grpc.InvoiceSubscription request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeInvoicesMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `decodepayreq`
     *DecodePayReq takes an encoded payment request string and attempts to decode
     *it, returning a full description of the conditions encoded within the
     *payment request.
     * </pre>
     */
    public lightpay.lnd.grpc.PayReq decodePayReq(lightpay.lnd.grpc.PayReqString request) {
      return blockingUnaryCall(
          getChannel(), getDecodePayReqMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `listpayments`
     *ListPayments returns a list of all outgoing payments.
     * </pre>
     */
    public lightpay.lnd.grpc.ListPaymentsResponse listPayments(lightpay.lnd.grpc.ListPaymentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListPaymentsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *DeleteAllPayments deletes all outgoing payments from DB.
     * </pre>
     */
    public lightpay.lnd.grpc.DeleteAllPaymentsResponse deleteAllPayments(lightpay.lnd.grpc.DeleteAllPaymentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAllPaymentsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `describegraph`
     *DescribeGraph returns a description of the latest graph state from the
     *point of view of the node. The graph information is partitioned into two
     *components: all the nodes/vertexes, and all the edges that connect the
     *vertexes themselves.  As this is a directed graph, the edges also contain
     *the node directional specific routing policy which includes: the time lock
     *delta, fee information, etc.
     * </pre>
     */
    public lightpay.lnd.grpc.ChannelGraph describeGraph(lightpay.lnd.grpc.ChannelGraphRequest request) {
      return blockingUnaryCall(
          getChannel(), getDescribeGraphMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `getchaninfo`
     *GetChanInfo returns the latest authenticated network announcement for the
     *given channel identified by its channel ID: an 8-byte integer which
     *uniquely identifies the location of transaction's funding output within the
     *blockchain.
     * </pre>
     */
    public lightpay.lnd.grpc.ChannelEdge getChanInfo(lightpay.lnd.grpc.ChanInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetChanInfoMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `getnodeinfo`
     *GetNodeInfo returns the latest advertised, aggregated, and authenticated
     *channel information for the specified node identified by its public key.
     * </pre>
     */
    public lightpay.lnd.grpc.NodeInfo getNodeInfo(lightpay.lnd.grpc.NodeInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNodeInfoMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `queryroutes`
     *QueryRoutes attempts to query the daemon's Channel Router for a possible
     *route to a target destination capable of carrying a specific amount of
     *satoshis. The retuned route contains the full details required to craft and
     *send an HTLC, also including the necessary information that should be
     *present within the Sphinx packet encapsulated within the HTLC.
     * </pre>
     */
    public lightpay.lnd.grpc.QueryRoutesResponse queryRoutes(lightpay.lnd.grpc.QueryRoutesRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryRoutesMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `getnetworkinfo`
     *GetNetworkInfo returns some basic stats about the known channel graph from
     *the point of view of the node.
     * </pre>
     */
    public lightpay.lnd.grpc.NetworkInfo getNetworkInfo(lightpay.lnd.grpc.NetworkInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNetworkInfoMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `stop`
     *StopDaemon will send a shutdown request to the interrupt handler, triggering
     *a graceful shutdown of the daemon.
     * </pre>
     */
    public lightpay.lnd.grpc.StopResponse stopDaemon(lightpay.lnd.grpc.StopRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopDaemonMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *SubscribeChannelGraph launches a streaming RPC that allows the caller to
     *receive notifications upon any changes to the channel graph topology from
     *the point of view of the responding node. Events notified include: new
     *nodes coming online, nodes updating their authenticated attributes, new
     *channels being advertised, updates in the routing policy for a directional
     *channel edge, and when channels are closed on-chain.
     * </pre>
     */
    public java.util.Iterator<lightpay.lnd.grpc.GraphTopologyUpdate> subscribeChannelGraph(
        lightpay.lnd.grpc.GraphTopologySubscription request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeChannelGraphMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `debuglevel`
     *DebugLevel allows a caller to programmatically set the logging verbosity of
     *lnd. The logging can be targeted according to a coarse daemon-wide logging
     *level, or in a granular fashion to specify the logging for a target
     *sub-system.
     * </pre>
     */
    public lightpay.lnd.grpc.DebugLevelResponse debugLevel(lightpay.lnd.grpc.DebugLevelRequest request) {
      return blockingUnaryCall(
          getChannel(), getDebugLevelMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `feereport`
     *FeeReport allows the caller to obtain a report detailing the current fee
     *schedule enforced by the node globally for each channel.
     * </pre>
     */
    public lightpay.lnd.grpc.FeeReportResponse feeReport(lightpay.lnd.grpc.FeeReportRequest request) {
      return blockingUnaryCall(
          getChannel(), getFeeReportMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `updatechanpolicy`
     *UpdateChannelPolicy allows the caller to update the fee schedule and
     *channel policies for all channels globally, or a particular channel.
     * </pre>
     */
    public lightpay.lnd.grpc.PolicyUpdateResponse updateChannelPolicy(lightpay.lnd.grpc.PolicyUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateChannelPolicyMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LightningFutureStub extends io.grpc.stub.AbstractStub<LightningFutureStub> {
    private LightningFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightningFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightningFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightningFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     ** lncli: `walletbalance`
     *WalletBalance returns total unspent outputs(confirmed and unconfirmed), all confirmed unspent outputs and all unconfirmed unspent outputs under control
     *by the wallet. This method can be modified by having the request specify
     *only witness outputs should be factored into the final output sum.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.WalletBalanceResponse> walletBalance(
        lightpay.lnd.grpc.WalletBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWalletBalanceMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `channelbalance`
     *ChannelBalance returns the total funds available across all open channels
     *in satoshis.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.ChannelBalanceResponse> channelBalance(
        lightpay.lnd.grpc.ChannelBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChannelBalanceMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `listchaintxns`
     *GetTransactions returns a list describing all the known transactions
     *relevant to the wallet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.TransactionDetails> getTransactions(
        lightpay.lnd.grpc.GetTransactionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `sendcoins`
     *SendCoins executes a request to send coins to a particular address. Unlike
     *SendMany, this RPC call only allows creating a single output at a time. If
     *neither target_conf, or sat_per_byte are set, then the internal wallet will
     *consult its fee model to determine a fee for the default confirmation
     *target.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.SendCoinsResponse> sendCoins(
        lightpay.lnd.grpc.SendCoinsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendCoinsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `sendmany`
     *SendMany handles a request for a transaction that creates multiple specified
     *outputs in parallel. If neither target_conf, or sat_per_byte are set, then
     *the internal wallet will consult its fee model to determine a fee for the
     *default confirmation target.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.SendManyResponse> sendMany(
        lightpay.lnd.grpc.SendManyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendManyMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `newaddress`
     *NewAddress creates a new address under control of the local wallet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.NewAddressResponse> newAddress(
        lightpay.lnd.grpc.NewAddressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNewAddressMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *NewWitnessAddress creates a new witness address under control of the local wallet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.NewAddressResponse> newWitnessAddress(
        lightpay.lnd.grpc.NewWitnessAddressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNewWitnessAddressMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `signmessage`
     *SignMessage signs a message with this node's private key. The returned
     *signature string is `zbase32` encoded and pubkey recoverable, meaning that
     *only the message digest and signature are needed for verification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.SignMessageResponse> signMessage(
        lightpay.lnd.grpc.SignMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSignMessageMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `verifymessage`
     *VerifyMessage verifies a signature over a msg. The signature must be
     *zbase32 encoded and signed by an active node in the resident node's
     *channel database. In addition to returning the validity of the signature,
     *VerifyMessage also returns the recovered pubkey from the signature.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.VerifyMessageResponse> verifyMessage(
        lightpay.lnd.grpc.VerifyMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVerifyMessageMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `connect`
     *ConnectPeer attempts to establish a connection to a remote peer. This is at
     *the networking level, and is used for communication between nodes. This is
     *distinct from establishing a channel with a peer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.ConnectPeerResponse> connectPeer(
        lightpay.lnd.grpc.ConnectPeerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConnectPeerMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `disconnect`
     *DisconnectPeer attempts to disconnect one peer from another identified by a
     *given pubKey. In the case that we currently have a pending or active channel
     *with the target peer, then this action will be not be allowed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.DisconnectPeerResponse> disconnectPeer(
        lightpay.lnd.grpc.DisconnectPeerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDisconnectPeerMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `listpeers`
     *ListPeers returns a verbose listing of all currently active peers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.ListPeersResponse> listPeers(
        lightpay.lnd.grpc.ListPeersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListPeersMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `getinfo`
     *GetInfo returns general information concerning the lightning node including
     *it's identity pubkey, alias, the chains it is connected to, and information
     *concerning the number of open+pending channels.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.GetInfoResponse> getInfo(
        lightpay.lnd.grpc.GetInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInfoMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `pendingchannels`
     *PendingChannels returns a list of all the channels that are currently
     *considered "pending". A channel is pending if it has finished the funding
     *workflow and is waiting for confirmations for the funding txn, or is in the
     *process of closure, either initiated cooperatively or non-cooperatively.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.PendingChannelsResponse> pendingChannels(
        lightpay.lnd.grpc.PendingChannelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPendingChannelsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `listchannels`
     *ListChannels returns a description of all the open channels that this node
     *is a participant in.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.ListChannelsResponse> listChannels(
        lightpay.lnd.grpc.ListChannelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListChannelsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *OpenChannelSync is a synchronous version of the OpenChannel RPC call. This
     *call is meant to be consumed by clients to the REST proxy. As with all
     *other sync calls, all byte slices are intended to be populated as hex
     *encoded strings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.ChannelPoint> openChannelSync(
        lightpay.lnd.grpc.OpenChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOpenChannelSyncMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *SendPaymentSync is the synchronous non-streaming version of SendPayment.
     *This RPC is intended to be consumed by clients of the REST proxy.
     *Additionally, this RPC expects the destination's public key and the payment
     *hash (if any) to be encoded as hex strings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.SendResponse> sendPaymentSync(
        lightpay.lnd.grpc.SendRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendPaymentSyncMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `addinvoice`
     *AddInvoice attempts to add a new invoice to the invoice database. Any
     *duplicated invoices are rejected, therefore all invoices *must* have a
     *unique payment preimage.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.AddInvoiceResponse> addInvoice(
        lightpay.lnd.grpc.Invoice request) {
      return futureUnaryCall(
          getChannel().newCall(getAddInvoiceMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `listinvoices`
     *ListInvoices returns a list of all the invoices currently stored within the
     *database. Any active debug invoices are ignored.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.ListInvoiceResponse> listInvoices(
        lightpay.lnd.grpc.ListInvoiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListInvoicesMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `lookupinvoice`
     *LookupInvoice attempts to look up an invoice according to its payment hash.
     *The passed payment hash *must* be exactly 32 bytes, if not, an error is
     *returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.Invoice> lookupInvoice(
        lightpay.lnd.grpc.PaymentHash request) {
      return futureUnaryCall(
          getChannel().newCall(getLookupInvoiceMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `decodepayreq`
     *DecodePayReq takes an encoded payment request string and attempts to decode
     *it, returning a full description of the conditions encoded within the
     *payment request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.PayReq> decodePayReq(
        lightpay.lnd.grpc.PayReqString request) {
      return futureUnaryCall(
          getChannel().newCall(getDecodePayReqMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `listpayments`
     *ListPayments returns a list of all outgoing payments.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.ListPaymentsResponse> listPayments(
        lightpay.lnd.grpc.ListPaymentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListPaymentsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *DeleteAllPayments deletes all outgoing payments from DB.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.DeleteAllPaymentsResponse> deleteAllPayments(
        lightpay.lnd.grpc.DeleteAllPaymentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAllPaymentsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `describegraph`
     *DescribeGraph returns a description of the latest graph state from the
     *point of view of the node. The graph information is partitioned into two
     *components: all the nodes/vertexes, and all the edges that connect the
     *vertexes themselves.  As this is a directed graph, the edges also contain
     *the node directional specific routing policy which includes: the time lock
     *delta, fee information, etc.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.ChannelGraph> describeGraph(
        lightpay.lnd.grpc.ChannelGraphRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDescribeGraphMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `getchaninfo`
     *GetChanInfo returns the latest authenticated network announcement for the
     *given channel identified by its channel ID: an 8-byte integer which
     *uniquely identifies the location of transaction's funding output within the
     *blockchain.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.ChannelEdge> getChanInfo(
        lightpay.lnd.grpc.ChanInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetChanInfoMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `getnodeinfo`
     *GetNodeInfo returns the latest advertised, aggregated, and authenticated
     *channel information for the specified node identified by its public key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.NodeInfo> getNodeInfo(
        lightpay.lnd.grpc.NodeInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNodeInfoMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `queryroutes`
     *QueryRoutes attempts to query the daemon's Channel Router for a possible
     *route to a target destination capable of carrying a specific amount of
     *satoshis. The retuned route contains the full details required to craft and
     *send an HTLC, also including the necessary information that should be
     *present within the Sphinx packet encapsulated within the HTLC.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.QueryRoutesResponse> queryRoutes(
        lightpay.lnd.grpc.QueryRoutesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryRoutesMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `getnetworkinfo`
     *GetNetworkInfo returns some basic stats about the known channel graph from
     *the point of view of the node.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.NetworkInfo> getNetworkInfo(
        lightpay.lnd.grpc.NetworkInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNetworkInfoMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `stop`
     *StopDaemon will send a shutdown request to the interrupt handler, triggering
     *a graceful shutdown of the daemon.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.StopResponse> stopDaemon(
        lightpay.lnd.grpc.StopRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopDaemonMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `debuglevel`
     *DebugLevel allows a caller to programmatically set the logging verbosity of
     *lnd. The logging can be targeted according to a coarse daemon-wide logging
     *level, or in a granular fashion to specify the logging for a target
     *sub-system.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.DebugLevelResponse> debugLevel(
        lightpay.lnd.grpc.DebugLevelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDebugLevelMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `feereport`
     *FeeReport allows the caller to obtain a report detailing the current fee
     *schedule enforced by the node globally for each channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.FeeReportResponse> feeReport(
        lightpay.lnd.grpc.FeeReportRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFeeReportMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `updatechanpolicy`
     *UpdateChannelPolicy allows the caller to update the fee schedule and
     *channel policies for all channels globally, or a particular channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.PolicyUpdateResponse> updateChannelPolicy(
        lightpay.lnd.grpc.PolicyUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateChannelPolicyMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WALLET_BALANCE = 0;
  private static final int METHODID_CHANNEL_BALANCE = 1;
  private static final int METHODID_GET_TRANSACTIONS = 2;
  private static final int METHODID_SEND_COINS = 3;
  private static final int METHODID_SUBSCRIBE_TRANSACTIONS = 4;
  private static final int METHODID_SEND_MANY = 5;
  private static final int METHODID_NEW_ADDRESS = 6;
  private static final int METHODID_NEW_WITNESS_ADDRESS = 7;
  private static final int METHODID_SIGN_MESSAGE = 8;
  private static final int METHODID_VERIFY_MESSAGE = 9;
  private static final int METHODID_CONNECT_PEER = 10;
  private static final int METHODID_DISCONNECT_PEER = 11;
  private static final int METHODID_LIST_PEERS = 12;
  private static final int METHODID_GET_INFO = 13;
  private static final int METHODID_PENDING_CHANNELS = 14;
  private static final int METHODID_LIST_CHANNELS = 15;
  private static final int METHODID_OPEN_CHANNEL_SYNC = 16;
  private static final int METHODID_OPEN_CHANNEL = 17;
  private static final int METHODID_CLOSE_CHANNEL = 18;
  private static final int METHODID_SEND_PAYMENT_SYNC = 19;
  private static final int METHODID_ADD_INVOICE = 20;
  private static final int METHODID_LIST_INVOICES = 21;
  private static final int METHODID_LOOKUP_INVOICE = 22;
  private static final int METHODID_SUBSCRIBE_INVOICES = 23;
  private static final int METHODID_DECODE_PAY_REQ = 24;
  private static final int METHODID_LIST_PAYMENTS = 25;
  private static final int METHODID_DELETE_ALL_PAYMENTS = 26;
  private static final int METHODID_DESCRIBE_GRAPH = 27;
  private static final int METHODID_GET_CHAN_INFO = 28;
  private static final int METHODID_GET_NODE_INFO = 29;
  private static final int METHODID_QUERY_ROUTES = 30;
  private static final int METHODID_GET_NETWORK_INFO = 31;
  private static final int METHODID_STOP_DAEMON = 32;
  private static final int METHODID_SUBSCRIBE_CHANNEL_GRAPH = 33;
  private static final int METHODID_DEBUG_LEVEL = 34;
  private static final int METHODID_FEE_REPORT = 35;
  private static final int METHODID_UPDATE_CHANNEL_POLICY = 36;
  private static final int METHODID_SEND_PAYMENT = 37;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LightningImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LightningImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WALLET_BALANCE:
          serviceImpl.walletBalance((lightpay.lnd.grpc.WalletBalanceRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.WalletBalanceResponse>) responseObserver);
          break;
        case METHODID_CHANNEL_BALANCE:
          serviceImpl.channelBalance((lightpay.lnd.grpc.ChannelBalanceRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ChannelBalanceResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTIONS:
          serviceImpl.getTransactions((lightpay.lnd.grpc.GetTransactionsRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.TransactionDetails>) responseObserver);
          break;
        case METHODID_SEND_COINS:
          serviceImpl.sendCoins((lightpay.lnd.grpc.SendCoinsRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.SendCoinsResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TRANSACTIONS:
          serviceImpl.subscribeTransactions((lightpay.lnd.grpc.GetTransactionsRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.Transaction>) responseObserver);
          break;
        case METHODID_SEND_MANY:
          serviceImpl.sendMany((lightpay.lnd.grpc.SendManyRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.SendManyResponse>) responseObserver);
          break;
        case METHODID_NEW_ADDRESS:
          serviceImpl.newAddress((lightpay.lnd.grpc.NewAddressRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.NewAddressResponse>) responseObserver);
          break;
        case METHODID_NEW_WITNESS_ADDRESS:
          serviceImpl.newWitnessAddress((lightpay.lnd.grpc.NewWitnessAddressRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.NewAddressResponse>) responseObserver);
          break;
        case METHODID_SIGN_MESSAGE:
          serviceImpl.signMessage((lightpay.lnd.grpc.SignMessageRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.SignMessageResponse>) responseObserver);
          break;
        case METHODID_VERIFY_MESSAGE:
          serviceImpl.verifyMessage((lightpay.lnd.grpc.VerifyMessageRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.VerifyMessageResponse>) responseObserver);
          break;
        case METHODID_CONNECT_PEER:
          serviceImpl.connectPeer((lightpay.lnd.grpc.ConnectPeerRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ConnectPeerResponse>) responseObserver);
          break;
        case METHODID_DISCONNECT_PEER:
          serviceImpl.disconnectPeer((lightpay.lnd.grpc.DisconnectPeerRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.DisconnectPeerResponse>) responseObserver);
          break;
        case METHODID_LIST_PEERS:
          serviceImpl.listPeers((lightpay.lnd.grpc.ListPeersRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ListPeersResponse>) responseObserver);
          break;
        case METHODID_GET_INFO:
          serviceImpl.getInfo((lightpay.lnd.grpc.GetInfoRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.GetInfoResponse>) responseObserver);
          break;
        case METHODID_PENDING_CHANNELS:
          serviceImpl.pendingChannels((lightpay.lnd.grpc.PendingChannelsRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.PendingChannelsResponse>) responseObserver);
          break;
        case METHODID_LIST_CHANNELS:
          serviceImpl.listChannels((lightpay.lnd.grpc.ListChannelsRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ListChannelsResponse>) responseObserver);
          break;
        case METHODID_OPEN_CHANNEL_SYNC:
          serviceImpl.openChannelSync((lightpay.lnd.grpc.OpenChannelRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ChannelPoint>) responseObserver);
          break;
        case METHODID_OPEN_CHANNEL:
          serviceImpl.openChannel((lightpay.lnd.grpc.OpenChannelRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.OpenStatusUpdate>) responseObserver);
          break;
        case METHODID_CLOSE_CHANNEL:
          serviceImpl.closeChannel((lightpay.lnd.grpc.CloseChannelRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.CloseStatusUpdate>) responseObserver);
          break;
        case METHODID_SEND_PAYMENT_SYNC:
          serviceImpl.sendPaymentSync((lightpay.lnd.grpc.SendRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.SendResponse>) responseObserver);
          break;
        case METHODID_ADD_INVOICE:
          serviceImpl.addInvoice((lightpay.lnd.grpc.Invoice) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.AddInvoiceResponse>) responseObserver);
          break;
        case METHODID_LIST_INVOICES:
          serviceImpl.listInvoices((lightpay.lnd.grpc.ListInvoiceRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ListInvoiceResponse>) responseObserver);
          break;
        case METHODID_LOOKUP_INVOICE:
          serviceImpl.lookupInvoice((lightpay.lnd.grpc.PaymentHash) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.Invoice>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_INVOICES:
          serviceImpl.subscribeInvoices((lightpay.lnd.grpc.InvoiceSubscription) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.Invoice>) responseObserver);
          break;
        case METHODID_DECODE_PAY_REQ:
          serviceImpl.decodePayReq((lightpay.lnd.grpc.PayReqString) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.PayReq>) responseObserver);
          break;
        case METHODID_LIST_PAYMENTS:
          serviceImpl.listPayments((lightpay.lnd.grpc.ListPaymentsRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ListPaymentsResponse>) responseObserver);
          break;
        case METHODID_DELETE_ALL_PAYMENTS:
          serviceImpl.deleteAllPayments((lightpay.lnd.grpc.DeleteAllPaymentsRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.DeleteAllPaymentsResponse>) responseObserver);
          break;
        case METHODID_DESCRIBE_GRAPH:
          serviceImpl.describeGraph((lightpay.lnd.grpc.ChannelGraphRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ChannelGraph>) responseObserver);
          break;
        case METHODID_GET_CHAN_INFO:
          serviceImpl.getChanInfo((lightpay.lnd.grpc.ChanInfoRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.ChannelEdge>) responseObserver);
          break;
        case METHODID_GET_NODE_INFO:
          serviceImpl.getNodeInfo((lightpay.lnd.grpc.NodeInfoRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.NodeInfo>) responseObserver);
          break;
        case METHODID_QUERY_ROUTES:
          serviceImpl.queryRoutes((lightpay.lnd.grpc.QueryRoutesRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.QueryRoutesResponse>) responseObserver);
          break;
        case METHODID_GET_NETWORK_INFO:
          serviceImpl.getNetworkInfo((lightpay.lnd.grpc.NetworkInfoRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.NetworkInfo>) responseObserver);
          break;
        case METHODID_STOP_DAEMON:
          serviceImpl.stopDaemon((lightpay.lnd.grpc.StopRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.StopResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CHANNEL_GRAPH:
          serviceImpl.subscribeChannelGraph((lightpay.lnd.grpc.GraphTopologySubscription) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.GraphTopologyUpdate>) responseObserver);
          break;
        case METHODID_DEBUG_LEVEL:
          serviceImpl.debugLevel((lightpay.lnd.grpc.DebugLevelRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.DebugLevelResponse>) responseObserver);
          break;
        case METHODID_FEE_REPORT:
          serviceImpl.feeReport((lightpay.lnd.grpc.FeeReportRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.FeeReportResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CHANNEL_POLICY:
          serviceImpl.updateChannelPolicy((lightpay.lnd.grpc.PolicyUpdateRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.PolicyUpdateResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_PAYMENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendPayment(
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.SendResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LightningBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LightningBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lightpay.lnd.grpc.Rpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Lightning");
    }
  }

  private static final class LightningFileDescriptorSupplier
      extends LightningBaseDescriptorSupplier {
    LightningFileDescriptorSupplier() {}
  }

  private static final class LightningMethodDescriptorSupplier
      extends LightningBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LightningMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LightningGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LightningFileDescriptorSupplier())
              .addMethod(getWalletBalanceMethodHelper())
              .addMethod(getChannelBalanceMethodHelper())
              .addMethod(getGetTransactionsMethodHelper())
              .addMethod(getSendCoinsMethodHelper())
              .addMethod(getSubscribeTransactionsMethodHelper())
              .addMethod(getSendManyMethodHelper())
              .addMethod(getNewAddressMethodHelper())
              .addMethod(getNewWitnessAddressMethodHelper())
              .addMethod(getSignMessageMethodHelper())
              .addMethod(getVerifyMessageMethodHelper())
              .addMethod(getConnectPeerMethodHelper())
              .addMethod(getDisconnectPeerMethodHelper())
              .addMethod(getListPeersMethodHelper())
              .addMethod(getGetInfoMethodHelper())
              .addMethod(getPendingChannelsMethodHelper())
              .addMethod(getListChannelsMethodHelper())
              .addMethod(getOpenChannelSyncMethodHelper())
              .addMethod(getOpenChannelMethodHelper())
              .addMethod(getCloseChannelMethodHelper())
              .addMethod(getSendPaymentMethodHelper())
              .addMethod(getSendPaymentSyncMethodHelper())
              .addMethod(getAddInvoiceMethodHelper())
              .addMethod(getListInvoicesMethodHelper())
              .addMethod(getLookupInvoiceMethodHelper())
              .addMethod(getSubscribeInvoicesMethodHelper())
              .addMethod(getDecodePayReqMethodHelper())
              .addMethod(getListPaymentsMethodHelper())
              .addMethod(getDeleteAllPaymentsMethodHelper())
              .addMethod(getDescribeGraphMethodHelper())
              .addMethod(getGetChanInfoMethodHelper())
              .addMethod(getGetNodeInfoMethodHelper())
              .addMethod(getQueryRoutesMethodHelper())
              .addMethod(getGetNetworkInfoMethodHelper())
              .addMethod(getStopDaemonMethodHelper())
              .addMethod(getSubscribeChannelGraphMethodHelper())
              .addMethod(getDebugLevelMethodHelper())
              .addMethod(getFeeReportMethodHelper())
              .addMethod(getUpdateChannelPolicyMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
