package com.sadan.question.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadan.eventzone.service.Eventzone_Service;
import com.sadan.question.service.Question_Service;



@Controller
public class Question_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Question_Controller.class);
	
	@Autowired
	private Question_Service question_service;
	
	@RequestMapping("/question/main.do")
	private String question() {
		
		return "question/question";
	}
			
}
