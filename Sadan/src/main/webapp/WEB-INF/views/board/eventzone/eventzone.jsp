<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이벤트존</title>
<link rel="stylesheet" href="/resources/css/enter.css">

</head>
<body>
		<div class="board_all">
		<div class="board_subject">
			<div class="board_main_subject">			
				<span>공지사항</span>
				<span><a href="#" onclick="return false;" class="more">more</a></span>			
			</div>
		</div>
		
			<div class="table-responsive">          
		  <table class="table table-hover" style="margin-bottom:0px;">
		    <tbody>
		    <c:forEach var="board" items="${event0 }" varStatus="status" begin="0" end="6">
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
				<span>유그이벤트</span>
				<span><a href="#" onclick="return false;" class="more">more</a></span>			
			</div>
		</div>
		
		<div class="table-responsive">          
		  <table class="table table-hover" style="margin-bottom:0px;">
		    <tbody>
		    <c:forEach var="board" items="${event1 }" varStatus="status" begin="0" end="6">
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
				<span>개별업소이벤트</span>
				<span><a href="#" onclick="return false;" class="more">more</a></span>			
			</div>
		</div>
		
		<div class="table-responsive">          
		  <table class="table table-hover" style="margin-bottom:0px;">
		    <tbody>
		    <c:forEach var="board" items="${event2 }" varStatus="status" begin="0" end="6">
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
				<span>고렙이벤트</span>
				<span><a href="#" onclick="return false;" class="more">more</a></span>			
			</div>
		</div>
		
		<div class="table-responsive">          
		  <table class="table table-hover" style="margin-bottom:0px;">
		    <tbody>
		    <c:forEach var="board" items="${event3 }" varStatus="status" begin="0" end="6">
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