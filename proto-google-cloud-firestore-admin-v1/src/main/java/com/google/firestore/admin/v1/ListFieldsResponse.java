/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/admin/v1/firestore_admin.proto

package com.google.firestore.admin.v1;

/**
 *
 *
 * <pre>
 * The response for [FirestoreAdmin.ListFields][google.firestore.admin.v1.FirestoreAdmin.ListFields].
 * </pre>
 *
 * Protobuf type {@code google.firestore.admin.v1.ListFieldsResponse}
 */
public final class ListFieldsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.firestore.admin.v1.ListFieldsResponse)
    ListFieldsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListFieldsResponse.newBuilder() to construct.
  private ListFieldsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListFieldsResponse() {
    fields_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListFieldsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListFieldsResponse(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fields_ = new java.util.ArrayList<com.google.firestore.admin.v1.Field>();
                mutable_bitField0_ |= 0x00000001;
              }
              fields_.add(
                  input.readMessage(
                      com.google.firestore.admin.v1.Field.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        fields_ = java.util.Collections.unmodifiableList(fields_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.firestore.admin.v1.FirestoreAdminProto
        .internal_static_google_firestore_admin_v1_ListFieldsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firestore.admin.v1.FirestoreAdminProto
        .internal_static_google_firestore_admin_v1_ListFieldsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firestore.admin.v1.ListFieldsResponse.class,
            com.google.firestore.admin.v1.ListFieldsResponse.Builder.class);
  }

  public static final int FIELDS_FIELD_NUMBER = 1;
  private java.util.List<com.google.firestore.admin.v1.Field> fields_;
  /**
   *
   *
   * <pre>
   * The requested fields.
   * </pre>
   *
   * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.firestore.admin.v1.Field> getFieldsList() {
    return fields_;
  }
  /**
   *
   *
   * <pre>
   * The requested fields.
   * </pre>
   *
   * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.firestore.admin.v1.FieldOrBuilder>
      getFieldsOrBuilderList() {
    return fields_;
  }
  /**
   *
   *
   * <pre>
   * The requested fields.
   * </pre>
   *
   * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
   */
  @java.lang.Override
  public int getFieldsCount() {
    return fields_.size();
  }
  /**
   *
   *
   * <pre>
   * The requested fields.
   * </pre>
   *
   * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
   */
  @java.lang.Override
  public com.google.firestore.admin.v1.Field getFields(int index) {
    return fields_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The requested fields.
   * </pre>
   *
   * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
   */
  @java.lang.Override
  public com.google.firestore.admin.v1.FieldOrBuilder getFieldsOrBuilder(int index) {
    return fields_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A page token that may be used to request another page of results. If blank,
   * this is the last page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A page token that may be used to request another page of results. If blank,
   * this is the last page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < fields_.size(); i++) {
      output.writeMessage(1, fields_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < fields_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, fields_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.firestore.admin.v1.ListFieldsResponse)) {
      return super.equals(obj);
    }
    com.google.firestore.admin.v1.ListFieldsResponse other =
        (com.google.firestore.admin.v1.ListFieldsResponse) obj;

    if (!getFieldsList().equals(other.getFieldsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getFieldsCount() > 0) {
      hash = (37 * hash) + FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getFieldsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firestore.admin.v1.ListFieldsResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.admin.v1.ListFieldsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.ListFieldsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.admin.v1.ListFieldsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.ListFieldsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.admin.v1.ListFieldsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.ListFieldsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.admin.v1.ListFieldsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.ListFieldsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.firestore.admin.v1.ListFieldsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.ListFieldsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.admin.v1.ListFieldsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.firestore.admin.v1.ListFieldsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The response for [FirestoreAdmin.ListFields][google.firestore.admin.v1.FirestoreAdmin.ListFields].
   * </pre>
   *
   * Protobuf type {@code google.firestore.admin.v1.ListFieldsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.firestore.admin.v1.ListFieldsResponse)
      com.google.firestore.admin.v1.ListFieldsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.firestore.admin.v1.FirestoreAdminProto
          .internal_static_google_firestore_admin_v1_ListFieldsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firestore.admin.v1.FirestoreAdminProto
          .internal_static_google_firestore_admin_v1_ListFieldsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firestore.admin.v1.ListFieldsResponse.class,
              com.google.firestore.admin.v1.ListFieldsResponse.Builder.class);
    }

    // Construct using com.google.firestore.admin.v1.ListFieldsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getFieldsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (fieldsBuilder_ == null) {
        fields_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        fieldsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.firestore.admin.v1.FirestoreAdminProto
          .internal_static_google_firestore_admin_v1_ListFieldsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.firestore.admin.v1.ListFieldsResponse getDefaultInstanceForType() {
      return com.google.firestore.admin.v1.ListFieldsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firestore.admin.v1.ListFieldsResponse build() {
      com.google.firestore.admin.v1.ListFieldsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firestore.admin.v1.ListFieldsResponse buildPartial() {
      com.google.firestore.admin.v1.ListFieldsResponse result =
          new com.google.firestore.admin.v1.ListFieldsResponse(this);
      int from_bitField0_ = bitField0_;
      if (fieldsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          fields_ = java.util.Collections.unmodifiableList(fields_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fields_ = fields_;
      } else {
        result.fields_ = fieldsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.firestore.admin.v1.ListFieldsResponse) {
        return mergeFrom((com.google.firestore.admin.v1.ListFieldsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firestore.admin.v1.ListFieldsResponse other) {
      if (other == com.google.firestore.admin.v1.ListFieldsResponse.getDefaultInstance())
        return this;
      if (fieldsBuilder_ == null) {
        if (!other.fields_.isEmpty()) {
          if (fields_.isEmpty()) {
            fields_ = other.fields_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFieldsIsMutable();
            fields_.addAll(other.fields_);
          }
          onChanged();
        }
      } else {
        if (!other.fields_.isEmpty()) {
          if (fieldsBuilder_.isEmpty()) {
            fieldsBuilder_.dispose();
            fieldsBuilder_ = null;
            fields_ = other.fields_;
            bitField0_ = (bitField0_ & ~0x00000001);
            fieldsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getFieldsFieldBuilder()
                    : null;
          } else {
            fieldsBuilder_.addAllMessages(other.fields_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.firestore.admin.v1.ListFieldsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.firestore.admin.v1.ListFieldsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.firestore.admin.v1.Field> fields_ =
        java.util.Collections.emptyList();

    private void ensureFieldsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fields_ = new java.util.ArrayList<com.google.firestore.admin.v1.Field>(fields_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.firestore.admin.v1.Field,
            com.google.firestore.admin.v1.Field.Builder,
            com.google.firestore.admin.v1.FieldOrBuilder>
        fieldsBuilder_;

    /**
     *
     *
     * <pre>
     * The requested fields.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
     */
    public java.util.List<com.google.firestore.admin.v1.Field> getFieldsList() {
      if (fieldsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fields_);
      } else {
        return fieldsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The requested fields.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
     */
    public int getFieldsCount() {
      if (fieldsBuilder_ == null) {
        return fields_.size();
      } else {
        return fieldsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The requested fields.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
     */
    public com.google.firestore.admin.v1.Field getFields(int index) {
      if (fieldsBuilder_ == null) {
        return fields_.get(index);
      } else {
        return fieldsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The requested fields.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
     */
    public Builder setFields(int index, com.google.firestore.admin.v1.Field value) {
      if (fieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldsIsMutable();
        fields_.set(index, value);
        onChanged();
      } else {
        fieldsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested fields.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
     */
    public Builder setFields(
        int index, com.google.firestore.admin.v1.Field.Builder builderForValue) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.set(index, builderForValue.build());
        onChanged();
      } else {
        fieldsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested fields.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
     */
    public Builder addFields(com.google.firestore.admin.v1.Field value) {
      if (fieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldsIsMutable();
        fields_.add(value);
        onChanged();
      } else {
        fieldsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested fields.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
     */
    public Builder addFields(int index, com.google.firestore.admin.v1.Field value) {
      if (fieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldsIsMutable();
        fields_.add(index, value);
        onChanged();
      } else {
        fieldsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested fields.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
     */
    public Builder addFields(com.google.firestore.admin.v1.Field.Builder builderForValue) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.add(builderForValue.build());
        onChanged();
      } else {
        fieldsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested fields.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
     */
    public Builder addFields(
        int index, com.google.firestore.admin.v1.Field.Builder builderForValue) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.add(index, builderForValue.build());
        onChanged();
      } else {
        fieldsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested fields.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
     */
    public Builder addAllFields(
        java.lang.Iterable<? extends com.google.firestore.admin.v1.Field> values) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, fields_);
        onChanged();
      } else {
        fieldsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested fields.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
     */
    public Builder clearFields() {
      if (fieldsBuilder_ == null) {
        fields_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        fieldsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested fields.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
     */
    public Builder removeFields(int index) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.remove(index);
        onChanged();
      } else {
        fieldsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested fields.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
     */
    public com.google.firestore.admin.v1.Field.Builder getFieldsBuilder(int index) {
      return getFieldsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The requested fields.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
     */
    public com.google.firestore.admin.v1.FieldOrBuilder getFieldsOrBuilder(int index) {
      if (fieldsBuilder_ == null) {
        return fields_.get(index);
      } else {
        return fieldsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The requested fields.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
     */
    public java.util.List<? extends com.google.firestore.admin.v1.FieldOrBuilder>
        getFieldsOrBuilderList() {
      if (fieldsBuilder_ != null) {
        return fieldsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fields_);
      }
    }
    /**
     *
     *
     * <pre>
     * The requested fields.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
     */
    public com.google.firestore.admin.v1.Field.Builder addFieldsBuilder() {
      return getFieldsFieldBuilder()
          .addBuilder(com.google.firestore.admin.v1.Field.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The requested fields.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
     */
    public com.google.firestore.admin.v1.Field.Builder addFieldsBuilder(int index) {
      return getFieldsFieldBuilder()
          .addBuilder(index, com.google.firestore.admin.v1.Field.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The requested fields.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Field fields = 1;</code>
     */
    public java.util.List<com.google.firestore.admin.v1.Field.Builder> getFieldsBuilderList() {
      return getFieldsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.firestore.admin.v1.Field,
            com.google.firestore.admin.v1.Field.Builder,
            com.google.firestore.admin.v1.FieldOrBuilder>
        getFieldsFieldBuilder() {
      if (fieldsBuilder_ == null) {
        fieldsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.firestore.admin.v1.Field,
                com.google.firestore.admin.v1.Field.Builder,
                com.google.firestore.admin.v1.FieldOrBuilder>(
                fields_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        fields_ = null;
      }
      return fieldsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A page token that may be used to request another page of results. If blank,
     * this is the last page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A page token that may be used to request another page of results. If blank,
     * this is the last page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A page token that may be used to request another page of results. If blank,
     * this is the last page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A page token that may be used to request another page of results. If blank,
     * this is the last page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A page token that may be used to request another page of results. If blank,
     * this is the last page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.firestore.admin.v1.ListFieldsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.firestore.admin.v1.ListFieldsResponse)
  private static final com.google.firestore.admin.v1.ListFieldsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.firestore.admin.v1.ListFieldsResponse();
  }

  public static com.google.firestore.admin.v1.ListFieldsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListFieldsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListFieldsResponse>() {
        @java.lang.Override
        public ListFieldsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListFieldsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListFieldsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListFieldsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firestore.admin.v1.ListFieldsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
