package com.sadan.eventzone.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadan.eventzone.service.Eventzone_Service;



@Controller
public class Eventzone_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Eventzone_Controller.class);
	
	@Autowired
	private Eventzone_Service eventzone_service;
	
	@RequestMapping("/eventzone/main.do")
	private String eventzone() {
		
		return "eventzone/eventzone";
	}
			
}
