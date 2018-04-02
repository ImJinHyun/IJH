<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 테스트 글 목록 페이지</title>
</head>
<body>

<div class="container table-reponsive" style="width:670px">
  <h2>베이스가 될 기본 게시판 양식</h2>
  <p>The .table-striped class adds zebra-stripes to a table:</p>        
        
<!--  글 검색하는 곳입니다.  -->
         <div id="infoArea">
           <section class="search">
              
           <form name="search" action="#서블렛주소" method="post" >
            <fieldset>
              <legend></legend>
                  <label for="keyword"></label> 
                  
                  <select name="keyfield" class="b_search">
                  
                  <option value="all" selected="selected">전체 검색</option>
                  <option value="event_title"
                     <c:if test="${'title' == keyfield}">selected="selected"</c:if>>제목</option>
                  <option value="event_writer"
                      <c:if test="${'writer' == keyfield}">selected="selected"</c:if>>작성자</option>
                  <option value="event_content"
                      <c:if test="${'content' == keyfield}">selected="selected"</c:if>>내용</option>
                  </select>
                     
                  <input type="search" id="keyword" name="keyword" required="required" placeholder="검색어 입력">
                  <button type="submit">검색</button>
            </fieldset>
            </form>
            </section>
         </div>

     
  <table class="table table-hover" >
    <thead>
      <tr>
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>등록일</th>
        <th>조회수</th>
      </tr>
    </thead>
    <tbody>
    
    <!-- c:foreach [var =jsp에서 사용할 변수명 | items = 자바에서 넘어오는 변수명 | varstatus = 반복문의 위치를 확인함-->
    <c:forEach var="board" items="${board}" varStatus="status">
      <tr>
        <td>${board.no }</td>
        <td><a href="read.do?no=${board.no}">${board.subject }</a></td>
        <td>${board.writer }</td>
        <td>${board.date }</td>
        <td>${board.hit }</td>
      </tr>
    </c:forEach>
     </tbody>
  </table>
</div>

서버 도메인명 : <%=request.getServerName( ) %> <br/>
서버 포트번호 : <%=request.getServerPort( ) %> <br/>
요청 URL : <%=request.getRequestURL( ) %> <br/>
요청 URI : <%=request.getRequestURI( ) %> <br/>
요청 쿼리 : <%=request.getQueryString( ) %> <br/>
클라이언트 호스트명 : <%=request.getRemoteHost( ) %> <br/>
클라이언트 IP 주소 : <%=request.getRemoteAddr( ) %> <br/>
프로토콜 : <%=request.getProtocol( ) %> <br/>
요청방식 : <%=request.getMethod( ) %> <br/>
컨텍스트 경로 : <%=request.getContextPath( ) %> <br/>

 <div id="contentsArea">
      <section id="titlename" class="qnaBoard">
         <h1>SweetNam 이벤트 게시판</h1>
         
<!--          이벤트 글 검색하는 곳입니다.  -->
         <div id="infoArea">
           <section class="search">
              
           <form name="search" action="./event_search_list.event" method="post" >
            <fieldset>
              <legend></legend>
                  <label for="keyword"></label> 
                  
                  <select name="keyfield" class="b_search">
                  
                  <option value="all" selected="selected">전체 검색</option>
                  <option value="event_title"
                     <c:if test="${'title' == keyfield}">selected="selected"</c:if>>제목</option>
                  <option value="event_writer"
                      <c:if test="${'writer' == keyfield}">selected="selected"</c:if>>작성자</option>
                  <option value="event_content"
                      <c:if test="${'content' == keyfield}">selected="selected"</c:if>>내용</option>
                  </select>
                     
                  <input type="search" id="keyword" name="keyword" required="required" placeholder="검색어 입력">
                  <button type="submit">검색</button>
            </fieldset>
            </form>
            </section>
         </div>
         
         
<!--          전체 글 개수 출력 -->
         <p class="allPost">
            전체 글: &nbsp; <strong><c:out value="${listcount}" /> </strong>개
         </p>
         
         
<!--          이벤트 게시판 내용 -->
<div align="center" class="table-reponsive">
         <table class="table table-hover">
            <caption>이벤트 리스트</caption>
            <c:choose>
               <c:when test="${listcount>0}">
                  <thead>
                     <tr>
                        <th scope="col" class="bbsNumber">번호</th>
                        <th scope="col" class="bbsTitle">제목</th>
                        <th scope="col" class="bbsTitle">내용</th>
                        <th scope="col" class="bbsAuthor">글쓴이</th>
                        <th scope="col" class="bbsDate">등록일</th>
                        <th scope="col" class="bbsHit">조회수</th>
                     </tr>
                  </thead>
                  
                  <c:forEach var="board" items="${event_List}" varStatus="status">
                     <tbody>
                        <tr>
                           <td><c:out value="${board.event_no}" /></td>
                           <td><a href="./EventViewService.event?num=<c:out value="${board.event_no}" />">
                                <c:out value="${board.event_title}" /></a></td>
                           <td><c:out value="${board.event_content}" /></td>
                           <td><c:out value="${board.event_writer}" /></td>
                           <td><c:out value="${board.event_date}" /></td>
                           <td><c:out value="${board.event_hit}" /></td>
      					</tr>
				  </c:forEach>
                            <c:out value="${board.event_title}" />
                  	</tbody>
               </c:when>
            </c:choose>
         </table>
        </div> 
         
         <div align="center">
            <table id="boardTableNe" class="boardTableNe">
               <tbody>
                  <c:if test="${searchlistcount==0}">
                     <tr>
                        <td colspan="4"></td>
                        <td>등록된 글이 없습니다.</td>
                     </tr>
                  </c:if>
                  
<!--                  글 목록 이동하기 -->
                 	 <tr>
                     <td colspan="5">
                     <c:choose>
                           <c:when test="${page <= 1}"> [이전]&nbsp; </c:when>
                           <c:otherwise>
                              <a href="./event_list.event?page=<c:out value="${page-1}"/>">[이전]</a>&nbsp;
							</c:otherwise>
                      </c:choose> 
                      
                        <c:forEach var="start" begin="${startpage}" end="${endpage}" step="1">
                          <c:choose>
                            <c:when test="${start eq page}"> [<c:out value="${start}" />] </c:when>
                              <c:otherwise>
                                 <a href="./event_list.event?page=<c:out value="${start}" />">
                                 [<c:out value="${start}" />]
                                 </a>&nbsp;
							   </c:otherwise>
                           </c:choose>
                        </c:forEach> 
                        
                        <c:choose>
                           <c:when test="${page >= maxpage}">[다음] </c:when>
                           <c:otherwise>
                              <a href="./event_list.event?page=<c:out value="${page+1}" />">[다음]</a>
                           </c:otherwise>
                        </c:choose>
                      </td>
                 	 </tr>
               </tbody>
            </table>
            
<!--             글쓰기 페이지로 이동 -->
            <div class="btnJoinAreb">
               <button type="button" value="button"
                onclick="location.href='./write.do'" class="btnOk">글쓰기</button>
            </div>
         </div>
      </section>
   </div>
</body>
</html>
