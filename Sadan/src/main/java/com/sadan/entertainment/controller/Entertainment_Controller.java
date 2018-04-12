package com.sadan.entertainment.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sadan.entertainment.service.Entertainment_Service;




@Controller
public class Entertainment_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Entertainment_Controller.class);
	
	@Autowired
	private Entertainment_Service entertainment_service;
	
	@RequestMapping("/entertainment/main.do")
	private String entertainment() {
		
		return "board/entertainment/entertainment";
	}
	
	/**
	 * 토렌토 게시글 목록
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/entertainment/torento.do")
	private String torento(Model model,@RequestParam String business_type)throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			map = entertainment_service.torento_Full_list(business_type);
			System.out.println(business_type);
			@SuppressWarnings({ "unchecked", "unused" })
			List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("list");
			model.addAttribute("entertainment", list);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "board/entertainment/torento";
	}
	//움짤/동영상
	@RequestMapping("/entertainment/video.do")
	private String video(Model model)throws Exception {

		return "board/entertainment/video";
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
