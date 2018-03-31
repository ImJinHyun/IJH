<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판읽기</title>
<link rel="stylesheet" href="/resources/css/board_read.css">
</head>
<body>
	<!-- 글보기 헤더 영역 -->
	<div class="boardhead">
		<!-- 글보기 헤더 감싸기 영역 -->
		<div class="warp_boardhead">
			<h3>룸싸롱 풀싸롱</h3>
		</div>
	</div>
	<!-- div 줄 바꿈 -->
	<div class="div_clear"></div>
	<!-- 버튼 감싸기 -->
	<div class="wrap_button">
		<button type="button" class="btn btn-primary link_button">목록</button>
	</div>
	<div class="div_clear"></div>
	
	<!-- 바디 전체 -->
	<div class="warp_bodyall">


		<!-- 바디 내용 -->
		<div class="board_body">
			<!-- 제목영역 -->
			<!-- 제목감싸기 -->
			<div class="warp_title">
				<div class="title">

					<a href="#"><h1>강남-테란(태수대표)</h1></a>

				</div>
				
				<!-- 작성일, ip주소, 조회, 추천 -->
				<div style="padding: 5px 15px 0 0; clear: both;">
					<div style="float: left; color: #aaa;">
						<span>작성일 : </span>
						<span>18.03.31 02:46</span> 
						<span>|</span>
						 <span>조회 : </span>
						 <span>28,539</span>
						<span>|</span> 
						<span>추천 : </span>
						<span style="color: blue;">0</span>
					</div>
					<div style="float: right; color: #aaa;"></div>
					<div class="clear"></div>
				</div>
				<!-- 작성일 조회 추천 날짜 끝 -->
				<hr>	
				<!-- 게시자 정보 -->
				<div class="warp_writer_info">
						<div class="">
						
						</div>
				</div>
				<!-- 게시자 정보 끝 -->
				
			</div>
			<!-- 제목 끝 -->
			
			
		</div>
		<!-- 바디 내용 끝 -->
		
	</div><!-- 바디 전체 감싸는 부분 끝 -->
</body>
</html>