// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: router_grpc.proto

package com.vearch.grpc.entity;

public interface SearchStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SearchStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 total = 1;</code>
   * @return The total.
   */
  int getTotal();

  /**
   * <code>int32 failed = 2;</code>
   * @return The failed.
   */
  int getFailed();

  /**
   * <code>int32 successful = 3;</code>
   * @return The successful.
   */
  int getSuccessful();

  /**
   * <code>string msg = 4;</code>
   * @return The msg.
   */
  String getMsg();
  /**
   * <code>string msg = 4;</code>
   * @return The bytes for msg.
   */
  com.google.protobuf.ByteString
      getMsgBytes();
}