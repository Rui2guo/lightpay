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
 * <pre>
 * The WalletUnlocker service is used to set up a wallet password for
 * lnd at first startup, and unlock a previously set up wallet.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: rpc.proto")
public final class WalletUnlockerGrpc {

  private WalletUnlockerGrpc() {}

  public static final String SERVICE_NAME = "lnrpc.WalletUnlocker";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateWalletMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.CreateWalletRequest,
      lightpay.lnd.grpc.CreateWalletResponse> METHOD_CREATE_WALLET = getCreateWalletMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.CreateWalletRequest,
      lightpay.lnd.grpc.CreateWalletResponse> getCreateWalletMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.CreateWalletRequest,
      lightpay.lnd.grpc.CreateWalletResponse> getCreateWalletMethod() {
    return getCreateWalletMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.CreateWalletRequest,
      lightpay.lnd.grpc.CreateWalletResponse> getCreateWalletMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.CreateWalletRequest, lightpay.lnd.grpc.CreateWalletResponse> getCreateWalletMethod;
    if ((getCreateWalletMethod = WalletUnlockerGrpc.getCreateWalletMethod) == null) {
      synchronized (WalletUnlockerGrpc.class) {
        if ((getCreateWalletMethod = WalletUnlockerGrpc.getCreateWalletMethod) == null) {
          WalletUnlockerGrpc.getCreateWalletMethod = getCreateWalletMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.CreateWalletRequest, lightpay.lnd.grpc.CreateWalletResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.WalletUnlocker", "CreateWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.CreateWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.CreateWalletResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletUnlockerMethodDescriptorSupplier("CreateWallet"))
                  .build();
          }
        }
     }
     return getCreateWalletMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUnlockWalletMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.UnlockWalletRequest,
      lightpay.lnd.grpc.UnlockWalletResponse> METHOD_UNLOCK_WALLET = getUnlockWalletMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.UnlockWalletRequest,
      lightpay.lnd.grpc.UnlockWalletResponse> getUnlockWalletMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.UnlockWalletRequest,
      lightpay.lnd.grpc.UnlockWalletResponse> getUnlockWalletMethod() {
    return getUnlockWalletMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.UnlockWalletRequest,
      lightpay.lnd.grpc.UnlockWalletResponse> getUnlockWalletMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.UnlockWalletRequest, lightpay.lnd.grpc.UnlockWalletResponse> getUnlockWalletMethod;
    if ((getUnlockWalletMethod = WalletUnlockerGrpc.getUnlockWalletMethod) == null) {
      synchronized (WalletUnlockerGrpc.class) {
        if ((getUnlockWalletMethod = WalletUnlockerGrpc.getUnlockWalletMethod) == null) {
          WalletUnlockerGrpc.getUnlockWalletMethod = getUnlockWalletMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.UnlockWalletRequest, lightpay.lnd.grpc.UnlockWalletResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.WalletUnlocker", "UnlockWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.UnlockWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.UnlockWalletResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletUnlockerMethodDescriptorSupplier("UnlockWallet"))
                  .build();
          }
        }
     }
     return getUnlockWalletMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WalletUnlockerStub newStub(io.grpc.Channel channel) {
    return new WalletUnlockerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WalletUnlockerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WalletUnlockerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WalletUnlockerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WalletUnlockerFutureStub(channel);
  }

