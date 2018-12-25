package com.zookeeper.web.inspector.service;

import java.util.List;

public interface ZooWebInspectorService {

	
	public boolean getConnection();

	public List<String> getZnodes(String path);
	
}
