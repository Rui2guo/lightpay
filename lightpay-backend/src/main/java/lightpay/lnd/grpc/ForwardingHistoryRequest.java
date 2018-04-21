// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

/**
 * Protobuf type {@code lnrpc.ForwardingHistoryRequest}
 */
public  final class ForwardingHistoryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lnrpc.ForwardingHistoryRequest)
    ForwardingHistoryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ForwardingHistoryRequest.newBuilder() to construct.
  private ForwardingHistoryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ForwardingHistoryRequest() {
    startTime_ = 0L;
    endTime_ = 0L;
    indexOffset_ = 0;
    numMaxEvents_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ForwardingHistoryRequest(
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

            startTime_ = input.readUInt64();
            break;
          }
          case 16: {

            endTime_ = input.readUInt64();
            break;
          }
          case 24: {

            indexOffset_ = input.readUInt32();
            break;
          }
          case 32: {

            numMaxEvents_ = input.readUInt32();
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
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ForwardingHistoryRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ForwardingHistoryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lightpay.lnd.grpc.ForwardingHistoryRequest.class, lightpay.lnd.grpc.ForwardingHistoryRequest.Builder.class);
  }

  public static final int START_TIME_FIELD_NUMBER = 1;
  private long startTime_;
  /**
   * <pre>
   *&#47; Start time is the starting point of the forwarding history request. All records beyond this point will be included, respecting the end time, and the index offset.
   * </pre>
   *
   * <code>uint64 start_time = 1[json_name = "start_time"];</code>
   */
  public long getStartTime() {
    return startTime_;
  }

  public static final int END_TIME_FIELD_NUMBER = 2;
  private long endTime_;
  /**
   * <pre>
   *&#47; End time is the end point of the forwarding history request. The response will carry at most 50k records between the start time and the end time. The index offset can be used to implement pagination.
   * </pre>
   *
   * <code>uint64 end_time = 2[json_name = "end_time"];</code>
   */
  public long getEndTime() {
    return endTime_;
  }

  public static final int INDEX_OFFSET_FIELD_NUMBER = 3;
  private int indexOffset_;
  /**
   * <pre>
   *&#47; Index offset is the offset in the time series to start at. As each response can only contain 50k records, callers can use this to skip around within a packed time series.
   * </pre>
   *
   * <code>uint32 index_offset = 3[json_name = "index_offset"];</code>
   */
  public int getIndexOffset() {
    return indexOffset_;
  }

  public static final int NUM_MAX_EVENTS_FIELD_NUMBER = 4;
  private int numMaxEvents_;
  /**
   * <pre>
   *&#47; The max number of events to return in the response to this query.
   * </pre>
   *
   * <code>uint32 num_max_events = 4[json_name = "num_max_events"];</code>
   */
  public int getNumMaxEvents() {
    return numMaxEvents_;
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
    if (startTime_ != 0L) {
      output.writeUInt64(1, startTime_);
    }
    if (endTime_ != 0L) {
      output.writeUInt64(2, endTime_);
    }
    if (indexOffset_ != 0) {
      output.writeUInt32(3, indexOffset_);
    }
    if (numMaxEvents_ != 0) {
      output.writeUInt32(4, numMaxEvents_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, startTime_);
    }
    if (endTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, endTime_);
    }
    if (indexOffset_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, indexOffset_);
    }
    if (numMaxEvents_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, numMaxEvents_);
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
    if (!(obj instanceof lightpay.lnd.grpc.ForwardingHistoryRequest)) {
      return super.equals(obj);
    }
    lightpay.lnd.grpc.ForwardingHistoryRequest other = (lightpay.lnd.grpc.ForwardingHistoryRequest) obj;

    boolean result = true;
    result = result && (getStartTime()
        == other.getStartTime());
    result = result && (getEndTime()
        == other.getEndTime());
    result = result && (getIndexOffset()
        == other.getIndexOffset());
    result = result && (getNumMaxEvents()
        == other.getNumMaxEvents());
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
    hash = (37 * hash) + START_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartTime());
    hash = (37 * hash) + END_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEndTime());
    hash = (37 * hash) + INDEX_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getIndexOffset();
    hash = (37 * hash) + NUM_MAX_EVENTS_FIELD_NUMBER;
    hash = (53 * hash) + getNumMaxEvents();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lightpay.lnd.grpc.ForwardingHistoryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryRequest parseFrom(
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
  public static Builder newBuilder(lightpay.lnd.grpc.ForwardingHistoryRequest prototype) {
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
   * Protobuf type {@code lnrpc.ForwardingHistoryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lnrpc.ForwardingHistoryRequest)
      lightpay.lnd.grpc.ForwardingHistoryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ForwardingHistoryRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ForwardingHistoryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lightpay.lnd.grpc.ForwardingHistoryRequest.class, lightpay.lnd.grpc.ForwardingHistoryRequest.Builder.class);
    }

    // Construct using lightpay.lnd.grpc.ForwardingHistoryRequest.newBuilder()
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
      startTime_ = 0L;

      endTime_ = 0L;

      indexOffset_ = 0;

      numMaxEvents_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ForwardingHistoryRequest_descriptor;
    }

    public lightpay.lnd.grpc.ForwardingHistoryRequest getDefaultInstanceForType() {
      return lightpay.lnd.grpc.ForwardingHistoryRequest.getDefaultInstance();
    }

    public lightpay.lnd.grpc.ForwardingHistoryRequest build() {
      lightpay.lnd.grpc.ForwardingHistoryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public lightpay.lnd.grpc.ForwardingHistoryRequest buildPartial() {
      lightpay.lnd.grpc.ForwardingHistoryRequest result = new lightpay.lnd.grpc.ForwardingHistoryRequest(this);
      result.startTime_ = startTime_;
      result.endTime_ = endTime_;
      result.indexOffset_ = indexOffset_;
      result.numMaxEvents_ = numMaxEvents_;
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
      if (other instanceof lightpay.lnd.grpc.ForwardingHistoryRequest) {
        return mergeFrom((lightpay.lnd.grpc.ForwardingHistoryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lightpay.lnd.grpc.ForwardingHistoryRequest other) {
      if (other == lightpay.lnd.grpc.ForwardingHistoryRequest.getDefaultInstance()) return this;
      if (other.getStartTime() != 0L) {
        setStartTime(other.getStartTime());
      }
      if (other.getEndTime() != 0L) {
        setEndTime(other.getEndTime());
      }
      if (other.getIndexOffset() != 0) {
        setIndexOffset(other.getIndexOffset());
      }
      if (other.getNumMaxEvents() != 0) {
        setNumMaxEvents(other.getNumMaxEvents());
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
      lightpay.lnd.grpc.ForwardingHistoryRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lightpay.lnd.grpc.ForwardingHistoryRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long startTime_ ;
    /**
     * <pre>
     *&#47; Start time is the starting point of the forwarding history request. All records beyond this point will be included, respecting the end time, and the index offset.
     * </pre>
     *
     * <code>uint64 start_time = 1[json_name = "start_time"];</code>
     */
    public long getStartTime() {
      return startTime_;
    }
    /**
     * <pre>
     *&#47; Start time is the starting point of the forwarding history request. All records beyond this point will be included, respecting the end time, and the index offset.
     * </pre>
     *
     * <code>uint64 start_time = 1[json_name = "start_time"];</code>
     */
    public Builder setStartTime(long value) {
      
      startTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; Start time is the starting point of the forwarding history request. All records beyond this point will be included, respecting the end time, and the index offset.
     * </pre>
     *
     * <code>uint64 start_time = 1[json_name = "start_time"];</code>
     */
    public Builder clearStartTime() {
      
      startTime_ = 0L;
      onChanged();
      return this;
    }

    private long endTime_ ;
    /**
     * <pre>
     *&#47; End time is the end point of the forwarding history request. The response will carry at most 50k records between the start time and the end time. The index offset can be used to implement pagination.
     * </pre>
     *
     * <code>uint64 end_time = 2[json_name = "end_time"];</code>
     */
    public long getEndTime() {
      return endTime_;
    }
    /**
     * <pre>
     *&#47; End time is the end point of the forwarding history request. The response will carry at most 50k records between the start time and the end time. The index offset can be used to implement pagination.
     * </pre>
     *
     * <code>uint64 end_time = 2[json_name = "end_time"];</code>
     */
    public Builder setEndTime(long value) {
      
      endTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; End time is the end point of the forwarding history request. The response will carry at most 50k records between the start time and the end time. The index offset can be used to implement pagination.
     * </pre>
     *
     * <code>uint64 end_time = 2[json_name = "end_time"];</code>
     */
    public Builder clearEndTime() {
      
      endTime_ = 0L;
      onChanged();
      return this;
    }

    private int indexOffset_ ;
    /**
     * <pre>
     *&#47; Index offset is the offset in the time series to start at. As each response can only contain 50k records, callers can use this to skip around within a packed time series.
     * </pre>
     *
     * <code>uint32 index_offset = 3[json_name = "index_offset"];</code>
     */
    public int getIndexOffset() {
      return indexOffset_;
    }
    /**
     * <pre>
     *&#47; Index offset is the offset in the time series to start at. As each response can only contain 50k records, callers can use this to skip around within a packed time series.
     * </pre>
     *
     * <code>uint32 index_offset = 3[json_name = "index_offset"];</code>
     */
    public Builder setIndexOffset(int value) {
      
      indexOffset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; Index offset is the offset in the time series to start at. As each response can only contain 50k records, callers can use this to skip around within a packed time series.
     * </pre>
     *
     * <code>uint32 index_offset = 3[json_name = "index_offset"];</code>
     */
    public Builder clearIndexOffset() {
      
      indexOffset_ = 0;
      onChanged();
      return this;
    }

    private int numMaxEvents_ ;
    /**
     * <pre>
     *&#47; The max number of events to return in the response to this query.
     * </pre>
     *
     * <code>uint32 num_max_events = 4[json_name = "num_max_events"];</code>
     */
    public int getNumMaxEvents() {
      return numMaxEvents_;
    }
    /**
     * <pre>
     *&#47; The max number of events to return in the response to this query.
     * </pre>
     *
     * <code>uint32 num_max_events = 4[json_name = "num_max_events"];</code>
     */
    public Builder setNumMaxEvents(int value) {
      
      numMaxEvents_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; The max number of events to return in the response to this query.
     * </pre>
     *
     * <code>uint32 num_max_events = 4[json_name = "num_max_events"];</code>
     */
    public Builder clearNumMaxEvents() {
      
      numMaxEvents_ = 0;
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


    // @@protoc_insertion_point(builder_scope:lnrpc.ForwardingHistoryRequest)
  }

  // @@protoc_insertion_point(class_scope:lnrpc.ForwardingHistoryRequest)
  private static final lightpay.lnd.grpc.ForwardingHistoryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lightpay.lnd.grpc.ForwardingHistoryRequest();
  }

  public static lightpay.lnd.grpc.ForwardingHistoryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ForwardingHistoryRequest>
      PARSER = new com.google.protobuf.AbstractParser<ForwardingHistoryRequest>() {
    public ForwardingHistoryRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ForwardingHistoryRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ForwardingHistoryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ForwardingHistoryRequest> getParserForType() {
    return PARSER;
  }

  public lightpay.lnd.grpc.ForwardingHistoryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

