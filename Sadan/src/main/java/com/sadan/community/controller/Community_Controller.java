package com.sadan.community.controller;



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
import com.sadan.community.service.Community_Service;


@Controller
public class Community_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Community_Controller.class);
	
	@Autowired
	private Community_Service community_service;	
	@RequestMapping("/community/main.do")
	private String community(Model model,SearchCriteria criteria) {
		String type[] = {"공지사항","가입인사(등업)","질문및답변","정모와번개","자유게시판","여우게시판","구인"};
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			for (int i = 0; i < type.length; i++) {
				System.out.println(type[i]);
				map = community_service.board_list(type[i], criteria);
				@SuppressWarnings({ "unchecked", "unused" })
				List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("list");
				model.addAttribute("commu"+i, list);
				
			}						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "board/community/community";
	}
	
	/**
	 * 커뮤니티 게시글 목록
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/community/board.do")
	private String community(Model model,@RequestParam String business_type,SearchCriteria criteria)throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		PageMaker pageMaker =new PageMaker();
		try {
			map = community_service.board_list(business_type,criteria);
			System.out.println(business_type);
			pageMaker.setCri(criteria);
			pageMaker.setTotalCount(community_service.getRow(business_type));
			@SuppressWarnings({ "unchecked", "unused" })
			List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("list");
			model.addAttribute("community", list);
			model.addAttribute("business_type", business_type);
			model.addAttribute("pageMaker",pageMaker);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "board/community/board_list";
	}
	
	/**
	 * 커뮤니티 글작성 매핑
	 * @param model
	 * @param type
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/community/boardinsert.do")
	private String boardinsert(Model model,@RequestParam String type)throws Exception {
		model.addAttribute("type",type);
		System.out.println(type);
		return "board/community/insert";
	}
	
	/**
	 * 커뮤니티 글등록 처리
	 * @param model
	 * @param first_board_DTO
	 * @return
	 * @throws Exception
	 */

	@RequestMapping(value = "/community/board_insert.do", method = RequestMethod.POST)
	private String board_insert(Model model,Community_DTO community_DTO ) throws Exception{
		Map<String, Object> resultMap = new HashMap<String, Object>();
		String goURL = URLEncoder.encode(community_DTO.getBusiness_type(),"UTF-8");
		try {
			community_service.board_insert(community_DTO);
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("error", e.getMessage());
			model.addAttribute("error",resultMap.get("error"));
		}
		
		// 이미지 리스트로 간다.
		return "redirect:board.do?business_type="+goURL;
	}
	/**
	 * 커뮤니티 제목클릭후 게시글내용보기
	 * @param model
	 * @param community_DTO
	 * @return
	 * @throws Exception
	 */
	
	@RequestMapping("/community/board_read.do")
	private String board_read(Model model,Community_DTO community_DTO) throws Exception{
		
		try {
			System.out.println(community_DTO.getNo());
			model.addAttribute("community", community_service.board_read(community_DTO));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "board/community/Read";
		
	}
	/**
	 * 커뮤니티 글삭제 처리
	 * @param model
	 * @param no
	 * @param rttr
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/community/board_delete.do")
	private String board_delete(Community_DTO community_DTO)throws Exception{
		
		String goURL = URLEncoder.encode(community_DTO.getBusiness_type(),"UTF-8");
		try { 
			community_service.board_delete(community_DTO);
			System.out.println(community_DTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:board_list.do?business_type="+goURL;//		
	}
	
	/**
	 * 글수정 매핑
	 * @param community_DTO
	 * @param model
	 * @return
	 */
	@RequestMapping("/community/board_modify.do")
	private String board_modify(Community_DTO community_DTO, Model model) {
		try {
			System.out.println(community_DTO.getNo());
			model.addAttribute("community", community_service.board_read(community_DTO));
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		return "board/community/modify";
	}
	
	/**
	 * 커뮤니티 게시글 수정 처리
	 * @param model
	 * @param community_DTO
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/community/board_modify.do", method = RequestMethod.POST)
	private String board_modify(Model model,Community_DTO community_DTO ) throws Exception{
		Map<String, Object> resultMap = new HashMap<String, Object>();
		System.out.println(community_DTO);
		System.out.println(community_DTO.getBusiness_type());
		String goURL = URLEncoder.encode(community_DTO.getBusiness_type(),"UTF-8");
		try {
			community_service.board_modify(community_DTO);
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("error", e.getMessage());
			model.addAttribute("error",resultMap.get("error"));
		}
		
		// 이미지 리스트로 간다.
		return "redirect:board.do?business_type="+goURL;
	}
	
	
	
	
	
	
	
		//공지사항	
			@RequestMapping("/community/gongji.do")
			private String gongji() {
				
				return "board/community/gongji";
			}
		//가입인사(등업)	
			@RequestMapping("/community/greeting.do")
			private String greeting() {
				
				return "board/community/greeting";
			}
		//질문및답변	
			@RequestMapping("/community/qanswer.do")
			private String qanswer() {
				
				return "board/community/qanswer";
			}
		//정모와번개	
			@RequestMapping("/community/jeongmo.do")
			private String jeongmo() {
				
				return "board/community/jeongmo";
			}
		//자유게시판	
			@RequestMapping("/community/freeboard.do")
			private String freeboard() {
				
				return "board/community/freeboard";
			}
		//여우게시판	
			@RequestMapping("/community/foxboard.do")
			private String foxboard() {
				
				return "board/community/foxboard";
			}
		//구인	
			@RequestMapping("/community/joboffer.do")
			private String joboffer() {
					
				return "board/community/joboffer";
			}
		//구인	
			@RequestMapping("/community/choboguide.do")
			private String choboguide() {
					
				return "board/community/choboguide";
			}
		//구인	
			@RequestMapping("/community/eventbanner.do")
			private String eventbanner() {
					
				return "board/community/eventbanner";
			}	
			
}
