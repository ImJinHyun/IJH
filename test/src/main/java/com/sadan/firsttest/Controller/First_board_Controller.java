package com.sadan.firsttest.Controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.sadan.firsttest.service.First_board_Service;


@Controller
public class First_board_Controller {
	private static final Logger logger = LoggerFactory.getLogger(First_board_Controller.class);

	@Inject
	First_board_Service first_board_Service;
	
	public String board_List(Model model) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			first_board_Service.List();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "board/board_test";
	}
}
