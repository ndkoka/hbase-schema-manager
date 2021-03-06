/**
 * Copyright 2009 The Apache Software Foundation
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.larsgeorge.hadoop.hbase;

import org.apache.hadoop.hbase.HColumnDescriptor;

/**
 * Describes a column and its features.
 *
 * @author Lars George
 */
public class ColumnDefinition {

  private String name;
  private String description;
  private int maxVersions = HColumnDescriptor.DEFAULT_VERSIONS;
  private String compression = HColumnDescriptor.DEFAULT_COMPRESSION;
  private boolean inMemory = HColumnDescriptor.DEFAULT_IN_MEMORY;
  private boolean blockCacheEnabled = HColumnDescriptor.DEFAULT_BLOCKCACHE;
  private int blockSize = HColumnDescriptor.DEFAULT_BLOCKSIZE;
  private int timeToLive = HColumnDescriptor.DEFAULT_TTL;
  private String bloomFilter = HColumnDescriptor.DEFAULT_BLOOMFILTER;
  private final int replicationScope = HColumnDescriptor.DEFAULT_REPLICATION_SCOPE;

  public String getColumnName() {
    return name;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(final String description) {
    this.description = description;
  }

  public int getMaxVersions() {
    return maxVersions;
  }

  public void setMaxVersions(final int maxVersions) {
    this.maxVersions = maxVersions;
  }

  public String getCompression() {
    return compression;
  }

  public void setCompression(final String compression) {
    this.compression = compression;
  }

  public boolean isInMemory() {
    return inMemory;
  }

  public void setInMemory(final boolean inMemory) {
    this.inMemory = inMemory;
  }

  public boolean isBlockCacheEnabled() {
    return blockCacheEnabled;
  }

  public void setBlockCacheEnabled(final boolean blockCacheEnabled) {
    this.blockCacheEnabled = blockCacheEnabled;
  }

  public void setBlockSize(final int blockSize) {
    this.blockSize = blockSize;
  }

  public int getBlockSize() {
    return blockSize;
  }

  public int getTimeToLive() {
    return timeToLive;
  }

  public void setTimeToLive(final int timeToLive) {
    this.timeToLive = timeToLive;
  }

  public String getBloomFilter() {
    return bloomFilter;
  }

  public void setBloomFilter(final String bloomFilter) {
    this.bloomFilter = bloomFilter;
  }

  public int getReplicationScope() {
    return replicationScope;
  }

  @Override
  public String toString() {
    return "name -> " + name
      + "\n  description -> " + description
      + "\n  maxVersions -> " + maxVersions
      + "\n  compression -> " + compression
      + "\n  inMemory -> " + inMemory
      + "\n  blockCacheEnabled -> " + blockCacheEnabled
      + "\n  blockSize -> " + blockSize
      + "\n  timeToLive -> " + timeToLive
      + "\n  bloomFilter -> " + bloomFilter
      + "\n  replicationScope -> " + replicationScope;
  }

}
