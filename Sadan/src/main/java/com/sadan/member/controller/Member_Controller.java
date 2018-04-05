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
import com.sadan.member.service.Member_Service;


@Controller
public class Member_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Member_Controller.class);
	
	@Autowired
	private Member_Service member;
	
	@RequestMapping("/member/member.do")
	private String member() {
		
		return "member/member";
	}
	
			
}
