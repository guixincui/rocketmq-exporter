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
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.rocketmq.exporter.model.metrics.clientrunime;

public class ConsumerRuntimePullRTMetric extends ConsumerRuntimeConsumeFailedMsgsMetric {
    public ConsumerRuntimePullRTMetric(String group, String topic, String caddrs, String localaddrs) {
        super(group, topic, caddrs, localaddrs);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = 37 * hash + this.getGroup().hashCode();
        hash = 37 * hash + this.getTopic().hashCode();
        hash = 37 * hash + this.getCaddrs().hashCode();
        return hash;
    }

    @Override
    public String toString() {
        return "group: " + this.getGroup() + " topic: " + this.getTopic() + " caddrs: " + this.getCaddrs() + " localaddrs: " + this.getLocaladdrs();
    }
}
