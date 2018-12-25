package com.zookeeper.web.inspector.serviceimpl;

import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zookeeper.web.inspector.manager.ZooInspectorManager;
import com.zookeeper.web.inspector.service.ZooWebInspectorService;

@Service
public class ZooWebInspectorServiceImpl implements ZooWebInspectorService {

	@Autowired
	ZooInspectorManager ziManager;
	
	public boolean getConnection() {
		
		Properties connectionProps = new Properties();
   	 connectionProps.setProperty("hosts", "localhost:2181");
        connectionProps.setProperty("timeout", "30000");
        connectionProps.setProperty("encryptionManager", "com.zookeeper.web.inspector.encryption.BasicDataEncryptionManager");
        
   	ziManager.connect(connectionProps);
   	
   	ziManager.getChildren("/").forEach(x -> {
   		System.err.println(x);
   	});
   	
   	System.err.println(ziManager.getData("/schedule-tasks"));
		return true;
	}

	@Override
	public List<String> getZnodes(String path) {

		
		
		return ziManager.getChildren("/");
	}
	
	
}
