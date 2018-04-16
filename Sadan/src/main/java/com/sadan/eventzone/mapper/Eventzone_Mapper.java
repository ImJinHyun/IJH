package com.sadan.eventzone.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sadan.common.model.SearchCriteria;
import com.sadan.eventzone.model.Eventzone_DTO;

@Mapper
public interface Eventzone_Mapper {
	
	public List<Map<String, Object>> board_list(@Param("business_type") String business_type,@Param("criteria") SearchCriteria criteria)throws Exception;
	
	public void board_insert(Eventzone_DTO eventzone_DTO);

	public Eventzone_DTO board_read(Eventzone_DTO eventzone_DTO);

	public void board_delete(Eventzone_DTO eventzone_DTO);

	public void board_modify(Eventzone_DTO eventzone_DTO)throws Exception;

	public int getRow(String business_type) throws Exception;

	public Eventzone_DTO main_List();
}
