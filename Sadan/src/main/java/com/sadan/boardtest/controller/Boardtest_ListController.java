package com.sadan.boardtest.controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadan.boardtest.service.Boardtest_ListService;


@Controller
public class Boardtest_ListController {
	private static final Logger logger = LoggerFactory.getLogger(Boardtest_ListController.class);
	
	@Autowired
	private Boardtest_ListService first_board_Service;
	
	@RequestMapping("/board/test.do")
	public String board_List(Model model)throws Exception {
		
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		
		try {
			map2.put("A", "1");
			map2.put("B", "2");
			map2.put("C", "3");
			map = first_board_Service.List(map2);
			logger.debug(map2.toString());
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		return "board/board_test";
	}
}
