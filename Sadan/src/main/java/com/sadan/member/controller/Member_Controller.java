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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sadan.member.service.Member_Service;
import com.sadan.member.model.LoginDTO;

@Controller
@RequestMapping("/member")
public class Member_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Member_Controller.class);
	
	@Autowired
	private Member_Service member_Service;
	
	//회원가입 페이지 매핑
	@RequestMapping("/member.do")
	private String member() {
		
		return "member/member";
	}
	
	
	//회원가입 처리
	@RequestMapping("/join.do")
	private String member_insert(LoginDTO loginDTO, RedirectAttributes attributes) throws Exception {
		loginDTO = member_Service.modify(loginDTO);
		return "Index/main.do";
	}
	
	/**
	 * 	회원정보 수정처리
	 * @param loginDTO
	 * @param attributes
	 * @return
	 * @throws Exception
	 */
	//회원정보 수정 매핑
	@RequestMapping("/memModify.do")
	private String member_modify(LoginDTO loginDTO, RedirectAttributes attributes)throws Exception {
		
		return "member/modify";
	}
	
	//회원정보 수정 페이지 매핑
	/**
	 * 회원정보 수저 처리
	 * @param loginDTO
	 * @param attributes
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/memModify.do", method=RequestMethod.POST)
	private String modify_process(LoginDTO loginDTO, RedirectAttributes attributes) throws Exception {
		logger.info("MemberController.modify_prosess() : 회원정보수정 처리문 : loginDTO " + loginDTO);
		
		loginDTO  = member_Service.modify(loginDTO);
		attributes.addFlashAttribute("msg","MODIFYSUCCESS");
		return "redirect:member/modify";
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
		logger.info(""+loginDTO);
		String goURI = "../Index/main.do";
		if(loginDTO == null ){
			// login 실패할 때의 처리
			return "redirect:../Index/main.do";
		}
		else{ // 로그인이 성공했을 때
			session.setAttribute("login", loginDTO);
			
			  if(session.getAttribute("goURI") != null) {
				  goURI=(String)session.getAttribute("goURI");
				  // 정상적인 login.do를 실행한 경우 session이 남아 있으면 session쪽으로 이동은 방지
				  session.setAttribute("goURI", null);
			  }
			  
			if(loginDTO.getGrade()==5){	//등급이 5일때 가관리자 등급
				return "redirect:"+goURI;
			}else if(loginDTO.getGrade()==3){
				return "redirect:"+goURI;
			}else{
			return "redirect:"+goURI;
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
		return "redirect:../Index/main.do";
	}
	
			
}
