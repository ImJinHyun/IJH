package com.sadan.community.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadan.useafter.service.Useafter_Service;


@Controller
public class Community_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Community_Controller.class);
	
	@Autowired
	private Useafter_Service community_service;
	
	@RequestMapping("/community/main.do")
	private String community() {
		
		return "community/community";
	}
			
}
