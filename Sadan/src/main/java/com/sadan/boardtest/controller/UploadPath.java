package com.sadan.boardtest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Repository;

@Repository
public class UploadPath {

	public static String attach_path="WEB-INF/views/images/test_Img/";
	
	public static String path( HttpServletRequest request){
		String uploadPath ="/";
		try{
			
			String root_path =request.getSession().getServletContext().getRealPath("/");
			System.out.println("rootpath================"+root_path);
			uploadPath=root_path+attach_path.replace('/', '\\');;	  
			
			return uploadPath;
		}catch(Exception e){
			e.printStackTrace();
		
			return uploadPath;
		}
	}

}