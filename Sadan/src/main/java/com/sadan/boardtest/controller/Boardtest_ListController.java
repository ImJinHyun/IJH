package com.sadan.boardtest.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
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
import com.sadan.firsttest.model.First_board_DTO;


@Controller
public class Boardtest_ListController {
	private static final Logger logger = LoggerFactory.getLogger(Boardtest_ListController.class);
	
	@Autowired
	private Boardtest_ListService first_board_Service;
	
	
	//게시판 글 리스트
	@RequestMapping("/board/test.do")
	private String board_List(Model model,HttpSession session,		HttpServletRequest request)throws Exception {
		
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();

		try {
			map = (Map<String, Object>) first_board_Service.List(map2);
			System.out.println(map);
			System.out.println(request.getContextPath());
			
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
	
	//게시판 보기
		@RequestMapping("/board/write.do")
		private String board_write(Model model)throws Exception {
			return "board/board_write";
		}
		
		//제휴업소 보기
			@RequestMapping("/board/jehyu.do")
			private String jehyu(Model model)throws Exception {
				return "jehyu/jehyu";
			}
			
	//게시글 등록
			@RequestMapping(value = "/board/board_insert.do", method = RequestMethod.POST)
			private String board_insert(Model model, First_board_DTO first_board_DTO) throws Exception{
				Map<String, Object> map = new HashMap<String, Object>();
				Map<String, Object> resultMap = new HashMap<String, Object>();
				
				try {
					System.out.println(first_board_DTO);
					first_board_Service.board_insert(first_board_DTO);
				} catch (Exception e) {
					e.printStackTrace();
					resultMap.put("error", e.getMessage());
					model.addAttribute("error",resultMap.get("error"));
				}
				
				
				// 이미지 리스트로 간다.
				return "redirect:test.do";
			}
			
}
