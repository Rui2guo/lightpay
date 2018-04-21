// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

/**
 * Protobuf type {@code lnrpc.SendRequest}
 */
public  final class SendRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lnrpc.SendRequest)
    SendRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SendRequest.newBuilder() to construct.
  private SendRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendRequest() {
    dest_ = com.google.protobuf.ByteString.EMPTY;
    destString_ = "";
    amt_ = 0L;
    paymentHash_ = com.google.protobuf.ByteString.EMPTY;
    paymentHashString_ = "";
    paymentRequest_ = "";
    finalCltvDelta_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SendRequest(
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
          case 10: {

            dest_ = input.readBytes();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            destString_ = s;
            break;
          }
          case 24: {

            amt_ = input.readInt64();
            break;
          }
          case 34: {

            paymentHash_ = input.readBytes();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            paymentHashString_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            paymentRequest_ = s;
            break;
          }
          case 56: {

            finalCltvDelta_ = input.readInt32();
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
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_SendRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_SendRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lightpay.lnd.grpc.SendRequest.class, lightpay.lnd.grpc.SendRequest.Builder.class);
  }

  public static final int DEST_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString dest_;
  /**
   * <pre>
   *&#47; The identity pubkey of the payment recipient
   * </pre>
   *
   * <code>bytes dest = 1;</code>
   */
  public com.google.protobuf.ByteString getDest() {
    return dest_;
  }

  public static final int DEST_STRING_FIELD_NUMBER = 2;
  private volatile java.lang.Object destString_;
  /**
   * <pre>
   *&#47; The hex-encoded identity pubkey of the payment recipient
   * </pre>
   *
   * <code>string dest_string = 2;</code>
   */
  public java.lang.String getDestString() {
    java.lang.Object ref = destString_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destString_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *&#47; The hex-encoded identity pubkey of the payment recipient
   * </pre>
   *
   * <code>string dest_string = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDestStringBytes() {
    java.lang.Object ref = destString_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      destString_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMT_FIELD_NUMBER = 3;
  private long amt_;
  /**
   * <pre>
   *&#47; Number of satoshis to send.
   * </pre>
   *
   * <code>int64 amt = 3;</code>
   */
  public long getAmt() {
    return amt_;
  }

  public static final int PAYMENT_HASH_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString paymentHash_;
  /**
   * <pre>
   *&#47; The hash to use within the payment's HTLC
   * </pre>
   *
   * <code>bytes payment_hash = 4;</code>
   */
  public com.google.protobuf.ByteString getPaymentHash() {
    return paymentHash_;
  }

  public static final int PAYMENT_HASH_STRING_FIELD_NUMBER = 5;
  private volatile java.lang.Object paymentHashString_;
  /**
   * <pre>
   *&#47; The hex-encoded hash to use within the payment's HTLC
   * </pre>
   *
   * <code>string payment_hash_string = 5;</code>
   */
  public java.lang.String getPaymentHashString() {
    java.lang.Object ref = paymentHashString_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      paymentHashString_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *&#47; The hex-encoded hash to use within the payment's HTLC
   * </pre>
   *
   * <code>string payment_hash_string = 5;</code>
   */
  public com.google.protobuf.ByteString
      getPaymentHashStringBytes() {
    java.lang.Object ref = paymentHashString_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      paymentHashString_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYMENT_REQUEST_FIELD_NUMBER = 6;
  private volatile java.lang.Object paymentRequest_;
  /**
   * <pre>
   **
   *A bare-bones invoice for a payment within the Lightning Network.  With the
   *details of the invoice, the sender has all the data necessary to send a
   *payment to the recipient.
   * </pre>
   *
   * <code>string payment_request = 6;</code>
   */
  public java.lang.String getPaymentRequest() {
    java.lang.Object ref = paymentRequest_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      paymentRequest_ = s;
      return s;
    }
  }
  /**
   * <pre>
   **
   *A bare-bones invoice for a payment within the Lightning Network.  With the
   *details of the invoice, the sender has all the data necessary to send a
   *payment to the recipient.
   * </pre>
   *
   * <code>string payment_request = 6;</code>
   */
  public com.google.protobuf.ByteString
      getPaymentRequestBytes() {
    java.lang.Object ref = paymentRequest_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      paymentRequest_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FINAL_CLTV_DELTA_FIELD_NUMBER = 7;
  private int finalCltvDelta_;
  /**
   * <pre>
   *&#47; The CLTV delta from the current height that should be used to set the timelock for the final hop.
   * </pre>
   *
   * <code>int32 final_cltv_delta = 7;</code>
   */
  public int getFinalCltvDelta() {
    return finalCltvDelta_;
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
    if (!dest_.isEmpty()) {
      output.writeBytes(1, dest_);
    }
    if (!getDestStringBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, destString_);
    }
    if (amt_ != 0L) {
      output.writeInt64(3, amt_);
    }
    if (!paymentHash_.isEmpty()) {
      output.writeBytes(4, paymentHash_);
    }
    if (!getPaymentHashStringBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, paymentHashString_);
    }
    if (!getPaymentRequestBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, paymentRequest_);
    }
    if (finalCltvDelta_ != 0) {
      output.writeInt32(7, finalCltvDelta_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!dest_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, dest_);
    }
    if (!getDestStringBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, destString_);
    }
    if (amt_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, amt_);
    }
    if (!paymentHash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, paymentHash_);
    }
    if (!getPaymentHashStringBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, paymentHashString_);
    }
    if (!getPaymentRequestBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, paymentRequest_);
    }
    if (finalCltvDelta_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, finalCltvDelta_);
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
    if (!(obj instanceof lightpay.lnd.grpc.SendRequest)) {
      return super.equals(obj);
    }
    lightpay.lnd.grpc.SendRequest other = (lightpay.lnd.grpc.SendRequest) obj;

    boolean result = true;
    result = result && getDest()
        .equals(other.getDest());
    result = result && getDestString()
        .equals(other.getDestString());
    result = result && (getAmt()
        == other.getAmt());
    result = result && getPaymentHash()
        .equals(other.getPaymentHash());
    result = result && getPaymentHashString()
        .equals(other.getPaymentHashString());
    result = result && getPaymentRequest()
        .equals(other.getPaymentRequest());
    result = result && (getFinalCltvDelta()
        == other.getFinalCltvDelta());
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
    hash = (37 * hash) + DEST_FIELD_NUMBER;
    hash = (53 * hash) + getDest().hashCode();
    hash = (37 * hash) + DEST_STRING_FIELD_NUMBER;
    hash = (53 * hash) + getDestString().hashCode();
    hash = (37 * hash) + AMT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAmt());
    hash = (37 * hash) + PAYMENT_HASH_FIELD_NUMBER;
    hash = (53 * hash) + getPaymentHash().hashCode();
    hash = (37 * hash) + PAYMENT_HASH_STRING_FIELD_NUMBER;
    hash = (53 * hash) + getPaymentHashString().hashCode();
    hash = (37 * hash) + PAYMENT_REQUEST_FIELD_NUMBER;
    hash = (53 * hash) + getPaymentRequest().hashCode();
    hash = (37 * hash) + FINAL_CLTV_DELTA_FIELD_NUMBER;
    hash = (53 * hash) + getFinalCltvDelta();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lightpay.lnd.grpc.SendRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.SendRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.SendRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.SendRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.SendRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.SendRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.SendRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.SendRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.SendRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.SendRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.SendRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.SendRequest parseFrom(
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
  public static Builder newBuilder(lightpay.lnd.grpc.SendRequest prototype) {
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
   * Protobuf type {@code lnrpc.SendRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lnrpc.SendRequest)
      lightpay.lnd.grpc.SendRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_SendRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_SendRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lightpay.lnd.grpc.SendRequest.class, lightpay.lnd.grpc.SendRequest.Builder.class);
    }

    // Construct using lightpay.lnd.grpc.SendRequest.newBuilder()
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
      dest_ = com.google.protobuf.ByteString.EMPTY;

      destString_ = "";

      amt_ = 0L;

      paymentHash_ = com.google.protobuf.ByteString.EMPTY;

      paymentHashString_ = "";

      paymentRequest_ = "";

      finalCltvDelta_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_SendRequest_descriptor;
    }

    public lightpay.lnd.grpc.SendRequest getDefaultInstanceForType() {
      return lightpay.lnd.grpc.SendRequest.getDefaultInstance();
    }

    public lightpay.lnd.grpc.SendRequest build() {
      lightpay.lnd.grpc.SendRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public lightpay.lnd.grpc.SendRequest buildPartial() {
      lightpay.lnd.grpc.SendRequest result = new lightpay.lnd.grpc.SendRequest(this);
      result.dest_ = dest_;
      result.destString_ = destString_;
      result.amt_ = amt_;
      result.paymentHash_ = paymentHash_;
      result.paymentHashString_ = paymentHashString_;
      result.paymentRequest_ = paymentRequest_;
      result.finalCltvDelta_ = finalCltvDelta_;
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
      if (other instanceof lightpay.lnd.grpc.SendRequest) {
        return mergeFrom((lightpay.lnd.grpc.SendRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lightpay.lnd.grpc.SendRequest other) {
      if (other == lightpay.lnd.grpc.SendRequest.getDefaultInstance()) return this;
      if (other.getDest() != com.google.protobuf.ByteString.EMPTY) {
        setDest(other.getDest());
      }
      if (!other.getDestString().isEmpty()) {
        destString_ = other.destString_;
        onChanged();
      }
      if (other.getAmt() != 0L) {
        setAmt(other.getAmt());
      }
      if (other.getPaymentHash() != com.google.protobuf.ByteString.EMPTY) {
        setPaymentHash(other.getPaymentHash());
      }
      if (!other.getPaymentHashString().isEmpty()) {
        paymentHashString_ = other.paymentHashString_;
        onChanged();
      }
      if (!other.getPaymentRequest().isEmpty()) {
        paymentRequest_ = other.paymentRequest_;
        onChanged();
      }
      if (other.getFinalCltvDelta() != 0) {
        setFinalCltvDelta(other.getFinalCltvDelta());
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
      lightpay.lnd.grpc.SendRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lightpay.lnd.grpc.SendRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString dest_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     *&#47; The identity pubkey of the payment recipient
     * </pre>
     *
     * <code>bytes dest = 1;</code>
     */
    public com.google.protobuf.ByteString getDest() {
      return dest_;
    }
    /**
     * <pre>
     *&#47; The identity pubkey of the payment recipient
     * </pre>
     *
     * <code>bytes dest = 1;</code>
     */
    public Builder setDest(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dest_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; The identity pubkey of the payment recipient
     * </pre>
     *
     * <code>bytes dest = 1;</code>
     */
    public Builder clearDest() {
      
      dest_ = getDefaultInstance().getDest();
      onChanged();
      return this;
    }

    private java.lang.Object destString_ = "";
    /**
     * <pre>
     *&#47; The hex-encoded identity pubkey of the payment recipient
     * </pre>
     *
     * <code>string dest_string = 2;</code>
     */
    public java.lang.String getDestString() {
      java.lang.Object ref = destString_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destString_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *&#47; The hex-encoded identity pubkey of the payment recipient
     * </pre>
     *
     * <code>string dest_string = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDestStringBytes() {
      java.lang.Object ref = destString_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        destString_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *&#47; The hex-encoded identity pubkey of the payment recipient
     * </pre>
     *
     * <code>string dest_string = 2;</code>
     */
    public Builder setDestString(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      destString_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; The hex-encoded identity pubkey of the payment recipient
     * </pre>
     *
     * <code>string dest_string = 2;</code>
     */
    public Builder clearDestString() {
      
      destString_ = getDefaultInstance().getDestString();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; The hex-encoded identity pubkey of the payment recipient
     * </pre>
     *
     * <code>string dest_string = 2;</code>
     */
    public Builder setDestStringBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      destString_ = value;
      onChanged();
      return this;
    }

    private long amt_ ;
    /**
     * <pre>
     *&#47; Number of satoshis to send.
     * </pre>
     *
     * <code>int64 amt = 3;</code>
     */
    public long getAmt() {
      return amt_;
    }
    /**
     * <pre>
     *&#47; Number of satoshis to send.
     * </pre>
     *
     * <code>int64 amt = 3;</code>
     */
    public Builder setAmt(long value) {
      
      amt_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; Number of satoshis to send.
     * </pre>
     *
     * <code>int64 amt = 3;</code>
     */
    public Builder clearAmt() {
      
      amt_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString paymentHash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     *&#47; The hash to use within the payment's HTLC
     * </pre>
     *
     * <code>bytes payment_hash = 4;</code>
     */
    public com.google.protobuf.ByteString getPaymentHash() {
      return paymentHash_;
    }
    /**
     * <pre>
     *&#47; The hash to use within the payment's HTLC
     * </pre>
     *
     * <code>bytes payment_hash = 4;</code>
     */
    public Builder setPaymentHash(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      paymentHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; The hash to use within the payment's HTLC
     * </pre>
     *
     * <code>bytes payment_hash = 4;</code>
     */
    public Builder clearPaymentHash() {
      
      paymentHash_ = getDefaultInstance().getPaymentHash();
      onChanged();
      return this;
    }

    private java.lang.Object paymentHashString_ = "";
    /**
     * <pre>
     *&#47; The hex-encoded hash to use within the payment's HTLC
     * </pre>
     *
     * <code>string payment_hash_string = 5;</code>
     */
    public java.lang.String getPaymentHashString() {
      java.lang.Object ref = paymentHashString_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        paymentHashString_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *&#47; The hex-encoded hash to use within the payment's HTLC
     * </pre>
     *
     * <code>string payment_hash_string = 5;</code>
     */
    public com.google.protobuf.ByteString
        getPaymentHashStringBytes() {
      java.lang.Object ref = paymentHashString_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        paymentHashString_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *&#47; The hex-encoded hash to use within the payment's HTLC
     * </pre>
     *
     * <code>string payment_hash_string = 5;</code>
     */
    public Builder setPaymentHashString(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      paymentHashString_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; The hex-encoded hash to use within the payment's HTLC
     * </pre>
     *
     * <code>string payment_hash_string = 5;</code>
     */
    public Builder clearPaymentHashString() {
      
      paymentHashString_ = getDefaultInstance().getPaymentHashString();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; The hex-encoded hash to use within the payment's HTLC
     * </pre>
     *
     * <code>string payment_hash_string = 5;</code>
     */
    public Builder setPaymentHashStringBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      paymentHashString_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object paymentRequest_ = "";
    /**
     * <pre>
     **
     *A bare-bones invoice for a payment within the Lightning Network.  With the
     *details of the invoice, the sender has all the data necessary to send a
     *payment to the recipient.
     * </pre>
     *
     * <code>string payment_request = 6;</code>
     */
    public java.lang.String getPaymentRequest() {
      java.lang.Object ref = paymentRequest_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        paymentRequest_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     **
     *A bare-bones invoice for a payment within the Lightning Network.  With the
     *details of the invoice, the sender has all the data necessary to send a
     *payment to the recipient.
     * </pre>
     *
     * <code>string payment_request = 6;</code>
     */
    public com.google.protobuf.ByteString
        getPaymentRequestBytes() {
      java.lang.Object ref = paymentRequest_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        paymentRequest_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     **
     *A bare-bones invoice for a payment within the Lightning Network.  With the
     *details of the invoice, the sender has all the data necessary to send a
     *payment to the recipient.
     * </pre>
     *
     * <code>string payment_request = 6;</code>
     */
    public Builder setPaymentRequest(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      paymentRequest_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     *A bare-bones invoice for a payment within the Lightning Network.  With the
     *details of the invoice, the sender has all the data necessary to send a
     *payment to the recipient.
     * </pre>
     *
     * <code>string payment_request = 6;</code>
     */
    public Builder clearPaymentRequest() {
      
      paymentRequest_ = getDefaultInstance().getPaymentRequest();
      onChanged();
      return this;
    }
    /**
     * <pre>
     **
     *A bare-bones invoice for a payment within the Lightning Network.  With the
     *details of the invoice, the sender has all the data necessary to send a
     *payment to the recipient.
     * </pre>
     *
     * <code>string payment_request = 6;</code>
     */
    public Builder setPaymentRequestBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      paymentRequest_ = value;
      onChanged();
      return this;
    }

    private int finalCltvDelta_ ;
    /**
     * <pre>
     *&#47; The CLTV delta from the current height that should be used to set the timelock for the final hop.
     * </pre>
     *
     * <code>int32 final_cltv_delta = 7;</code>
     */
    public int getFinalCltvDelta() {
      return finalCltvDelta_;
    }
    /**
     * <pre>
     *&#47; The CLTV delta from the current height that should be used to set the timelock for the final hop.
     * </pre>
     *
     * <code>int32 final_cltv_delta = 7;</code>
     */
    public Builder setFinalCltvDelta(int value) {
      
      finalCltvDelta_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; The CLTV delta from the current height that should be used to set the timelock for the final hop.
     * </pre>
     *
     * <code>int32 final_cltv_delta = 7;</code>
     */
    public Builder clearFinalCltvDelta() {
      
      finalCltvDelta_ = 0;
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


    // @@protoc_insertion_point(builder_scope:lnrpc.SendRequest)
  }

  // @@protoc_insertion_point(class_scope:lnrpc.SendRequest)
  private static final lightpay.lnd.grpc.SendRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lightpay.lnd.grpc.SendRequest();
  }

  public static lightpay.lnd.grpc.SendRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendRequest>
      PARSER = new com.google.protobuf.AbstractParser<SendRequest>() {
    public SendRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SendRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SendRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SendRequest> getParserForType() {
    return PARSER;
  }

  public lightpay.lnd.grpc.SendRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
