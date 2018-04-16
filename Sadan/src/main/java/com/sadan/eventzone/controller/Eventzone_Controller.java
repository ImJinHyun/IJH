package com.sadan.eventzone.controller;



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
import com.sadan.eventzone.model.Eventzone_DTO;
import com.sadan.eventzone.service.Eventzone_Service;



@Controller
public class Eventzone_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Eventzone_Controller.class);
	
	@Autowired
	private Eventzone_Service eventzone_service;
	
	@RequestMapping("/eventzone/main.do")
	private String eventzone(Model model,SearchCriteria criteria) {
		String type[] = {"유그이벤트","개별업소이벤트","고렙이벤트","즉석복권","레이싱게임"};
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			for (int i = 0; i < type.length; i++) {
				System.out.println(type[i]);
				map = eventzone_service.board_list(type[i], criteria);
				@SuppressWarnings({ "unchecked", "unused" })
				List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("list");
				model.addAttribute("event"+i, list);
				
			}						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "board/eventzone/eventzone";
	}
	
	/**
	 * 이벤트존 게시글 목록
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/eventzone/board.do")
	private String eventzone(Model model,@RequestParam String business_type,SearchCriteria criteria)throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		PageMaker pageMaker =new PageMaker();
		try {
			map = eventzone_service.board_list(business_type,criteria);
			System.out.println(business_type);
			pageMaker.setCri(criteria);
			pageMaker.setTotalCount(eventzone_service.getRow(business_type));
			@SuppressWarnings({ "unchecked", "unused" })
			List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("list");
			model.addAttribute("eventzone", list);
			model.addAttribute("business_type", business_type);
			model.addAttribute("pageMaker",pageMaker);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "board/eventzone/board_list";
	}
	
	/**
	 * 이벤트존 글작성 매핑
	 * @param model
	 * @param type
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/eventzone/boardinsert.do")
	private String boardinsert(Model model,@RequestParam String type)throws Exception {
		model.addAttribute("type",type);
		System.out.println(type);
		return "board/eventzone/insert";
	}
	
	/**
	 * 이벤트존 글등록 처리
	 * @param model
	 * @param first_board_DTO
	 * @return
	 * @throws Exception
	 */

	@RequestMapping(value = "/eventzone/board_insert.do", method = RequestMethod.POST)
	private String board_insert(Model model,Eventzone_DTO eventzone_DTO ) throws Exception{
		Map<String, Object> resultMap = new HashMap<String, Object>();
		String goURL = URLEncoder.encode(eventzone_DTO.getBusiness_type(),"UTF-8");
		try {
			eventzone_service.board_insert(eventzone_DTO);
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("error", e.getMessage());
			model.addAttribute("error",resultMap.get("error"));
		}
		
		// 이미지 리스트로 간다.
		return "redirect:board.do?business_type="+goURL;
	}
	/**
	 * 이벤트존 제목클릭후 게시글내용보기
	 * @param model
	 * @param eventzone_DTO
	 * @return
	 * @throws Exception
	 */
	
	@RequestMapping("/eventzone/board_read.do")
	private String board_read(Model model,Eventzone_DTO eventzone_DTO) throws Exception{
		
		try {
			System.out.println(eventzone_DTO.getNo());
			model.addAttribute("eventzone", eventzone_service.board_read(eventzone_DTO));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "board/eventzone/Read";
		
	}
	/**
	 * 이벤트 글삭제 처리
	 * @param model
	 * @param no
	 * @param rttr
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/eventzone/board_delete.do")
	private String board_delete(Eventzone_DTO eventzone_DTO)throws Exception{
		
		String goURL = URLEncoder.encode(eventzone_DTO.getBusiness_type(),"UTF-8");
		try { 
			eventzone_service.board_delete(eventzone_DTO);
			System.out.println(eventzone_DTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:board_list.do?business_type="+goURL;//		
	}
	
	/**
	 * 글수정 매핑
	 * @param eventzone_DTO
	 * @param model
	 * @return
	 */
	@RequestMapping("/eventzone/board_modify.do")
	private String board_modify(Eventzone_DTO eventzone_DTO, Model model) {
		try {
			System.out.println(eventzone_DTO.getNo());
			model.addAttribute("eventzone", eventzone_service.board_read(eventzone_DTO));
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		return "board/eventzone/modify";
	}
	
	/**
	 * 이벤트존 게시글 수정 처리
	 * @param model
	 * @param eventzone_DTO
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/eventzone/board_modify.do", method = RequestMethod.POST)
	private String board_modify(Model model,Eventzone_DTO eventzone_DTO ) throws Exception{
		Map<String, Object> resultMap = new HashMap<String, Object>();
		System.out.println(eventzone_DTO);
		System.out.println(eventzone_DTO.getBusiness_type());
		String goURL = URLEncoder.encode(eventzone_DTO.getBusiness_type(),"UTF-8");
		try {
			eventzone_service.board_modify(eventzone_DTO);
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("error", e.getMessage());
			model.addAttribute("error",resultMap.get("error"));
		}
		
		// 이미지 리스트로 간다.
		return "redirect:board.do?business_type="+goURL;
	}
		
	
	
	
	
	
	
	
	//유그이벤트	
	@RequestMapping("/eventzone/ugevent.do")
	private String ugevent() {
		
		return "board/eventzone/ugevent";
	}
	//개별업소이벤트
	@RequestMapping("/eventzone/singleevent.do")
	private String singleevent() {
		
		return "board/eventzone/singleevent";
	}
	//고렙이벤트
	@RequestMapping("/eventzone/highlevelevent.do")
	private String highlevelevent() {
		
		return "board/eventzone/highlevelevent";
	}
	//즉석복권
	@RequestMapping("/eventzone/lotto.do")
	private String lotto() {
		
		return "board/eventzone/lotto";
	}
	//레이싱게임	
	@RequestMapping("/eventzone/racinggame.do")
	private String racinggame() {
		
		return "board/eventzone/racinggame";
	}
	//초보자가이드
	@RequestMapping("/eventzone/choboguide.do")
	private String choboguide(Model model)throws Exception {
										
		return "board/eventzone/choboguide";
	}
	//이벤트업소배너
	@RequestMapping("/eventzone/eventbanner.do")
	private String eventbanner(Model model)throws Exception {
										
		return "board/eventzone/eventbanner";
	}
			
}
