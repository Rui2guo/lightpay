// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

/**
 * Protobuf type {@code lnrpc.RouteHint}
 */
public  final class RouteHint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lnrpc.RouteHint)
    RouteHintOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RouteHint.newBuilder() to construct.
  private RouteHint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RouteHint() {
    hopHints_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RouteHint(
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
              hopHints_ = new java.util.ArrayList<lightpay.lnd.grpc.HopHint>();
              mutable_bitField0_ |= 0x00000001;
            }
            hopHints_.add(
                input.readMessage(lightpay.lnd.grpc.HopHint.parser(), extensionRegistry));
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
        hopHints_ = java.util.Collections.unmodifiableList(hopHints_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_RouteHint_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_RouteHint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lightpay.lnd.grpc.RouteHint.class, lightpay.lnd.grpc.RouteHint.Builder.class);
  }

  public static final int HOP_HINTS_FIELD_NUMBER = 1;
  private java.util.List<lightpay.lnd.grpc.HopHint> hopHints_;
  /**
   * <pre>
   **
   *A list of hop hints that when chained together can assist in reaching a
   *specific destination.
   * </pre>
   *
   * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
   */
  public java.util.List<lightpay.lnd.grpc.HopHint> getHopHintsList() {
    return hopHints_;
  }
  /**
   * <pre>
   **
   *A list of hop hints that when chained together can assist in reaching a
   *specific destination.
   * </pre>
   *
   * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
   */
  public java.util.List<? extends lightpay.lnd.grpc.HopHintOrBuilder> 
      getHopHintsOrBuilderList() {
    return hopHints_;
  }
  /**
   * <pre>
   **
   *A list of hop hints that when chained together can assist in reaching a
   *specific destination.
   * </pre>
   *
   * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
   */
  public int getHopHintsCount() {
    return hopHints_.size();
  }
  /**
   * <pre>
   **
   *A list of hop hints that when chained together can assist in reaching a
   *specific destination.
   * </pre>
   *
   * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
   */
  public lightpay.lnd.grpc.HopHint getHopHints(int index) {
    return hopHints_.get(index);
  }
  /**
   * <pre>
   **
   *A list of hop hints that when chained together can assist in reaching a
   *specific destination.
   * </pre>
   *
   * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
   */
  public lightpay.lnd.grpc.HopHintOrBuilder getHopHintsOrBuilder(
      int index) {
    return hopHints_.get(index);
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
    for (int i = 0; i < hopHints_.size(); i++) {
      output.writeMessage(1, hopHints_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < hopHints_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, hopHints_.get(i));
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
    if (!(obj instanceof lightpay.lnd.grpc.RouteHint)) {
      return super.equals(obj);
    }
    lightpay.lnd.grpc.RouteHint other = (lightpay.lnd.grpc.RouteHint) obj;

    boolean result = true;
    result = result && getHopHintsList()
        .equals(other.getHopHintsList());
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
    if (getHopHintsCount() > 0) {
      hash = (37 * hash) + HOP_HINTS_FIELD_NUMBER;
      hash = (53 * hash) + getHopHintsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lightpay.lnd.grpc.RouteHint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.RouteHint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.RouteHint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.RouteHint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.RouteHint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.RouteHint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.RouteHint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.RouteHint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.RouteHint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.RouteHint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.RouteHint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.RouteHint parseFrom(
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
  public static Builder newBuilder(lightpay.lnd.grpc.RouteHint prototype) {
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
   * Protobuf type {@code lnrpc.RouteHint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lnrpc.RouteHint)
      lightpay.lnd.grpc.RouteHintOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_RouteHint_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_RouteHint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lightpay.lnd.grpc.RouteHint.class, lightpay.lnd.grpc.RouteHint.Builder.class);
    }

    // Construct using lightpay.lnd.grpc.RouteHint.newBuilder()
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
        getHopHintsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (hopHintsBuilder_ == null) {
        hopHints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        hopHintsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_RouteHint_descriptor;
    }

    public lightpay.lnd.grpc.RouteHint getDefaultInstanceForType() {
      return lightpay.lnd.grpc.RouteHint.getDefaultInstance();
    }

    public lightpay.lnd.grpc.RouteHint build() {
      lightpay.lnd.grpc.RouteHint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public lightpay.lnd.grpc.RouteHint buildPartial() {
      lightpay.lnd.grpc.RouteHint result = new lightpay.lnd.grpc.RouteHint(this);
      int from_bitField0_ = bitField0_;
      if (hopHintsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          hopHints_ = java.util.Collections.unmodifiableList(hopHints_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.hopHints_ = hopHints_;
      } else {
        result.hopHints_ = hopHintsBuilder_.build();
      }
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
      if (other instanceof lightpay.lnd.grpc.RouteHint) {
        return mergeFrom((lightpay.lnd.grpc.RouteHint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lightpay.lnd.grpc.RouteHint other) {
      if (other == lightpay.lnd.grpc.RouteHint.getDefaultInstance()) return this;
      if (hopHintsBuilder_ == null) {
        if (!other.hopHints_.isEmpty()) {
          if (hopHints_.isEmpty()) {
            hopHints_ = other.hopHints_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHopHintsIsMutable();
            hopHints_.addAll(other.hopHints_);
          }
          onChanged();
        }
      } else {
        if (!other.hopHints_.isEmpty()) {
          if (hopHintsBuilder_.isEmpty()) {
            hopHintsBuilder_.dispose();
            hopHintsBuilder_ = null;
            hopHints_ = other.hopHints_;
            bitField0_ = (bitField0_ & ~0x00000001);
            hopHintsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHopHintsFieldBuilder() : null;
          } else {
            hopHintsBuilder_.addAllMessages(other.hopHints_);
          }
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
      lightpay.lnd.grpc.RouteHint parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lightpay.lnd.grpc.RouteHint) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<lightpay.lnd.grpc.HopHint> hopHints_ =
      java.util.Collections.emptyList();
    private void ensureHopHintsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        hopHints_ = new java.util.ArrayList<lightpay.lnd.grpc.HopHint>(hopHints_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        lightpay.lnd.grpc.HopHint, lightpay.lnd.grpc.HopHint.Builder, lightpay.lnd.grpc.HopHintOrBuilder> hopHintsBuilder_;

    /**
     * <pre>
     **
     *A list of hop hints that when chained together can assist in reaching a
     *specific destination.
     * </pre>
     *
     * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
     */
    public java.util.List<lightpay.lnd.grpc.HopHint> getHopHintsList() {
      if (hopHintsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(hopHints_);
      } else {
        return hopHintsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     **
     *A list of hop hints that when chained together can assist in reaching a
     *specific destination.
     * </pre>
     *
     * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
     */
    public int getHopHintsCount() {
      if (hopHintsBuilder_ == null) {
        return hopHints_.size();
      } else {
        return hopHintsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     **
     *A list of hop hints that when chained together can assist in reaching a
     *specific destination.
     * </pre>
     *
     * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
     */
    public lightpay.lnd.grpc.HopHint getHopHints(int index) {
      if (hopHintsBuilder_ == null) {
        return hopHints_.get(index);
      } else {
        return hopHintsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     **
     *A list of hop hints that when chained together can assist in reaching a
     *specific destination.
     * </pre>
     *
     * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
     */
    public Builder setHopHints(
        int index, lightpay.lnd.grpc.HopHint value) {
      if (hopHintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHopHintsIsMutable();
        hopHints_.set(index, value);
        onChanged();
      } else {
        hopHintsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     **
     *A list of hop hints that when chained together can assist in reaching a
     *specific destination.
     * </pre>
     *
     * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
     */
    public Builder setHopHints(
        int index, lightpay.lnd.grpc.HopHint.Builder builderForValue) {
      if (hopHintsBuilder_ == null) {
        ensureHopHintsIsMutable();
        hopHints_.set(index, builderForValue.build());
        onChanged();
      } else {
        hopHintsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     **
     *A list of hop hints that when chained together can assist in reaching a
     *specific destination.
     * </pre>
     *
     * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
     */
    public Builder addHopHints(lightpay.lnd.grpc.HopHint value) {
      if (hopHintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHopHintsIsMutable();
        hopHints_.add(value);
        onChanged();
      } else {
        hopHintsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     **
     *A list of hop hints that when chained together can assist in reaching a
     *specific destination.
     * </pre>
     *
     * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
     */
    public Builder addHopHints(
        int index, lightpay.lnd.grpc.HopHint value) {
      if (hopHintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHopHintsIsMutable();
        hopHints_.add(index, value);
        onChanged();
      } else {
        hopHintsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     **
     *A list of hop hints that when chained together can assist in reaching a
     *specific destination.
     * </pre>
     *
     * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
     */
    public Builder addHopHints(
        lightpay.lnd.grpc.HopHint.Builder builderForValue) {
      if (hopHintsBuilder_ == null) {
        ensureHopHintsIsMutable();
        hopHints_.add(builderForValue.build());
        onChanged();
      } else {
        hopHintsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     **
     *A list of hop hints that when chained together can assist in reaching a
     *specific destination.
     * </pre>
     *
     * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
     */
    public Builder addHopHints(
        int index, lightpay.lnd.grpc.HopHint.Builder builderForValue) {
      if (hopHintsBuilder_ == null) {
        ensureHopHintsIsMutable();
        hopHints_.add(index, builderForValue.build());
        onChanged();
      } else {
        hopHintsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     **
     *A list of hop hints that when chained together can assist in reaching a
     *specific destination.
     * </pre>
     *
     * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
     */
    public Builder addAllHopHints(
        java.lang.Iterable<? extends lightpay.lnd.grpc.HopHint> values) {
      if (hopHintsBuilder_ == null) {
        ensureHopHintsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hopHints_);
        onChanged();
      } else {
        hopHintsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     **
     *A list of hop hints that when chained together can assist in reaching a
     *specific destination.
     * </pre>
     *
     * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
     */
    public Builder clearHopHints() {
      if (hopHintsBuilder_ == null) {
        hopHints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        hopHintsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     **
     *A list of hop hints that when chained together can assist in reaching a
     *specific destination.
     * </pre>
     *
     * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
     */
    public Builder removeHopHints(int index) {
      if (hopHintsBuilder_ == null) {
        ensureHopHintsIsMutable();
        hopHints_.remove(index);
        onChanged();
      } else {
        hopHintsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     **
     *A list of hop hints that when chained together can assist in reaching a
     *specific destination.
     * </pre>
     *
     * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
     */
    public lightpay.lnd.grpc.HopHint.Builder getHopHintsBuilder(
        int index) {
      return getHopHintsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     **
     *A list of hop hints that when chained together can assist in reaching a
     *specific destination.
     * </pre>
     *
     * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
     */
    public lightpay.lnd.grpc.HopHintOrBuilder getHopHintsOrBuilder(
        int index) {
      if (hopHintsBuilder_ == null) {
        return hopHints_.get(index);  } else {
        return hopHintsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     **
     *A list of hop hints that when chained together can assist in reaching a
     *specific destination.
     * </pre>
     *
     * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
     */
    public java.util.List<? extends lightpay.lnd.grpc.HopHintOrBuilder> 
         getHopHintsOrBuilderList() {
      if (hopHintsBuilder_ != null) {
        return hopHintsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(hopHints_);
      }
    }
    /**
     * <pre>
     **
     *A list of hop hints that when chained together can assist in reaching a
     *specific destination.
     * </pre>
     *
     * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
     */
    public lightpay.lnd.grpc.HopHint.Builder addHopHintsBuilder() {
      return getHopHintsFieldBuilder().addBuilder(
          lightpay.lnd.grpc.HopHint.getDefaultInstance());
    }
    /**
     * <pre>
     **
     *A list of hop hints that when chained together can assist in reaching a
     *specific destination.
     * </pre>
     *
     * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
     */
    public lightpay.lnd.grpc.HopHint.Builder addHopHintsBuilder(
        int index) {
      return getHopHintsFieldBuilder().addBuilder(
          index, lightpay.lnd.grpc.HopHint.getDefaultInstance());
    }
    /**
     * <pre>
     **
     *A list of hop hints that when chained together can assist in reaching a
     *specific destination.
     * </pre>
     *
     * <code>repeated .lnrpc.HopHint hop_hints = 1[json_name = "hop_hints"];</code>
     */
    public java.util.List<lightpay.lnd.grpc.HopHint.Builder> 
         getHopHintsBuilderList() {
      return getHopHintsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        lightpay.lnd.grpc.HopHint, lightpay.lnd.grpc.HopHint.Builder, lightpay.lnd.grpc.HopHintOrBuilder> 
        getHopHintsFieldBuilder() {
      if (hopHintsBuilder_ == null) {
        hopHintsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            lightpay.lnd.grpc.HopHint, lightpay.lnd.grpc.HopHint.Builder, lightpay.lnd.grpc.HopHintOrBuilder>(
                hopHints_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        hopHints_ = null;
      }
      return hopHintsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:lnrpc.RouteHint)
  }

  // @@protoc_insertion_point(class_scope:lnrpc.RouteHint)
  private static final lightpay.lnd.grpc.RouteHint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lightpay.lnd.grpc.RouteHint();
  }

  public static lightpay.lnd.grpc.RouteHint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RouteHint>
      PARSER = new com.google.protobuf.AbstractParser<RouteHint>() {
    public RouteHint parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RouteHint(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RouteHint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RouteHint> getParserForType() {
    return PARSER;
  }

  public lightpay.lnd.grpc.RouteHint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

