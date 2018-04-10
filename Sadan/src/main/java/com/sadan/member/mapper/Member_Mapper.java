package com.sadan.member.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.sadan.member.model.LoginDTO;

@Mapper
public interface Member_Mapper {
	//로그인 기능
	public LoginDTO login(LoginDTO loginDTO) throws Exception;
	//회원정보수정
	public LoginDTO modify(LoginDTO loginDTO)throws Exception ;
	//회원가입 처리
	public LoginDTO insert(LoginDTO loginDTO) throws Exception;




}
