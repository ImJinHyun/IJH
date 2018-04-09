package com.sadan.entertainment.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadan.entertainment.service.Entertainment_Service;




@Controller
public class Entertainment_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Entertainment_Controller.class);
	
	@Autowired
	private Entertainment_Service entertainment_service;
	
	@RequestMapping("/entertainment/main.do")
	private String entertainment() {
		
		return "entertainment/entertainment";
	}
			
}
