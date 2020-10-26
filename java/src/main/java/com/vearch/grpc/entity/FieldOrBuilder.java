// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_model.proto

package com.vearch.grpc.entity;

public interface FieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Field)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.FieldType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.FieldType type = 2;</code>
   * @return The type.
   */
  FieldType getType();

  /**
   * <code>bytes value = 3;</code>
   * @return The value.
   */
  com.google.protobuf.ByteString getValue();

  /**
   * <code>.FieldOption option = 4;</code>
   * @return The enum numeric value on the wire for option.
   */
  int getOptionValue();
  /**
   * <code>.FieldOption option = 4;</code>
   * @return The option.
   */
  FieldOption getOption();

  /**
   * <code>string source = 5;</code>
   * @return The source.
   */
  String getSource();
  /**
   * <code>string source = 5;</code>
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString
      getSourceBytes();
}