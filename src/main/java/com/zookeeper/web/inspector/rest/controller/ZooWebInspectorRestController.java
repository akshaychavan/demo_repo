package com.zookeeper.web.inspector.rest.controller;

import java.util.List;

import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zookeeper.web.inspector.service.ZooWebInspectorService;

@RestController
public class ZooWebInspectorRestController {

	@Autowired
	ZooWebInspectorService zWebInspectorService;
	
	@RequestMapping(value = "/connect", method = RequestMethod.GET)
	public boolean getConnection() {

		return zWebInspectorService.getConnection();
		
	}
	
	@RequestMapping(value = "/nodes/{path}", method = RequestMethod.GET)
	public List<String> getZnodes(@PathVariable("path") String path) {

		return zWebInspectorService.getZnodes(path);
		
	}
	
	
	
	
}
