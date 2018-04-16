package com.sadan.eventzone.service;

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
import com.sadan.eventzone.mapper.Eventzone_Mapper;
import com.sadan.eventzone.model.Eventzone_DTO;




@Service
public class Eventzone_Service {
	private static final Logger logger = LoggerFactory.getLogger(Eventzone_Service.class);
	
	@Autowired
	private Eventzone_Mapper eventzone_Mapper;
	
	public Map<String, Object> board_list(SearchCriteria criteria) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			resultMap.put("list", eventzone_Mapper.board_list(criteria)); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultMap;
	}
	
	public void board_insert(Eventzone_DTO eventzone_DTO) throws Exception {
		eventzone_Mapper.board_insert(eventzone_DTO);
	}

	public Eventzone_DTO board_read(Eventzone_DTO eventzone_DTO) {
		return eventzone_Mapper.board_read(eventzone_DTO);
	}
	
	public void board_delete(Eventzone_DTO eventzone_DTO) {
		eventzone_Mapper.board_delete(eventzone_DTO);
	
	}

	public int getRow(SearchCriteria criteria) throws Exception{
		return eventzone_Mapper.getRow(criteria); 
	}
	
	@Transactional
	public void board_modify(Eventzone_DTO eventzone_DTO)throws Exception {
		try {
			eventzone_Mapper.board_modify(eventzone_DTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	public Eventzone_DTO main_List() {
		return eventzone_Mapper.main_List();
	}
	


}
