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
// source: google/firestore/v1/write.proto

package com.google.firestore.v1;

public final class WriteProto {
  private WriteProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_Write_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_Write_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_DocumentTransform_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_DocumentTransform_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_DocumentTransform_FieldTransform_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_DocumentTransform_FieldTransform_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_WriteResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_WriteResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_DocumentChange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_DocumentChange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_DocumentDelete_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_DocumentDelete_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_DocumentRemove_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_DocumentRemove_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_ExistenceFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_ExistenceFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\037google/firestore/v1/write.proto\022\023googl"
          + "e.firestore.v1\032 google/firestore/v1/comm"
          + "on.proto\032\"google/firestore/v1/document.p"
          + "roto\032\037google/protobuf/timestamp.proto\032\034g"
          + "oogle/api/annotations.proto\"\333\002\n\005Write\022/\n"
          + "\006update\030\001 \001(\0132\035.google.firestore.v1.Docu"
          + "mentH\000\022\020\n\006delete\030\002 \001(\tH\000\022;\n\ttransform\030\006 "
          + "\001(\0132&.google.firestore.v1.DocumentTransf"
          + "ormH\000\0226\n\013update_mask\030\003 \001(\0132!.google.fire"
          + "store.v1.DocumentMask\022P\n\021update_transfor"
          + "ms\030\007 \003(\01325.google.firestore.v1.DocumentT"
          + "ransform.FieldTransform\022;\n\020current_docum"
          + "ent\030\004 \001(\0132!.google.firestore.v1.Precondi"
          + "tionB\013\n\toperation\"\345\004\n\021DocumentTransform\022"
          + "\020\n\010document\030\001 \001(\t\022O\n\020field_transforms\030\002 "
          + "\003(\01325.google.firestore.v1.DocumentTransf"
          + "orm.FieldTransform\032\354\003\n\016FieldTransform\022\022\n"
          + "\nfield_path\030\001 \001(\t\022`\n\023set_to_server_value"
          + "\030\002 \001(\0162A.google.firestore.v1.DocumentTra"
          + "nsform.FieldTransform.ServerValueH\000\022/\n\ti"
          + "ncrement\030\003 \001(\0132\032.google.firestore.v1.Val"
          + "ueH\000\022-\n\007maximum\030\004 \001(\0132\032.google.firestore"
          + ".v1.ValueH\000\022-\n\007minimum\030\005 \001(\0132\032.google.fi"
          + "restore.v1.ValueH\000\022B\n\027append_missing_ele"
          + "ments\030\006 \001(\0132\037.google.firestore.v1.ArrayV"
          + "alueH\000\022@\n\025remove_all_from_array\030\007 \001(\0132\037."
          + "google.firestore.v1.ArrayValueH\000\"=\n\013Serv"
          + "erValue\022\034\n\030SERVER_VALUE_UNSPECIFIED\020\000\022\020\n"
          + "\014REQUEST_TIME\020\001B\020\n\016transform_type\"u\n\013Wri"
          + "teResult\022/\n\013update_time\030\001 \001(\0132\032.google.p"
          + "rotobuf.Timestamp\0225\n\021transform_results\030\002"
          + " \003(\0132\032.google.firestore.v1.Value\"q\n\016Docu"
          + "mentChange\022/\n\010document\030\001 \001(\0132\035.google.fi"
          + "restore.v1.Document\022\022\n\ntarget_ids\030\005 \003(\005\022"
          + "\032\n\022removed_target_ids\030\006 \003(\005\"m\n\016DocumentD"
          + "elete\022\020\n\010document\030\001 \001(\t\022\032\n\022removed_targe"
          + "t_ids\030\006 \003(\005\022-\n\tread_time\030\004 \001(\0132\032.google."
          + "protobuf.Timestamp\"m\n\016DocumentRemove\022\020\n\010"
          + "document\030\001 \001(\t\022\032\n\022removed_target_ids\030\002 \003"
          + "(\005\022-\n\tread_time\030\004 \001(\0132\032.google.protobuf."
          + "Timestamp\"3\n\017ExistenceFilter\022\021\n\ttarget_i"
          + "d\030\001 \001(\005\022\r\n\005count\030\002 \001(\005B\303\001\n\027com.google.fi"
          + "restore.v1B\nWriteProtoP\001Z<google.golang."
          + "org/genproto/googleapis/firestore/v1;fir"
          + "estore\242\002\004GCFS\252\002\031Google.Cloud.Firestore.V"
          + "1\312\002\031Google\\Cloud\\Firestore\\V1\352\002\034Google::"
          + "Cloud::Firestore::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.firestore.v1.CommonProto.getDescriptor(),
              com.google.firestore.v1.DocumentProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_firestore_v1_Write_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_firestore_v1_Write_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_Write_descriptor,
            new java.lang.String[] {
              "Update",
              "Delete",
              "Transform",
              "UpdateMask",
              "UpdateTransforms",
              "CurrentDocument",
              "Operation",
            });
    internal_static_google_firestore_v1_DocumentTransform_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_firestore_v1_DocumentTransform_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_DocumentTransform_descriptor,
            new java.lang.String[] {
              "Document", "FieldTransforms",
            });
    internal_static_google_firestore_v1_DocumentTransform_FieldTransform_descriptor =
        internal_static_google_firestore_v1_DocumentTransform_descriptor.getNestedTypes().get(0);
    internal_static_google_firestore_v1_DocumentTransform_FieldTransform_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_DocumentTransform_FieldTransform_descriptor,
            new java.lang.String[] {
              "FieldPath",
              "SetToServerValue",
              "Increment",
              "Maximum",
              "Minimum",
              "AppendMissingElements",
              "RemoveAllFromArray",
              "TransformType",
            });
    internal_static_google_firestore_v1_WriteResult_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_firestore_v1_WriteResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_WriteResult_descriptor,
            new java.lang.String[] {
              "UpdateTime", "TransformResults",
            });
    internal_static_google_firestore_v1_DocumentChange_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_firestore_v1_DocumentChange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_DocumentChange_descriptor,
            new java.lang.String[] {
              "Document", "TargetIds", "RemovedTargetIds",
            });
    internal_static_google_firestore_v1_DocumentDelete_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_firestore_v1_DocumentDelete_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_DocumentDelete_descriptor,
            new java.lang.String[] {
              "Document", "RemovedTargetIds", "ReadTime",
            });
    internal_static_google_firestore_v1_DocumentRemove_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_firestore_v1_DocumentRemove_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_DocumentRemove_descriptor,
            new java.lang.String[] {
              "Document", "RemovedTargetIds", "ReadTime",
            });
    internal_static_google_firestore_v1_ExistenceFilter_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_firestore_v1_ExistenceFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_ExistenceFilter_descriptor,
            new java.lang.String[] {
              "TargetId", "Count",
            });
    com.google.firestore.v1.CommonProto.getDescriptor();
    com.google.firestore.v1.DocumentProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
