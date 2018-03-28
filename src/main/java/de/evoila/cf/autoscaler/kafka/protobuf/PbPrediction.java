// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Prediction.proto

package de.evoila.cf.autoscaler.kafka.protobuf;

public final class PbPrediction {
  private PbPrediction() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ProtoPredictionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:autoscaler.ProtoPrediction)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 timestamp = 1;</code>
     */
    long getTimestamp();

    /**
     * <code>string predictorId = 2;</code>
     */
    java.lang.String getPredictorId();
    /**
     * <code>string predictorId = 2;</code>
     */
    com.google.protobuf.ByteString
        getPredictorIdBytes();

    /**
     * <code>string appId = 3;</code>
     */
    java.lang.String getAppId();
    /**
     * <code>string appId = 3;</code>
     */
    com.google.protobuf.ByteString
        getAppIdBytes();

    /**
     * <code>int64 intervalStart = 4;</code>
     */
    long getIntervalStart();

    /**
     * <code>int64 intervalEnd = 5;</code>
     */
    long getIntervalEnd();

    /**
     * <code>int32 instanceCount = 6;</code>
     */
    int getInstanceCount();

    /**
     * <code>string description = 7;</code>
     */
    java.lang.String getDescription();
    /**
     * <code>string description = 7;</code>
     */
    com.google.protobuf.ByteString
        getDescriptionBytes();
  }
  /**
   * Protobuf type {@code autoscaler.ProtoPrediction}
   */
  public  static final class ProtoPrediction extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:autoscaler.ProtoPrediction)
      ProtoPredictionOrBuilder {
    // Use ProtoPrediction.newBuilder() to construct.
    private ProtoPrediction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ProtoPrediction() {
      timestamp_ = 0L;
      predictorId_ = "";
      appId_ = "";
      intervalStart_ = 0L;
      intervalEnd_ = 0L;
      instanceCount_ = 0;
      description_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ProtoPrediction(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              timestamp_ = input.readInt64();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              predictorId_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              appId_ = s;
              break;
            }
            case 32: {

              intervalStart_ = input.readInt64();
              break;
            }
            case 40: {

              intervalEnd_ = input.readInt64();
              break;
            }
            case 48: {

              instanceCount_ = input.readInt32();
              break;
            }
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();

              description_ = s;
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.internal_static_autoscaler_ProtoPrediction_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.internal_static_autoscaler_ProtoPrediction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction.class, de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction.Builder.class);
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private long timestamp_;
    /**
     * <code>int64 timestamp = 1;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int PREDICTORID_FIELD_NUMBER = 2;
    private volatile java.lang.Object predictorId_;
    /**
     * <code>string predictorId = 2;</code>
     */
    public java.lang.String getPredictorId() {
      java.lang.Object ref = predictorId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        predictorId_ = s;
        return s;
      }
    }
    /**
     * <code>string predictorId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPredictorIdBytes() {
      java.lang.Object ref = predictorId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        predictorId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int APPID_FIELD_NUMBER = 3;
    private volatile java.lang.Object appId_;
    /**
     * <code>string appId = 3;</code>
     */
    public java.lang.String getAppId() {
      java.lang.Object ref = appId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appId_ = s;
        return s;
      }
    }
    /**
     * <code>string appId = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAppIdBytes() {
      java.lang.Object ref = appId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int INTERVALSTART_FIELD_NUMBER = 4;
    private long intervalStart_;
    /**
     * <code>int64 intervalStart = 4;</code>
     */
    public long getIntervalStart() {
      return intervalStart_;
    }

    public static final int INTERVALEND_FIELD_NUMBER = 5;
    private long intervalEnd_;
    /**
     * <code>int64 intervalEnd = 5;</code>
     */
    public long getIntervalEnd() {
      return intervalEnd_;
    }

    public static final int INSTANCECOUNT_FIELD_NUMBER = 6;
    private int instanceCount_;
    /**
     * <code>int32 instanceCount = 6;</code>
     */
    public int getInstanceCount() {
      return instanceCount_;
    }

    public static final int DESCRIPTION_FIELD_NUMBER = 7;
    private volatile java.lang.Object description_;
    /**
     * <code>string description = 7;</code>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      }
    }
    /**
     * <code>string description = 7;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (timestamp_ != 0L) {
        output.writeInt64(1, timestamp_);
      }
      if (!getPredictorIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, predictorId_);
      }
      if (!getAppIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, appId_);
      }
      if (intervalStart_ != 0L) {
        output.writeInt64(4, intervalStart_);
      }
      if (intervalEnd_ != 0L) {
        output.writeInt64(5, intervalEnd_);
      }
      if (instanceCount_ != 0) {
        output.writeInt32(6, instanceCount_);
      }
      if (!getDescriptionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, description_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (timestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, timestamp_);
      }
      if (!getPredictorIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, predictorId_);
      }
      if (!getAppIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, appId_);
      }
      if (intervalStart_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, intervalStart_);
      }
      if (intervalEnd_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, intervalEnd_);
      }
      if (instanceCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, instanceCount_);
      }
      if (!getDescriptionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, description_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction)) {
        return super.equals(obj);
      }
      de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction other = (de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction) obj;

      boolean result = true;
      result = result && (getTimestamp()
          == other.getTimestamp());
      result = result && getPredictorId()
          .equals(other.getPredictorId());
      result = result && getAppId()
          .equals(other.getAppId());
      result = result && (getIntervalStart()
          == other.getIntervalStart());
      result = result && (getIntervalEnd()
          == other.getIntervalEnd());
      result = result && (getInstanceCount()
          == other.getInstanceCount());
      result = result && getDescription()
          .equals(other.getDescription());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimestamp());
      hash = (37 * hash) + PREDICTORID_FIELD_NUMBER;
      hash = (53 * hash) + getPredictorId().hashCode();
      hash = (37 * hash) + APPID_FIELD_NUMBER;
      hash = (53 * hash) + getAppId().hashCode();
      hash = (37 * hash) + INTERVALSTART_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getIntervalStart());
      hash = (37 * hash) + INTERVALEND_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getIntervalEnd());
      hash = (37 * hash) + INSTANCECOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getInstanceCount();
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction parseFrom(
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
    public static Builder newBuilder(de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction prototype) {
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
     * Protobuf type {@code autoscaler.ProtoPrediction}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:autoscaler.ProtoPrediction)
        de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPredictionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.internal_static_autoscaler_ProtoPrediction_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.internal_static_autoscaler_ProtoPrediction_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction.class, de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction.Builder.class);
      }

      // Construct using de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction.newBuilder()
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
        timestamp_ = 0L;

        predictorId_ = "";

        appId_ = "";

        intervalStart_ = 0L;

        intervalEnd_ = 0L;

        instanceCount_ = 0;

        description_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.internal_static_autoscaler_ProtoPrediction_descriptor;
      }

      public de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction getDefaultInstanceForType() {
        return de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction.getDefaultInstance();
      }

      public de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction build() {
        de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction buildPartial() {
        de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction result = new de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction(this);
        result.timestamp_ = timestamp_;
        result.predictorId_ = predictorId_;
        result.appId_ = appId_;
        result.intervalStart_ = intervalStart_;
        result.intervalEnd_ = intervalEnd_;
        result.instanceCount_ = instanceCount_;
        result.description_ = description_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
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
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction) {
          return mergeFrom((de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction other) {
        if (other == de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction.getDefaultInstance()) return this;
        if (other.getTimestamp() != 0L) {
          setTimestamp(other.getTimestamp());
        }
        if (!other.getPredictorId().isEmpty()) {
          predictorId_ = other.predictorId_;
          onChanged();
        }
        if (!other.getAppId().isEmpty()) {
          appId_ = other.appId_;
          onChanged();
        }
        if (other.getIntervalStart() != 0L) {
          setIntervalStart(other.getIntervalStart());
        }
        if (other.getIntervalEnd() != 0L) {
          setIntervalEnd(other.getIntervalEnd());
        }
        if (other.getInstanceCount() != 0) {
          setInstanceCount(other.getInstanceCount());
        }
        if (!other.getDescription().isEmpty()) {
          description_ = other.description_;
          onChanged();
        }
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
        de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long timestamp_ ;
      /**
       * <code>int64 timestamp = 1;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>int64 timestamp = 1;</code>
       */
      public Builder setTimestamp(long value) {
        
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 timestamp = 1;</code>
       */
      public Builder clearTimestamp() {
        
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object predictorId_ = "";
      /**
       * <code>string predictorId = 2;</code>
       */
      public java.lang.String getPredictorId() {
        java.lang.Object ref = predictorId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          predictorId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string predictorId = 2;</code>
       */
      public com.google.protobuf.ByteString
          getPredictorIdBytes() {
        java.lang.Object ref = predictorId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          predictorId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string predictorId = 2;</code>
       */
      public Builder setPredictorId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        predictorId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string predictorId = 2;</code>
       */
      public Builder clearPredictorId() {
        
        predictorId_ = getDefaultInstance().getPredictorId();
        onChanged();
        return this;
      }
      /**
       * <code>string predictorId = 2;</code>
       */
      public Builder setPredictorIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        predictorId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object appId_ = "";
      /**
       * <code>string appId = 3;</code>
       */
      public java.lang.String getAppId() {
        java.lang.Object ref = appId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          appId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string appId = 3;</code>
       */
      public com.google.protobuf.ByteString
          getAppIdBytes() {
        java.lang.Object ref = appId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          appId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string appId = 3;</code>
       */
      public Builder setAppId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        appId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string appId = 3;</code>
       */
      public Builder clearAppId() {
        
        appId_ = getDefaultInstance().getAppId();
        onChanged();
        return this;
      }
      /**
       * <code>string appId = 3;</code>
       */
      public Builder setAppIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        appId_ = value;
        onChanged();
        return this;
      }

      private long intervalStart_ ;
      /**
       * <code>int64 intervalStart = 4;</code>
       */
      public long getIntervalStart() {
        return intervalStart_;
      }
      /**
       * <code>int64 intervalStart = 4;</code>
       */
      public Builder setIntervalStart(long value) {
        
        intervalStart_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 intervalStart = 4;</code>
       */
      public Builder clearIntervalStart() {
        
        intervalStart_ = 0L;
        onChanged();
        return this;
      }

      private long intervalEnd_ ;
      /**
       * <code>int64 intervalEnd = 5;</code>
       */
      public long getIntervalEnd() {
        return intervalEnd_;
      }
      /**
       * <code>int64 intervalEnd = 5;</code>
       */
      public Builder setIntervalEnd(long value) {
        
        intervalEnd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 intervalEnd = 5;</code>
       */
      public Builder clearIntervalEnd() {
        
        intervalEnd_ = 0L;
        onChanged();
        return this;
      }

      private int instanceCount_ ;
      /**
       * <code>int32 instanceCount = 6;</code>
       */
      public int getInstanceCount() {
        return instanceCount_;
      }
      /**
       * <code>int32 instanceCount = 6;</code>
       */
      public Builder setInstanceCount(int value) {
        
        instanceCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 instanceCount = 6;</code>
       */
      public Builder clearInstanceCount() {
        
        instanceCount_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object description_ = "";
      /**
       * <code>string description = 7;</code>
       */
      public java.lang.String getDescription() {
        java.lang.Object ref = description_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          description_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string description = 7;</code>
       */
      public com.google.protobuf.ByteString
          getDescriptionBytes() {
        java.lang.Object ref = description_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          description_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string description = 7;</code>
       */
      public Builder setDescription(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        description_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string description = 7;</code>
       */
      public Builder clearDescription() {
        
        description_ = getDefaultInstance().getDescription();
        onChanged();
        return this;
      }
      /**
       * <code>string description = 7;</code>
       */
      public Builder setDescriptionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        description_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:autoscaler.ProtoPrediction)
    }

    // @@protoc_insertion_point(class_scope:autoscaler.ProtoPrediction)
    private static final de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction();
    }

    public static de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ProtoPrediction>
        PARSER = new com.google.protobuf.AbstractParser<ProtoPrediction>() {
      public ProtoPrediction parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ProtoPrediction(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ProtoPrediction> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ProtoPrediction> getParserForType() {
      return PARSER;
    }

    public de.evoila.cf.autoscaler.kafka.protobuf.PbPrediction.ProtoPrediction getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_autoscaler_ProtoPrediction_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_autoscaler_ProtoPrediction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020Prediction.proto\022\nautoscaler\"\240\001\n\017Proto" +
      "Prediction\022\021\n\ttimestamp\030\001 \001(\003\022\023\n\013predict" +
      "orId\030\002 \001(\t\022\r\n\005appId\030\003 \001(\t\022\025\n\rintervalSta" +
      "rt\030\004 \001(\003\022\023\n\013intervalEnd\030\005 \001(\003\022\025\n\rinstanc" +
      "eCount\030\006 \001(\005\022\023\n\013description\030\007 \001(\tBV\n&de." +
      "evoila.cf.autoscaler.kafka.protobufB\014PbP" +
      "rediction\252\002\035de.cf.autoscaler.PbPredictio" +
      "nb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_autoscaler_ProtoPrediction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_autoscaler_ProtoPrediction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_autoscaler_ProtoPrediction_descriptor,
        new java.lang.String[] { "Timestamp", "PredictorId", "AppId", "IntervalStart", "IntervalEnd", "InstanceCount", "Description", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}