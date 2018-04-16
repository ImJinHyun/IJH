package com.sadan.servicecenter.service;

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
import com.sadan.community.model.Community_DTO;
import com.sadan.servicecenter.mapper.Servicecenter_Mapper;
import com.sadan.servicecenter.model.Servicecenter_DTO;




@Service
public class Servicecenter_Service {
	private static final Logger logger = LoggerFactory.getLogger(Servicecenter_Service.class);
	
	@Autowired
	private Servicecenter_Mapper servicecenter_Mapper;
	
	public Map<String, Object> board_list(String business_type, SearchCriteria criteria) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			resultMap.put("list", servicecenter_Mapper.board_list(business_type,criteria));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultMap;
	}
	
	public void board_insert(Servicecenter_DTO servicecenter_DTO) throws Exception {
		servicecenter_Mapper.board_insert(servicecenter_DTO);
	}

	public Servicecenter_DTO board_read(Servicecenter_DTO servicecenter_DTO) {
		return servicecenter_Mapper.board_read(servicecenter_DTO);
	}
	
	public void board_delete(Servicecenter_DTO servicecenter_DTO) {
		servicecenter_Mapper.board_delete(servicecenter_DTO);
	
	}

	public int getRow(String business_type) throws Exception{
		return servicecenter_Mapper.getRow(business_type);
	}
	
	@Transactional
	public void board_modify(Servicecenter_DTO servicecenter_DTO)throws Exception {
		try {
			servicecenter_Mapper.board_modify(servicecenter_DTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	public Servicecenter_DTO main_List() {
		return servicecenter_Mapper.main_List();
	}


}
