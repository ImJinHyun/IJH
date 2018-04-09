package com.sadan.attendence.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadan.attendence.service.Attendence_Service;
import com.sadan.useafter.service.Useafter_Service;


@Controller
public class Attendence_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Attendence_Controller.class);
	
	@Autowired
	private Attendence_Service attendence_service;
	
	@RequestMapping("/attendence/main.do")
	private String attendence() {
		
		return "attendence/attendence";
	}
			
}
