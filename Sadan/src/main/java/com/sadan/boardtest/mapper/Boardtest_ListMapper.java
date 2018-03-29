package com.sadan.boardtest.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Boardtest_ListMapper {
	List<Map<String, Object>> selectList1(Map<String, Object> map2) throws Exception;

	List<Map<String, Object>> board_Read(int no)  throws Exception;


}
