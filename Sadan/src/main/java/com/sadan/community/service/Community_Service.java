package com.sadan.community.service;

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
import com.sadan.chat.mapper.Chat_Mapper;
import com.sadan.common.model.SearchCriteria;
import com.sadan.community.mapper.Community_Mapper;
import com.sadan.community.model.Community_DTO;

@Service
public class Community_Service {
	private static final Logger logger = LoggerFactory.getLogger(Community_Service.class);
	
	@Autowired
	private Community_Mapper community_Mapper;
	
	public Map<String, Object> board_list(String business_type, SearchCriteria criteria) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			resultMap.put("list", community_Mapper.board_list(business_type,criteria));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultMap;
	}
	
	public void board_insert(Community_DTO community_DTO) throws Exception {
		community_Mapper.board_insert(community_DTO);
	}

	public Community_DTO board_read(Community_DTO community_DTO) {
		return community_Mapper.board_read(community_DTO);
	}
	
	public void board_delete(Community_DTO community_DTO) {
		community_Mapper.board_delete(community_DTO);
	
	}

	public int getRow(String business_type) throws Exception{
		return community_Mapper.getRow(business_type);
	}
	
	@Transactional
	public void board_modify(Community_DTO community_DTO)throws Exception {
		try {
			community_Mapper.board_modify(community_DTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	public Community_DTO main_List() {
		return community_Mapper.main_List();
	}
	
	


}
