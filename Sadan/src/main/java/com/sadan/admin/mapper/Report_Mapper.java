package com.sadan.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sadan.useafter.model.Useafter_DTO;

@Mapper
public interface Report_Mapper {

	public int report_count(@Param("DTO") Map<String, Object>map,@Param("table_nm") String table_nm,@Param("userId") String userId);


}
