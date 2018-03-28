package com.sadan.index.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.activation.DataSource;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.transaction.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.TransactionManagementConfigurationSelector;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.sadan.boardtest.mapper.Boardtest_ListMapper;
import com.sadan.index.controller.IndexController;
import com.sadan.index.mapper.IndexMapper;

@Service
public class IndexService {
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	@Autowired
	private IndexMapper indexmapper;
	
	

	@Transactional
	public Map<String, Object> List(Map<String, Object> map2) throws Exception{
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			System.out.println(map2);
			List<Map<String, Object>> index_List = 	indexmapper.indexselect(map2); 
			resultMap.put("board_List", index_List);
			System.out.println(index_List);
			logger.debug("@@@@@@select_List = ",index_List);
			
		} catch (SQLException e) {
			logger.debug("IndexService 에러");
}
		return resultMap;
	}

}
