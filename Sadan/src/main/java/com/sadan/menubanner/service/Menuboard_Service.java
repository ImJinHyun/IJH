package com.sadan.menubanner.service;

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
import com.sadan.menubanner.mapper.Menuboard_Mapper;

@Service
public class Menuboard_Service {
	private static final Logger logger = LoggerFactory.getLogger(Menuboard_Service.class);
	
	@Autowired
	private Menuboard_Mapper menuboard_Mapper;
	
	


}
