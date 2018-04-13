package com.sadan.community.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadan.community.service.Community_Service;
import com.sadan.useafter.service.Useafter_Service;


@Controller
public class Community_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Community_Controller.class);
	
	@Autowired
	private Community_Service community_service;
	
	@RequestMapping("/community/main.do")	
	private String community() {
		
		return "board/community/community";
	}
	
		//공지사항	
			@RequestMapping("/community/gongji.do")
			private String gongji() {
				
				return "board/community/gongji";
			}
		//가입인사(등업)	
			@RequestMapping("/community/greeting.do")
			private String greeting() {
				
				return "board/community/greeting";
			}
		//질문및답변	
			@RequestMapping("/community/qanswer.do")
			private String qanswer() {
				
				return "board/community/qanswer";
			}
		//정모와번개	
			@RequestMapping("/community/jeongmo.do")
			private String jeongmo() {
				
				return "board/community/jeongmo";
			}
		//자유게시판	
			@RequestMapping("/community/freeboard.do")
			private String freeboard() {
				
				return "board/community/freeboard";
			}
		//여우게시판	
			@RequestMapping("/community/foxboard.do")
			private String foxboard() {
				
				return "board/community/foxboard";
			}
		//구인	
			@RequestMapping("/community/joboffer.do")
			private String joboffer() {
					
				return "board/community/joboffer";
			}
		//구인	
			@RequestMapping("/community/choboguide.do")
			private String choboguide() {
					
				return "board/community/choboguide";
			}
		//구인	
			@RequestMapping("/community/eventbanner.do")
			private String eventbanner() {
					
				return "board/community/eventbanner";
			}	
			
}
