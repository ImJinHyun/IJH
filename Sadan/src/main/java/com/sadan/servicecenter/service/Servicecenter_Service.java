package com.sadan.servicecenter.service;

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
import com.sadan.eventzone.mapper.Eventzone_Mapper;
import com.sadan.servicecenter.mapper.Servicecenter_Mapper;




@Service
public class Servicecenter_Service {
	private static final Logger logger = LoggerFactory.getLogger(Servicecenter_Service.class);
	
	@Autowired
	private Servicecenter_Mapper servicecenter_Mapper;
	
	


}
