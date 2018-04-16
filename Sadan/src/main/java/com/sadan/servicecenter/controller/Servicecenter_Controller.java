package com.sadan.servicecenter.controller;



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
import com.sadan.community.model.Community_DTO;
import com.sadan.servicecenter.model.Servicecenter_DTO;
import com.sadan.servicecenter.service.Servicecenter_Service;



@Controller
public class Servicecenter_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Servicecenter_Controller.class);
	
	@Autowired
	private Servicecenter_Service servicecenter_service;	
	@RequestMapping("/servicecenter/main.do")
	private String servicecenter(Model model,SearchCriteria criteria) {
		String type[] = {"업소공지사항","고객문의(일반)","고객문의(업소)"};
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			for (int i = 0; i < type.length; i++) {
				System.out.println(type[i]);
				map = servicecenter_service.board_list(type[i], criteria);
				@SuppressWarnings({ "unchecked", "unused" })
				List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("list");
				model.addAttribute("service"+i, list);
				
			}						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "board/servicecenter/servicecenter";
	}
	
	/**
	 * 고객센터 게시글 목록
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/servicecenter/board.do")
	private String servicecenter(Model model,@RequestParam String business_type,SearchCriteria criteria)throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		PageMaker pageMaker =new PageMaker();
		try {
			map = servicecenter_service.board_list(business_type,criteria);
			System.out.println(business_type);
			pageMaker.setCri(criteria);
			pageMaker.setTotalCount(servicecenter_service.getRow(business_type));
			@SuppressWarnings({ "unchecked", "unused" })
			List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("list");
			model.addAttribute("servicecenter", list);
			model.addAttribute("business_type", business_type);
			model.addAttribute("pageMaker",pageMaker);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "board/servicecenter/board_list";
	}
	
	/**
	 * 고객센터 글작성 매핑
	 * @param model
	 * @param type
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/servicecenter/boardinsert.do")
	private String boardinsert(Model model,@RequestParam String type)throws Exception {
		model.addAttribute("type",type);
		System.out.println(type);
		return "board/servicecenter/insert";
	}
	
	/**
	 * 고객센터 글등록 처리
	 * @param model
	 * @param first_board_DTO
	 * @return
	 * @throws Exception
	 */

	@RequestMapping(value = "/servicecenter/board_insert.do", method = RequestMethod.POST)
	private String board_insert(Model model,Servicecenter_DTO servicecenter_DTO ) throws Exception{
		Map<String, Object> resultMap = new HashMap<String, Object>();
		String goURL = URLEncoder.encode(servicecenter_DTO.getBusiness_type(),"UTF-8");
		try {
			servicecenter_service.board_insert(servicecenter_DTO);
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("error", e.getMessage());
			model.addAttribute("error",resultMap.get("error"));
		}
		
		// 이미지 리스트로 간다.
		return "redirect:board.do?business_type="+goURL;
	}
	/**
	 * 고객센터 제목클릭후 게시글내용보기
	 * @param model
	 * @param community_DTO
	 * @return
	 * @throws Exception
	 */
	
	@RequestMapping("/servicecenter/board_read.do")
	private String board_read(Model model,Servicecenter_DTO servicecenter_DTO) throws Exception{
		
		try {
			System.out.println(servicecenter_DTO.getNo());
			model.addAttribute("servicecenter", servicecenter_service.board_read(servicecenter_DTO));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "board/servicecenter/Read";
		
	}
	/**
	 * 고객센터 글삭제 처리
	 * @param model
	 * @param no
	 * @param rttr
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/servicecenter/board_delete.do")
	private String board_delete(Servicecenter_DTO servicecenter_DTO)throws Exception{
		
		String goURL = URLEncoder.encode(servicecenter_DTO.getBusiness_type(),"UTF-8");
		try { 
			servicecenter_service.board_delete(servicecenter_DTO);
			System.out.println(servicecenter_DTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:board_list.do?business_type="+goURL;//		
	}
	
	/**
	 * 글수정 매핑
	 * @param servicecenter_DTO
	 * @param model
	 * @return
	 */
	@RequestMapping("/servicecenter/board_modify.do")
	private String board_modify(Servicecenter_DTO servicecenter_DTO, Model model) {
		try {
			System.out.println(servicecenter_DTO.getNo());
			model.addAttribute("servicecenter", servicecenter_service.board_read(servicecenter_DTO));
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		return "board/servicecenter/modify";
	}
	
	/**
	 * 고객센터 게시글 수정 처리
	 * @param model
	 * @param servicecenter_DTO
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/servicecenter/board_modify.do", method = RequestMethod.POST)
	private String board_modify(Model model,Servicecenter_DTO servicecenter_DTO ) throws Exception{
		Map<String, Object> resultMap = new HashMap<String, Object>();
		System.out.println(servicecenter_DTO);
		System.out.println(servicecenter_DTO.getBusiness_type());
		String goURL = URLEncoder.encode(servicecenter_DTO.getBusiness_type(),"UTF-8");
		try {
			servicecenter_service.board_modify(servicecenter_DTO);
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("error", e.getMessage());
			model.addAttribute("error",resultMap.get("error"));
		}
		
		// 이미지 리스트로 간다.
		return "redirect:board.do?business_type="+goURL;
	}
			
}
