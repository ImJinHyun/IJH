package com.sadan.servicecenter.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sadan.common.model.SearchCriteria;
import com.sadan.community.model.Community_DTO;
import com.sadan.servicecenter.model.Servicecenter_DTO;

@Mapper
public interface Servicecenter_Mapper {

	public List<Map<String, Object>> board_list(@Param("business_type") String business_type,@Param("criteria") SearchCriteria criteria)throws Exception;
	
	public void board_insert(Servicecenter_DTO servicecenter_DTO);

	public Servicecenter_DTO board_read(Servicecenter_DTO servicecenter_DTO);

	public void board_delete(Servicecenter_DTO servicecenter_DTO);

	public void board_modify(Servicecenter_DTO servicecenter_DTO)throws Exception;

	public int getRow(String business_type) throws Exception;

	public Servicecenter_DTO main_List();
}
