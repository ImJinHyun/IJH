package com.sadan.attendence.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		
		return "board/attendence/attendence";
	}
	//풀싸롱
			@RequestMapping("/attendence/fullssa.do")
			private String fullssa(Model model)throws Exception {

				return "board/attendence/fullssa";
		}
		//노래방/나이트/바
			@RequestMapping("/attendence/songnightbar.do")
			private String songnightbar(Model model)throws Exception {
				
				return "board/attendence/songnightbar";
			}
		//아로마
			@RequestMapping("/attendence/aroma.do")
			private String aroma(Model model)throws Exception {
				
				return "board/attendence/aroma";
			}
		//출장마사지
			@RequestMapping("/attendence/masage.do")
			private String masage(Model model)throws Exception {
				
				return "board/attendence/masage";
			}
		//스포츠마사지
			@RequestMapping("/attendence/sportsmasage.do")
			private String sportsmasage(Model model)throws Exception {
				
				return "board/attendence/sportsmasage";
			}
		//키스방
			@RequestMapping("/attendence/kissroom.do")
			private String kissroom(Model model)throws Exception {
				
				return "board/attendence/kissroom";
			}
		//오피
			@RequestMapping("/attendence/office.do")
			private String office(Model model)throws Exception {
				
				return "board/attendence/office";
			}
		//휴게텔
			@RequestMapping("/attendence/resttel.do")
			private String resttel(Model model)throws Exception {
				
				return "board/attendence/resttel";
			}
		//기타업소
			@RequestMapping("/attendence/etc.do")
			private String etc(Model model)throws Exception {
				
				return "board/attendence/etc";
			}
		//룸/풀싸롱PR
			@RequestMapping("/attendence/prfullssa.do")
			private String prfullssa(Model model)throws Exception {
								
				return "board/attendence/prfullssa";
			}
		//노래방/나이트바PR
			@RequestMapping("/attendence/prsongnightbar.do")
			private String prsongnightbar(Model model)throws Exception {
								
				return "board/attendence/prsongnightbar";
			}
		//아로마PR
			@RequestMapping("/attendence/praroma.do")
			private String prarom(Model model)throws Exception {
								
				return "board/attendence/praroma";
			}
		//출장마사지PR
			@RequestMapping("/attendence/prmasage.do")
			private String prmasage(Model model)throws Exception {
								
				return "board/attendence/prmasage";
			}
		//스포츠마사지PR
			@RequestMapping("/attendence/prsportsmasage.do")
			private String prsportsmasage(Model model)throws Exception {
							
				return "board/attendence/prsportsmasage";
			}
		//키스방PR
			@RequestMapping("/attendence/prkissroom.do")
			private String prkissroom(Model model)throws Exception {
								
				return "board/attendence/prkissroom";
			}
		//오피PR
			@RequestMapping("/attendence/proffice.do")
			private String proffice(Model model)throws Exception {
								
				return "board/attendence/proffice";
			}
		//휴게텔PR
			@RequestMapping("/attendence/prresttel.do")
			private String prresttel(Model model)throws Exception {
								
				return "board/attendence/prresttel";
			}
		//기타업소PR
			@RequestMapping("/attendence/pretc.do")
			private String pretc(Model model)throws Exception {
								
				return "board/attendence/pretc";
			}
		//초보자가이드
			@RequestMapping("/attendence/choboguide.do")
			private String choboguide(Model model)throws Exception {
										
				return "board/attendence/choboguide";
			}
		//이벤트업소배너
			@RequestMapping("/attendence/eventbanner.do")
			private String eventbanner(Model model)throws Exception {
										
				return "board/attendence/eventbanner";
			}
			
}
