<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커뮤니티</title>
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
		    <c:forEach var="board" items="${commu0 }" varStatus="status" begin="0" end="6">
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
				<span>가입인사(등업)</span>
				<span><a href="#" onclick="return false;" class="more">more</a></span>			
			</div>
		</div>
		
		<div class="table-responsive">          
		  <table class="table table-hover" style="margin-bottom:0px;">
		    <tbody>
		    <c:forEach var="board" items="${commu1 }" varStatus="status" begin="0" end="6">
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
				<span>질문및답변</span>
				<span><a href="#" onclick="return false;" class="more">more</a></span>			
			</div>
		</div>
		
		<div class="table-responsive">          
		  <table class="table table-hover" style="margin-bottom:0px;">
		    <tbody>
		    <c:forEach var="board" items="${commu2 }" varStatus="status" begin="0" end="6">
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
				<span>정모와번개</span>
				<span><a href="#" onclick="return false;" class="more">more</a></span>			
			</div>
		</div>
		
		<div class="table-responsive">          
		  <table class="table table-hover" style="margin-bottom:0px;">
		    <tbody>
		    <c:forEach var="board" items="${commu3 }" varStatus="status" begin="0" end="6">
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
				<span>자유게시판</span>
				<span><a href="#" onclick="return false;" class="more">more</a></span>			
			</div>
		</div>
		
		<div class="table-responsive">          
		  <table class="table table-hover" style="margin-bottom:0px;">
		    <tbody>
		    <c:forEach var="board" items="${commu4 }" varStatus="status" begin="0" end="6">
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
				<span>여우게시판</span>
				<span><a href="#" onclick="return false;" class="more">more</a></span>			
			</div>
		</div>
		
		<div class="table-responsive">          
		  <table class="table table-hover" style="margin-bottom:0px;" >
		    <tbody>
		    <c:forEach var="board" items="${commu5 }" varStatus="status" begin="0" end="6">
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
				<span>구인</span>
				<span><a href="#" onclick="return false;" class="more">more</a></span>			
			</div>
		</div>
		
		<div class="table-responsive">          
		  <table class="table table-hover" style="margin-bottom:0px;" >
		    <tbody>
		    <c:forEach var="board" items="${commu6 }" varStatus="status" begin="0" end="6">
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