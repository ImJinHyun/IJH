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
				<span>${business_type }</span>							
			</div>
		</div>
	</div>
	<!-- 검색 시작 -->
	<form action="fullssa.do?business_type=${business_type }">
	<input type="hidden" name="page" value="1"/>
			<input type="hidden" name="perPageNum" value="${pageMaker.cri.perPageNum }"/>
			
			<!-- 1차 분류 -->
	<select class="form-control" name="location">
		<option value="n" ${pageMaker.cri.location == null or cri.location == "n"?"selected='selected'":"" } >전체</option>
	 	<option value="강남" ${pageMaker.cri.location =="강남"?"selected='selected'":"" }>강남</option> 
	 	<option value="비강남"${pageMaker.cri.location =="비강남"?"selected='selected'":"" }>비강남</option> 
	 	<option value="인천"${pageMaker.cri.location =="인천"?"selected='selected'":"" }>인천</option> 
	 	<option value="경기"${pageMaker.cri.location =="경기"?"selected='selected'":"" }>경기</option> 
	 	<option value="부산" ${pageMaker.cri.location =="부산"?"selected='selected'":"" }>부산</option>
	 	<option value="울산" ${pageMaker.cri.location =="울산"?"selected='selected'":"" }>울산/경남/제주</option>
	 	<option value="대구" ${pageMaker.cri.location =="대구"?"selected='selected'":"" }>대구</option>
	 	<option value="경북" ${pageMaker.cri.location =="경북"?"selected='selected'":"" }>경북</option>
	 	<option value="광주" ${pageMaker.cri.location =="광주"?"selected='selected'":"" }>광주/전라</option>
	 	<option value="대전" ${pageMaker.cri.location =="대전"?"selected='selected'":"" }>대전/충청/세종</option>
	 	<option value="강원" ${pageMaker.cri.location =="강원"?"selected='selected'":"" }>강원</option> 
	 </select>
	 
	 <!-- 2차 분류 (보류 : 2018.04.12) -->
	 <select class="form-control" name="business_type">
	 <option value="n" ${pageMaker.cri.business_type == null or cri.business_type == "n"?"selected='selected'":"" } >전체</option>
	 <option value="룸/풀싸롱" ${pageMaker.cri.business_type == "룸/풀싸롱"?"selected='selected'":"" } >룸/풀싸롱</option>
	 <option value="노래방/나이트/바" ${pageMaker.cri.business_type == "노래방/나이트/바"?"selected='selected'":"" } >노래방/나이트/바</option>
	 <option value="아로마" ${pageMaker.cri.business_type == "아로마"?"selected='selected'":"" } >아로마</option>
	 <option value="출장마사지" ${pageMaker.cri.business_type == "출장마사지"?"selected='selected'":"" } >출장마사지</option>
	 <option value="스포츠마사지" ${pageMaker.cri.business_type == "스포츠마사지"?"selected='selected'":"" } >스포츠마사지</option>
	 <option value="키스방" ${pageMaker.cri.business_type == "키스방"?"selected='selected'":"" } >키스방</option>
	 <option value="오피" ${pageMaker.cri.business_type == "오피"?"selected='selected'":"" } >오피</option>
	 <option value="휴게텔" ${pageMaker.cri.business_type == "휴게텔"?"selected='selected'":"" } >휴게텔</option>
	 <option value="기타업소" ${pageMaker.cri.business_type == "기타업소"?"selected='selected'":"" } >기타업소</option>
	 </select>

	<!-- 3차 분류 (보류 : 2018.04.17) -->
	 <select class="form-control" name="searchType">
	 <option value="n" ${pageMaker.cri.searchType == null or cri.business_type == "n"?"selected='selected'":"" } >---</option>
	 <option value="t" ${pageMaker.cri.searchType== "t"?"selected='selected'":"" } >제목</option>
	 <option value="c" ${pageMaker.cri.searchType == "c"?"selected='selected'":"" } >내용</option>
	 <option value="w" ${pageMaker.cri.searchType == "w"?"selected='selected'":"" } >작성자</option>
	 <option value="tc" ${pageMaker.cri.searchType == "tc"?"selected='selected'":"" } >제목 + 내용</option>
	 <option value="tw" ${pageMaker.cri.searchType == "tw"?"selected='selected'":"" } >제목 + 작성자</option>
	 <option value="cw" ${pageMaker.cri.searchType == "cw"?"selected='selected'":"" } >내용 + 작성자</option>
	 <option value="tcw" ${pageMaker.cri.searchType == "tcw"?"selected='selected'":"" } >전체</option>
	 </select>

	 <input name="keyword" value="${pageMaker.cri.keyword }" />
	 <button type="submit" class="btn">검색</button>
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

			<tr id="${status.index }">
				<td>${(pageMaker.totalCount - status.index)-((pageMaker.cri.page-1)*pageMaker.cri.perPageNum)}</td>
				<td>[${useafter.location}]</td>
<%-- 				<td>[${useafter.business_type}]</td> --%>
				<td style="text-align: left;"><a href="board_read.do?no=${useafter.no }"> ${useafter.subject}</a></td>
				<td>${useafter.writer}</td>												
				<td>${useafter.dates}</td>
				<td>${useafter.hit}</td>
				<td>${useafter.recommand}</td>							
			</tr>
			
			<script type="text/javascript">
			//	if(${useafter.answer_seq} > 0){
					//$("#${status.index}").children("#wrap_reply").before("<div class='answer'>RE : </div>");
		//		};
			</script>
		</c:forEach>
		</tbody>
	</table>		
	<!-- 게시글 끝 -->
		<hr/>
		
		
		<a class="btn btn-default pull-right" href="fullssainsert.do?business_type=${business_type }">글쓰기</a>		
		<!-- 페이지 처리 시작 -->
		<div class="text-center">
			<ul class="pagination">
			<!-- 이전 페이지 처리 -->
						<c:if test="${pageMaker.prev }">
							<li><a href="fullssa.do?page=${pageMaker.startPage -1 }&location=${pageMaker.cri.location }&business_type=룸/풀싸롱	">&laquo;</a></li>
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
							<li><a href="fullssa.do?page=${pageMaker.endPage + 1 }&location=${pageMaker.cri.location }&business_type=룸/풀싸롱">&raquo;</a></li>
						</c:if>
						
			</ul>
		</div>	
</body>
</html>