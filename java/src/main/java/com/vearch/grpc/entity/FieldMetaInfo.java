// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_model.proto

package com.vearch.grpc.entity;

/**
 * Protobuf type {@code FieldMetaInfo}
 */
public final class FieldMetaInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FieldMetaInfo)
    FieldMetaInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FieldMetaInfo.newBuilder() to construct.
  private FieldMetaInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FieldMetaInfo() {
    name_ = "";
    dataType_ = 0;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new FieldMetaInfo();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FieldMetaInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
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
          case 10: {
            String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            dataType_ = rawValue;
            break;
          }
          case 24: {

            isIndex_ = input.readBool();
            break;
          }
          case 32: {

            isStore_ = input.readBool();
            break;
          }
          case 42: {
            VectorMetaInfo.Builder subBuilder = null;
            if (vectorMetaInfo_ != null) {
              subBuilder = vectorMetaInfo_.toBuilder();
            }
            vectorMetaInfo_ = input.readMessage(VectorMetaInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(vectorMetaInfo_);
              vectorMetaInfo_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return DataModel.internal_static_FieldMetaInfo_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return DataModel.internal_static_FieldMetaInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            FieldMetaInfo.class, FieldMetaInfo.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @Override
  public String getName() {
    Object ref = name_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    Object ref = name_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_TYPE_FIELD_NUMBER = 2;
  private int dataType_;
  /**
   * <code>.FieldType data_type = 2;</code>
   * @return The enum numeric value on the wire for dataType.
   */
  @Override public int getDataTypeValue() {
    return dataType_;
  }
  /**
   * <code>.FieldType data_type = 2;</code>
   * @return The dataType.
   */
  @Override public FieldType getDataType() {
    @SuppressWarnings("deprecation")
    FieldType result = FieldType.valueOf(dataType_);
    return result == null ? FieldType.UNRECOGNIZED : result;
  }

  public static final int IS_INDEX_FIELD_NUMBER = 3;
  private boolean isIndex_;
  /**
   * <code>bool is_index = 3;</code>
   * @return The isIndex.
   */
  @Override
  public boolean getIsIndex() {
    return isIndex_;
  }

  public static final int IS_STORE_FIELD_NUMBER = 4;
  private boolean isStore_;
  /**
   * <code>bool is_store = 4;</code>
   * @return The isStore.
   */
  @Override
  public boolean getIsStore() {
    return isStore_;
  }

  public static final int VECTOR_META_INFO_FIELD_NUMBER = 5;
  private VectorMetaInfo vectorMetaInfo_;
  /**
   * <pre>
   * nil if data_type is not vector
   * </pre>
   *
   * <code>.VectorMetaInfo vector_meta_info = 5;</code>
   * @return Whether the vectorMetaInfo field is set.
   */
  @Override
  public boolean hasVectorMetaInfo() {
    return vectorMetaInfo_ != null;
  }
  /**
   * <pre>
   * nil if data_type is not vector
   * </pre>
   *
   * <code>.VectorMetaInfo vector_meta_info = 5;</code>
   * @return The vectorMetaInfo.
   */
  @Override
  public VectorMetaInfo getVectorMetaInfo() {
    return vectorMetaInfo_ == null ? VectorMetaInfo.getDefaultInstance() : vectorMetaInfo_;
  }
  /**
   * <pre>
   * nil if data_type is not vector
   * </pre>
   *
   * <code>.VectorMetaInfo vector_meta_info = 5;</code>
   */
  @Override
  public VectorMetaInfoOrBuilder getVectorMetaInfoOrBuilder() {
    return getVectorMetaInfo();
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (dataType_ != FieldType.INT.getNumber()) {
      output.writeEnum(2, dataType_);
    }
    if (isIndex_ != false) {
      output.writeBool(3, isIndex_);
    }
    if (isStore_ != false) {
      output.writeBool(4, isStore_);
    }
    if (vectorMetaInfo_ != null) {
      output.writeMessage(5, getVectorMetaInfo());
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (dataType_ != FieldType.INT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, dataType_);
    }
    if (isIndex_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isIndex_);
    }
    if (isStore_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isStore_);
    }
    if (vectorMetaInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getVectorMetaInfo());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof FieldMetaInfo)) {
      return super.equals(obj);
    }
    FieldMetaInfo other = (FieldMetaInfo) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (dataType_ != other.dataType_) return false;
    if (getIsIndex()
        != other.getIsIndex()) return false;
    if (getIsStore()
        != other.getIsStore()) return false;
    if (hasVectorMetaInfo() != other.hasVectorMetaInfo()) return false;
    if (hasVectorMetaInfo()) {
      if (!getVectorMetaInfo()
          .equals(other.getVectorMetaInfo())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DATA_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + dataType_;
    hash = (37 * hash) + IS_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsIndex());
    hash = (37 * hash) + IS_STORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsStore());
    if (hasVectorMetaInfo()) {
      hash = (37 * hash) + VECTOR_META_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getVectorMetaInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static FieldMetaInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FieldMetaInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FieldMetaInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FieldMetaInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FieldMetaInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FieldMetaInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FieldMetaInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static FieldMetaInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static FieldMetaInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static FieldMetaInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static FieldMetaInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static FieldMetaInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(FieldMetaInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code FieldMetaInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FieldMetaInfo)
      FieldMetaInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DataModel.internal_static_FieldMetaInfo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DataModel.internal_static_FieldMetaInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              FieldMetaInfo.class, FieldMetaInfo.Builder.class);
    }

    // Construct using com.vearch.grpc.entity.FieldMetaInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      name_ = "";

      dataType_ = 0;

      isIndex_ = false;

      isStore_ = false;

      if (vectorMetaInfoBuilder_ == null) {
        vectorMetaInfo_ = null;
      } else {
        vectorMetaInfo_ = null;
        vectorMetaInfoBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return DataModel.internal_static_FieldMetaInfo_descriptor;
    }

    @Override
    public FieldMetaInfo getDefaultInstanceForType() {
      return FieldMetaInfo.getDefaultInstance();
    }

    @Override
    public FieldMetaInfo build() {
      FieldMetaInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public FieldMetaInfo buildPartial() {
      FieldMetaInfo result = new FieldMetaInfo(this);
      result.name_ = name_;
      result.dataType_ = dataType_;
      result.isIndex_ = isIndex_;
      result.isStore_ = isStore_;
      if (vectorMetaInfoBuilder_ == null) {
        result.vectorMetaInfo_ = vectorMetaInfo_;
      } else {
        result.vectorMetaInfo_ = vectorMetaInfoBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof FieldMetaInfo) {
        return mergeFrom((FieldMetaInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(FieldMetaInfo other) {
      if (other == FieldMetaInfo.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.dataType_ != 0) {
        setDataTypeValue(other.getDataTypeValue());
      }
      if (other.getIsIndex() != false) {
        setIsIndex(other.getIsIndex());
      }
      if (other.getIsStore() != false) {
        setIsStore(other.getIsStore());
      }
      if (other.hasVectorMetaInfo()) {
        mergeVectorMetaInfo(other.getVectorMetaInfo());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      FieldMetaInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (FieldMetaInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public String getName() {
      Object ref = name_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private int dataType_ = 0;
    /**
     * <code>.FieldType data_type = 2;</code>
     * @return The enum numeric value on the wire for dataType.
     */
    @Override public int getDataTypeValue() {
      return dataType_;
    }
    /**
     * <code>.FieldType data_type = 2;</code>
     * @param value The enum numeric value on the wire for dataType to set.
     * @return This builder for chaining.
     */
    public Builder setDataTypeValue(int value) {

      dataType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.FieldType data_type = 2;</code>
     * @return The dataType.
     */
    @Override
    public FieldType getDataType() {
      @SuppressWarnings("deprecation")
      FieldType result = FieldType.valueOf(dataType_);
      return result == null ? FieldType.UNRECOGNIZED : result;
    }
    /**
     * <code>.FieldType data_type = 2;</code>
     * @param value The dataType to set.
     * @return This builder for chaining.
     */
    public Builder setDataType(FieldType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      dataType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.FieldType data_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataType() {

      dataType_ = 0;
      onChanged();
      return this;
    }

    private boolean isIndex_ ;
    /**
     * <code>bool is_index = 3;</code>
     * @return The isIndex.
     */
    @Override
    public boolean getIsIndex() {
      return isIndex_;
    }
    /**
     * <code>bool is_index = 3;</code>
     * @param value The isIndex to set.
     * @return This builder for chaining.
     */
    public Builder setIsIndex(boolean value) {

      isIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_index = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsIndex() {

      isIndex_ = false;
      onChanged();
      return this;
    }

    private boolean isStore_ ;
    /**
     * <code>bool is_store = 4;</code>
     * @return The isStore.
     */
    @Override
    public boolean getIsStore() {
      return isStore_;
    }
    /**
     * <code>bool is_store = 4;</code>
     * @param value The isStore to set.
     * @return This builder for chaining.
     */
    public Builder setIsStore(boolean value) {

      isStore_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_store = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsStore() {

      isStore_ = false;
      onChanged();
      return this;
    }

    private VectorMetaInfo vectorMetaInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        VectorMetaInfo, VectorMetaInfo.Builder, VectorMetaInfoOrBuilder> vectorMetaInfoBuilder_;
    /**
     * <pre>
     * nil if data_type is not vector
     * </pre>
     *
     * <code>.VectorMetaInfo vector_meta_info = 5;</code>
     * @return Whether the vectorMetaInfo field is set.
     */
    public boolean hasVectorMetaInfo() {
      return vectorMetaInfoBuilder_ != null || vectorMetaInfo_ != null;
    }
    /**
     * <pre>
     * nil if data_type is not vector
     * </pre>
     *
     * <code>.VectorMetaInfo vector_meta_info = 5;</code>
     * @return The vectorMetaInfo.
     */
    public VectorMetaInfo getVectorMetaInfo() {
      if (vectorMetaInfoBuilder_ == null) {
        return vectorMetaInfo_ == null ? VectorMetaInfo.getDefaultInstance() : vectorMetaInfo_;
      } else {
        return vectorMetaInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * nil if data_type is not vector
     * </pre>
     *
     * <code>.VectorMetaInfo vector_meta_info = 5;</code>
     */
    public Builder setVectorMetaInfo(VectorMetaInfo value) {
      if (vectorMetaInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        vectorMetaInfo_ = value;
        onChanged();
      } else {
        vectorMetaInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * nil if data_type is not vector
     * </pre>
     *
     * <code>.VectorMetaInfo vector_meta_info = 5;</code>
     */
    public Builder setVectorMetaInfo(
        VectorMetaInfo.Builder builderForValue) {
      if (vectorMetaInfoBuilder_ == null) {
        vectorMetaInfo_ = builderForValue.build();
        onChanged();
      } else {
        vectorMetaInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * nil if data_type is not vector
     * </pre>
     *
     * <code>.VectorMetaInfo vector_meta_info = 5;</code>
     */
    public Builder mergeVectorMetaInfo(VectorMetaInfo value) {
      if (vectorMetaInfoBuilder_ == null) {
        if (vectorMetaInfo_ != null) {
          vectorMetaInfo_ =
            VectorMetaInfo.newBuilder(vectorMetaInfo_).mergeFrom(value).buildPartial();
        } else {
          vectorMetaInfo_ = value;
        }
        onChanged();
      } else {
        vectorMetaInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * nil if data_type is not vector
     * </pre>
     *
     * <code>.VectorMetaInfo vector_meta_info = 5;</code>
     */
    public Builder clearVectorMetaInfo() {
      if (vectorMetaInfoBuilder_ == null) {
        vectorMetaInfo_ = null;
        onChanged();
      } else {
        vectorMetaInfo_ = null;
        vectorMetaInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * nil if data_type is not vector
     * </pre>
     *
     * <code>.VectorMetaInfo vector_meta_info = 5;</code>
     */
    public VectorMetaInfo.Builder getVectorMetaInfoBuilder() {

      onChanged();
      return getVectorMetaInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * nil if data_type is not vector
     * </pre>
     *
     * <code>.VectorMetaInfo vector_meta_info = 5;</code>
     */
    public VectorMetaInfoOrBuilder getVectorMetaInfoOrBuilder() {
      if (vectorMetaInfoBuilder_ != null) {
        return vectorMetaInfoBuilder_.getMessageOrBuilder();
      } else {
        return vectorMetaInfo_ == null ?
            VectorMetaInfo.getDefaultInstance() : vectorMetaInfo_;
      }
    }
    /**
     * <pre>
     * nil if data_type is not vector
     * </pre>
     *
     * <code>.VectorMetaInfo vector_meta_info = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        VectorMetaInfo, VectorMetaInfo.Builder, VectorMetaInfoOrBuilder>
        getVectorMetaInfoFieldBuilder() {
      if (vectorMetaInfoBuilder_ == null) {
        vectorMetaInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            VectorMetaInfo, VectorMetaInfo.Builder, VectorMetaInfoOrBuilder>(
                getVectorMetaInfo(),
                getParentForChildren(),
                isClean());
        vectorMetaInfo_ = null;
      }
      return vectorMetaInfoBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:FieldMetaInfo)
  }

  // @@protoc_insertion_point(class_scope:FieldMetaInfo)
  private static final FieldMetaInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new FieldMetaInfo();
  }

  public static FieldMetaInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FieldMetaInfo>
      PARSER = new com.google.protobuf.AbstractParser<FieldMetaInfo>() {
    @Override
    public FieldMetaInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FieldMetaInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FieldMetaInfo> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<FieldMetaInfo> getParserForType() {
    return PARSER;
  }

  @Override
  public FieldMetaInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

