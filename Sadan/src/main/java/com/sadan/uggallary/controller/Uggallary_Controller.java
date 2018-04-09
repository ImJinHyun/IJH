package com.sadan.uggallary.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadan.useafter.service.Useafter_Service;


@Controller
public class Uggallary_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Uggallary_Controller.class);
	
	@Autowired
	private Useafter_Service uggallary_service;
	
	@RequestMapping("/uggallary/main.do")
	private String uggallary() {
		
		return "uggallary/uggallary";
	}
			
}
