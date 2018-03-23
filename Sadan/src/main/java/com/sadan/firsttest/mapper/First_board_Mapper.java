package com.sadan.firsttest.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface First_board_Mapper {



	List<Map<String, Object>> selectList1(Map<String, Object> map2);

}
