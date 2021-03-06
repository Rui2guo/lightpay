// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

/**
 * Protobuf type {@code lnrpc.ChannelPoint}
 */
public  final class ChannelPoint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lnrpc.ChannelPoint)
    ChannelPointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChannelPoint.newBuilder() to construct.
  private ChannelPoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChannelPoint() {
    outputIndex_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChannelPoint(
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
            fundingTxidCase_ = 1;
            fundingTxid_ = input.readBytes();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            fundingTxidCase_ = 2;
            fundingTxid_ = s;
            break;
          }
          case 24: {

            outputIndex_ = input.readUInt32();
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
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ChannelPoint_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ChannelPoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lightpay.lnd.grpc.ChannelPoint.class, lightpay.lnd.grpc.ChannelPoint.Builder.class);
  }

  private int fundingTxidCase_ = 0;
  private java.lang.Object fundingTxid_;
  public enum FundingTxidCase
      implements com.google.protobuf.Internal.EnumLite {
    FUNDING_TXID_BYTES(1),
    FUNDING_TXID_STR(2),
    FUNDINGTXID_NOT_SET(0);
    private final int value;
    private FundingTxidCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FundingTxidCase valueOf(int value) {
      return forNumber(value);
    }

    public static FundingTxidCase forNumber(int value) {
      switch (value) {
        case 1: return FUNDING_TXID_BYTES;
        case 2: return FUNDING_TXID_STR;
        case 0: return FUNDINGTXID_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public FundingTxidCase
  getFundingTxidCase() {
    return FundingTxidCase.forNumber(
        fundingTxidCase_);
  }

  public static final int FUNDING_TXID_BYTES_FIELD_NUMBER = 1;
  /**
   * <pre>
   *&#47; Txid of the funding transaction
   * </pre>
   *
   * <code>bytes funding_txid_bytes = 1[json_name = "funding_txid_bytes"];</code>
   */
  public com.google.protobuf.ByteString getFundingTxidBytes() {
    if (fundingTxidCase_ == 1) {
      return (com.google.protobuf.ByteString) fundingTxid_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int FUNDING_TXID_STR_FIELD_NUMBER = 2;
  /**
   * <pre>
   *&#47; Hex-encoded string representing the funding transaction
   * </pre>
   *
   * <code>string funding_txid_str = 2[json_name = "funding_txid_str"];</code>
   */
  public java.lang.String getFundingTxidStr() {
    java.lang.Object ref = "";
    if (fundingTxidCase_ == 2) {
      ref = fundingTxid_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (fundingTxidCase_ == 2) {
        fundingTxid_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   *&#47; Hex-encoded string representing the funding transaction
   * </pre>
   *
   * <code>string funding_txid_str = 2[json_name = "funding_txid_str"];</code>
   */
  public com.google.protobuf.ByteString
      getFundingTxidStrBytes() {
    java.lang.Object ref = "";
    if (fundingTxidCase_ == 2) {
      ref = fundingTxid_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (fundingTxidCase_ == 2) {
        fundingTxid_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OUTPUT_INDEX_FIELD_NUMBER = 3;
  private int outputIndex_;
  /**
   * <pre>
   *&#47; The index of the output of the funding transaction
   * </pre>
   *
   * <code>uint32 output_index = 3[json_name = "output_index"];</code>
   */
  public int getOutputIndex() {
    return outputIndex_;
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
    if (fundingTxidCase_ == 1) {
      output.writeBytes(
          1, (com.google.protobuf.ByteString) fundingTxid_);
    }
    if (fundingTxidCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fundingTxid_);
    }
    if (outputIndex_ != 0) {
      output.writeUInt32(3, outputIndex_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fundingTxidCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            1, (com.google.protobuf.ByteString) fundingTxid_);
    }
    if (fundingTxidCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fundingTxid_);
    }
    if (outputIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, outputIndex_);
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
    if (!(obj instanceof lightpay.lnd.grpc.ChannelPoint)) {
      return super.equals(obj);
    }
    lightpay.lnd.grpc.ChannelPoint other = (lightpay.lnd.grpc.ChannelPoint) obj;

    boolean result = true;
    result = result && (getOutputIndex()
        == other.getOutputIndex());
    result = result && getFundingTxidCase().equals(
        other.getFundingTxidCase());
    if (!result) return false;
    switch (fundingTxidCase_) {
      case 1:
        result = result && getFundingTxidBytes()
            .equals(other.getFundingTxidBytes());
        break;
      case 2:
        result = result && getFundingTxidStr()
            .equals(other.getFundingTxidStr());
        break;
      case 0:
      default:
    }
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
    hash = (37 * hash) + OUTPUT_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getOutputIndex();
    switch (fundingTxidCase_) {
      case 1:
        hash = (37 * hash) + FUNDING_TXID_BYTES_FIELD_NUMBER;
        hash = (53 * hash) + getFundingTxidBytes().hashCode();
        break;
      case 2:
        hash = (37 * hash) + FUNDING_TXID_STR_FIELD_NUMBER;
        hash = (53 * hash) + getFundingTxidStr().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lightpay.lnd.grpc.ChannelPoint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.ChannelPoint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ChannelPoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.ChannelPoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ChannelPoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.ChannelPoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ChannelPoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.ChannelPoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ChannelPoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.ChannelPoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ChannelPoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.ChannelPoint parseFrom(
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
  public static Builder newBuilder(lightpay.lnd.grpc.ChannelPoint prototype) {
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
   * Protobuf type {@code lnrpc.ChannelPoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lnrpc.ChannelPoint)
      lightpay.lnd.grpc.ChannelPointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ChannelPoint_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ChannelPoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lightpay.lnd.grpc.ChannelPoint.class, lightpay.lnd.grpc.ChannelPoint.Builder.class);
    }

    // Construct using lightpay.lnd.grpc.ChannelPoint.newBuilder()
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
      outputIndex_ = 0;

      fundingTxidCase_ = 0;
      fundingTxid_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ChannelPoint_descriptor;
    }

    public lightpay.lnd.grpc.ChannelPoint getDefaultInstanceForType() {
      return lightpay.lnd.grpc.ChannelPoint.getDefaultInstance();
    }

    public lightpay.lnd.grpc.ChannelPoint build() {
      lightpay.lnd.grpc.ChannelPoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public lightpay.lnd.grpc.ChannelPoint buildPartial() {
      lightpay.lnd.grpc.ChannelPoint result = new lightpay.lnd.grpc.ChannelPoint(this);
      if (fundingTxidCase_ == 1) {
        result.fundingTxid_ = fundingTxid_;
      }
      if (fundingTxidCase_ == 2) {
        result.fundingTxid_ = fundingTxid_;
      }
      result.outputIndex_ = outputIndex_;
      result.fundingTxidCase_ = fundingTxidCase_;
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
      if (other instanceof lightpay.lnd.grpc.ChannelPoint) {
        return mergeFrom((lightpay.lnd.grpc.ChannelPoint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lightpay.lnd.grpc.ChannelPoint other) {
      if (other == lightpay.lnd.grpc.ChannelPoint.getDefaultInstance()) return this;
      if (other.getOutputIndex() != 0) {
        setOutputIndex(other.getOutputIndex());
      }
      switch (other.getFundingTxidCase()) {
        case FUNDING_TXID_BYTES: {
          setFundingTxidBytes(other.getFundingTxidBytes());
          break;
        }
        case FUNDING_TXID_STR: {
          fundingTxidCase_ = 2;
          fundingTxid_ = other.fundingTxid_;
          onChanged();
          break;
        }
        case FUNDINGTXID_NOT_SET: {
          break;
        }
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
      lightpay.lnd.grpc.ChannelPoint parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lightpay.lnd.grpc.ChannelPoint) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int fundingTxidCase_ = 0;
    private java.lang.Object fundingTxid_;
    public FundingTxidCase
        getFundingTxidCase() {
      return FundingTxidCase.forNumber(
          fundingTxidCase_);
    }

    public Builder clearFundingTxid() {
      fundingTxidCase_ = 0;
      fundingTxid_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     *&#47; Txid of the funding transaction
     * </pre>
     *
     * <code>bytes funding_txid_bytes = 1[json_name = "funding_txid_bytes"];</code>
     */
    public com.google.protobuf.ByteString getFundingTxidBytes() {
      if (fundingTxidCase_ == 1) {
        return (com.google.protobuf.ByteString) fundingTxid_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     *&#47; Txid of the funding transaction
     * </pre>
     *
     * <code>bytes funding_txid_bytes = 1[json_name = "funding_txid_bytes"];</code>
     */
    public Builder setFundingTxidBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  fundingTxidCase_ = 1;
      fundingTxid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; Txid of the funding transaction
     * </pre>
     *
     * <code>bytes funding_txid_bytes = 1[json_name = "funding_txid_bytes"];</code>
     */
    public Builder clearFundingTxidBytes() {
      if (fundingTxidCase_ == 1) {
        fundingTxidCase_ = 0;
        fundingTxid_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     *&#47; Hex-encoded string representing the funding transaction
     * </pre>
     *
     * <code>string funding_txid_str = 2[json_name = "funding_txid_str"];</code>
     */
    public java.lang.String getFundingTxidStr() {
      java.lang.Object ref = "";
      if (fundingTxidCase_ == 2) {
        ref = fundingTxid_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (fundingTxidCase_ == 2) {
          fundingTxid_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *&#47; Hex-encoded string representing the funding transaction
     * </pre>
     *
     * <code>string funding_txid_str = 2[json_name = "funding_txid_str"];</code>
     */
    public com.google.protobuf.ByteString
        getFundingTxidStrBytes() {
      java.lang.Object ref = "";
      if (fundingTxidCase_ == 2) {
        ref = fundingTxid_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (fundingTxidCase_ == 2) {
          fundingTxid_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *&#47; Hex-encoded string representing the funding transaction
     * </pre>
     *
     * <code>string funding_txid_str = 2[json_name = "funding_txid_str"];</code>
     */
    public Builder setFundingTxidStr(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  fundingTxidCase_ = 2;
      fundingTxid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; Hex-encoded string representing the funding transaction
     * </pre>
     *
     * <code>string funding_txid_str = 2[json_name = "funding_txid_str"];</code>
     */
    public Builder clearFundingTxidStr() {
      if (fundingTxidCase_ == 2) {
        fundingTxidCase_ = 0;
        fundingTxid_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     *&#47; Hex-encoded string representing the funding transaction
     * </pre>
     *
     * <code>string funding_txid_str = 2[json_name = "funding_txid_str"];</code>
     */
    public Builder setFundingTxidStrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      fundingTxidCase_ = 2;
      fundingTxid_ = value;
      onChanged();
      return this;
    }

    private int outputIndex_ ;
    /**
     * <pre>
     *&#47; The index of the output of the funding transaction
     * </pre>
     *
     * <code>uint32 output_index = 3[json_name = "output_index"];</code>
     */
    public int getOutputIndex() {
      return outputIndex_;
    }
    /**
     * <pre>
     *&#47; The index of the output of the funding transaction
     * </pre>
     *
     * <code>uint32 output_index = 3[json_name = "output_index"];</code>
     */
    public Builder setOutputIndex(int value) {
      
      outputIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; The index of the output of the funding transaction
     * </pre>
     *
     * <code>uint32 output_index = 3[json_name = "output_index"];</code>
     */
    public Builder clearOutputIndex() {
      
      outputIndex_ = 0;
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


    // @@protoc_insertion_point(builder_scope:lnrpc.ChannelPoint)
  }

  // @@protoc_insertion_point(class_scope:lnrpc.ChannelPoint)
  private static final lightpay.lnd.grpc.ChannelPoint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lightpay.lnd.grpc.ChannelPoint();
  }

  public static lightpay.lnd.grpc.ChannelPoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChannelPoint>
      PARSER = new com.google.protobuf.AbstractParser<ChannelPoint>() {
    public ChannelPoint parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChannelPoint(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChannelPoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChannelPoint> getParserForType() {
    return PARSER;
  }

  public lightpay.lnd.grpc.ChannelPoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

