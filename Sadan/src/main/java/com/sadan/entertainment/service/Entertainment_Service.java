package com.sadan.entertainment.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.sadan.boardtest.controller.Boardtest_ListController;
import com.sadan.boardtest.mapper.Boardtest_ListMapper;
import com.sadan.chat.mapper.Chat_Mapper;
import com.sadan.entertainment.mapper.Entertainment_Mapper;
import com.sadan.entertainment.model.Entertainment_DTO;



@Service
public class Entertainment_Service {
	private static final Logger logger = LoggerFactory.getLogger(Entertainment_Service.class);
	
	@Autowired
	private Entertainment_Mapper entertainment_Mapper;

	public Map<String, Object> torento_Full_list(String business_type) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			resultMap.put("list", entertainment_Mapper.torento_Full_list(business_type));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultMap;
	}
	
	public void board_insert(Entertainment_DTO entertainment_DTO) throws Exception {
		entertainment_Mapper.board_insert(entertainment_DTO);
	}

	public Entertainment_DTO board_read(Entertainment_DTO entertainment_DTO) {
		return entertainment_Mapper.board_read(entertainment_DTO);
	}
	
	public void board_delete(Entertainment_DTO entertainment_DTO) {
		entertainment_Mapper.board_delete(entertainment_DTO);
	
	}
	
	


}
