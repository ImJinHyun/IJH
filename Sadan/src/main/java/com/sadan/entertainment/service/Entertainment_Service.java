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
import com.sadan.useafter.mapper.Useafter_Mapper;

@Service
public class Entertainment_Service {
	private static final Logger logger = LoggerFactory.getLogger(Entertainment_Service.class);
	
	@Autowired
	private Entertainment_Mapper entertainment_Mapper;
	
	


}
