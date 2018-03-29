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
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadan.boardtest.service.Boardtest_ListService;


@Controller
public class Boardtest_ListController {
	private static final Logger logger = LoggerFactory.getLogger(Boardtest_ListController.class);
	
	@Autowired
	private Boardtest_ListService first_board_Service;
	
	
	//게시판 글 리스트
	@RequestMapping("/board/test.do")
	private String board_List(Model model,HttpSession session)throws Exception {
		
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		
		try {
			map = (Map<String, Object>) first_board_Service.List(map2);
			System.out.println(map);
			
			if (!map.get("list").toString().equals("error")) {
				@SuppressWarnings({ "unused", "unchecked" })
				List<Map<String, Object>> board = (List<Map<String, Object>>) map.get("list");
				model.addAttribute("board",board);
			}
		} catch (Exception e) {
			e.printStackTrace();
			map.put("error", e.getMessage());
			model.addAttribute("error",map.get("error"));
		}
		return "board/board_test";
	}
	
	//게시판 보기
	@RequestMapping("/board/read.do")
	private String board_Read(Model model,int no)throws Exception {
		
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		
		try {
			logger.debug("@@@@@@NO==",no);
			map = first_board_Service.board_Read(no);
			
			if (!map.get("read").toString().equals("error")) {
				@SuppressWarnings({ "unused", "unchecked" })
				List<Map<String, Object>> board = (List<Map<String, Object>>) map.get("read");
				model.addAttribute("board",board);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			map.put("error", e.getMessage());
			model.addAttribute("error",map.get("error"));
		}
		return "board/test_Read";
	}
	
	
}
