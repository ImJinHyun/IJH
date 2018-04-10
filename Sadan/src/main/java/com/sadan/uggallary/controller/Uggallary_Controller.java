package com.sadan.uggallary.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadan.useafter.service.Useafter_Service;


@Controller
public class Uggallary_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Uggallary_Controller.class);
	
	@Autowired
	private Useafter_Service uggallary_service;
	
	@RequestMapping("/uggallary/main.do")
	private String uggallary() {
		
		return "board/uggallary/uggallary";
	}
	//업소갤러리
	@RequestMapping("/uggallary/eobsogal.do")
	private String eobsogal(Model model)throws Exception {

		return "board/uggallary/eobsogal";
	}
	//일반인갤러리
	@RequestMapping("/uggallary/publicgal.do")
	private String publicgal(Model model)throws Exception {

		return "board/uggallary/publicgal";
	}
	//레이싱갤러리
	@RequestMapping("/uggallary/racinggal.do")
	private String racinggal(Model model)throws Exception {

		return "board/uggallary/racinggal";
	}
	//서양갤러리
	@RequestMapping("/uggallary/westerngal.do")
	private String westerngal(Model model)throws Exception {

		return "board/uggallary/westerngal";
	}
	//슴가갤러리
	@RequestMapping("/uggallary/chestgal.do")
	private String chestgal(Model model)throws Exception {

		return "board/uggallary/chestgal";
	}
	//힙갤러리
	@RequestMapping("/uggallary/hipgal.do")
	private String hipgal(Model model)throws Exception {

		return "board/uggallary/hipgal";
	}
	//자유갤러리
	@RequestMapping("/uggallary/freegal.do")
	private String freegal(Model model)throws Exception {

		return "board/uggallary/freegal";
	}
	//초보자가이드
		@RequestMapping("/uggallary/choboguide.do")
		private String choboguide(Model model)throws Exception {

			return "board/uggallary/choboguide";
		}
	//이벤트업소배너
		@RequestMapping("/uggallary/eventbanner.do")
		private String eventbanner(Model model)throws Exception {

			return "board/uggallary/eventbanner";
		}	
			
}
