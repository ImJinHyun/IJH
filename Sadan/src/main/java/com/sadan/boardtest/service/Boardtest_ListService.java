package com.sadan.boardtest.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.activation.DataSource;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.transaction.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.TransactionManagementConfigurationSelector;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.sadan.boardtestmapper.Boardtest_ListMapper;

@Service
public class Boardtest_ListService {
	
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
			List<Map<String, Object>> board_List = 	first_board_Mapper.selectList1(map2); 
			resultMap.put("board_List", board_List);
			System.out.println(board_List);
//			txManager.commit(status);
			
			
		} catch (Exception e) {
		e.printStackTrace();
//		txManager.rollback(status);
		}
		return resultMap;
	}

}
