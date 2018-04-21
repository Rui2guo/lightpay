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
  @java.lang.Deprecated // Use {@link #getGenSeedMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.GenSeedRequest,
      lightpay.lnd.grpc.GenSeedResponse> METHOD_GEN_SEED = getGenSeedMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.GenSeedRequest,
      lightpay.lnd.grpc.GenSeedResponse> getGenSeedMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.GenSeedRequest,
      lightpay.lnd.grpc.GenSeedResponse> getGenSeedMethod() {
    return getGenSeedMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.GenSeedRequest,
      lightpay.lnd.grpc.GenSeedResponse> getGenSeedMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.GenSeedRequest, lightpay.lnd.grpc.GenSeedResponse> getGenSeedMethod;
    if ((getGenSeedMethod = WalletUnlockerGrpc.getGenSeedMethod) == null) {
      synchronized (WalletUnlockerGrpc.class) {
        if ((getGenSeedMethod = WalletUnlockerGrpc.getGenSeedMethod) == null) {
          WalletUnlockerGrpc.getGenSeedMethod = getGenSeedMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.GenSeedRequest, lightpay.lnd.grpc.GenSeedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.WalletUnlocker", "GenSeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.GenSeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.GenSeedResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletUnlockerMethodDescriptorSupplier("GenSeed"))
                  .build();
          }
        }
     }
     return getGenSeedMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getInitWalletMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lightpay.lnd.grpc.InitWalletRequest,
      lightpay.lnd.grpc.InitWalletResponse> METHOD_INIT_WALLET = getInitWalletMethodHelper();

  private static volatile io.grpc.MethodDescriptor<lightpay.lnd.grpc.InitWalletRequest,
      lightpay.lnd.grpc.InitWalletResponse> getInitWalletMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lightpay.lnd.grpc.InitWalletRequest,
      lightpay.lnd.grpc.InitWalletResponse> getInitWalletMethod() {
    return getInitWalletMethodHelper();
  }

  private static io.grpc.MethodDescriptor<lightpay.lnd.grpc.InitWalletRequest,
      lightpay.lnd.grpc.InitWalletResponse> getInitWalletMethodHelper() {
    io.grpc.MethodDescriptor<lightpay.lnd.grpc.InitWalletRequest, lightpay.lnd.grpc.InitWalletResponse> getInitWalletMethod;
    if ((getInitWalletMethod = WalletUnlockerGrpc.getInitWalletMethod) == null) {
      synchronized (WalletUnlockerGrpc.class) {
        if ((getInitWalletMethod = WalletUnlockerGrpc.getInitWalletMethod) == null) {
          WalletUnlockerGrpc.getInitWalletMethod = getInitWalletMethod = 
              io.grpc.MethodDescriptor.<lightpay.lnd.grpc.InitWalletRequest, lightpay.lnd.grpc.InitWalletResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.WalletUnlocker", "InitWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.InitWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lightpay.lnd.grpc.InitWalletResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletUnlockerMethodDescriptorSupplier("InitWallet"))
                  .build();
          }
        }
     }
     return getInitWalletMethod;
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
     **
     *GenSeed is the first method that should be used to instantiate a new lnd
     *instance. This method allows a caller to generate a new aezeed cipher seed
     *given an optional passphrase. If provided, the passphrase will be necessary
     *to decrypt the cipherseed to expose the internal wallet seed.
     *Once the cipherseed is obtained and verified by the user, the InitWallet
     *method should be used to commit the newly generated seed, and create the
     *wallet.
     * </pre>
     */
    public void genSeed(lightpay.lnd.grpc.GenSeedRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.GenSeedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenSeedMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     **
     *InitWallet is used when lnd is starting up for the first time to fully
     *initialize the daemon and its internal wallet. At the very least a wallet
     *password must be provided. This will be used to encrypt sensitive material
     *on disk.
     *In the case of a recovery scenario, the user can also specify their aezeed
     *mnemonic and passphrase. If set, then the daemon will use this prior state
     *to initialize its internal wallet.
     *Alternatively, this can be used along with the GenSeed RPC to obtain a
     *seed, then present it to the user. Once it has been verified by the user,
     *the seed can be fed into this RPC in order to commit the new wallet.
     * </pre>
     */
    public void initWallet(lightpay.lnd.grpc.InitWalletRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.InitWalletResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitWalletMethodHelper(), responseObserver);
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
            getGenSeedMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.GenSeedRequest,
                lightpay.lnd.grpc.GenSeedResponse>(
                  this, METHODID_GEN_SEED)))
          .addMethod(
            getInitWalletMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                lightpay.lnd.grpc.InitWalletRequest,
                lightpay.lnd.grpc.InitWalletResponse>(
                  this, METHODID_INIT_WALLET)))
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
     **
     *GenSeed is the first method that should be used to instantiate a new lnd
     *instance. This method allows a caller to generate a new aezeed cipher seed
     *given an optional passphrase. If provided, the passphrase will be necessary
     *to decrypt the cipherseed to expose the internal wallet seed.
     *Once the cipherseed is obtained and verified by the user, the InitWallet
     *method should be used to commit the newly generated seed, and create the
     *wallet.
     * </pre>
     */
    public void genSeed(lightpay.lnd.grpc.GenSeedRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.GenSeedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenSeedMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *InitWallet is used when lnd is starting up for the first time to fully
     *initialize the daemon and its internal wallet. At the very least a wallet
     *password must be provided. This will be used to encrypt sensitive material
     *on disk.
     *In the case of a recovery scenario, the user can also specify their aezeed
     *mnemonic and passphrase. If set, then the daemon will use this prior state
     *to initialize its internal wallet.
     *Alternatively, this can be used along with the GenSeed RPC to obtain a
     *seed, then present it to the user. Once it has been verified by the user,
     *the seed can be fed into this RPC in order to commit the new wallet.
     * </pre>
     */
    public void initWallet(lightpay.lnd.grpc.InitWalletRequest request,
        io.grpc.stub.StreamObserver<lightpay.lnd.grpc.InitWalletResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitWalletMethodHelper(), getCallOptions()), request, responseObserver);
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
     **
     *GenSeed is the first method that should be used to instantiate a new lnd
     *instance. This method allows a caller to generate a new aezeed cipher seed
     *given an optional passphrase. If provided, the passphrase will be necessary
     *to decrypt the cipherseed to expose the internal wallet seed.
     *Once the cipherseed is obtained and verified by the user, the InitWallet
     *method should be used to commit the newly generated seed, and create the
     *wallet.
     * </pre>
     */
    public lightpay.lnd.grpc.GenSeedResponse genSeed(lightpay.lnd.grpc.GenSeedRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenSeedMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *InitWallet is used when lnd is starting up for the first time to fully
     *initialize the daemon and its internal wallet. At the very least a wallet
     *password must be provided. This will be used to encrypt sensitive material
     *on disk.
     *In the case of a recovery scenario, the user can also specify their aezeed
     *mnemonic and passphrase. If set, then the daemon will use this prior state
     *to initialize its internal wallet.
     *Alternatively, this can be used along with the GenSeed RPC to obtain a
     *seed, then present it to the user. Once it has been verified by the user,
     *the seed can be fed into this RPC in order to commit the new wallet.
     * </pre>
     */
    public lightpay.lnd.grpc.InitWalletResponse initWallet(lightpay.lnd.grpc.InitWalletRequest request) {
      return blockingUnaryCall(
          getChannel(), getInitWalletMethodHelper(), getCallOptions(), request);
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
     **
     *GenSeed is the first method that should be used to instantiate a new lnd
     *instance. This method allows a caller to generate a new aezeed cipher seed
     *given an optional passphrase. If provided, the passphrase will be necessary
     *to decrypt the cipherseed to expose the internal wallet seed.
     *Once the cipherseed is obtained and verified by the user, the InitWallet
     *method should be used to commit the newly generated seed, and create the
     *wallet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.GenSeedResponse> genSeed(
        lightpay.lnd.grpc.GenSeedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenSeedMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *InitWallet is used when lnd is starting up for the first time to fully
     *initialize the daemon and its internal wallet. At the very least a wallet
     *password must be provided. This will be used to encrypt sensitive material
     *on disk.
     *In the case of a recovery scenario, the user can also specify their aezeed
     *mnemonic and passphrase. If set, then the daemon will use this prior state
     *to initialize its internal wallet.
     *Alternatively, this can be used along with the GenSeed RPC to obtain a
     *seed, then present it to the user. Once it has been verified by the user,
     *the seed can be fed into this RPC in order to commit the new wallet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lightpay.lnd.grpc.InitWalletResponse> initWallet(
        lightpay.lnd.grpc.InitWalletRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInitWalletMethodHelper(), getCallOptions()), request);
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

  private static final int METHODID_GEN_SEED = 0;
  private static final int METHODID_INIT_WALLET = 1;
  private static final int METHODID_UNLOCK_WALLET = 2;

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
        case METHODID_GEN_SEED:
          serviceImpl.genSeed((lightpay.lnd.grpc.GenSeedRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.GenSeedResponse>) responseObserver);
          break;
        case METHODID_INIT_WALLET:
          serviceImpl.initWallet((lightpay.lnd.grpc.InitWalletRequest) request,
              (io.grpc.stub.StreamObserver<lightpay.lnd.grpc.InitWalletResponse>) responseObserver);
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
              .addMethod(getGenSeedMethodHelper())
              .addMethod(getInitWalletMethodHelper())
              .addMethod(getUnlockWalletMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
