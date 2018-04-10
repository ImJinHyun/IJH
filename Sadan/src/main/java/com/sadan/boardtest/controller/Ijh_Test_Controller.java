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
	
	
	//제휴업소
		@RequestMapping("/jehyu/jehyu.do")
		private String jehyu(Model model)throws Exception {
		
			return "jehyu/jehyu";
	}
		
	//이용후기
		@RequestMapping("/headmenu_all/useafter.do")
		private String useafter(Model model)throws Exception {
			
			return "board/userafter/useafter";
	}
	//커뮤니티
		@RequestMapping("/headmenu_all/community.do")
		private String community(Model model)throws Exception {
			
			return "board/community/community";
	}
	//엔터테인먼트
		@RequestMapping("/headmenu_all/entertainment.do")
		private String entertainment(Model model)throws Exception {
			
			return "headmenu_all/entertainment";
	}
	//유그이미지
		@RequestMapping("/headmenu_all/uggallary.do")
		private String uggallary(Model model)throws Exception {
			
			return "headmenu_all/uggallary";
	}			
	//출석부
		@RequestMapping("/headmenu_all/attendence.do")
		private String attendence(Model model)throws Exception {
			
			return "headmenu_all/attendence";
	}
	//이벤트존	
		@RequestMapping("/headmenu_all/eventzone.do")
		private String eventzone(Model model)throws Exception {
					
			return "headmenu_all/eventzone";
	}
	//서비스센터
		@RequestMapping("/headmenu_all/servicecenter.do")
		private String servicecenter(Model model)throws Exception {
					
			return "headmenu_all/servicecenter";
	}			
	//제휴문의
		@RequestMapping("/headmenu_all/contactus.do")
		private String contactus(Model model)throws Exception {
					
			return "headmenu_all/contactus";
	}	
	
	
	//채팅방링크
		@RequestMapping("/leftmenuboard/chat.do")
		private String chat(Model model)throws Exception {
					
			return "leftmenuboard/chat";
		}			
		
	
					
			
				
				
				
}
