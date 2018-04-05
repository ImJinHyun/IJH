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
	
	//게시판 보기
	@RequestMapping("/menuboard/fullssa.do")
	private String fullssa(Model model)throws Exception {
		
		return "menuboard/fullssa";
	}
			
}
