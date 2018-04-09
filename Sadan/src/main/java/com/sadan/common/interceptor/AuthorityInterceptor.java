package com.sadan.common.interceptor;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.sadan.member.model.LoginDTO;

public class AuthorityInterceptor
extends HandlerInterceptorAdapter{

	// Map<URI, 페이지 권한>
	// 페이지 권한 : 1-로그인, 9-권리자  --> 프로그래머가 정한다.
	static private Map<String, Integer> authMap = new HashMap<String, Integer>();

	// 초기화 블록 - 바로 실행됨.
	static {
		// 게시판 글쓰기 - 1(로그인을 하셔야 한다.)
		authMap.put("/board/write.do", 1);
		authMap.put("/board/update.do", 1);
		authMap.put("/board/delete.do", 1);
		// 이미지 올리기 - 9(관리자 권한이 있어야 한다.)
		authMap.put("/image/write.do", 9);
		authMap.put("/image/update.do", 9);
		authMap.put("/image/delete.do", 9);
	}

	@Override
	// controller를 실행하기 전에 이 메소드가 실행이 됩니다.
	public boolean preHandle
	(HttpServletRequest request,
	HttpServletResponse response,
	Object handler) throws Exception{
		System.out.println("AuthorityInterceptor.preHandle()");

		HttpSession session = request.getSession();


		String uri = request.getServletPath();
		Integer uriGrade = authMap.get(uri);
		System.out.println(uri);

		// 로그인이 필요한 경우 로그인을 시킨다.
		if(uriGrade != null) {
			// 로그인 정보를 받아 온다.
			LoginDTO loginDTO = (LoginDTO)session.getAttribute("login");
			// 로그인이 안되어 있는 경우
			if(loginDTO == null) {
				// 로그인 처리하기 전에 URI 저장
				session.setAttribute("goURI", ".."+uri);
				// 로그인 처리 화면으로 간다.
				response.sendRedirect("../login/login.do");
				// 요청한 URI을 실행하지 않게 한다.
				return false;
			}
			// 로그인은 되어 있으나 권한이 없는 경우 처리
			if(loginDTO.getGrade() < uriGrade) {
				// 권한 없음 페이지로 이동
				response.sendRedirect("../error/noPermission.do");
				// 요청한 URI을 실행하지 않게 한다.
				return false;
			}
		}
		// 요청한 URI을 실행하게 한다.
		return true;
	}
}
