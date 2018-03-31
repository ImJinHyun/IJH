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
			
				<!-- 제목 헤더 감싸기 -->
				<div class="title">

					<a href="#">◆ 스파르타에서만 가능한 
					파격 2만 할인 이벤트 ◆전국 최저가 마사지 & 연애 11만원★ 와꾸실화 확실한 마인드 교육 / 언제나 내상ZERO★최고의 퀄리티로 모시겠습니다.★내용이 있는 스파르타★ ◀■ 한번도 안온 사람은 있어도 한번만 온사람이 
					없는 스파르타 ■#분당, #정자, #성남, #서현, #오리</a>

				</div>
				
				<!-- 작성일, ip주소, 조회, 추천 -->
				<div class="board_info">
					<div style="float: left; color: gray;">
						<span class="info_bt">작성일 : </span>
						<span class="info_st">18.03.31 02:46 | </span> 
						 <span class="info_bt">조회 : </span>
						 <span class="info_st">28,539 | </span>
						<span  class="info_bt">추천 : </span>
						<span style="color: blue; font-size:10px;">0</span>
					</div>
					<div style="float: right; color: #aaa;"></div>
					<div class="clear"></div>
				</div>
				<!-- 작성일 조회 추천 날짜 끝 -->
				
				<br>
				<hr>	
				<!-- 게시자 정보 -->
				<div class="warp_writer_info">
						<div class="writer_info">
								<div class="writer_left">
								<img src="/resource/images/main2.png" width="100%" height="110px">
								</div>
								<div class="writer_right">
								<span class="span_writer">업소명 : </span>
								<hr class="writer_hr">
								<span class="span_writer">업　종 : </span>
								<hr class="writer_hr">
								<span class="span_writer">담당자 :</span>
								<hr class="writer_hr">
								<span class="span_writer">지　역 : </span>
								<hr class="writer_hr">
								<span class="span_writer">연락처 : </span>
								<hr class="writer_hr">
								</div>
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