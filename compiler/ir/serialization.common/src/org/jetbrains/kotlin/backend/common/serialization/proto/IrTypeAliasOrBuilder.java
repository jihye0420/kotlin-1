// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface IrTypeAliasOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAlias)
    org.jetbrains.kotlin.protobuf.MessageLiteOrBuilder {

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase base = 1;</code>
   */
  boolean hasBase();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase base = 1;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase getBase();

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name = 2;</code>
   */
  boolean hasName();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex name = 2;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex getName();

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Visibility visibility = 3;</code>
   */
  boolean hasVisibility();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Visibility visibility = 3;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.Visibility getVisibility();

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer type_parameters = 4;</code>
   */
  boolean hasTypeParameters();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer type_parameters = 4;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeParameterContainer getTypeParameters();

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex expanded_type = 5;</code>
   */
  boolean hasExpandedType();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex expanded_type = 5;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex getExpandedType();

  /**
   * <code>required bool is_actual = 6;</code>
   */
  boolean hasIsActual();
  /**
   * <code>required bool is_actual = 6;</code>
   */
  boolean getIsActual();
}