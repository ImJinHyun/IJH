package com.sadan.entertainment.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.sadan.entertainment.model.Entertainment_DTO;



@Mapper
public interface Entertainment_Mapper {

	public List<Map<String, Object>> torento_Full_list(String business_type)throws Exception;
	
	public void board_insert(Entertainment_DTO entertainment_DTO);

	public Entertainment_DTO board_read(Entertainment_DTO entertainment_DTO);

	public void board_delete(Entertainment_DTO entertainment_DTO);

	public void board_modify(Entertainment_DTO entertainment_DTO)throws Exception;

}
