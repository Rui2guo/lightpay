// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

/**
 * Protobuf type {@code lnrpc.HTLC}
 */
public  final class HTLC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lnrpc.HTLC)
    HTLCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HTLC.newBuilder() to construct.
  private HTLC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HTLC() {
    incoming_ = false;
    amount_ = 0L;
    hashLock_ = com.google.protobuf.ByteString.EMPTY;
    expirationHeight_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HTLC(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            incoming_ = input.readBool();
            break;
          }
          case 16: {

            amount_ = input.readInt64();
            break;
          }
          case 26: {

            hashLock_ = input.readBytes();
            break;
          }
          case 32: {

            expirationHeight_ = input.readUInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_HTLC_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_HTLC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lightpay.lnd.grpc.HTLC.class, lightpay.lnd.grpc.HTLC.Builder.class);
  }

  public static final int INCOMING_FIELD_NUMBER = 1;
  private boolean incoming_;
  /**
   * <code>bool incoming = 1[json_name = "incoming"];</code>
   */
  public boolean getIncoming() {
    return incoming_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  private long amount_;
  /**
   * <code>int64 amount = 2[json_name = "amount"];</code>
   */
  public long getAmount() {
    return amount_;
  }

  public static final int HASH_LOCK_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString hashLock_;
  /**
   * <code>bytes hash_lock = 3[json_name = "hash_lock"];</code>
   */
  public com.google.protobuf.ByteString getHashLock() {
    return hashLock_;
  }

  public static final int EXPIRATION_HEIGHT_FIELD_NUMBER = 4;
  private int expirationHeight_;
  /**
   * <code>uint32 expiration_height = 4[json_name = "expiration_height"];</code>
   */
  public int getExpirationHeight() {
    return expirationHeight_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (incoming_ != false) {
      output.writeBool(1, incoming_);
    }
    if (amount_ != 0L) {
      output.writeInt64(2, amount_);
    }
    if (!hashLock_.isEmpty()) {
      output.writeBytes(3, hashLock_);
    }
    if (expirationHeight_ != 0) {
      output.writeUInt32(4, expirationHeight_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (incoming_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, incoming_);
    }
    if (amount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, amount_);
    }
    if (!hashLock_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, hashLock_);
    }
    if (expirationHeight_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, expirationHeight_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof lightpay.lnd.grpc.HTLC)) {
      return super.equals(obj);
    }
    lightpay.lnd.grpc.HTLC other = (lightpay.lnd.grpc.HTLC) obj;

    boolean result = true;
    result = result && (getIncoming()
        == other.getIncoming());
    result = result && (getAmount()
        == other.getAmount());
    result = result && getHashLock()
        .equals(other.getHashLock());
    result = result && (getExpirationHeight()
        == other.getExpirationHeight());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + INCOMING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncoming());
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAmount());
    hash = (37 * hash) + HASH_LOCK_FIELD_NUMBER;
    hash = (53 * hash) + getHashLock().hashCode();
    hash = (37 * hash) + EXPIRATION_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getExpirationHeight();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lightpay.lnd.grpc.HTLC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.HTLC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.HTLC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.HTLC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.HTLC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.HTLC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.HTLC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.HTLC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.HTLC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.HTLC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.HTLC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.HTLC parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(lightpay.lnd.grpc.HTLC prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code lnrpc.HTLC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lnrpc.HTLC)
      lightpay.lnd.grpc.HTLCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_HTLC_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_HTLC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lightpay.lnd.grpc.HTLC.class, lightpay.lnd.grpc.HTLC.Builder.class);
    }

    // Construct using lightpay.lnd.grpc.HTLC.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      incoming_ = false;

      amount_ = 0L;

      hashLock_ = com.google.protobuf.ByteString.EMPTY;

      expirationHeight_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_HTLC_descriptor;
    }

    public lightpay.lnd.grpc.HTLC getDefaultInstanceForType() {
      return lightpay.lnd.grpc.HTLC.getDefaultInstance();
    }

    public lightpay.lnd.grpc.HTLC build() {
      lightpay.lnd.grpc.HTLC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public lightpay.lnd.grpc.HTLC buildPartial() {
      lightpay.lnd.grpc.HTLC result = new lightpay.lnd.grpc.HTLC(this);
      result.incoming_ = incoming_;
      result.amount_ = amount_;
      result.hashLock_ = hashLock_;
      result.expirationHeight_ = expirationHeight_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof lightpay.lnd.grpc.HTLC) {
        return mergeFrom((lightpay.lnd.grpc.HTLC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lightpay.lnd.grpc.HTLC other) {
      if (other == lightpay.lnd.grpc.HTLC.getDefaultInstance()) return this;
      if (other.getIncoming() != false) {
        setIncoming(other.getIncoming());
      }
      if (other.getAmount() != 0L) {
        setAmount(other.getAmount());
      }
      if (other.getHashLock() != com.google.protobuf.ByteString.EMPTY) {
        setHashLock(other.getHashLock());
      }
      if (other.getExpirationHeight() != 0) {
        setExpirationHeight(other.getExpirationHeight());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      lightpay.lnd.grpc.HTLC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lightpay.lnd.grpc.HTLC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean incoming_ ;
    /**
     * <code>bool incoming = 1[json_name = "incoming"];</code>
     */
    public boolean getIncoming() {
      return incoming_;
    }
    /**
     * <code>bool incoming = 1[json_name = "incoming"];</code>
     */
    public Builder setIncoming(boolean value) {
      
      incoming_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool incoming = 1[json_name = "incoming"];</code>
     */
    public Builder clearIncoming() {
      
      incoming_ = false;
      onChanged();
      return this;
    }

    private long amount_ ;
    /**
     * <code>int64 amount = 2[json_name = "amount"];</code>
     */
    public long getAmount() {
      return amount_;
    }
    /**
     * <code>int64 amount = 2[json_name = "amount"];</code>
     */
    public Builder setAmount(long value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 amount = 2[json_name = "amount"];</code>
     */
    public Builder clearAmount() {
      
      amount_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString hashLock_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes hash_lock = 3[json_name = "hash_lock"];</code>
     */
    public com.google.protobuf.ByteString getHashLock() {
      return hashLock_;
    }
    /**
     * <code>bytes hash_lock = 3[json_name = "hash_lock"];</code>
     */
    public Builder setHashLock(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hashLock_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes hash_lock = 3[json_name = "hash_lock"];</code>
     */
    public Builder clearHashLock() {
      
      hashLock_ = getDefaultInstance().getHashLock();
      onChanged();
      return this;
    }

    private int expirationHeight_ ;
    /**
     * <code>uint32 expiration_height = 4[json_name = "expiration_height"];</code>
     */
    public int getExpirationHeight() {
      return expirationHeight_;
    }
    /**
     * <code>uint32 expiration_height = 4[json_name = "expiration_height"];</code>
     */
    public Builder setExpirationHeight(int value) {
      
      expirationHeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 expiration_height = 4[json_name = "expiration_height"];</code>
     */
    public Builder clearExpirationHeight() {
      
      expirationHeight_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:lnrpc.HTLC)
  }

  // @@protoc_insertion_point(class_scope:lnrpc.HTLC)
  private static final lightpay.lnd.grpc.HTLC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lightpay.lnd.grpc.HTLC();
  }

  public static lightpay.lnd.grpc.HTLC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HTLC>
      PARSER = new com.google.protobuf.AbstractParser<HTLC>() {
    public HTLC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HTLC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HTLC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HTLC> getParserForType() {
    return PARSER;
  }

  public lightpay.lnd.grpc.HTLC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
