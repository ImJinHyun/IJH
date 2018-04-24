package com.sadan.useafter.controller;



import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sadan.common.model.PageMaker;
import com.sadan.common.model.SearchCriteria;
import com.sadan.member.model.LoginDTO;
import com.sadan.useafter.model.Useafter_DTO;
import com.sadan.useafter.model.Useafter_reply_DTO;
import com.sadan.useafter.service.Useafter_Service;
import com.sadan.useafter.service.Useafter_reply_Service;


@Controller
public class Useafter_reply_Controller {
	private static final Logger logger = LoggerFactory.getLogger(Useafter_reply_Controller.class);
	
	@Autowired
	private Useafter_reply_Service useafter_reply_Service;
	
	@RequestMapping("/useafter/replies_insert.do")
	public String reply_insert(Useafter_reply_DTO useafter_reply_DTO, RedirectAttributes rttr){
		try {
			// 등록 실행
			useafter_reply_Service.reply_insert(useafter_reply_DTO);
			
			// 등록이 성공하면 성공했다는 entity 생성
			rttr.addFlashAttribute("msg","REPLY_INSERT_SUCCESS");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			rttr.addFlashAttribute("msg","REPLY_INSERT_FAILED");
		}
		return "redirect:/useafter/board_read.do?no="+useafter_reply_DTO.getNo();
		//return "redirect:board_read.do?no="+useafter_DTO.getNo();
	}
	
	@RequestMapping("/useafter/replies_update.do")
	public String reply_update(Useafter_reply_DTO useafter_reply_DTO, RedirectAttributes rttr){
		try {
			// 등록 실행
			useafter_reply_Service.reply_update(useafter_reply_DTO);
			
			// 등록이 성공하면 성공했다는 entity 생성
			rttr.addFlashAttribute("msg","REPLY_UPDATE_SUCCESS");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			rttr.addFlashAttribute("msg","REPLY_UPDATE_FAILED");
		}
		return "redirect:/useafter/board_read.do?no="+useafter_reply_DTO.getNo();
		//return "redirect:board_read.do?no="+useafter_DTO.getNo();
	}
	
	@RequestMapping("/useafter/replies_delete.do")
	public String reply_delete(Useafter_reply_DTO useafter_reply_DTO, RedirectAttributes rttr){
		try {
			// 등록 실행
			useafter_reply_Service.reply_delete(useafter_reply_DTO);
			
			// 등록이 성공하면 성공했다는 entity 생성
			rttr.addFlashAttribute("msg","REPLY_DELETE_SUCCESS");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			rttr.addFlashAttribute("msg","REPLY_DELETE_FAILED");
		}
		return "redirect:/useafter/board_read.do?no="+useafter_reply_DTO.getNo();
		//return "redirect:board_read.do?no="+useafter_DTO.getNo();
	}
	
}
