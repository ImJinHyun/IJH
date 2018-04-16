package com.sadan.question.controller;



import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sadan.common.model.PageMaker;
import com.sadan.common.model.SearchCriteria;
import com.sadan.question.model.Question_DTO;
import com.sadan.question.service.Question_Service;

@Controller
public class Question_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Question_Controller.class);
	
	@Autowired
	private Question_Service question_service;
	@RequestMapping("/question/main.do")
	private String question(Model model,SearchCriteria criteria) {
		String type[] = {"제휴문의"};
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			for (int i = 0; i < type.length; i++) {
				System.out.println(type[i]);
				map = question_service.board_list(type[i], criteria);
				@SuppressWarnings({ "unchecked", "unused" })
				List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("list");
				model.addAttribute("ques"+i, list);
				
			}						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "board/question/question";
	}
	
	/**
	 * 제휴문의 게시글 목록
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/question/board.do")
	private String question(Model model,@RequestParam String business_type,SearchCriteria criteria)throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		PageMaker pageMaker =new PageMaker();
		try {
			map = question_service.board_list(business_type,criteria);
			System.out.println(business_type);
			pageMaker.setCri(criteria);
			pageMaker.setTotalCount(question_service.getRow(business_type));
			@SuppressWarnings({ "unchecked", "unused" })
			List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("list");
			model.addAttribute("question", list);
			model.addAttribute("business_type", business_type);
			model.addAttribute("pageMaker",pageMaker);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "board/question/board_list";
	}
	
	/**
	 * 제휴문의 글작성 매핑
	 * @param model
	 * @param type
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/question/boardinsert.do")
	private String boardinsert(Model model,@RequestParam String type)throws Exception {
		model.addAttribute("type",type);
		System.out.println(type);
		return "board/question/insert";
	}
	
	/**
	 * 제휴문의 글등록 처리
	 * @param model
	 * @param first_board_DTO
	 * @return
	 * @throws Exception
	 */

	@RequestMapping(value = "/question/board_insert.do", method = RequestMethod.POST)
	private String board_insert(Model model,Question_DTO question_DTO ) throws Exception{
		Map<String, Object> resultMap = new HashMap<String, Object>();
		String goURL = URLEncoder.encode(question_DTO.getBusiness_type(),"UTF-8");
		try {
			question_service.board_insert(question_DTO);
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("error", e.getMessage());
			model.addAttribute("error",resultMap.get("error"));
		}
		
		// 이미지 리스트로 간다.
		return "redirect:board.do?business_type="+goURL;
	}
	/**
	 * 제휴문의 제목클릭후 게시글내용보기
	 * @param model
	 * @param question_DTO
	 * @return
	 * @throws Exception
	 */
	
	@RequestMapping("/question/board_read.do")
	private String board_read(Model model,Question_DTO question_DTO) throws Exception{
		
		try {
			System.out.println(question_DTO.getNo());
			model.addAttribute("question", question_service.board_read(question_DTO));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "board/question/Read";
		
	}
	/**
	 * 제휴문의 글삭제 처리
	 * @param model
	 * @param no
	 * @param rttr
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/question/board_delete.do")
	private String board_delete(Question_DTO question_DTO)throws Exception{
		
		String goURL = URLEncoder.encode(question_DTO.getBusiness_type(),"UTF-8");
		try { 
			question_service.board_delete(question_DTO);
			System.out.println(question_DTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:board_list.do?business_type="+goURL;//		
	}
	
	/**
	 * 글수정 매핑
	 * @param question_DTO
	 * @param model
	 * @return
	 */
	@RequestMapping("/question/board_modify.do")
	private String board_modify(Question_DTO question_DTO, Model model) {
		try {
			System.out.println(question_DTO.getNo());
			model.addAttribute("question", question_service.board_read(question_DTO));
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		return "board/question/modify";
	}
	
	/**
	 * 제휴문의 게시글 수정 처리
	 * @param model
	 * @param question_DTO
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/question/board_modify.do", method = RequestMethod.POST)
	private String board_modify(Model model,Question_DTO question_DTO ) throws Exception{
		Map<String, Object> resultMap = new HashMap<String, Object>();
		System.out.println(question_DTO);
		System.out.println(question_DTO.getBusiness_type());
		String goURL = URLEncoder.encode(question_DTO.getBusiness_type(),"UTF-8");
		try {
			question_service.board_modify(question_DTO);
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("error", e.getMessage());
			model.addAttribute("error",resultMap.get("error"));
		}
		
		// 이미지 리스트로 간다.
		return "redirect:board.do?business_type="+goURL;
	}
			
}
