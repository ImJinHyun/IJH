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
		@RequestMapping("/jehyu/index.do")
		private String jehyu(Model model)throws Exception {
		
			return "headmenu_all/jehyu";
	}
		
	//이용후기
		@RequestMapping("/headmenu_all/useafter.do")
		private String useafter(Model model)throws Exception {
			
			return "headmenu_all/useafter";
	}
	//커뮤니티
		@RequestMapping("/headmenu_all/community.do")
		private String community(Model model)throws Exception {
			
			return "headmenu_all/community";
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
		@RequestMapping("/headmenu_all/calendar.do")
		private String calendar(Model model)throws Exception {
			
			return "headmenu_all/calendar";
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
	
	//풀싸롱
		@RequestMapping("/leftmenuboard/fullssa.do")
		private String fullssa(Model model)throws Exception {
		
		return "leftmenuboard/fullssa";
	}
	//노래방/나이트/바
		@RequestMapping("/leftmenuboard/songnightbar.do")
		private String songnightbar(Model model)throws Exception {
			
			return "leftmenuboard/songnightbar";
		}
	//아로마
		@RequestMapping("/leftmenuboard/aroma.do")
		private String aroma(Model model)throws Exception {
			
			return "leftmenuboard/aroma";
		}
	//출장마사지
		@RequestMapping("/leftmenuboard/masage.do")
		private String masage(Model model)throws Exception {
			
			return "leftmenuboard/masage";
		}
	//스포츠마사지
		@RequestMapping("/leftmenuboard/sportsmasage.do")
		private String sportsmasage(Model model)throws Exception {
			
			return "leftmenuboard/sportsmasage";
		}
	//키스방
		@RequestMapping("/leftmenuboard/kissroom.do")
		private String kissroom(Model model)throws Exception {
			
			return "leftmenuboard/kissroom";
		}
	//오피
		@RequestMapping("/leftmenuboard/office.do")
		private String office(Model model)throws Exception {
			
			return "leftmenuboard/office";
		}
	//휴게텔
		@RequestMapping("/leftmenuboard/resttel.do")
		private String resttel(Model model)throws Exception {
			
			return "leftmenuboard/resttel";
		}
	//기타업소
		@RequestMapping("/leftmenuboard/etc.do")
		private String etc(Model model)throws Exception {
			
			return "leftmenuboard/etc";
		}
	//채팅방링크
		@RequestMapping("/leftmenuboard/chat.do")
		private String chat(Model model)throws Exception {
					
			return "leftmenuboard/chat";
		}			
	//룸/풀싸롱PR
		@RequestMapping("/leftmenuboard/prfullssa.do")
		private String prfullssa(Model model)throws Exception {
					
			return "leftmenuboard/prfullssa";
		}
	//노래방/나이트바PR
		@RequestMapping("/leftmenuboard/prsongnightbar.do")
		private String prsongnightbar(Model model)throws Exception {
					
			return "leftmenuboard/prsongnightbar";
		}
	//아로마PR
		@RequestMapping("/leftmenuboard/praroma.do")
		private String prarom(Model model)throws Exception {
					
			return "leftmenuboard/praroma";
		}
	//출장마사지PR
		@RequestMapping("/leftmenuboard/prmasage.do")
		private String prmasage(Model model)throws Exception {
					
			return "leftmenuboard/prmasage";
		}
	//스포츠마사지PR
		@RequestMapping("/leftmenuboard/prsportsmasage.do")
		private String prsportsmasage(Model model)throws Exception {
				
			return "leftmenuboard/prsportsmasage";
		}
	//키스방PR
		@RequestMapping("/leftmenuboard/prkissroom.do")
		private String prkissroom(Model model)throws Exception {
					
			return "leftmenuboard/prkissroom";
		}
	//오피PR
		@RequestMapping("/leftmenuboard/proffice.do")
		private String proffice(Model model)throws Exception {
					
			return "leftmenuboard/proffice";
		}
	//휴게텔PR
		@RequestMapping("/leftmenuboard/prresttel.do")
		private String prresttel(Model model)throws Exception {
					
			return "leftmenuboard/prresttel";
		}
	//기타업소PR
		@RequestMapping("/leftmenuboard/pretc.do")
		private String pretc(Model model)throws Exception {
					
			return "leftmenuboard/pretc";
		}	
	
					
			
				
				
				
}
