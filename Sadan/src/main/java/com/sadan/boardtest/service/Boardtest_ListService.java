package com.sadan.boardtest.service;

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

@Service
public class Boardtest_ListService {
	private static final Logger logger = LoggerFactory.getLogger(Boardtest_ListService.class);
	
	@Autowired
	private Boardtest_ListMapper first_board_Mapper;
	
	


	public Map<String, Object> List(Map<String, Object> map2) throws Exception{
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
//		DataSourceTransactionManager txManager = null;
//		TransactionStatus status = txManager.getTransaction(def);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			System.out.println(map2);
			resultMap.put("list", first_board_Mapper.selectList1(map2));   
			System.out.println(resultMap);
			
//			txManager.commit(status);
			
			
		} catch (Exception e) {
		e.printStackTrace();
//		txManager.rollback(status);
		resultMap.put("error", e.getMessage());
		}
		return resultMap;
	}




	public Map<String, Object> board_Read(int no)  throws Exception {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		try {
			
			logger.debug("no");
			resultMap.put("read", first_board_Mapper.board_Read(no));		//쿼리 호출   
			logger.debug("resultMap========",resultMap.get("list"));
			System.out.println(resultMap.get("read"));
			
		} catch (Exception e) {
			e.printStackTrace();
	//		txManager.rollback(status);
			resultMap.put("error", e.getMessage());
		}
		return resultMap;
	}



@Transactional
	public void board_insert(Map<String, Object> map) {
	Map<String, Object> resultMap = new HashMap<String, Object>();
	
		try {
			
			first_board_Mapper.board_insert(map);
		} catch (Exception e) {
			resultMap.put("error", e.getMessage());
		}
	}



}
