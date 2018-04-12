<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>초보자가이드</title>
<link rel="stylesheet" href="/resources/css/chatinglink.css">
<link rel="stylesheet" href="/resources/css/jeyu.css">
<link rel="stylesheet" href="/resources/css/pr.css">

</head>
<body>
	<div class="prfullssa_all">
		<div class="board_subject">
			<div class="board_main_subject">			
				<span>룸/풀싸롱</span>							
			</div>
		</div>
	</div>
	<!-- 검색 시작 -->
	<form action="fullssa.do?business_type=룸/풀싸롱">
	<select class="form-control">
		<option value="n" ${pageMaker.cri.searchType == null or cri.searchType == "n"?"selected='selected'":"" } >전체</option>
	 	<option value="gangNam" ${pageMaker.cri.searchType =="gangNam"?"selected='selected'":"" }>강남</option> 
	 	<option value="nonGangNam">비강남</option> 
	 	<option value="inCheon">인천</option> 
	 	<option value="gyeonGi">경기</option> 
	 	<option value="buSan">부산</option>
	 	<option value="ulSan">울산/경남/제주</option>
	 	<option value="daeGu">대구</option>
	 	<option value="gyeongBuk">경북</option>
	 	<option value="gwangJu">광주/전라</option>
	 	<option value="daeJeon">대전/충청/세종</option>
	 	<option value="gangWon">강원</option> 
	 </select>
	 
	 <!-- 2차 분류 (보류 : 2018.04.12) -->
<!-- 	 <select class="form-control"> -->
<!-- 	 	<option>룸/풀싸롱</option>  -->
<!-- 	 	<option>노래방/나이트/바</option>  -->
<!-- 	 	<option>아로마</option>  -->
<!-- 	 	<option>출장마사지</option>  -->
<!-- 	 	<option>스포츠마사지</option> -->
<!-- 	 	<option>키스방</option> -->
<!-- 	 	<option>오피</option> -->
<!-- 	 	<option>휴게텔</option> -->
<!-- 	 	<option>기타업소</option>  -->
<!-- 	 </select> -->

	 <input type="text" class="form-control" id="usr">
	 <button type="button" class="btn">검색</button>
	 </form>		 
	 <!-- 게시글 시작 -->
	<table class="table table-hover">
		<thead class="main_tr">
			<tr>
				<th>번호</th>
<!-- 				<th>지역</th> -->
				<th></th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>날짜</th>
				<th>조회</th>
				<th>추천</th>				
			</tr>			
		</thead>
		<tbody>
		<c:forEach var="useafter" items="${useafter}" varStatus="status">
			<tr>
				<td>${useafter.no}</td>
				<td>[${useafter.location}]</td>
<%-- 				<td>[${useafter.business_type}]</td> --%>
				<td style="text-align: left;"><a href="board_read.do?no=${useafter.no }"> ${useafter.subject}</a></td>
				<td>${useafter.writer}</td>												
				<td>${useafter.dates}</td>
				<td>${useafter.hit}</td>
				<td>${useafter.recommand}</td>							
			</tr>
		</c:forEach>
		</tbody>
	</table>		
	<!-- 게시글 끝 -->
		<hr/>
		
		
		<a class="btn btn-default pull-right" href="fullssainsert.do?type=룸/풀싸롱">글쓰기</a>		
		<!-- 페이지 처리 시작 -->
		<div class="text-center">
			<ul class="pagination">
			<!-- 이전 페이지 처리 -->
						<c:if test="${pageMaker.prev }">
							<li><a href="fullssa.do?page=${pageMaker.startPage -1 }&business_type=룸/풀싸롱	">&laquo;</a></li>
						</c:if>
						
				<!-- 시작 페이지부터 끝 페이지까지 반복 처리 -->
						<c:forEach begin="${pageMaker.startPage }"
						 end="${pageMaker.endPage}" var="idx">
							<li ${pageMaker.cri.page==idx?"class='active'":"" }>
								<a href="fullssa.do${pageMaker.makeQuery(idx) }&business_type=룸/풀싸롱">${idx }</a>
							</li>
						</c:forEach>
						
				<!-- 다음 페이지 처리 -->
						<c:if test="${pageMaker.next }">
							<li><a href="fullssa.do?page=${pageMaker.endPage + 1 }&business_type=룸/풀싸롱">&raquo;</a></li>
						</c:if>
						
			</ul>
		</div>	
</body>
</html>