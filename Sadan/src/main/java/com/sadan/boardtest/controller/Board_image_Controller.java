package com.sadan.boardtest.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * 이미지 업로드
 * @param request
 * @param response
 * @param upload
 */

	
	@Controller
	public class Board_image_Controller {
		/**
	     * 이미지 업로드
	     * @param request
	     * @param response
	     * @param upload
	     */
	   
		@RequestMapping("/imageUpload.do")
	    public void communityImageUpload(HttpServletRequest request, HttpServletResponse response, @RequestParam MultipartFile upload) {
	 
	        OutputStream out = null;
	        PrintWriter printWriter = null;
	        response.setCharacterEncoding("utf-8");
	        response.setContentType("text/html;charset=utf-8");
	        
	        try{
	        	
	        	
	        	//업로드한 파일이름
	            String fileName = upload.getOriginalFilename();
	            
	            //파일을 바이트 배열로 변환
	            byte[] bytes = upload.getBytes();
	            
	            //배포 디렉토리가 저장됌
	            String uploadPath = UploadPath.path(request) +fileName;
	            System.out.println(fileName+"\nupLoadPath======"+uploadPath+"\nbytes================"+bytes+"\n\nUPloadPath====="+ UploadPath.path(request));
	            //파일 아웃 스트림 서버로 파일을 올리는것 <-> 파일 인풋스트림 서버에서 파일을 내려받음
	            out = new FileOutputStream(new File(uploadPath));
	            out.write(bytes);
	            
	            //클라이언트에 결과를 표시
	            String callback = request.getParameter("CKEditorFuncNum");
	 
	            //서버가 클라이언트에게 응답을 해주는 메소드
	            printWriter = response.getWriter();
	            String fileUrl = request.getContextPath()+"/images/test_img/"+ fileName;		//url경로
	            System.out.println(fileUrl);
	            printWriter.println("<script type='text/javascript'>window.parent.CKEDITOR.tools.callFunction("
	                    + callback
	                    + ",'"
	                    + fileUrl
	                    + "','이미지를 업로드 하였습니다.'"
	                    + ")</script>");
	            printWriter.flush();
	 
	        }catch(IOException e){
	            e.printStackTrace();
	        } finally {
	            try {
	                if (out != null) {
	                    out.close();
	                }
	                if (printWriter != null) {
	                    printWriter.close();
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	 
	        return;
	    }


			
}
