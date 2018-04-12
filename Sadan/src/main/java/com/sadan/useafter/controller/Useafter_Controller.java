package com.sadan.useafter.controller;



import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sadan.common.model.PageMaker;
import com.sadan.common.model.SearchCriteria;
import com.sadan.useafter.model.Useafter_DTO;
import com.sadan.useafter.service.Useafter_Service;


@Controller
public class Useafter_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Useafter_Controller.class);
	
	@Autowired
	private Useafter_Service useafter_service;
	
	@RequestMapping("/useafter/main.do")
	private String useafter() {
		
		return "board/useafter/useafter";
	}
	
				/**
				 * 풀싸롱 게시글 목록
				 * @param model
				 * @return
				 * @throws Exception
				 */
//				@RequestMapping(value="/useafter/fullssa.do")
//				private String fullssa(Model model,@RequestParam String business_type)throws Exception {
//					Map<String, Object> map = new HashMap<String, Object>();
//					try {
//						map = useafter_service.room_Full_list(business_type);
//						System.out.println(business_type);
//						@SuppressWarnings({ "unchecked", "unused" })
//						List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("list");
//						model.addAttribute("useafter", list);
//						System.out.println(list);
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//					
//					return "board/useafter/fullssa";
//				}
				
				@RequestMapping(value="/useafter/fullssa.do")
				private String Pagefullssa(SearchCriteria criteria,Model model,@RequestParam String business_type)throws Exception {
					Map<String, Object> map = new HashMap<String, Object>();
					PageMaker pageMaker = new PageMaker();
					try {
						//게시글 불러오기
						map = useafter_service.room_Full_list(business_type,criteria);
						System.out.println(business_type);
						
						
						//페이징처리
						pageMaker.setCri(criteria);
						//페이지 전체 갯수 구하기
						pageMaker.setTotalCount(useafter_service.getRow(business_type));
						
						System.out.println(pageMaker);
						@SuppressWarnings({ "unchecked", "unused" })
						List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("list");
						model.addAttribute("useafter", list);
						model.addAttribute("pageMaker",pageMaker);
						System.out.println(list);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					return "board/useafter/fullssa";
				}
				//페이지 처리된 게시판 글 리스트
//				@RequestMapping(value="/useafter/fullssa.do")
//				private String fullssadelete(@RequestParam("no")int no, RedirectAttributes rttr )throws Exception {
//					useafter_service.remove(no);
//				}
				
				/**
				 * 풀싸롱 글작성 매핑
				 * @param model
				 * @param type
				 * @return
				 * @throws Exception
				 */
				@RequestMapping("/useafter/fullssainsert.do")
				private String fullssainsert(Model model,@RequestParam String type)throws Exception {
					model.addAttribute("type",type);
					System.out.println(type);
					return "board/useafter/insert";
				}
				
				/**
				 * 풀싸롱 글등록 처리
				 * @param model
				 * @param first_board_DTO
				 * @return
				 * @throws Exception
				 */
			
				@RequestMapping(value = "/useafter/board_insert.do", method = RequestMethod.POST)
				private String board_insert(Model model,Useafter_DTO useafter_DTO ) throws Exception{
					Map<String, Object> resultMap = new HashMap<String, Object>();
					String goURL = URLEncoder.encode(useafter_DTO.getBusiness_type(),"UTF-8");
					try {
						useafter_service.board_insert(useafter_DTO);
					} catch (Exception e) {
						e.printStackTrace();
						resultMap.put("error", e.getMessage());
						model.addAttribute("error",resultMap.get("error"));
					}
					
					// 이미지 리스트로 간다.
					return "redirect:fullssa.do?business_type="+goURL;
				}
				/**
				 * 풀싸롱 제목클릭후 게시글내용보기
				 * @param model
				 * @param useafter_DTO
				 * @return
				 * @throws Exception
				 */
				
				@RequestMapping("/useafter/board_read.do")
				private String board_read(Model model,Useafter_DTO useafter_DTO) throws Exception{
					
					try {
						System.out.println(useafter_DTO.getNo());
						model.addAttribute("useafter", useafter_service.board_read(useafter_DTO));
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					return "board/useafter/Read";
					
				}
				/**
				 * 풀싸롱 글삭제 처리
				 * @param model
				 * @param no
				 * @param rttr
				 * @return
				 * @throws Exception
				 */
				@RequestMapping("/useafter/board_delete.do")
				private String board_delete(Useafter_DTO useafter_DTO)throws Exception{
					
					String goURL = URLEncoder.encode(useafter_DTO.getBusiness_type(),"UTF-8");
					try { 
						useafter_service.board_delete(useafter_DTO);
						System.out.println(useafter_DTO);
					} catch (Exception e) {
						e.printStackTrace();
					}
					return "redirect:fullssa.do?business_type="+goURL;		
				}
				
				/**
				 * 글수정 매핑
				 * @param useafter_DTO
				 * @param model
				 * @return
				 */
				@RequestMapping("/useafter/board_modify.do")
				private String board_modify(Useafter_DTO useafter_DTO, Model model) {
					try {
						System.out.println(useafter_DTO.getNo());
						model.addAttribute("useafter", useafter_service.board_read(useafter_DTO));
					} catch (Exception e) {
						e.printStackTrace();
					
					}
					return "board/useafter/modify";
				}
				
				/**
				 * 룸/풀싸롱 게시글 수정 처리
				 * @param model
				 * @param useafter_DTO
				 * @return
				 * @throws Exception
				 */
				@RequestMapping(value = "/useafter/board_modify.do", method = RequestMethod.POST)
				private String board_modify(Model model,Useafter_DTO useafter_DTO ) throws Exception{
					Map<String, Object> resultMap = new HashMap<String, Object>();
					System.out.println(useafter_DTO);
					String goURL = URLEncoder.encode(useafter_DTO.getBusiness_type(),"UTF-8"); 
					try {
						useafter_service.board_modify(useafter_DTO);
					} catch (Exception e) {
						e.printStackTrace();
						resultMap.put("error", e.getMessage());
						model.addAttribute("error",resultMap.get("error"));
					}
					
					// 이미지 리스트로 간다.
					return "redirect:fullssa.do?business_type="+goURL;
				}

				
				/**
				 * 노래방/나이트/바 게시글 목록
				 * @param model
				 * @return
				 * @throws Exception
				 */

				@RequestMapping("/useafter/songnightbar.do")
				private String songnightbar(Model model)throws Exception {
					
					return "board/useafter/songnightbar";
				}
				
				
				
				
			//아로마	목록
				@RequestMapping("/useafter/aroma.do")
				private String aroma(Model model)throws Exception {
					
					return "board/useafter/aroma";
				}
			//출장마사지
				@RequestMapping("/useafter/masage.do")
				private String masage(Model model)throws Exception {
					
					return "board/useafter/masage";
				}
			//스포츠마사지
				@RequestMapping("/useafter/sportsmasage.do")
				private String sportsmasage(Model model)throws Exception {
					
					return "board/useafter/sportsmasage";
				}
			//키스방
				@RequestMapping("/useafter/kissroom.do")
				private String kissroom(Model model)throws Exception {
					
					return "board/useafter/kissroom";
				}
			//오피
				@RequestMapping("/useafter/office.do")
				private String office(Model model)throws Exception {
					
					return "board/useafter/office";
				}
			//휴게텔
				@RequestMapping("/useafter/resttel.do")
				private String resttel(Model model)throws Exception {
					
					return "board/useafter/resttel";
				}
			//기타업소
				@RequestMapping("/useafter/etc.do")
				private String etc(Model model)throws Exception {
					
					return "board/useafter/etc";
				}
			//초보자가이드
				@RequestMapping("/useafter/choboguide.do")
				private String choboguide(Model model)throws Exception {
					
					return "board/useafter/choboguide";
				}
			//이벤트업소배너
				@RequestMapping("/useafter/eventbanner.do")
				private String eventbanner(Model model)throws Exception {
					
					return "board/useafter/eventbanner";
				}	
			
}
