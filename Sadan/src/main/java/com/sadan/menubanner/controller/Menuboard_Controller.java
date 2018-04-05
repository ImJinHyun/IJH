package com.sadan.menubanner.controller;

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

import com.sadan.boardtest.service.Boardtest_ListService;
import com.sadan.menubanner.service.Menuboard_Service;


@Controller
public class Menuboard_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Menuboard_Controller.class);
	
	@Autowired
	private Menuboard_Service menuboard_Service;
	
	@RequestMapping("/menuboard/menuboard.do")
	private String chat() {
		
		return "menuboard/menuboard";
	}
	
			
}