  /**
   * <pre>
   * The WalletUnlocker service is used to set up a wallet password for
   * lnd at first startup, and unlock a previously set up wallet.
   * </pre>
   */
  public static abstract class WalletUnlockerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     ** lncli: `create`
     *CreateWallet is used at lnd startup to set the encryption password for
     *the wallet database.
     * </pre>
     */
    public void createWallet(lightpay.lnd.grpc.CreateWalletRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.CreateWalletResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateWalletMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `unlock`
     *UnlockWallet is used at startup of lnd to provide a password to unlock
     *the wallet database.
     * </pre>
     */
    public void unlockWallet(lightpay.lnd.grpc.UnlockWalletRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.UnlockWalletResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnlockWalletMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateWalletMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.CreateWalletRequest,
                lightpay.lnd.grpc.CreateWalletResponse>(
                  this, METHODID_CREATE_WALLET)))
          .addMethod(
            getUnlockWalletMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.UnlockWalletRequest,
                lightpay.lnd.grpc.UnlockWalletResponse>(
                  this, METHODID_UNLOCK_WALLET)))
          .build();
    }
  }

  /**
   * <pre>
   * The WalletUnlocker service is used to set up a wallet password for
   * lnd at first startup, and unlock a previously set up wallet.
   * </pre>
   */
  public static final class WalletUnlockerStub extends io.grpc.stub.AbstractStub<WalletUnlockerStub> {
    private WalletUnlockerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletUnlockerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletUnlockerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletUnlockerStub(channel, callOptions);
    }

    /**
     * <pre>
     ** lncli: `create`
     *CreateWallet is used at lnd startup to set the encryption password for
     *the wallet database.
     * </pre>
     */
    public void createWallet(lightpay.lnd.grpc.CreateWalletRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.CreateWalletResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateWalletMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `unlock`
     *UnlockWallet is used at startup of lnd to provide a password to unlock
     *the wallet database.
     * </pre>
     */
    public void unlockWallet(lightpay.lnd.grpc.UnlockWalletRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.UnlockWalletResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnlockWalletMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The WalletUnlocker service is used to set up a wallet password for
   * lnd at first startup, and unlock a previously set up wallet.
   * </pre>
   */
  public static final class WalletUnlockerBlockingStub extends io.grpc.stub.AbstractStub<WalletUnlockerBlockingStub> {
    private WalletUnlockerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletUnlockerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletUnlockerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletUnlockerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     ** lncli: `create`
     *CreateWallet is used at lnd startup to set the encryption password for
     *the wallet database.
     * </pre>
     */
    public lightpay.lnd.grpc.CreateWalletResponse createWallet(lightpay.lnd.grpc.CreateWalletRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateWalletMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `unlock`
     *UnlockWallet is used at startup of lnd to provide a password to unlock
     *the wallet database.
     * </pre>
     */
    public lightpay.lnd.grpc.UnlockWalletResponse unlockWallet(lightpay.lnd.grpc.UnlockWalletRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnlockWalletMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The WalletUnlocker service is used to set up a wallet password for
   * lnd at first startup, and unlock a previously set up wallet.
   * </pre>
   */
  public static final class WalletUnlockerFutureStub extends io.grpc.stub.AbstractStub<WalletUnlockerFutureStub> {
    private WalletUnlockerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletUnlockerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletUnlockerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletUnlockerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     ** lncli: `create`
     *CreateWallet is used at lnd startup to set the encryption password for
     *the wallet database.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.CreateWalletResponse> createWallet(
        lightpay.lnd.grpc.CreateWalletRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateWalletMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `unlock`
     *UnlockWallet is used at startup of lnd to provide a password to unlock
     *the wallet database.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.UnlockWalletResponse> unlockWallet(
        lightpay.lnd.grpc.UnlockWalletRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnlockWalletMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_WALLET = 0;
  private static final int METHODID_UNLOCK_WALLET = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WalletUnlockerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WalletUnlockerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_WALLET:
          serviceImpl.createWallet((lightpay.lnd.grpc.CreateWalletRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.CreateWalletResponse>) responseObserver);
          break;
        case METHODID_UNLOCK_WALLET:
          serviceImpl.unlockWallet((lightpay.lnd.grpc.UnlockWalletRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.UnlockWalletResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WalletUnlockerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WalletUnlockerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lightpay.lnd.grpc.Rpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WalletUnlocker");
    }
  }

  private static final class WalletUnlockerFileDescriptorSupplier
      extends WalletUnlockerBaseDescriptorSupplier {
    WalletUnlockerFileDescriptorSupplier() {}
  }

  private static final class WalletUnlockerMethodDescriptorSupplier
      extends WalletUnlockerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WalletUnlockerMethodDescriptorSupplier(String methodName) {
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
      synchronized (WalletUnlockerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WalletUnlockerFileDescriptorSupplier())
              .addMethod(getCreateWalletMethodHelper())
              .addMethod(getUnlockWalletMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
