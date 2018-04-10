package com.sadan.jehyu.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		
		return "board/jehyu/jehyu";
	}
	//풀싸롱
		@RequestMapping("/jehyu/fullssa.do")
		private String fullssa(Model model)throws Exception {

			return "board/jehyu/fullssa";
	}
	//노래방/나이트/바
		@RequestMapping("/jehyu/songnightbar.do")
		private String songnightbar(Model model)throws Exception {
			
			return "board/jehyu/songnightbar";
		}
	//아로마
		@RequestMapping("/jehyu/aroma.do")
		private String aroma(Model model)throws Exception {
			
			return "board/jehyu/aroma";
		}
	//출장마사지
		@RequestMapping("/jehyu/masage.do")
		private String masage(Model model)throws Exception {
			
			return "board/jehyu/masage";
		}
	//스포츠마사지
		@RequestMapping("/jehyu/sportsmasage.do")
		private String sportsmasage(Model model)throws Exception {
			
			return "board/jehyu/sportsmasage";
		}
	//키스방
		@RequestMapping("/jehyu/kissroom.do")
		private String kissroom(Model model)throws Exception {
			
			return "board/jehyu/kissroom";
		}
	//오피
		@RequestMapping("/jehyu/office.do")
		private String office(Model model)throws Exception {
			
			return "board/jehyu/office";
		}
	//휴게텔
		@RequestMapping("/jehyu/resttel.do")
		private String resttel(Model model)throws Exception {
			
			return "board/jehyu/resttel";
		}
	//기타업소
		@RequestMapping("/jehyu/etc.do")
		private String etc(Model model)throws Exception {
			
			return "board/jehyu/etc";
		}
	//룸/풀싸롱PR
		@RequestMapping("/jehyu/prfullssa.do")
		private String prfullssa(Model model)throws Exception {
							
			return "board/jehyu/prfullssa";
		}
	//노래방/나이트바PR
		@RequestMapping("/jehyu/prsongnightbar.do")
		private String prsongnightbar(Model model)throws Exception {
							
			return "board/jehyu/prsongnightbar";
		}
	//아로마PR
		@RequestMapping("/jehyu/praroma.do")
		private String prarom(Model model)throws Exception {
							
			return "board/jehyu/praroma";
		}
	//출장마사지PR
		@RequestMapping("/jehyu/prmasage.do")
		private String prmasage(Model model)throws Exception {
							
			return "board/jehyu/prmasage";
		}
	//스포츠마사지PR
		@RequestMapping("/jehyu/prsportsmasage.do")
		private String prsportsmasage(Model model)throws Exception {
						
			return "board/jehyu/prsportsmasage";
		}
	//키스방PR
		@RequestMapping("/jehyu/prkissroom.do")
		private String prkissroom(Model model)throws Exception {
							
			return "board/jehyu/prkissroom";
		}
	//오피PR
		@RequestMapping("/jehyu/proffice.do")
		private String proffice(Model model)throws Exception {
							
			return "board/jehyu/proffice";
		}
	//휴게텔PR
		@RequestMapping("/jehyu/prresttel.do")
		private String prresttel(Model model)throws Exception {
							
			return "board/jehyu/prresttel";
		}
	//기타업소PR
		@RequestMapping("/jehyu/pretc.do")
		private String pretc(Model model)throws Exception {
							
			return "board/jehyu/pretc";
		}
	//초보자가이드
		@RequestMapping("/jehyu/choboguide.do")
		private String choboguide(Model model)throws Exception {
									
			return "board/jehyu/choboguide";
		}
	//이벤트업소배너
		@RequestMapping("/jehyu/eventbanner.do")
		private String eventbanner(Model model)throws Exception {
									
			return "board/jehyu/eventbanner";
		}
			
}
