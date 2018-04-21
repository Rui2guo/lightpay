// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

/**
 * Protobuf type {@code lnrpc.ForwardingHistoryResponse}
 */
public  final class ForwardingHistoryResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lnrpc.ForwardingHistoryResponse)
    ForwardingHistoryResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ForwardingHistoryResponse.newBuilder() to construct.
  private ForwardingHistoryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ForwardingHistoryResponse() {
    forwardingEvents_ = java.util.Collections.emptyList();
    lastOffsetIndex_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ForwardingHistoryResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              forwardingEvents_ = new java.util.ArrayList<lightpay.lnd.grpc.ForwardingEvent>();
              mutable_bitField0_ |= 0x00000001;
            }
            forwardingEvents_.add(
                input.readMessage(lightpay.lnd.grpc.ForwardingEvent.parser(), extensionRegistry));
            break;
          }
          case 16: {

            lastOffsetIndex_ = input.readUInt32();
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        forwardingEvents_ = java.util.Collections.unmodifiableList(forwardingEvents_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ForwardingHistoryResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ForwardingHistoryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lightpay.lnd.grpc.ForwardingHistoryResponse.class, lightpay.lnd.grpc.ForwardingHistoryResponse.Builder.class);
  }

  private int bitField0_;
  public static final int FORWARDING_EVENTS_FIELD_NUMBER = 1;
  private java.util.List<lightpay.lnd.grpc.ForwardingEvent> forwardingEvents_;
  /**
   * <pre>
   *&#47; A list of forwarding events from the time slice of the time series specified in the request.
   * </pre>
   *
   * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
   */
  public java.util.List<lightpay.lnd.grpc.ForwardingEvent> getForwardingEventsList() {
    return forwardingEvents_;
  }
  /**
   * <pre>
   *&#47; A list of forwarding events from the time slice of the time series specified in the request.
   * </pre>
   *
   * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
   */
  public java.util.List<? extends lightpay.lnd.grpc.ForwardingEventOrBuilder> 
      getForwardingEventsOrBuilderList() {
    return forwardingEvents_;
  }
  /**
   * <pre>
   *&#47; A list of forwarding events from the time slice of the time series specified in the request.
   * </pre>
   *
   * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
   */
  public int getForwardingEventsCount() {
    return forwardingEvents_.size();
  }
  /**
   * <pre>
   *&#47; A list of forwarding events from the time slice of the time series specified in the request.
   * </pre>
   *
   * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
   */
  public lightpay.lnd.grpc.ForwardingEvent getForwardingEvents(int index) {
    return forwardingEvents_.get(index);
  }
  /**
   * <pre>
   *&#47; A list of forwarding events from the time slice of the time series specified in the request.
   * </pre>
   *
   * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
   */
  public lightpay.lnd.grpc.ForwardingEventOrBuilder getForwardingEventsOrBuilder(
      int index) {
    return forwardingEvents_.get(index);
  }

  public static final int LAST_OFFSET_INDEX_FIELD_NUMBER = 2;
  private int lastOffsetIndex_;
  /**
   * <pre>
   *&#47; The index of the last time in the set of returned forwarding events. Can be used to seek further, pagination style.
   * </pre>
   *
   * <code>uint32 last_offset_index = 2[json_name = "last_offset_index"];</code>
   */
  public int getLastOffsetIndex() {
    return lastOffsetIndex_;
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
    for (int i = 0; i < forwardingEvents_.size(); i++) {
      output.writeMessage(1, forwardingEvents_.get(i));
    }
    if (lastOffsetIndex_ != 0) {
      output.writeUInt32(2, lastOffsetIndex_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < forwardingEvents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, forwardingEvents_.get(i));
    }
    if (lastOffsetIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, lastOffsetIndex_);
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
    if (!(obj instanceof lightpay.lnd.grpc.ForwardingHistoryResponse)) {
      return super.equals(obj);
    }
    lightpay.lnd.grpc.ForwardingHistoryResponse other = (lightpay.lnd.grpc.ForwardingHistoryResponse) obj;

    boolean result = true;
    result = result && getForwardingEventsList()
        .equals(other.getForwardingEventsList());
    result = result && (getLastOffsetIndex()
        == other.getLastOffsetIndex());
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
    if (getForwardingEventsCount() > 0) {
      hash = (37 * hash) + FORWARDING_EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getForwardingEventsList().hashCode();
    }
    hash = (37 * hash) + LAST_OFFSET_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getLastOffsetIndex();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lightpay.lnd.grpc.ForwardingHistoryResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.ForwardingHistoryResponse parseFrom(
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
  public static Builder newBuilder(lightpay.lnd.grpc.ForwardingHistoryResponse prototype) {
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
   * Protobuf type {@code lnrpc.ForwardingHistoryResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lnrpc.ForwardingHistoryResponse)
      lightpay.lnd.grpc.ForwardingHistoryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ForwardingHistoryResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ForwardingHistoryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lightpay.lnd.grpc.ForwardingHistoryResponse.class, lightpay.lnd.grpc.ForwardingHistoryResponse.Builder.class);
    }

    // Construct using lightpay.lnd.grpc.ForwardingHistoryResponse.newBuilder()
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
        getForwardingEventsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (forwardingEventsBuilder_ == null) {
        forwardingEvents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        forwardingEventsBuilder_.clear();
      }
      lastOffsetIndex_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ForwardingHistoryResponse_descriptor;
    }

    public lightpay.lnd.grpc.ForwardingHistoryResponse getDefaultInstanceForType() {
      return lightpay.lnd.grpc.ForwardingHistoryResponse.getDefaultInstance();
    }

    public lightpay.lnd.grpc.ForwardingHistoryResponse build() {
      lightpay.lnd.grpc.ForwardingHistoryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public lightpay.lnd.grpc.ForwardingHistoryResponse buildPartial() {
      lightpay.lnd.grpc.ForwardingHistoryResponse result = new lightpay.lnd.grpc.ForwardingHistoryResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (forwardingEventsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          forwardingEvents_ = java.util.Collections.unmodifiableList(forwardingEvents_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.forwardingEvents_ = forwardingEvents_;
      } else {
        result.forwardingEvents_ = forwardingEventsBuilder_.build();
      }
      result.lastOffsetIndex_ = lastOffsetIndex_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof lightpay.lnd.grpc.ForwardingHistoryResponse) {
        return mergeFrom((lightpay.lnd.grpc.ForwardingHistoryResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lightpay.lnd.grpc.ForwardingHistoryResponse other) {
      if (other == lightpay.lnd.grpc.ForwardingHistoryResponse.getDefaultInstance()) return this;
      if (forwardingEventsBuilder_ == null) {
        if (!other.forwardingEvents_.isEmpty()) {
          if (forwardingEvents_.isEmpty()) {
            forwardingEvents_ = other.forwardingEvents_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureForwardingEventsIsMutable();
            forwardingEvents_.addAll(other.forwardingEvents_);
          }
          onChanged();
        }
      } else {
        if (!other.forwardingEvents_.isEmpty()) {
          if (forwardingEventsBuilder_.isEmpty()) {
            forwardingEventsBuilder_.dispose();
            forwardingEventsBuilder_ = null;
            forwardingEvents_ = other.forwardingEvents_;
            bitField0_ = (bitField0_ & ~0x00000001);
            forwardingEventsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getForwardingEventsFieldBuilder() : null;
          } else {
            forwardingEventsBuilder_.addAllMessages(other.forwardingEvents_);
          }
        }
      }
      if (other.getLastOffsetIndex() != 0) {
        setLastOffsetIndex(other.getLastOffsetIndex());
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
      lightpay.lnd.grpc.ForwardingHistoryResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lightpay.lnd.grpc.ForwardingHistoryResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<lightpay.lnd.grpc.ForwardingEvent> forwardingEvents_ =
      java.util.Collections.emptyList();
    private void ensureForwardingEventsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        forwardingEvents_ = new java.util.ArrayList<lightpay.lnd.grpc.ForwardingEvent>(forwardingEvents_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        lightpay.lnd.grpc.ForwardingEvent, lightpay.lnd.grpc.ForwardingEvent.Builder, lightpay.lnd.grpc.ForwardingEventOrBuilder> forwardingEventsBuilder_;

    /**
     * <pre>
     *&#47; A list of forwarding events from the time slice of the time series specified in the request.
     * </pre>
     *
     * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
     */
    public java.util.List<lightpay.lnd.grpc.ForwardingEvent> getForwardingEventsList() {
      if (forwardingEventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(forwardingEvents_);
      } else {
        return forwardingEventsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *&#47; A list of forwarding events from the time slice of the time series specified in the request.
     * </pre>
     *
     * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
     */
    public int getForwardingEventsCount() {
      if (forwardingEventsBuilder_ == null) {
        return forwardingEvents_.size();
      } else {
        return forwardingEventsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *&#47; A list of forwarding events from the time slice of the time series specified in the request.
     * </pre>
     *
     * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
     */
    public lightpay.lnd.grpc.ForwardingEvent getForwardingEvents(int index) {
      if (forwardingEventsBuilder_ == null) {
        return forwardingEvents_.get(index);
      } else {
        return forwardingEventsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *&#47; A list of forwarding events from the time slice of the time series specified in the request.
     * </pre>
     *
     * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
     */
    public Builder setForwardingEvents(
        int index, lightpay.lnd.grpc.ForwardingEvent value) {
      if (forwardingEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureForwardingEventsIsMutable();
        forwardingEvents_.set(index, value);
        onChanged();
      } else {
        forwardingEventsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *&#47; A list of forwarding events from the time slice of the time series specified in the request.
     * </pre>
     *
     * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
     */
    public Builder setForwardingEvents(
        int index, lightpay.lnd.grpc.ForwardingEvent.Builder builderForValue) {
      if (forwardingEventsBuilder_ == null) {
        ensureForwardingEventsIsMutable();
        forwardingEvents_.set(index, builderForValue.build());
        onChanged();
      } else {
        forwardingEventsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *&#47; A list of forwarding events from the time slice of the time series specified in the request.
     * </pre>
     *
     * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
     */
    public Builder addForwardingEvents(lightpay.lnd.grpc.ForwardingEvent value) {
      if (forwardingEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureForwardingEventsIsMutable();
        forwardingEvents_.add(value);
        onChanged();
      } else {
        forwardingEventsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *&#47; A list of forwarding events from the time slice of the time series specified in the request.
     * </pre>
     *
     * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
     */
    public Builder addForwardingEvents(
        int index, lightpay.lnd.grpc.ForwardingEvent value) {
      if (forwardingEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureForwardingEventsIsMutable();
        forwardingEvents_.add(index, value);
        onChanged();
      } else {
        forwardingEventsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *&#47; A list of forwarding events from the time slice of the time series specified in the request.
     * </pre>
     *
     * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
     */
    public Builder addForwardingEvents(
        lightpay.lnd.grpc.ForwardingEvent.Builder builderForValue) {
      if (forwardingEventsBuilder_ == null) {
        ensureForwardingEventsIsMutable();
        forwardingEvents_.add(builderForValue.build());
        onChanged();
      } else {
        forwardingEventsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *&#47; A list of forwarding events from the time slice of the time series specified in the request.
     * </pre>
     *
     * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
     */
    public Builder addForwardingEvents(
        int index, lightpay.lnd.grpc.ForwardingEvent.Builder builderForValue) {
      if (forwardingEventsBuilder_ == null) {
        ensureForwardingEventsIsMutable();
        forwardingEvents_.add(index, builderForValue.build());
        onChanged();
      } else {
        forwardingEventsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *&#47; A list of forwarding events from the time slice of the time series specified in the request.
     * </pre>
     *
     * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
     */
    public Builder addAllForwardingEvents(
        java.lang.Iterable<? extends lightpay.lnd.grpc.ForwardingEvent> values) {
      if (forwardingEventsBuilder_ == null) {
        ensureForwardingEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, forwardingEvents_);
        onChanged();
      } else {
        forwardingEventsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *&#47; A list of forwarding events from the time slice of the time series specified in the request.
     * </pre>
     *
     * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
     */
    public Builder clearForwardingEvents() {
      if (forwardingEventsBuilder_ == null) {
        forwardingEvents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        forwardingEventsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *&#47; A list of forwarding events from the time slice of the time series specified in the request.
     * </pre>
     *
     * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
     */
    public Builder removeForwardingEvents(int index) {
      if (forwardingEventsBuilder_ == null) {
        ensureForwardingEventsIsMutable();
        forwardingEvents_.remove(index);
        onChanged();
      } else {
        forwardingEventsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *&#47; A list of forwarding events from the time slice of the time series specified in the request.
     * </pre>
     *
     * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
     */
    public lightpay.lnd.grpc.ForwardingEvent.Builder getForwardingEventsBuilder(
        int index) {
      return getForwardingEventsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *&#47; A list of forwarding events from the time slice of the time series specified in the request.
     * </pre>
     *
     * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
     */
    public lightpay.lnd.grpc.ForwardingEventOrBuilder getForwardingEventsOrBuilder(
        int index) {
      if (forwardingEventsBuilder_ == null) {
        return forwardingEvents_.get(index);  } else {
        return forwardingEventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *&#47; A list of forwarding events from the time slice of the time series specified in the request.
     * </pre>
     *
     * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
     */
    public java.util.List<? extends lightpay.lnd.grpc.ForwardingEventOrBuilder> 
         getForwardingEventsOrBuilderList() {
      if (forwardingEventsBuilder_ != null) {
        return forwardingEventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(forwardingEvents_);
      }
    }
    /**
     * <pre>
     *&#47; A list of forwarding events from the time slice of the time series specified in the request.
     * </pre>
     *
     * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
     */
    public lightpay.lnd.grpc.ForwardingEvent.Builder addForwardingEventsBuilder() {
      return getForwardingEventsFieldBuilder().addBuilder(
          lightpay.lnd.grpc.ForwardingEvent.getDefaultInstance());
    }
    /**
     * <pre>
     *&#47; A list of forwarding events from the time slice of the time series specified in the request.
     * </pre>
     *
     * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
     */
    public lightpay.lnd.grpc.ForwardingEvent.Builder addForwardingEventsBuilder(
        int index) {
      return getForwardingEventsFieldBuilder().addBuilder(
          index, lightpay.lnd.grpc.ForwardingEvent.getDefaultInstance());
    }
    /**
     * <pre>
     *&#47; A list of forwarding events from the time slice of the time series specified in the request.
     * </pre>
     *
     * <code>repeated .lnrpc.ForwardingEvent forwarding_events = 1[json_name = "forwarding_events"];</code>
     */
    public java.util.List<lightpay.lnd.grpc.ForwardingEvent.Builder> 
         getForwardingEventsBuilderList() {
      return getForwardingEventsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        lightpay.lnd.grpc.ForwardingEvent, lightpay.lnd.grpc.ForwardingEvent.Builder, lightpay.lnd.grpc.ForwardingEventOrBuilder> 
        getForwardingEventsFieldBuilder() {
      if (forwardingEventsBuilder_ == null) {
        forwardingEventsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            lightpay.lnd.grpc.ForwardingEvent, lightpay.lnd.grpc.ForwardingEvent.Builder, lightpay.lnd.grpc.ForwardingEventOrBuilder>(
                forwardingEvents_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        forwardingEvents_ = null;
      }
      return forwardingEventsBuilder_;
    }

    private int lastOffsetIndex_ ;
    /**
     * <pre>
     *&#47; The index of the last time in the set of returned forwarding events. Can be used to seek further, pagination style.
     * </pre>
     *
     * <code>uint32 last_offset_index = 2[json_name = "last_offset_index"];</code>
     */
    public int getLastOffsetIndex() {
      return lastOffsetIndex_;
    }
    /**
     * <pre>
     *&#47; The index of the last time in the set of returned forwarding events. Can be used to seek further, pagination style.
     * </pre>
     *
     * <code>uint32 last_offset_index = 2[json_name = "last_offset_index"];</code>
     */
    public Builder setLastOffsetIndex(int value) {
      
      lastOffsetIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; The index of the last time in the set of returned forwarding events. Can be used to seek further, pagination style.
     * </pre>
     *
     * <code>uint32 last_offset_index = 2[json_name = "last_offset_index"];</code>
     */
    public Builder clearLastOffsetIndex() {
      
      lastOffsetIndex_ = 0;
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


    // @@protoc_insertion_point(builder_scope:lnrpc.ForwardingHistoryResponse)
  }

  // @@protoc_insertion_point(class_scope:lnrpc.ForwardingHistoryResponse)
  private static final lightpay.lnd.grpc.ForwardingHistoryResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lightpay.lnd.grpc.ForwardingHistoryResponse();
  }

  public static lightpay.lnd.grpc.ForwardingHistoryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ForwardingHistoryResponse>
      PARSER = new com.google.protobuf.AbstractParser<ForwardingHistoryResponse>() {
    public ForwardingHistoryResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ForwardingHistoryResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ForwardingHistoryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ForwardingHistoryResponse> getParserForType() {
    return PARSER;
  }

  public lightpay.lnd.grpc.ForwardingHistoryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
