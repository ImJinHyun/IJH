package com.sadan.question.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sadan.common.model.SearchCriteria;
import com.sadan.question.model.Question_DTO;

@Mapper
public interface Question_Mapper {
	
	public List<Map<String, Object>> board_list(@Param("business_type") String business_type,@Param("criteria") SearchCriteria criteria)throws Exception;
	
	public void board_insert(Question_DTO question_DTO);

	public Question_DTO board_read(Question_DTO question_DTO);

	public void board_delete(Question_DTO question_DTO);

	public void board_modify(Question_DTO question_DTO)throws Exception;

	public int getRow(String business_type) throws Exception;

	public Question_DTO main_List();
}
