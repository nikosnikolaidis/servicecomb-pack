/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.servicecomb.pack.omega.context;

/**
 *  This class is holding the Transaction related context which could be use in customer code
 */
public class TransactionContext {
  private String globalTxId;
  private String localTxId;

  public TransactionContext(String globalTxId, String localTxId) {
    this.globalTxId = globalTxId;
    this.localTxId = localTxId;
  }

  public String globalTxId() {
    return globalTxId;
  }

  public void setGlobalTxId(String globalTxId) {
    this.globalTxId = globalTxId;
  }

  public String localTxId() {
    return localTxId;
  }

  public void setLocalTxId(String localTxId) {
    this.localTxId = localTxId;
  }
}
