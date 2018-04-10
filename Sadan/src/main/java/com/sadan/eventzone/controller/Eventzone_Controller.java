package com.sadan.eventzone.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadan.eventzone.service.Eventzone_Service;



@Controller
public class Eventzone_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Eventzone_Controller.class);
	
	@Autowired
	private Eventzone_Service eventzone_service;
	
	@RequestMapping("/eventzone/main.do")
	private String eventzone() {
		
		return "board/eventzone/eventzone";
	}
	//유그이벤트	
	@RequestMapping("/eventzone/ugevent.do")
	private String ugevent() {
		
		return "board/eventzone/ugevent";
	}
	//개별업소이벤트
	@RequestMapping("/eventzone/singleevent.do")
	private String singleevent() {
		
		return "board/eventzone/singleevent";
	}
	//고렙이벤트
	@RequestMapping("/eventzone/highlevelevent.do")
	private String highlevelevent() {
		
		return "board/eventzone/highlevelevent";
	}
	//즉석복권
	@RequestMapping("/eventzone/lotto.do")
	private String lotto() {
		
		return "board/eventzone/lotto";
	}
	//레이싱게임	
	@RequestMapping("/eventzone/racinggame.do")
	private String racinggame() {
		
		return "board/eventzone/racinggame";
	}
	//초보자가이드
	@RequestMapping("/eventzone/choboguide.do")
	private String choboguide(Model model)throws Exception {
										
		return "board/eventzone/choboguide";
	}
	//이벤트업소배너
	@RequestMapping("/eventzone/eventbanner.do")
	private String eventbanner(Model model)throws Exception {
										
		return "board/eventzone/eventbanner";
	}
			
}
