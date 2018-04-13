<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>토렌트</title>
<link rel="stylesheet" href="/resources/css/chatinglink.css">
<link rel="stylesheet" href="/resources/css/jeyu.css">
<link rel="stylesheet" href="/resources/css/pr.css">

</head>
<body>
	<div class="prfullssa_all">
		<div class="board_subject">
			<div class="board_main_subject">			
				<span>토렌트</span>							
			</div>
		</div>
	</div>
	<div>
	<select class="form-control">
	 	<option>제목</option> 
	 	<option>내용</option> 
	 	<option>제목+내용</option> 
	 	<option>글쓴이</option> 
	 	<option>글쓴이(코)</option>
<!-- 	 	<option>울산/경남/제주</option> -->
<!-- 	 	<option>대구</option> -->
<!-- 	 	<option>경북</option> -->
<!-- 	 	<option>광주/전라</option> -->
<!-- 	 	<option>대전/충청/세종</option> -->
<!-- 	 	<option>강원</option>  -->
	 </select>
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
	 </div>		 
	<table class="table table-hover">
		<thead class="main_tr">
			<tr>
				<th>번호</th>
<!-- 				<th>지역</th> -->
<!-- 				<th></th> -->
				<th>제목</th>
				<th>글쓴이</th>
				<th>날짜</th>
				<th>조회</th>
				<th>추천</th>				
			</tr>			
		</thead>
		<tbody>
		<c:forEach var="entertainment" items="${entertainment}" varStatus="status">
			<tr>
				<td>${entertainment.no}</td>
				<td><a href="board_read.do?no=${entertainment.no }"> ${entertainment.subject}</a></td>
				<td>${entertainment.writer}</td>
				<td>${entertainment.dates}</td>
				<td>${entertainment.hit}</td>
				<td>${entertainment.recommand}</td>	
<%-- 				<td>[${entertainment.location}]</td> --%>
<%-- 				<td>[${entertainment.business_type}]</td> --%>
<%-- 				<td style="text-align: left;"><a href="board_read.do?no=${entertainment.no }"> ${entertainment.subject}</a></td> --%>
																
				
				
										
			</tr>
		</c:forEach>
		</tbody>
	</table>		
		<hr/>
		<a class="btn btn-default pull-right" href="torentoinsert.do?type=토렌트">글쓰기</a>		
		<div class="text-center">
			<ul class="pagination">
			<!-- 이전 페이지 처리 -->
						<c:if test="${pageMaker.prev }">
							<li><a href="torento.do?page=${pageMaker.startPage -1 }&business_type=토렌트">&laquo;</a></li>
						</c:if>
						
						<!-- 시작 페이지부터 끝 페이지까지 반복 처리 -->
						<c:forEach begin="${pageMaker.startPage }"
						 end="${pageMaker.endPage}" var="idx">
							<li ${pageMaker.cri.page==idx?"class='active'":"" }>
								<a href="torento.do${pageMaker.makeQuery(idx) }&business_type=토렌트">${idx }</a>
							</li>
						</c:forEach>
						
				<!-- 다음 페이지 처리 -->
						<c:if test="${pageMaker.next }">
							<li><a href="torento.do?page=${pageMaker.endPage + 1 }&business_type=토렌트">&raquo;</a></li>
						</c:if>
			</ul>
		</div>	
</body>
</html>