// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TableListMessage.proto

package org.apache.hadoop.hbase.stargate.protobuf.generated;

public final class TableListMessage {
  private TableListMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class TableList extends
      com.google.protobuf.GeneratedMessage {
    // Use TableList.newBuilder() to construct.
    private TableList() {
      initFields();
    }
    private TableList(boolean noInit) {}
    
    private static final TableList defaultInstance;
    public static TableList getDefaultInstance() {
      return defaultInstance;
    }
    
    public TableList getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.internal_static_org_apache_hadoop_hbase_stargate_protobuf_generated_TableList_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.internal_static_org_apache_hadoop_hbase_stargate_protobuf_generated_TableList_fieldAccessorTable;
    }
    
    // repeated string name = 1;
    public static final int NAME_FIELD_NUMBER = 1;
    private java.util.List<java.lang.String> name_ =
      java.util.Collections.emptyList();
    public java.util.List<java.lang.String> getNameList() {
      return name_;
    }
    public int getNameCount() { return name_.size(); }
    public java.lang.String getName(int index) {
      return name_.get(index);
    }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (java.lang.String element : getNameList()) {
        output.writeString(1, element);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      {
        int dataSize = 0;
        for (java.lang.String element : getNameList()) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeStringSizeNoTag(element);
        }
        size += dataSize;
        size += 1 * getNameList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList result;
      
      // Construct using org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList();
        return builder;
      }
      
      protected org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList.getDescriptor();
      }
      
      public org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList getDefaultInstanceForType() {
        return org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.name_ != java.util.Collections.EMPTY_LIST) {
          result.name_ =
            java.util.Collections.unmodifiableList(result.name_);
        }
        org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList) {
          return mergeFrom((org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList other) {
        if (other == org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList.getDefaultInstance()) return this;
        if (!other.name_.isEmpty()) {
          if (result.name_.isEmpty()) {
            result.name_ = new java.util.ArrayList<java.lang.String>();
          }
          result.name_.addAll(other.name_);
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              addName(input.readString());
              break;
            }
          }
        }
      }
      
      
      // repeated string name = 1;
      public java.util.List<java.lang.String> getNameList() {
        return java.util.Collections.unmodifiableList(result.name_);
      }
      public int getNameCount() {
        return result.getNameCount();
      }
      public java.lang.String getName(int index) {
        return result.getName(index);
      }
      public Builder setName(int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.name_.set(index, value);
        return this;
      }
      public Builder addName(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  if (result.name_.isEmpty()) {
          result.name_ = new java.util.ArrayList<java.lang.String>();
        }
        result.name_.add(value);
        return this;
      }
      public Builder addAllName(
          java.lang.Iterable<? extends java.lang.String> values) {
        if (result.name_.isEmpty()) {
          result.name_ = new java.util.ArrayList<java.lang.String>();
        }
        super.addAll(values, result.name_);
        return this;
      }
      public Builder clearName() {
        result.name_ = java.util.Collections.emptyList();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:org.apache.hadoop.hbase.stargate.protobuf.generated.TableList)
    }
    
    static {
      defaultInstance = new TableList(true);
      org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:org.apache.hadoop.hbase.stargate.protobuf.generated.TableList)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_hadoop_hbase_stargate_protobuf_generated_TableList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_apache_hadoop_hbase_stargate_protobuf_generated_TableList_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026TableListMessage.proto\0223org.apache.had" +
      "oop.hbase.stargate.protobuf.generated\"\031\n" +
      "\tTableList\022\014\n\004name\030\001 \003(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_org_apache_hadoop_hbase_stargate_protobuf_generated_TableList_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_org_apache_hadoop_hbase_stargate_protobuf_generated_TableList_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_org_apache_hadoop_hbase_stargate_protobuf_generated_TableList_descriptor,
              new java.lang.String[] { "Name", },
              org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList.class,
              org.apache.hadoop.hbase.stargate.protobuf.generated.TableListMessage.TableList.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}