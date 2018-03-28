package com.sadan.index.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IndexMapper {



	List<Map<String, Object>> indexselect(Map<String, Object> map2) throws Exception;

}
