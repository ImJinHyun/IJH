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
import com.sadan.common.model.PageMaker;
import com.sadan.common.model.SearchCriteria;
import com.sadan.useafter.mapper.Useafter_Mapper;
import com.sadan.useafter.mapper.Useafter_reply_Mapper;
import com.sadan.useafter.model.Useafter_DTO;
import com.sadan.useafter.model.Useafter_reply_DTO;

@Service
public class Useafter_reply_Service {
	private static final Logger logger = LoggerFactory.getLogger(Useafter_reply_Service.class);
	
	@Autowired
	private Useafter_reply_Mapper useafter_reply_Mapper;

	 

	public void reply_insert(Useafter_reply_DTO useafter_reply_DTO) {

		useafter_reply_Mapper.reply_insert(useafter_reply_DTO);
	}



	public List<Useafter_reply_DTO> reply_list(Useafter_reply_DTO useafter_reply_DTO, SearchCriteria criteria) {
		
		
		return useafter_reply_Mapper.reply_list(useafter_reply_DTO,criteria);
		
		
	}



	public int getRow(String no) {
		return useafter_reply_Mapper.getRow(no);
	}



	public void reply_update(Useafter_reply_DTO useafter_reply_DTO) {
		useafter_reply_Mapper.reply_update(useafter_reply_DTO);
		
	}



	public void reply_delete(Useafter_reply_DTO useafter_reply_DTO) {
		useafter_reply_Mapper.reply_delete(useafter_reply_DTO);
		
	}



	public void reply_answer(Useafter_reply_DTO useafter_reply_DTO) {
			useafter_reply_Mapper.reply_answer(useafter_reply_DTO);
	}



	
	
	


}
