package com.sadan.jehyu.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadan.jehyu.service.Jehyu_Service;
import com.sadan.useafter.service.Useafter_Service;


@Controller
public class Jehyu_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Jehyu_Controller.class);
	
	@Autowired
	private Jehyu_Service jehyu_service;
	
	@RequestMapping("/jehyu/main.do")
	private String jehyu() {
		
		return "jehyu/jehyu";
	}
			
}