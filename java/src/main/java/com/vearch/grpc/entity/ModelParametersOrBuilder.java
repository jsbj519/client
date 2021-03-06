// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_model.proto

package com.vearch.grpc.entity;

public interface ModelParametersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ModelParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string json_parameters_str = 1;</code>
   * @return The jsonParametersStr.
   */
  String getJsonParametersStr();
  /**
   * <code>string json_parameters_str = 1;</code>
   * @return The bytes for jsonParametersStr.
   */
  com.google.protobuf.ByteString
      getJsonParametersStrBytes();

  /**
   * <code>map&lt;string, string&gt; parameters = 2;</code>
   */
  int getParametersCount();
  /**
   * <code>map&lt;string, string&gt; parameters = 2;</code>
   */
  boolean containsParameters(
          String key);
  /**
   * Use {@link #getParametersMap()} instead.
   */
  @Deprecated
  java.util.Map<String, String>
  getParameters();
  /**
   * <code>map&lt;string, string&gt; parameters = 2;</code>
   */
  java.util.Map<String, String>
  getParametersMap();
  /**
   * <code>map&lt;string, string&gt; parameters = 2;</code>
   */

  String getParametersOrDefault(
          String key,
          String defaultValue);
  /**
   * <code>map&lt;string, string&gt; parameters = 2;</code>
   */

  String getParametersOrThrow(
          String key);
}
