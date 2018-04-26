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
import com.sadan.common.model.SearchCriteria;
import com.sadan.useafter.mapper.Useafter_Mapper;
import com.sadan.useafter.model.Useafter_DTO;
import com.sadan.useafter.model.Useafter_reply_DTO;

@Service
public class Useafter_Service {
	private static final Logger logger = LoggerFactory.getLogger(Useafter_Service.class);
	
	@Autowired
	private Useafter_Mapper useafter_Mapper;

	@Transactional
	public Map<String, Object> room_Full_list(SearchCriteria criteria)throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			resultMap.put("list", useafter_Mapper.room_Full_list(criteria)); 
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


	public int getRow(SearchCriteria criteria) throws Exception{
		return useafter_Mapper.getRow(criteria); 
	}
	
	@Transactional
	public void board_modify(Useafter_DTO useafter_DTO)throws Exception {
		try {
			useafter_Mapper.board_modify(useafter_DTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}


	public void board_Hit(Useafter_DTO useafter_DTO) throws Exception {
		try {
			useafter_Mapper.board_Hit(useafter_DTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public int recom_count(Useafter_DTO useafter_DTO, String table_nm, String userId) throws Exception {
		int recommand_Count = 0 ;;
		try {
			recommand_Count = useafter_Mapper.recom_count(useafter_DTO, table_nm, userId);
			System.out.println("service========="+recommand_Count);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return recommand_Count; 
	}


	public void recom_increase(Useafter_DTO useafter_DTO, String table_nm, String userId) {
		try {
			useafter_Mapper.recom_increase(useafter_DTO,table_nm,userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void recom_board(Useafter_DTO useafter_DTO) {
		useafter_Mapper.recom_board(useafter_DTO);
	}


	


	public Map<String, Object> board_reply_list(SearchCriteria criteria, Useafter_DTO useafter_DTO) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			resultMap.put("list", useafter_Mapper.board_reply_list(criteria, useafter_DTO)); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultMap;
	} 


	public int getReplyRow(Useafter_DTO useafter_DTO) {
		return useafter_Mapper.getReplyRow(useafter_DTO);
	}


	public void answer_insert(Useafter_DTO useafter_DTO) {
	useafter_Mapper.answer_insert(useafter_DTO);
		
	}


	public void answer_seq(Useafter_DTO useafter_DTO) {
useafter_Mapper.answer_seq(useafter_DTO);		
	}


	public int answer_seq_count(Useafter_DTO useafter_DTO) {
		return useafter_Mapper.answer_seq_count(useafter_DTO); 
	}



	
	
	


}
