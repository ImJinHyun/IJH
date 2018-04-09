package com.sadan.member.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sadan.member.service.Member_Service;
import com.sadan.member.model.LoginDTO;

@Controller("/member")
public class Member_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Member_Controller.class);
	
	@Autowired
	private Member_Service member_Service;
	
	//회원가입 페이지 매핑
	@RequestMapping("/member.do")
	private String member() {
		
		return "member/member";
	}
	
	
	/**로그인 처리
	 * 
	 * @param loginDTO
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/login.do", method=RequestMethod.POST)
	public String loginprosess(LoginDTO loginDTO, HttpSession session) throws Exception{
		
		logger.info("MemberController.loginprosess() : 로그인 처리문 : loginDTO " + loginDTO);
		
		loginDTO  = member_Service.login(loginDTO);
		if(loginDTO == null ){
			// login 실패할 때의 처리
			return "redirect:../index/index.do";
		}
		else{ // 로그인이 성공했을 때
			session.setAttribute("login", loginDTO);
			
			if(loginDTO.getGrade()==5){
				return "redirect:../member/userlist.do";
			}else if(loginDTO.getGrade()==3){
				return "redirect:../index/index.do";
			}else{
			return "redirect:../time/list.ti";
			}
		}
	}
	
	/**
	 * 로그 아웃
	 * @param session
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception {
		System.out.println("LoginController.logout() : 로그아웃 처리문 : " + session );
		session.invalidate();
		// main으로 리턴
		return "redirect:../index/index.do";
	}
	
			
}
