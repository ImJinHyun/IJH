<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제휴문의</title>
<link rel="stylesheet" href="/resources/css/enter.css">

</head>
<body>
		<div class="board_all">
		<div class="board_subject">
			<div class="board_main_subject">			
				<span>제휴문의</span>
				<span><a href="#" onclick="return false;" class="more">more</a></span>			
			</div>
		</div>
		
			<div class="table-responsive">          
		  <table class="table table-hover" style="margin-bottom:0px;">
		    <tbody>
		    <c:forEach var="board" items="${ques0 }" varStatus="status" begin="0" end="1">
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