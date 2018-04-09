package com.sadan.member.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.sadan.member.model.LoginDTO;

@Mapper
public interface Member_Mapper {

	public LoginDTO login(LoginDTO loginDTO);




}
