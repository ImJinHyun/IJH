package com.sadan.chat.controller;

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
import com.sadan.chat.service.Chat_Service;


@Controller
public class Chat_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Chat_Controller.class);
	
	@Autowired
	private Chat_Service chat_service;
	
	@RequestMapping("/chat/chat.do")
	private String chat() {
		
		return "chat/chat";
	}
			
}
