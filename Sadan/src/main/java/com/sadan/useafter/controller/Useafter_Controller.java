package com.sadan.useafter.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadan.useafter.service.Useafter_Service;


@Controller
public class Useafter_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Useafter_Controller.class);
	
	@Autowired
	private Useafter_Service useafter_service;
	
	@RequestMapping("/useafter/main.do")
	private String useafter() {
		
		return "board/useafter/useafter";
	}
	
			//풀싸롱
				@RequestMapping("/useafter/fullssa.do")
				private String fullssa(Model model)throws Exception {
			
					return "board/useafter/fullssa";
				}
			//노래방/나이트/바
				@RequestMapping("/useafter/songnightbar.do")
				private String songnightbar(Model model)throws Exception {
					
					return "board/useafter/songnightbar";
				}
			//아로마
				@RequestMapping("/useafter/aroma.do")
				private String aroma(Model model)throws Exception {
					
					return "board/useafter/aroma";
				}
			//출장마사지
				@RequestMapping("/useafter/masage.do")
				private String masage(Model model)throws Exception {
					
					return "board/useafter/masage";
				}
			//스포츠마사지
				@RequestMapping("/useafter/sportsmasage.do")
				private String sportsmasage(Model model)throws Exception {
					
					return "board/useafter/sportsmasage";
				}
			//키스방
				@RequestMapping("/useafter/kissroom.do")
				private String kissroom(Model model)throws Exception {
					
					return "board/useafter/kissroom";
				}
			//오피
				@RequestMapping("/useafter/office.do")
				private String office(Model model)throws Exception {
					
					return "board/useafter/office";
				}
			//휴게텔
				@RequestMapping("/useafter/resttel.do")
				private String resttel(Model model)throws Exception {
					
					return "board/useafter/resttel";
				}
			//기타업소
				@RequestMapping("/useafter/etc.do")
				private String etc(Model model)throws Exception {
					
					return "board/useafter/etc";
				}
			//초보자가이드
				@RequestMapping("/useafter/choboguide.do")
				private String choboguide(Model model)throws Exception {
					
					return "board/useafter/choboguide";
				}
			//이벤트업소배너
				@RequestMapping("/useafter/eventbanner.do")
				private String eventbanner(Model model)throws Exception {
					
					return "board/useafter/eventbanner";
				}	
			
}
