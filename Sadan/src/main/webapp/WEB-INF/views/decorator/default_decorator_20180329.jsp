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
<title>18sadan | <decorator:title />
</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/resources/css/bootstrap.css">
		<link rel="stylesheet" href="/resources/css/18sadan.css">
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="/resources/js/bootstrap.js"></script>
<!-- 로그인 시 -->
<!-- <script type="text/javascript"> -->
<!-- $(function(){
		
 	$("#profile").val() != null ? $(".userImage").attr("src","../download/displayFile?userImage=<c:out value='${login.userImage}'/>") : $(".userImage").attr("src","../resources/images/logo.gif") ;
 });-->
<!-- </script> -->	

<decorator:head />
</head>

<body>

		<!--네비게이션바-->
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
						<span class="sr-only"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#"><span style="font-size: 16px;">18SADAN공식트위터</span><span class="address">&nbsp;https://www.18SADAN.com</span>&nbsp;<span>팔로우해주세요</span></a>
				</div>
                <button type="button" class="btn btn-sm btn-default navbar-right"
                		style=" padding-left: 0px;
							    border-left-width: 0px;
							    border-bottom-width: 0px;
							    padding-bottom: 0px;
							    padding-right: 0px;
							    padding-top: 0px;
							    border-top-width: 0px;
							    border-right-width: 0px;
							    margin-right: 0px;
								">
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav ">
						<li><a href="#">홈<span class="sr-only"></span></a></li>
						<li><a href="#">출석부</a></li>
						<li><a href="#">공지사항</a></li>
						<li><a href="#">고객문의(회원)</a></li>
						<li><a href="#">고객문의(업소)</a></li>
						<li><a href="#" class="jeyu">제휴문의</a></li>
						<!--드롭다운 메뉴 -->
						<!--<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">회원<span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">A</a></li>
								<li><a href="#">B</a></li>
								<li><a href="#">C</a></li>	
							</ul>
						</li>-->
						</ul>
						<!--<form class="navbar-form navbar-left">
							<div class="form-group">
								<input type="text" class="form-control" placeholder="내용을 입력하세요">
							</div>
							<button type="submit" class="btn btn-default">검색</button>
						</form>-->
						<!--<ul class="nav navbar-nav navbar-right">
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">접속하기<span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="#">A</a></li>
									<li><a href="#">B</a></li>
								</ul>
							</li>						
						</ul>-->
						<!--드롭다운 메뉴 -->
					</div>
                </button>
				</div>
		</nav>

		<!--네비게이션바-->

		<!--메인화면 점보트론-->
		<div class="container" id="main_container">
			<div class="headmain">	
			<ul>
				<li><div class="header_logo"><h1><a href="." onfocus="this.blur()"></a></h1></div></li>
				<li><img src="/resources/images/main1.png"></li>
				<li><img src="/resources/images/main2.png"></li>
				<li><img src="/resources/images/main3.png"></li>
			</ul>
			
			</div>
			</div>
			
