package com.sadan.servicecenter.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadan.eventzone.service.Eventzone_Service;
import com.sadan.servicecenter.service.Servicecenter_Service;



@Controller
public class Servicecenter_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Servicecenter_Controller.class);
	
	@Autowired
	private Servicecenter_Service servicecenter_service;
	
	@RequestMapping("/servicecenter/main.do")
	private String eventzone() {
		
		return "servicecenter/servicecenter";
	}
			
}
