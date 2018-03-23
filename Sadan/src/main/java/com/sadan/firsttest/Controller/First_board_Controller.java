package com.sadan.firsttest.Controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadan.firsttest.service.First_board_Service;


@Controller
public class First_board_Controller {
	private static final Logger logger = LoggerFactory.getLogger(First_board_Controller.class);
	
	@Inject
	private First_board_Service first_board_Service;
	
	@RequestMapping("/board/test.do")
	public String board_List(Model model) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		
		try {
			map2.put("A", "1");
			map2.put("B", "2");
			map2.put("C", "3");
			map = first_board_Service.List(map2);
			logger.debug(map.toString());
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		return "board/board_test";
	}
}
