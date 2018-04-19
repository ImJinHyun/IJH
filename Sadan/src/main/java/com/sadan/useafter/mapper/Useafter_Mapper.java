package com.sadan.useafter.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sadan.common.model.SearchCriteria;
import com.sadan.useafter.model.Useafter_DTO;

@Mapper
public interface Useafter_Mapper {

	public List<Map<String, Object>> room_Full_list(@Param("criteria") SearchCriteria criteria)throws Exception;

	public void board_insert(Useafter_DTO useafter_DTO);

	public Useafter_DTO board_read(Useafter_DTO useafter_DTO);

	public void board_delete(Useafter_DTO useafter_DTO);

	public void board_modify(Useafter_DTO useafter_DTO)throws Exception;

	public int getRow(@Param("criteria") SearchCriteria criteria) throws Exception;

	public void board_Hit(Useafter_DTO useafter_DTO) throws Exception;

	public int recom_count(@Param("useafter_DTO") Useafter_DTO useafter_DTO,@Param("table_nm") String table_nm, @Param("userId")String userId);

	public void recom_increase(@Param("useafter_DTO") Useafter_DTO useafter_DTO,@Param("table_nm") String table_nm, @Param("userId")String userId);

	public void recom_board(Useafter_DTO useafter_DTO);


	
}
