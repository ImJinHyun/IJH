package com.sadan.firsttest.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.sadan.firsttest.mapper.First_board_Mapper;

@Service
public class First_board_Service {
	
	@Mapper
	private First_board_Mapper first_board_Mapper;
	
	


	public Map<String, Object> List(Map<String, Object> map2) throws Exception{
		
		System.out.println(map2);
		List<Map<String, Object>> board_List = 	first_board_Mapper.selectList1(map2); 
		System.out.println(board_List);
		return null;
	}

}
