/**
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
package com.zookeeper.web.inspector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.zookeeper.web.inspector")
public class ZooWebInspector {


	
//    public static void main(String[] args) throws IOException {
//
//    	ZooInspectorManager ziManager = new ZooInspectorManagerImpl();
//    	
//    	Properties connectionProps = new Properties();
//    	 connectionProps.setProperty("hosts", "localhost:2181");
//         connectionProps.setProperty("timeout", "30000");
//         connectionProps.setProperty("encryptionManager", "com.zookeeper.web.inspector.encryption.BasicDataEncryptionManager");
//         
//    	ziManager.connect(connectionProps);
//    	
//    	ziManager.getChildren("/").forEach(x -> {
//    		System.err.println(x);
//    	});
//    	
//    	System.err.println(ziManager.getData("/schedule-tasks"));
//    }

	
	
	 public static void main(String[] args) {
	        SpringApplication.run(ZooWebInspector.class, args);
	    }
	
}
