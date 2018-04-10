package com.sadan.entertainment.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadan.entertainment.service.Entertainment_Service;




@Controller
public class Entertainment_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Entertainment_Controller.class);
	
	@Autowired
	private Entertainment_Service entertainment_service;
	
	@RequestMapping("/entertainment/main.do")
	private String entertainment() {
		
		return "board/entertainment/entertainment";
	}
	//토렌토
	@RequestMapping("/entertainment/torento.do")
	private String torento(Model model)throws Exception {

		return "board/entertainment/torento";
	}
	//움짤/동영상
	@RequestMapping("/entertainment/video.do")
	private String video(Model model)throws Exception {

		return "board/entertainment/video";
	}
	//웹툰게시판
	@RequestMapping("/entertainment/webtoonboard.do")
	private String webtoonboard(Model model)throws Exception {

		return "board/entertainment/webtoonboard";
	}
	//유머게시판
	@RequestMapping("/entertainment/funnyboard.do")
	private String funnyboard(Model model)throws Exception {

		return "board/entertainment/funnyboard";
	}
	//매거진
	@RequestMapping("/entertainment/magazine.do")
	private String magazine(Model model)throws Exception {

		return "board/entertainment/magazine";
	}
	//맛집
	@RequestMapping("/entertainment/restaurant.do")
	private String restaurant(Model model)throws Exception {

		return "board/entertainment/restaurant";
	}
	//초보자가이드
		@RequestMapping("/entertainment/choboguide.do")
		private String choboguide(Model model)throws Exception {

			return "board/entertainment/choboguide";
		}
	//이벤트업소배너
		@RequestMapping("/entertainment/eventbanner.do")
		private String eventbanner(Model model)throws Exception {

			return "board/entertainment/eventbanner";
		}	
			
}