<!-- 			<div class="jumbotron"> -->
<!-- 				<h1 class="text-center">18SADAN에 오신것을 환영합니다</h1> -->
<!-- 				<p class="text-center">18SADAN은 다양한 정보를 제공합니다</p> -->
<!-- 				<p class="text-center"><a class="btn btn-primary btn-lg" href="#" role="button">18사단 가입하기</a></p> -->
<!-- 			</div>	 -->
		
	<div style="width: 100%; background-color: #000000;">
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" style="margin: 0 auto; width: 1170px; padding: 0 0 0 0;" >
			<div class="navbar navbar-default" style="margin-bottom: 0px;">
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav" >
							<li><a href="#" class="jeyu">제휴업소<span class="sr-only"></span></a></li>
							<li><a href="#">이용후기</a></li>
							<li><a href="#">커뮤니티</a></li>
							<li><a href="#">엔터테인먼트</a></li>
							<li><a href="#">갤러리</a></li>
							<li><a href="#">고렙존</a></li>
							<li><a href="#">출석부</a></li>
							<li><a href="#">이벤트존</a></li>
							<li><a href="#">고객센터</a></li>
							<li><a href="#">제휴문의</a></li>					
						</ul>
				</div>			
			</div>
		</div>
	</div>
	<div style="width: 100%; background-color: #000000;">
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" style="margin: 0 auto; width: 1170px; padding: 0 0 0 0; " >
			<div class="navbar navbar-default1" style="margin-bottom: 0px; ">
					<p>구글에서 <br/><span>유흥그라운드</span>를 검색해주세요</p><img src="/resources/images/main5.png">
					<p class="nineteen">*유흥그라운드는 성인전용 커뮤니티입니다.미성년자는 일체 접근 불허하며, 현자들의 세계에 오신걸  환영합니다.*</p>
			</div>
		</div>
	</div>
	<div style="width: 100%; background-color: red;">
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" style="margin: 0 auto; width: 1170px; padding: 0 0 0 0;">
			<div class="navbar navbar-default" style="margin-bottom: 0px; background-color: red;  border: 0;">
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" style="background-color: red;">
						<ul class="nav navbar-nav" >
							<li><img src="/resources/images/main2.png"></li>
							<li><img src="/resources/images/main2.png"></li>
							<li><img src="/resources/images/main2.png"></li>
							<li><img src="/resources/images/main2.png"></li>
							<li><img src="/resources/images/main2.png"></li>
							<li><img src="/resources/images/main2.png"></li>
							<li><img src="/resources/images/main2.png"></li>
							<li><img src="/resources/images/main2.png"></li>
							<li><img src="/resources/images/main2.png"></li>
							<li><img src="/resources/images/main2.png"></li>								
						</ul>
				</div>			
			</div>
		</div>
	</div>

	<div class="container" style="width: 1170px; height: 1000px; border: 0;" >

		<div class="top_bar">			
		</div>
		<!--왼쪽바디-->
		<div class="left_body">
			<!--로그인 바디-->
			<div class="login_all">
				<!--아이디-->
				<input type="text" name="id" id="id" class="id">								
				<!--패스워드-->
				<input type="password" name="pw" id="pw" class="pw">									
				<!--자동로그인체크-->
				<div class="auto_login_all">
				<input type="checkbox" name="auto_login" id="auto_login">
					<span>자동로그인</span>
				<input type="submit" name="login" id="login" value="로그인" style="float: right; margin: 0; background-color:#18007C; color:#ffffff; width: 70px;">	
			</div>
			<!--아이디/비밀번호찾기 및 회원가입-->
			<div class="login_all2">
				<span><a href="#">아이디/비번찾기</a></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<span class="member_join"><a href="#">회원가입</a></span>
			</div>	
		</div>
		<!--좌측메뉴-->
		<table class="left_menu_all" >
				<tr>
					<td><a>채팅방링크</a></td>
				</tr>
				<tr>
					<td><a>할인권현황</a></td>
				</tr>
				<tr>
					<td><a>초보자가이드</a></td>
				</tr>
				<tr>
					<td><a>공지사항</a></td>
				</tr>
				<tr>
					<td><a>제휴업소</a></td>
				</tr>
				<tr>
					<td><a>출근부PR</a></td>
				</tr>
				<tr>
					<td><a>이벤트업소배너</a></td>
				</tr>
		</table>
			<!--가운데 바디-->
			<div class="center_body">
			
								<decorator:body />
			
			
				<!--오른쪽 바디-->
				<div class="right_body_all">
					<div class="right_body">
						<img src="./images/banner1.png">
						<img src="./images/banner2.jpg">
						<img src="./images/banner1.png">
						<img src="./images/banner2.jpg">
						<img src="./images/banner1.png">
						<img src="./images/banner2.jpg">
						<img src="./images/banner1.png">
						<img src="./images/banner2.jpg">
						<img src="./images/banner1.png">
						<img src="./images/banner2.jpg">
						<img src="./images/banner1.png">
						<img src="./images/banner2.jpg">					
					</div>
				</div>
			</div>
		</div>				
	</div>



	<div class="bottom_bar">			
	</div>	
		<!--메인화면 점보트론-->
	
	

		
		<!-- 푸터 -->
		<footer class="footer">
			<div class="container" id="footer_container">
				<br>
				<div class="row">
					<div class="col-sm-2" style="text-align: center;"><h5>CopyRight © 2018</h5><h5>임진현(JinHyun)</h5></div>
					<div class="col-sm-4">대표자 소개<h4>저는 18SADAN대표 임진현입니다</h4></div>
					<div class="col-sm-2"><h4 style="text-align: center;">네비게이션</h4>
						<div class="list-group">
							<a href="#" class="list-group-item">소개</a>
							<a href="#" class="list-group-item">임원진</a>
							<a href="#" class="list-group-item">업소소개</a>
						</div>	
					</div>
					<div class="col-sm-2"><h4 style="text-align: center;">SNS</h4>
						<div class="list-group">
							<a href="#" class="list-group-item">페이스북</a>
							<a href="#" class="list-group-item">유투브</a>
							<a href="#" class="list-group-item">네이버</a>
						</div>
					</div>
					<div class="col-sm-2"><h4 style="text-align: center;"><span class="glyphicon glyphicon-ok"></span>&nbsp;by 임진현</h4></div>
				</div>
			</div>			
		</footer>
		<!-- 푸터 -->



	 <!-- %
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
	<!-- %
		session.setAttribute("messageType", "오류 메시지");
			session.setAttribute("messageContent", "현재 로그인이 되어 있는 상태입니다.");
			response.sendRedirect("index.do");
			return;
		}
		
	%> -->
	
				

		
	

</body>
</html>