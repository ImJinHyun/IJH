package com.sadan.index.controller;

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
import com.sadan.index.service.IndexService;


@Controller
public class IndexController {
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	private  IndexService indexService;
	
	@RequestMapping("/Index/main.do")
	public String board_List(Model model)throws Exception {
		
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		
		try {
//			map = indexService.List(map2);
			logger.debug(map2.toString());
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		return "index/index";
	}
}
