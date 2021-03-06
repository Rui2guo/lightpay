// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

/**
 * Protobuf type {@code lnrpc.NodeInfo}
 */
public  final class NodeInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lnrpc.NodeInfo)
    NodeInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NodeInfo.newBuilder() to construct.
  private NodeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NodeInfo() {
    numChannels_ = 0;
    totalCapacity_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NodeInfo(
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
            lightpay.lnd.grpc.LightningNode.Builder subBuilder = null;
            if (node_ != null) {
              subBuilder = node_.toBuilder();
            }
            node_ = input.readMessage(lightpay.lnd.grpc.LightningNode.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(node_);
              node_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            numChannels_ = input.readUInt32();
            break;
          }
          case 24: {

            totalCapacity_ = input.readInt64();
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
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_NodeInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_NodeInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lightpay.lnd.grpc.NodeInfo.class, lightpay.lnd.grpc.NodeInfo.Builder.class);
  }

  public static final int NODE_FIELD_NUMBER = 1;
  private lightpay.lnd.grpc.LightningNode node_;
  /**
   * <pre>
   **
   *An individual vertex/node within the channel graph. A node is
   *connected to other nodes by one or more channel edges emanating from it. As
   *the graph is directed, a node will also have an incoming edge attached to
   *it for each outgoing edge.
   * </pre>
   *
   * <code>.lnrpc.LightningNode node = 1[json_name = "node"];</code>
   */
  public boolean hasNode() {
    return node_ != null;
  }
  /**
   * <pre>
   **
   *An individual vertex/node within the channel graph. A node is
   *connected to other nodes by one or more channel edges emanating from it. As
   *the graph is directed, a node will also have an incoming edge attached to
   *it for each outgoing edge.
   * </pre>
   *
   * <code>.lnrpc.LightningNode node = 1[json_name = "node"];</code>
   */
  public lightpay.lnd.grpc.LightningNode getNode() {
    return node_ == null ? lightpay.lnd.grpc.LightningNode.getDefaultInstance() : node_;
  }
  /**
   * <pre>
   **
   *An individual vertex/node within the channel graph. A node is
   *connected to other nodes by one or more channel edges emanating from it. As
   *the graph is directed, a node will also have an incoming edge attached to
   *it for each outgoing edge.
   * </pre>
   *
   * <code>.lnrpc.LightningNode node = 1[json_name = "node"];</code>
   */
  public lightpay.lnd.grpc.LightningNodeOrBuilder getNodeOrBuilder() {
    return getNode();
  }

  public static final int NUM_CHANNELS_FIELD_NUMBER = 2;
  private int numChannels_;
  /**
   * <code>uint32 num_channels = 2[json_name = "num_channels"];</code>
   */
  public int getNumChannels() {
    return numChannels_;
  }

  public static final int TOTAL_CAPACITY_FIELD_NUMBER = 3;
  private long totalCapacity_;
  /**
   * <code>int64 total_capacity = 3[json_name = "total_capacity"];</code>
   */
  public long getTotalCapacity() {
    return totalCapacity_;
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
    if (node_ != null) {
      output.writeMessage(1, getNode());
    }
    if (numChannels_ != 0) {
      output.writeUInt32(2, numChannels_);
    }
    if (totalCapacity_ != 0L) {
      output.writeInt64(3, totalCapacity_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (node_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNode());
    }
    if (numChannels_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, numChannels_);
    }
    if (totalCapacity_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, totalCapacity_);
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
    if (!(obj instanceof lightpay.lnd.grpc.NodeInfo)) {
      return super.equals(obj);
    }
    lightpay.lnd.grpc.NodeInfo other = (lightpay.lnd.grpc.NodeInfo) obj;

    boolean result = true;
    result = result && (hasNode() == other.hasNode());
    if (hasNode()) {
      result = result && getNode()
          .equals(other.getNode());
    }
    result = result && (getNumChannels()
        == other.getNumChannels());
    result = result && (getTotalCapacity()
        == other.getTotalCapacity());
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
    if (hasNode()) {
      hash = (37 * hash) + NODE_FIELD_NUMBER;
      hash = (53 * hash) + getNode().hashCode();
    }
    hash = (37 * hash) + NUM_CHANNELS_FIELD_NUMBER;
    hash = (53 * hash) + getNumChannels();
    hash = (37 * hash) + TOTAL_CAPACITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalCapacity());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lightpay.lnd.grpc.NodeInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.NodeInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.NodeInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.NodeInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.NodeInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.NodeInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.NodeInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.NodeInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.NodeInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.NodeInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.NodeInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.NodeInfo parseFrom(
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
  public static Builder newBuilder(lightpay.lnd.grpc.NodeInfo prototype) {
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
   * Protobuf type {@code lnrpc.NodeInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lnrpc.NodeInfo)
      lightpay.lnd.grpc.NodeInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_NodeInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_NodeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lightpay.lnd.grpc.NodeInfo.class, lightpay.lnd.grpc.NodeInfo.Builder.class);
    }

    // Construct using lightpay.lnd.grpc.NodeInfo.newBuilder()
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
      if (nodeBuilder_ == null) {
        node_ = null;
      } else {
        node_ = null;
        nodeBuilder_ = null;
      }
      numChannels_ = 0;

      totalCapacity_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_NodeInfo_descriptor;
    }

    public lightpay.lnd.grpc.NodeInfo getDefaultInstanceForType() {
      return lightpay.lnd.grpc.NodeInfo.getDefaultInstance();
    }

    public lightpay.lnd.grpc.NodeInfo build() {
      lightpay.lnd.grpc.NodeInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public lightpay.lnd.grpc.NodeInfo buildPartial() {
      lightpay.lnd.grpc.NodeInfo result = new lightpay.lnd.grpc.NodeInfo(this);
      if (nodeBuilder_ == null) {
        result.node_ = node_;
      } else {
        result.node_ = nodeBuilder_.build();
      }
      result.numChannels_ = numChannels_;
      result.totalCapacity_ = totalCapacity_;
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
      if (other instanceof lightpay.lnd.grpc.NodeInfo) {
        return mergeFrom((lightpay.lnd.grpc.NodeInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lightpay.lnd.grpc.NodeInfo other) {
      if (other == lightpay.lnd.grpc.NodeInfo.getDefaultInstance()) return this;
      if (other.hasNode()) {
        mergeNode(other.getNode());
      }
      if (other.getNumChannels() != 0) {
        setNumChannels(other.getNumChannels());
      }
      if (other.getTotalCapacity() != 0L) {
        setTotalCapacity(other.getTotalCapacity());
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
      lightpay.lnd.grpc.NodeInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lightpay.lnd.grpc.NodeInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private lightpay.lnd.grpc.LightningNode node_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        lightpay.lnd.grpc.LightningNode, lightpay.lnd.grpc.LightningNode.Builder, lightpay.lnd.grpc.LightningNodeOrBuilder> nodeBuilder_;
    /**
     * <pre>
     **
     *An individual vertex/node within the channel graph. A node is
     *connected to other nodes by one or more channel edges emanating from it. As
     *the graph is directed, a node will also have an incoming edge attached to
     *it for each outgoing edge.
     * </pre>
     *
     * <code>.lnrpc.LightningNode node = 1[json_name = "node"];</code>
     */
    public boolean hasNode() {
      return nodeBuilder_ != null || node_ != null;
    }
    /**
     * <pre>
     **
     *An individual vertex/node within the channel graph. A node is
     *connected to other nodes by one or more channel edges emanating from it. As
     *the graph is directed, a node will also have an incoming edge attached to
     *it for each outgoing edge.
     * </pre>
     *
     * <code>.lnrpc.LightningNode node = 1[json_name = "node"];</code>
     */
    public lightpay.lnd.grpc.LightningNode getNode() {
      if (nodeBuilder_ == null) {
        return node_ == null ? lightpay.lnd.grpc.LightningNode.getDefaultInstance() : node_;
      } else {
        return nodeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     **
     *An individual vertex/node within the channel graph. A node is
     *connected to other nodes by one or more channel edges emanating from it. As
     *the graph is directed, a node will also have an incoming edge attached to
     *it for each outgoing edge.
     * </pre>
     *
     * <code>.lnrpc.LightningNode node = 1[json_name = "node"];</code>
     */
    public Builder setNode(lightpay.lnd.grpc.LightningNode value) {
      if (nodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        node_ = value;
        onChanged();
      } else {
        nodeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     **
     *An individual vertex/node within the channel graph. A node is
     *connected to other nodes by one or more channel edges emanating from it. As
     *the graph is directed, a node will also have an incoming edge attached to
     *it for each outgoing edge.
     * </pre>
     *
     * <code>.lnrpc.LightningNode node = 1[json_name = "node"];</code>
     */
    public Builder setNode(
        lightpay.lnd.grpc.LightningNode.Builder builderForValue) {
      if (nodeBuilder_ == null) {
        node_ = builderForValue.build();
        onChanged();
      } else {
        nodeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     **
     *An individual vertex/node within the channel graph. A node is
     *connected to other nodes by one or more channel edges emanating from it. As
     *the graph is directed, a node will also have an incoming edge attached to
     *it for each outgoing edge.
     * </pre>
     *
     * <code>.lnrpc.LightningNode node = 1[json_name = "node"];</code>
     */
    public Builder mergeNode(lightpay.lnd.grpc.LightningNode value) {
      if (nodeBuilder_ == null) {
        if (node_ != null) {
          node_ =
            lightpay.lnd.grpc.LightningNode.newBuilder(node_).mergeFrom(value).buildPartial();
        } else {
          node_ = value;
        }
        onChanged();
      } else {
        nodeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     **
     *An individual vertex/node within the channel graph. A node is
     *connected to other nodes by one or more channel edges emanating from it. As
     *the graph is directed, a node will also have an incoming edge attached to
     *it for each outgoing edge.
     * </pre>
     *
     * <code>.lnrpc.LightningNode node = 1[json_name = "node"];</code>
     */
    public Builder clearNode() {
      if (nodeBuilder_ == null) {
        node_ = null;
        onChanged();
      } else {
        node_ = null;
        nodeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     **
     *An individual vertex/node within the channel graph. A node is
     *connected to other nodes by one or more channel edges emanating from it. As
     *the graph is directed, a node will also have an incoming edge attached to
     *it for each outgoing edge.
     * </pre>
     *
     * <code>.lnrpc.LightningNode node = 1[json_name = "node"];</code>
     */
    public lightpay.lnd.grpc.LightningNode.Builder getNodeBuilder() {
      
      onChanged();
      return getNodeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     **
     *An individual vertex/node within the channel graph. A node is
     *connected to other nodes by one or more channel edges emanating from it. As
     *the graph is directed, a node will also have an incoming edge attached to
     *it for each outgoing edge.
     * </pre>
     *
     * <code>.lnrpc.LightningNode node = 1[json_name = "node"];</code>
     */
    public lightpay.lnd.grpc.LightningNodeOrBuilder getNodeOrBuilder() {
      if (nodeBuilder_ != null) {
        return nodeBuilder_.getMessageOrBuilder();
      } else {
        return node_ == null ?
            lightpay.lnd.grpc.LightningNode.getDefaultInstance() : node_;
      }
    }
    /**
     * <pre>
     **
     *An individual vertex/node within the channel graph. A node is
     *connected to other nodes by one or more channel edges emanating from it. As
     *the graph is directed, a node will also have an incoming edge attached to
     *it for each outgoing edge.
     * </pre>
     *
     * <code>.lnrpc.LightningNode node = 1[json_name = "node"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        lightpay.lnd.grpc.LightningNode, lightpay.lnd.grpc.LightningNode.Builder, lightpay.lnd.grpc.LightningNodeOrBuilder> 
        getNodeFieldBuilder() {
      if (nodeBuilder_ == null) {
        nodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            lightpay.lnd.grpc.LightningNode, lightpay.lnd.grpc.LightningNode.Builder, lightpay.lnd.grpc.LightningNodeOrBuilder>(
                getNode(),
                getParentForChildren(),
                isClean());
        node_ = null;
      }
      return nodeBuilder_;
    }

    private int numChannels_ ;
    /**
     * <code>uint32 num_channels = 2[json_name = "num_channels"];</code>
     */
    public int getNumChannels() {
      return numChannels_;
    }
    /**
     * <code>uint32 num_channels = 2[json_name = "num_channels"];</code>
     */
    public Builder setNumChannels(int value) {
      
      numChannels_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 num_channels = 2[json_name = "num_channels"];</code>
     */
    public Builder clearNumChannels() {
      
      numChannels_ = 0;
      onChanged();
      return this;
    }

    private long totalCapacity_ ;
    /**
     * <code>int64 total_capacity = 3[json_name = "total_capacity"];</code>
     */
    public long getTotalCapacity() {
      return totalCapacity_;
    }
    /**
     * <code>int64 total_capacity = 3[json_name = "total_capacity"];</code>
     */
    public Builder setTotalCapacity(long value) {
      
      totalCapacity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 total_capacity = 3[json_name = "total_capacity"];</code>
     */
    public Builder clearTotalCapacity() {
      
      totalCapacity_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:lnrpc.NodeInfo)
  }

  // @@protoc_insertion_point(class_scope:lnrpc.NodeInfo)
  private static final lightpay.lnd.grpc.NodeInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lightpay.lnd.grpc.NodeInfo();
  }

  public static lightpay.lnd.grpc.NodeInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeInfo>
      PARSER = new com.google.protobuf.AbstractParser<NodeInfo>() {
    public NodeInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NodeInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NodeInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeInfo> getParserForType() {
    return PARSER;
  }

  public lightpay.lnd.grpc.NodeInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

