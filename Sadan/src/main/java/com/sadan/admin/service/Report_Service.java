package com.sadan.admin.service;


import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadan.admin.mapper.Report_Mapper;

@Service
public class Report_Service {
	private static final Logger logger = LoggerFactory.getLogger(Report_Service.class);
	
	@Autowired
	Report_Mapper  report_Mapper;
	
	public void board_report(Map<String, Object> map, String table_nm, String userId) throws Exception{
		System.out.println("신고map===============\n"+map+"table_nm====================\n"+table_nm+"userId===================\n"+userId);
	}



}
