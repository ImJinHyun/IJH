<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="text/html; charset=UTF-8">
<title>게시판읽기</title>
<link rel="stylesheet" href="/resources/css/board_read.css">

<script type="text/javascript">
$(function(){

	//#=id / .class 선택자를 .on했을 때("click") 클릭했을 때 function() - 기능을 하겠다. 
	$("#community_list").on("click",function(){
		location.href="/community/board.do?business_type=공지사항";
	});
	
	$("#community_delete").on("click",function(){
		$("#community_Form").attr("action","board_delete.do").submit();
	});
	
	$("#community_modify").on("click",function(){
		$("#community_Form").attr("action","board_modify.do").submit();
	});
	
	
});
</script>
</head>
<body>
	<!-- 글보기 헤더 영역 -->
	<div class="boardhead">
		<!-- 글보기 헤더 감싸기 영역 -->
		<div class="warp_boardhead">
			<h3>${community.business_type }</h3>
		</div>
	</div>
	<!-- div 줄 바꿈 -->
	<div class="div_clear"></div>
	<!-- 버튼 감싸기 -->
	<div class="wrap_button">
		<button type="button" class="btn btn-primary link_button" id="community_list">목록</button>
		<button type="button" class="btn btn-primary link_button" id="community_delete">삭제</button>
		<button type="button" class="btn btn-primary link_button" id="community_modify">수정</button>
	</div>
	<div class="div_clear"></div>
	
	<!-- 바디 전체 -->
	<div class="warp_bodyall">

		<form id="community_Form" accept-charset="UTF-8"> 
			<!-- 히든으로 보낼 데이터들 -->
			<input type="hidden" value="${community.no }" name="no">
			<input type="hidden" value="${community.business_type }" name="business_type">
		</form>
		
	
		<!-- 바디 내용 -->
		<div class="board_body">
			
			<!-- 제목영역 -->
			<!-- 제목감싸기 -->
			<div class="warp_title">
			
				<!-- 제목 헤더 감싸기 -->
				<div class="title">

					<a href="#">${community.subject }</a>

				</div>
				
				<!-- 작성일, ip주소, 조회, 추천 -->
				<div class="board_info">
					<div style="float: left; color: gray;">
						<span class="info_bt">작성일 : </span>
						<span class="info_st">${community.dates } | </span> 
						 <span class="info_bt">조회 : </span>
						 <span class="info_st">${community.hit } | </span>
						<span  class="info_bt">추천 : </span>
						<span style="color: blue; font-size:10px;">${community.recommand }</span>
					</div>
					<div style="float: right; color: #aaa;"></div>
					<div class="clear"></div>
				</div>
				<!-- 작성일 조회 추천 날짜 끝 -->
				
				<br>
				<hr>	
		</div>
		<!-- 제목 끝 -->
		<div class="clear">
		</div>
		
		
		
		<!-- 글 본문 시작 -->
			<!-- 예약문의시 18사단 회원임을 알려주세요 -->
			<div class="sale">
				<img src="/images/test_img/18sadan_member.gif" />
			</div>
				<div class="clear"></div>

			<!-- 본문 내용 시작 -->
			<div class="body_content">
				${community.content }
			</div>
			
			
			
			<div class="clear"></div>
			<!-- 본문 내용 끝 -->
		
			<!-- 댓글 시작 -->
			<div class="reply">
			
			</div>
		</div>
		<!-- 바디 내용 끝 -->
		
	</div><!-- 바디 전체 감싸는 부분 끝 -->
	
</body>
</html>