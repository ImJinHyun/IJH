package com.sadan.question.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.sadan.boardtest.controller.Boardtest_ListController;
import com.sadan.boardtest.mapper.Boardtest_ListMapper;
import com.sadan.common.model.SearchCriteria;
import com.sadan.question.mapper.Question_Mapper;
import com.sadan.question.model.Question_DTO;




@Service
public class Question_Service {
	private static final Logger logger = LoggerFactory.getLogger(Question_Service.class);
	
	@Autowired
	private Question_Mapper question_Mapper;
	
	public Map<String, Object> board_list(String business_type, SearchCriteria criteria) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			resultMap.put("list", question_Mapper.board_list(business_type,criteria));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultMap;
	}
	
	public void board_insert(Question_DTO question_DTO) throws Exception {
		question_Mapper.board_insert(question_DTO);
	}

	public Question_DTO board_read(Question_DTO question_DTO) {
		return question_Mapper.board_read(question_DTO);
	}
	
	public void board_delete(Question_DTO question_DTO) {
		question_Mapper.board_delete(question_DTO);
	
	}

	public int getRow(String business_type) throws Exception{
		return question_Mapper.getRow(business_type);
	}
	
	@Transactional
	public void board_modify(Question_DTO question_DTO)throws Exception {
		try {
			question_Mapper.board_modify(question_DTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	public Question_DTO main_List() {
		return question_Mapper.main_List();
	}


}
