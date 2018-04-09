package com.sadan.useafter.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadan.useafter.service.Useafter_Service;


@Controller
public class Useafter_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Useafter_Controller.class);
	
	@Autowired
	private Useafter_Service chat_service;
	
	@RequestMapping("/useafter/main.do")
	private String useafter() {
		
		return "useafter/useafter";
	}
			
}
