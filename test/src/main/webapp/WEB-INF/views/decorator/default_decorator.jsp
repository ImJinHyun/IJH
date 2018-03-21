<!-- sitemesh 사용을 위한 설정 파일 -->
<!-- 작성자 : 이영환 -->
<!-- 작성일 : 2017-01-12 -->
<!-- 최종수정일 : 2017-09-05 -->


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="decorator"
	uri="http://www.opensymphony.com/sitemesh/decorator"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!-- header.jsp 에서 복사해서 가져오세요. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>임진현프로젝트 | <decorator:title />
</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../resources/css/bootstrap.css">
<link rel="stylesheet" href="../resources/css/custom.css">
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="../resources/js/bootstrap.js"></script>
<script type="text/javascript">
//로그인시 사진, 비로그인 시 사진
$(function(){
		
	$("#profile").val() != null ? $(".userImage").attr("src","../download/displayFile?userImage=<c:out value='${login.userImage}'/>") : $(".userImage").attr("src","../resources/images/logo.gif") ;
});
</script>
<decorator:head />
</head>

<body>
<%-- 	<%
		// 		String userId = (String) session.getAttribute("userId");

		// 		세션 처리 (유저가 로그인시 세션처리) - 접속유무 파악
		String userId = null;
		if (session.getAttribute("userId") != null) {
			userId = (String) session.getAttribute("userId");
		}

		// 		로그인이 된 상태로 회원가입 페이지에 들어온다면 index.do로 돌려보냄
		if (userId != null) {
	%>
	alert("잘못된 경로 입니다.");
	<%
		session.setAttribute("messageType", "오류 메시지");
			session.setAttribute("messageContent", "현재 로그인이 되어 있는 상태입니다.");
			response.sendRedirect("index.do");
			return;
		}
	%>
 --%>
</body>
</html>