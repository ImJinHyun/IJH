package com.sadan.entertainment.controller;



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

import com.sadan.common.model.Criteria;
import com.sadan.common.model.PageMaker;
import com.sadan.common.model.SearchCriteria;
import com.sadan.entertainment.model.Entertainment_DTO;
import com.sadan.entertainment.service.Entertainment_Service;





@Controller
public class Entertainment_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Entertainment_Controller.class);
	
	@Autowired
	private Entertainment_Service entertainment_service;
	
	@RequestMapping("/entertainment/main.do")
	private String entertainment(Model model,SearchCriteria criteria) {
		String type[] = {"토렌트","움짤/동영상","웹툰게시판","유머게시판","매거진","맛집"};
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			for (int i = 0; i < type.length; i++) {
				System.out.println(type[i]);
				map = entertainment_service.torento_Full_list(type[i], criteria);
				@SuppressWarnings({ "unchecked", "unused" })
				List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("list");
				model.addAttribute("enter"+i, list);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "board/entertainment/entertainment";
	}
	
	/**
	 * 토렌토 게시글 목록
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/entertainment/board.do")
	private String torento(Model model,@RequestParam String business_type,SearchCriteria criteria)throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		PageMaker pageMaker =new PageMaker();
		try {
			map = entertainment_service.torento_Full_list(business_type,criteria);
			System.out.println(business_type);
			pageMaker.setCri(criteria);
			pageMaker.setTotalCount(entertainment_service.getRow(business_type));
			@SuppressWarnings({ "unchecked", "unused" })
			List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("list");
			model.addAttribute("entertainment", list);
			model.addAttribute("business_type", business_type);
			model.addAttribute("pageMaker",pageMaker);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "board/entertainment/torento";
	}
	
	/**
	 * 토렌트 글작성 매핑
	 * @param model
	 * @param type
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/entertainment/torentoinsert.do")
	private String torentoinsert(Model model,@RequestParam String type)throws Exception {
		model.addAttribute("type",type);
		System.out.println(type);
		return "board/entertainment/insert";
	}
	
	/**
	 * 토렌트 글등록 처리
	 * @param model
	 * @param first_board_DTO
	 * @return
	 * @throws Exception
	 */

	@RequestMapping(value = "/entertainment/board_insert.do", method = RequestMethod.POST)
	private String board_insert(Model model,Entertainment_DTO entertainment_DTO ) throws Exception{
		Map<String, Object> resultMap = new HashMap<String, Object>();
		String goURL = URLEncoder.encode(entertainment_DTO.getBusiness_type(),"UTF-8");
		try {
			entertainment_service.board_insert(entertainment_DTO);
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("error", e.getMessage());
			model.addAttribute("error",resultMap.get("error"));
		}
		
		// 이미지 리스트로 간다.
		return "redirect:board.do?business_type="+goURL;
	}
	/**
	 * 토렌트 제목클릭후 게시글내용보기
	 * @param model
	 * @param entertainmentr_DTO
	 * @return
	 * @throws Exception
	 */
	
	@RequestMapping("/entertainment/board_read.do")
	private String board_read(Model model,Entertainment_DTO entertainment_DTO) throws Exception{
		
		try {
			System.out.println(entertainment_DTO.getNo());
			model.addAttribute("entertainment", entertainment_service.board_read(entertainment_DTO));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "board/entertainment/Read";
		
	}
	/**
	 * 토렌트 글삭제 처리
	 * @param model
	 * @param no
	 * @param rttr
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/entertainment/board_delete.do")
	private String board_delete(Entertainment_DTO entertainment_DTO)throws Exception{
		
		String goURL = URLEncoder.encode(entertainment_DTO.getBusiness_type(),"UTF-8");
		try { 
			entertainment_service.board_delete(entertainment_DTO);
			System.out.println(entertainment_DTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:torento.do?business_type="+goURL;		
	}
	
	/**
	 * 글수정 매핑
	 * @param entertainment_DTO
	 * @param model
	 * @return
	 */
	@RequestMapping("/entertainment/board_modify.do")
	private String board_modify(Entertainment_DTO entertainment_DTO, Model model) {
		try {
			System.out.println(entertainment_DTO.getNo());
			model.addAttribute("entertainment", entertainment_service.board_read(entertainment_DTO));
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		return "board/entertainment/modify";
	}
	
	/**
	 * 토렌트 게시글 수정 처리
	 * @param model
	 * @param entertainment_DTO
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/entertainment/board_modify.do", method = RequestMethod.POST)
	private String board_modify(Model model,Entertainment_DTO entertainment_DTO ) throws Exception{
		Map<String, Object> resultMap = new HashMap<String, Object>();
		System.out.println(entertainment_DTO);
		System.out.println(entertainment_DTO.getBusiness_type());
		String goURL = URLEncoder.encode(entertainment_DTO.getBusiness_type(),"UTF-8");
		try {
			entertainment_service.board_modify(entertainment_DTO);
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("error", e.getMessage());
			model.addAttribute("error",resultMap.get("error"));
		}
		
		// 이미지 리스트로 간다.
		return "redirect:board.do?business_type="+goURL;
	}
	
	
	
	
	
	
	
	
	//웹툰게시판
	@RequestMapping("/entertainment/webtoonboard.do")
	private String webtoonboard(Model model)throws Exception {

		return "board/entertainment/webtoonboard";
	}
	//유머게시판
	@RequestMapping("/entertainment/funnyboard.do")
	private String funnyboard(Model model)throws Exception {

		return "board/entertainment/funnyboard";
	}
	//매거진
	@RequestMapping("/entertainment/magazine.do")
	private String magazine(Model model)throws Exception {

		return "board/entertainment/magazine";
	}
	//맛집
	@RequestMapping("/entertainment/restaurant.do")
	private String restaurant(Model model)throws Exception {

		return "board/entertainment/restaurant";
	}
	//초보자가이드
		@RequestMapping("/entertainment/choboguide.do")
		private String choboguide(Model model)throws Exception {

			return "board/entertainment/choboguide";
		}
	//이벤트업소배너
		@RequestMapping("/entertainment/eventbanner.do")
		private String eventbanner(Model model)throws Exception {

			return "board/entertainment/eventbanner";
		}	
			
}
