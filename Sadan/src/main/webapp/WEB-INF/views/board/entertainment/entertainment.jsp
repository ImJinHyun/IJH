<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>엔터테인먼트페이지</title>
<link rel="stylesheet" href="/resources/css/enter.css">
</head>
<body>
	<div class="board_all">
		<div class="board_subject">
			<div class="board_main_subject">			
				<span>토렌토</span>
				<span><a href="#" onclick="return false;" class="more">more</a></span>			
			</div>
		</div>
		
		<div class="table-responsive">          
		  <table class="table table-hover" style="margin-bottom:0px;">
		    <tbody>
		    <c:forEach var="board" items="${enter0 }" varStatus="status" begin="0" end="5">
		      <tr>
		        <td>${board.dates }</td>
		        <td><a href="board_read.do?no=${board.no }" class="more">${board.subject }</a></td>
		        <td>${board.writer }</td>
		      </tr>		     
		      </c:forEach>  
		    </tbody>
		  </table>
  		</div>
	</div><!-- board_all끝 -->
	
	<div class="board_all">
		<div class="board_subject">
			<div class="board_main_subject">			
				<span>움짤/동영상</span>
				<span><a href="#" onclick="return false;" class="more">more</a></span>			
			</div>
		</div>
		
		<div class="table-responsive">          
		  <table class="table table-hover" style="margin-bottom:0px;">
		    <tbody>
		    <c:forEach var="board" items="${enter1 }" varStatus="status" begin="0" end="5">
		      <tr>
		        <td>${board.dates }</td>
		        <td><a href="board_read.do?no=${board.no }" class="more">${board.subject }</a></td>
		        <td>${board.writer }</td>
		      </tr>		     
		      </c:forEach>  
		    </tbody>
		  </table>
  		</div>
	</div><!-- board_all끝 -->
	
	<div class="board_all">
		<div class="board_subject">
			<div class="board_main_subject">			
				<span>웹툰게시판</span>
				<span><a href="#" onclick="return false;" class="more">more</a></span>			
			</div>
		</div>
		
		<div class="table-responsive">          
		  <table class="table table-hover" style="margin-bottom:0px;">
		    <tbody>
		    <c:forEach var="board" items="${enter2 }" varStatus="status" begin="0" end="5">
		      <tr>
		        <td>${board.dates }</td>
		        <td><a href="board_read.do?no=${board.no }" class="more">${board.subject }</a></td>
		        <td>${board.writer }</td>
		      </tr>		     
		      </c:forEach>  
		    </tbody>
		  </table>
  		</div>
	</div><!-- board_all끝 -->
	
	<div class="board_all">
		<div class="board_subject">
			<div class="board_main_subject">			
				<span>유머게시판</span>
				<span><a href="#" onclick="return false;" class="more">more</a></span>			
			</div>
		</div>
		
		<div class="table-responsive">          
		  <table class="table table-hover" style="margin-bottom:0px;">
		    <tbody>
		    <c:forEach var="board" items="${enter3 }" varStatus="status" begin="0" end="5">
		      <tr>
		        <td>${board.dates }</td>
		        <td><a href="board_read.do?no=${board.no }" class="more">${board.subject }</a></td>
		        <td>${board.writer }</td>
		      </tr>		     
		      </c:forEach>  
		    </tbody>
		  </table>
  		</div>
	</div><!-- board_all끝 -->
	
	<div class="board_all">
		<div class="board_subject">
			<div class="board_main_subject">			
				<span>매거진</span>
				<span><a href="#" onclick="return false;" class="more">more</a></span>			
			</div>
		</div>
		
		<div class="table-responsive">          
		  <table class="table table-hover" style="margin-bottom:0px;">
		    <tbody>
		    <c:forEach var="board" items="${enter4 }" varStatus="status" begin="0" end="5">
		      <tr>
		        <td>${board.dates }</td>
		        <td><a href="board_read.do?no=${board.no }" class="more">${board.subject }</a></td>
		        <td>${board.writer }</td>
		      </tr>		     
		      </c:forEach>  
		    </tbody>
		  </table>
  		</div>
	</div><!-- board_all끝 -->
	
	<div class="board_all">
		<div class="board_subject">
			<div class="board_main_subject">			
				<span>맛집</span>
				<span><a href="#" onclick="return false;" class="more">more</a></span>			
			</div>
		</div>
		
		<div class="table-responsive">          
		  <table class="table table-hover" style="margin-bottom:0px;" >
		    <tbody>
		    <c:forEach var="board" items="${enter5 }" varStatus="status" begin="0" end="5">
		      <tr>
		        <td>${board.dates }</td>
		        <td><a href="board_read.do?no=${board.no }" class="more">${board.subject }</a></td>
		        <td>${board.writer }</td>
		      </tr>
		      </c:forEach>  
		    </tbody>
		  </table>
  		</div>
	</div><!-- board_all끝 -->
	
</body>
</html>