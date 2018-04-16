package com.sadan.community.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sadan.common.model.SearchCriteria;
import com.sadan.community.model.Community_DTO;
import com.sadan.entertainment.model.Entertainment_DTO;

@Mapper
public interface Community_Mapper {
	
	public List<Map<String, Object>> board_list(@Param("business_type") String business_type,@Param("criteria") SearchCriteria criteria)throws Exception;
	
	public void board_insert(Community_DTO community_DTO);

	public Community_DTO board_read(Community_DTO community_DTO);

	public void board_delete(Community_DTO community_DTO);

	public void board_modify(Community_DTO community_DTO)throws Exception;

	public int getRow(String business_type) throws Exception;

	public Community_DTO main_List();
}
