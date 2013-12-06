/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.accumulo.proxy.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all") public class BatchScanOptions implements org.apache.thrift.TBase<BatchScanOptions, BatchScanOptions._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BatchScanOptions");

  private static final org.apache.thrift.protocol.TField AUTHORIZATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("authorizations", org.apache.thrift.protocol.TType.SET, (short)1);
  private static final org.apache.thrift.protocol.TField RANGES_FIELD_DESC = new org.apache.thrift.protocol.TField("ranges", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField ITERATORS_FIELD_DESC = new org.apache.thrift.protocol.TField("iterators", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField THREADS_FIELD_DESC = new org.apache.thrift.protocol.TField("threads", org.apache.thrift.protocol.TType.I32, (short)5);

  public Set<ByteBuffer> authorizations;
  public List<Range> ranges;
  public List<ScanColumn> columns;
  public List<IteratorSetting> iterators;
  public int threads;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  @SuppressWarnings("all") public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AUTHORIZATIONS((short)1, "authorizations"),
    RANGES((short)2, "ranges"),
    COLUMNS((short)3, "columns"),
    ITERATORS((short)4, "iterators"),
    THREADS((short)5, "threads");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // AUTHORIZATIONS
          return AUTHORIZATIONS;
        case 2: // RANGES
          return RANGES;
        case 3: // COLUMNS
          return COLUMNS;
        case 4: // ITERATORS
          return ITERATORS;
        case 5: // THREADS
          return THREADS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __THREADS_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.AUTHORIZATIONS, new org.apache.thrift.meta_data.FieldMetaData("authorizations", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , true))));
    tmpMap.put(_Fields.RANGES, new org.apache.thrift.meta_data.FieldMetaData("ranges", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Range.class))));
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ScanColumn.class))));
    tmpMap.put(_Fields.ITERATORS, new org.apache.thrift.meta_data.FieldMetaData("iterators", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, IteratorSetting.class))));
    tmpMap.put(_Fields.THREADS, new org.apache.thrift.meta_data.FieldMetaData("threads", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BatchScanOptions.class, metaDataMap);
  }

  public BatchScanOptions() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BatchScanOptions(BatchScanOptions other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetAuthorizations()) {
      Set<ByteBuffer> __this__authorizations = new HashSet<ByteBuffer>();
      for (ByteBuffer other_element : other.authorizations) {
        ByteBuffer temp_binary_element = org.apache.thrift.TBaseHelper.copyBinary(other_element);
;
        __this__authorizations.add(temp_binary_element);
      }
      this.authorizations = __this__authorizations;
    }
    if (other.isSetRanges()) {
      List<Range> __this__ranges = new ArrayList<Range>();
      for (Range other_element : other.ranges) {
        __this__ranges.add(new Range(other_element));
      }
      this.ranges = __this__ranges;
    }
    if (other.isSetColumns()) {
      List<ScanColumn> __this__columns = new ArrayList<ScanColumn>();
      for (ScanColumn other_element : other.columns) {
        __this__columns.add(new ScanColumn(other_element));
      }
      this.columns = __this__columns;
    }
    if (other.isSetIterators()) {
      List<IteratorSetting> __this__iterators = new ArrayList<IteratorSetting>();
      for (IteratorSetting other_element : other.iterators) {
        __this__iterators.add(new IteratorSetting(other_element));
      }
      this.iterators = __this__iterators;
    }
    this.threads = other.threads;
  }

  public BatchScanOptions deepCopy() {
    return new BatchScanOptions(this);
  }

  @Override
  public void clear() {
    this.authorizations = null;
    this.ranges = null;
    this.columns = null;
    this.iterators = null;
    setThreadsIsSet(false);
    this.threads = 0;
  }

  public int getAuthorizationsSize() {
    return (this.authorizations == null) ? 0 : this.authorizations.size();
  }

  public java.util.Iterator<ByteBuffer> getAuthorizationsIterator() {
    return (this.authorizations == null) ? null : this.authorizations.iterator();
  }

  public void addToAuthorizations(ByteBuffer elem) {
    if (this.authorizations == null) {
      this.authorizations = new HashSet<ByteBuffer>();
    }
    this.authorizations.add(elem);
  }

  public Set<ByteBuffer> getAuthorizations() {
    return this.authorizations;
  }

  public BatchScanOptions setAuthorizations(Set<ByteBuffer> authorizations) {
    this.authorizations = authorizations;
    return this;
  }

  public void unsetAuthorizations() {
    this.authorizations = null;
  }

  /** Returns true if field authorizations is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthorizations() {
    return this.authorizations != null;
  }

  public void setAuthorizationsIsSet(boolean value) {
    if (!value) {
      this.authorizations = null;
    }
  }

  public int getRangesSize() {
    return (this.ranges == null) ? 0 : this.ranges.size();
  }

  public java.util.Iterator<Range> getRangesIterator() {
    return (this.ranges == null) ? null : this.ranges.iterator();
  }

  public void addToRanges(Range elem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<Range>();
    }
    this.ranges.add(elem);
  }

  public List<Range> getRanges() {
    return this.ranges;
  }

  public BatchScanOptions setRanges(List<Range> ranges) {
    this.ranges = ranges;
    return this;
  }

  public void unsetRanges() {
    this.ranges = null;
  }

  /** Returns true if field ranges is set (has been assigned a value) and false otherwise */
  public boolean isSetRanges() {
    return this.ranges != null;
  }

  public void setRangesIsSet(boolean value) {
    if (!value) {
      this.ranges = null;
    }
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  public java.util.Iterator<ScanColumn> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(ScanColumn elem) {
    if (this.columns == null) {
      this.columns = new ArrayList<ScanColumn>();
    }
    this.columns.add(elem);
  }

  public List<ScanColumn> getColumns() {
    return this.columns;
  }

  public BatchScanOptions setColumns(List<ScanColumn> columns) {
    this.columns = columns;
    return this;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been assigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  public int getIteratorsSize() {
    return (this.iterators == null) ? 0 : this.iterators.size();
  }

  public java.util.Iterator<IteratorSetting> getIteratorsIterator() {
    return (this.iterators == null) ? null : this.iterators.iterator();
  }

  public void addToIterators(IteratorSetting elem) {
    if (this.iterators == null) {
      this.iterators = new ArrayList<IteratorSetting>();
    }
    this.iterators.add(elem);
  }

  public List<IteratorSetting> getIterators() {
    return this.iterators;
  }

  public BatchScanOptions setIterators(List<IteratorSetting> iterators) {
    this.iterators = iterators;
    return this;
  }

  public void unsetIterators() {
    this.iterators = null;
  }

  /** Returns true if field iterators is set (has been assigned a value) and false otherwise */
  public boolean isSetIterators() {
    return this.iterators != null;
  }

  public void setIteratorsIsSet(boolean value) {
    if (!value) {
      this.iterators = null;
    }
  }

  public int getThreads() {
    return this.threads;
  }

  public BatchScanOptions setThreads(int threads) {
    this.threads = threads;
    setThreadsIsSet(true);
    return this;
  }

  public void unsetThreads() {
    __isset_bit_vector.clear(__THREADS_ISSET_ID);
  }

  /** Returns true if field threads is set (has been assigned a value) and false otherwise */
  public boolean isSetThreads() {
    return __isset_bit_vector.get(__THREADS_ISSET_ID);
  }

  public void setThreadsIsSet(boolean value) {
    __isset_bit_vector.set(__THREADS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case AUTHORIZATIONS:
      if (value == null) {
        unsetAuthorizations();
      } else {
        setAuthorizations((Set<ByteBuffer>)value);
      }
      break;

    case RANGES:
      if (value == null) {
        unsetRanges();
      } else {
        setRanges((List<Range>)value);
      }
      break;

    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((List<ScanColumn>)value);
      }
      break;

    case ITERATORS:
      if (value == null) {
        unsetIterators();
      } else {
        setIterators((List<IteratorSetting>)value);
      }
      break;

    case THREADS:
      if (value == null) {
        unsetThreads();
      } else {
        setThreads((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case AUTHORIZATIONS:
      return getAuthorizations();

    case RANGES:
      return getRanges();

    case COLUMNS:
      return getColumns();

    case ITERATORS:
      return getIterators();

    case THREADS:
      return new Integer(getThreads());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case AUTHORIZATIONS:
      return isSetAuthorizations();
    case RANGES:
      return isSetRanges();
    case COLUMNS:
      return isSetColumns();
    case ITERATORS:
      return isSetIterators();
    case THREADS:
      return isSetThreads();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BatchScanOptions)
      return this.equals((BatchScanOptions)that);
    return false;
  }

  public boolean equals(BatchScanOptions that) {
    if (that == null)
      return false;

    boolean this_present_authorizations = true && this.isSetAuthorizations();
    boolean that_present_authorizations = true && that.isSetAuthorizations();
    if (this_present_authorizations || that_present_authorizations) {
      if (!(this_present_authorizations && that_present_authorizations))
        return false;
      if (!this.authorizations.equals(that.authorizations))
        return false;
    }

    boolean this_present_ranges = true && this.isSetRanges();
    boolean that_present_ranges = true && that.isSetRanges();
    if (this_present_ranges || that_present_ranges) {
      if (!(this_present_ranges && that_present_ranges))
        return false;
      if (!this.ranges.equals(that.ranges))
        return false;
    }

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_iterators = true && this.isSetIterators();
    boolean that_present_iterators = true && that.isSetIterators();
    if (this_present_iterators || that_present_iterators) {
      if (!(this_present_iterators && that_present_iterators))
        return false;
      if (!this.iterators.equals(that.iterators))
        return false;
    }

    boolean this_present_threads = true && this.isSetThreads();
    boolean that_present_threads = true && that.isSetThreads();
    if (this_present_threads || that_present_threads) {
      if (!(this_present_threads && that_present_threads))
        return false;
      if (this.threads != that.threads)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(BatchScanOptions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    BatchScanOptions typedOther = (BatchScanOptions)other;

    lastComparison = Boolean.valueOf(isSetAuthorizations()).compareTo(typedOther.isSetAuthorizations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthorizations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authorizations, typedOther.authorizations);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRanges()).compareTo(typedOther.isSetRanges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRanges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ranges, typedOther.ranges);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumns()).compareTo(typedOther.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columns, typedOther.columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIterators()).compareTo(typedOther.isSetIterators());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIterators()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iterators, typedOther.iterators);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetThreads()).compareTo(typedOther.isSetThreads());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThreads()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.threads, typedOther.threads);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // AUTHORIZATIONS
          if (field.type == org.apache.thrift.protocol.TType.SET) {
            {
              org.apache.thrift.protocol.TSet _set21 = iprot.readSetBegin();
              this.authorizations = new HashSet<ByteBuffer>(2*_set21.size);
              for (int _i22 = 0; _i22 < _set21.size; ++_i22)
              {
                ByteBuffer _elem23;
                _elem23 = iprot.readBinary();
                this.authorizations.add(_elem23);
              }
              iprot.readSetEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // RANGES
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
              this.ranges = new ArrayList<Range>(_list24.size);
              for (int _i25 = 0; _i25 < _list24.size; ++_i25)
              {
                Range _elem26;
                _elem26 = new Range();
                _elem26.read(iprot);
                this.ranges.add(_elem26);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // COLUMNS
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list27 = iprot.readListBegin();
              this.columns = new ArrayList<ScanColumn>(_list27.size);
              for (int _i28 = 0; _i28 < _list27.size; ++_i28)
              {
                ScanColumn _elem29;
                _elem29 = new ScanColumn();
                _elem29.read(iprot);
                this.columns.add(_elem29);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // ITERATORS
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list30 = iprot.readListBegin();
              this.iterators = new ArrayList<IteratorSetting>(_list30.size);
              for (int _i31 = 0; _i31 < _list30.size; ++_i31)
              {
                IteratorSetting _elem32;
                _elem32 = new IteratorSetting();
                _elem32.read(iprot);
                this.iterators.add(_elem32);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // THREADS
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.threads = iprot.readI32();
            setThreadsIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.authorizations != null) {
      if (isSetAuthorizations()) {
        oprot.writeFieldBegin(AUTHORIZATIONS_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, this.authorizations.size()));
          for (ByteBuffer _iter33 : this.authorizations)
          {
            oprot.writeBinary(_iter33);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.ranges != null) {
      if (isSetRanges()) {
        oprot.writeFieldBegin(RANGES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, this.ranges.size()));
          for (Range _iter34 : this.ranges)
          {
            _iter34.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.columns != null) {
      if (isSetColumns()) {
        oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, this.columns.size()));
          for (ScanColumn _iter35 : this.columns)
          {
            _iter35.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.iterators != null) {
      if (isSetIterators()) {
        oprot.writeFieldBegin(ITERATORS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, this.iterators.size()));
          for (IteratorSetting _iter36 : this.iterators)
          {
            _iter36.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (isSetThreads()) {
      oprot.writeFieldBegin(THREADS_FIELD_DESC);
      oprot.writeI32(this.threads);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BatchScanOptions(");
    boolean first = true;

    if (isSetAuthorizations()) {
      sb.append("authorizations:");
      if (this.authorizations == null) {
        sb.append("null");
      } else {
        sb.append(this.authorizations);
      }
      first = false;
    }
    if (isSetRanges()) {
      if (!first) sb.append(", ");
      sb.append("ranges:");
      if (this.ranges == null) {
        sb.append("null");
      } else {
        sb.append(this.ranges);
      }
      first = false;
    }
    if (isSetColumns()) {
      if (!first) sb.append(", ");
      sb.append("columns:");
      if (this.columns == null) {
        sb.append("null");
      } else {
        sb.append(this.columns);
      }
      first = false;
    }
    if (isSetIterators()) {
      if (!first) sb.append(", ");
      sb.append("iterators:");
      if (this.iterators == null) {
        sb.append("null");
      } else {
        sb.append(this.iterators);
      }
      first = false;
    }
    if (isSetThreads()) {
      if (!first) sb.append(", ");
      sb.append("threads:");
      sb.append(this.threads);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}
