package com.sadan.boardtest.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sadan.boardtest.service.Boardtest_ListService;


@Controller
public class Ijh_Test_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Ijh_Test_Controller.class);
	
	@Autowired
	private Boardtest_ListService first_board_Service;
	
	//풀싸롱
	@RequestMapping("/menuboard/fullssa.do")
	private String fullssa(Model model)throws Exception {
		
		return "menuboard/fullssa";
	}
	//노래방/나이트/바
		@RequestMapping("/menuboard/songnightbar.do")
		private String songnightbar(Model model)throws Exception {
			
			return "menuboard/songnightbar";
		}
	//아로마
		@RequestMapping("/menuboard/aroma.do")
		private String aroma(Model model)throws Exception {
			
			return "menuboard/aroma";
		}
	//출장마사지
		@RequestMapping("/menuboard/masage.do")
		private String masage(Model model)throws Exception {
			
			return "menuboard/masage";
		}
	//스포츠마사지
		@RequestMapping("/menuboard/sportsmasage.do")
		private String sportsmasage(Model model)throws Exception {
			
			return "menuboard/sportsmasage";
		}
	//키스방
		@RequestMapping("/menuboard/kissroom.do")
		private String kissroom(Model model)throws Exception {
			
			return "menuboard/kissroom";
		}
	//오피
		@RequestMapping("/menuboard/office.do")
		private String office(Model model)throws Exception {
			
			return "menuboard/office";
		}
	//휴게텔
		@RequestMapping("/menuboard/resttel.do")
		private String resttel(Model model)throws Exception {
			
			return "menuboard/resttel";
		}
	//기타업소
		@RequestMapping("/menuboard/etc.do")
		private String etc(Model model)throws Exception {
			
			return "menuboard/etc";
		}
	//이용후기
				@RequestMapping("/useafter/useafter.do")
		private String useafter(Model model)throws Exception {
					
			return "useafter/useafter";
		}
	//커뮤니티
				@RequestMapping("/community/community.do")
		private String community(Model model)throws Exception {
					
			return "community/community";
		}
	//엔터테인먼트
				@RequestMapping("/entertainment/entertainment.do")
		private String entertainment(Model model)throws Exception {
					
			return "entertainment/entertainment";
		}
	//유그이미지
				@RequestMapping("/uggallary/uggallary.do")
		private String uggallary(Model model)throws Exception {
					
			return "uggallary/uggallary";
		}			
	//유그이미지
				@RequestMapping("/calendar/calendar.do")
		private String calendar(Model model)throws Exception {
					
			return "calendar/calendar";
		}
	//이벤트존	
				@RequestMapping("/eventzone/eventzone.do")
				private String eventzone(Model model)throws Exception {
							
			return "eventzone/eventzone";
		}
	//서비스센터
				@RequestMapping("/servicecenter/servicecenter.do")
				private String servicecenter(Model model)throws Exception {
							
			return "servicecenter/servicecenter";
		}			
	//제휴문의
				@RequestMapping("/contactus/contactus.do")
				private String contactus(Model model)throws Exception {
							
			return "contactus/contactus";
		}
					
			
				
				
				
}
