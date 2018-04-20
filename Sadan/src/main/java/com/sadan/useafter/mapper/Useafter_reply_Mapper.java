package com.sadan.useafter.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sadan.common.model.PageMaker;
import com.sadan.common.model.SearchCriteria;
import com.sadan.useafter.model.Useafter_DTO;
import com.sadan.useafter.model.Useafter_reply_DTO;

@Mapper
public interface Useafter_reply_Mapper {



	public void reply_insert(Useafter_reply_DTO useafter_reply_DTO);

	public List<Useafter_reply_DTO> reply_list(@Param("reply_DTO") Useafter_reply_DTO useafter_reply_DTO,@Param("criteria") SearchCriteria criteria);

	public int getRow(String no);


	
}
