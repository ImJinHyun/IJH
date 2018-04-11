package com.sadan.useafter.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.soap.SOAPBinding.Use;

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
import com.sadan.useafter.mapper.Useafter_Mapper;
import com.sadan.useafter.model.Useafter_DTO;

@Service
public class Useafter_Service {
	private static final Logger logger = LoggerFactory.getLogger(Useafter_Service.class);
	
	@Autowired
	private Useafter_Mapper useafter_Mapper;

	@Transactional
	public Map<String, Object> room_Full_list(String business_type)throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			resultMap.put("list", useafter_Mapper.room_Full_list(business_type));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultMap;
	}

	
	public void board_insert(Useafter_DTO useafter_DTO) throws Exception {
		useafter_Mapper.board_insert(useafter_DTO);
	}

	public Useafter_DTO board_read(Useafter_DTO useafter_DTO) {
		return useafter_Mapper.board_read(useafter_DTO);
	}
	
	public void board_delete(Useafter_DTO useafter_DTO) {
		useafter_Mapper.board_delete(useafter_DTO);
	
	}

	@Transactional
	public void board_modify(Useafter_DTO useafter_DTO)throws Exception {
		try {
			useafter_Mapper.board_modify(useafter_DTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	
	
	


}
