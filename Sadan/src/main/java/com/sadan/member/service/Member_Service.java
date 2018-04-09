package com.sadan.member.service;

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
import com.sadan.member.mapper.Member_Mapper;
import com.sadan.member.model.LoginDTO;

@Service
public class Member_Service {
	private static final Logger logger = LoggerFactory.getLogger(Member_Service.class);
	
	@Autowired
	private Member_Mapper member_Mapper;

	
	
	@Transactional
	public LoginDTO login(LoginDTO loginDTO)throws Exception {
			 
		return member_Mapper.login(loginDTO);
	}
	
	


}
