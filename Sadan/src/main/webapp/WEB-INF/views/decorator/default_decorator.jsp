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
	
<decorator:head />
</head>

<body>
<div class="all">
									
			<div class="header">
				<div class="header_1">				
					<span><img src="/resources/images/main4.png">&nbsp;18사단 공식트위터 <a>http://twitter.com/18sadan_com</a> 팔로우해주세요</span>
				</div>
				<div class="header_2">
					<img src="/resources/images/main1.png" class="mainlogo1">
					<img src="/resources/images/main2.png">
					<img src="/resources/images/main3.png">
				</div>
				<div class="header_3">
					<span class="ground1">유흥그라운드</span><img src="/resources/images/main6.png"><p><span>구글에서</span><span class="ground2">유흥그라운드</span><span>를 검색해주세요</span></p>
				</div>
				<div class="header_4">
					<nav class="navbar navbar-inverse ">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Page 1</a></li>
      <li><a href="#">Page 2</a></li>
      <li><a href="#">Page 3</a></li>
    </ul>
  </div>
</nav>
				</div>
			</div>
			
			<div class="bodya">
				<div class=wrapbody>
				<div class="left_body">
					<div class="login">로그인
					
					</div>
					<div class="left_body_menu">레프트바디메뉴
					
					</div>
				</div>
				<div class="wrapcenter_body">
					<div class="center_body">센터바디
						<article><decorator:body /></article>
					</div>
				</div>
				<div class="right_body">
				라이트바디
				</div>
				
				<!-- right_body끝 -->
				</div>
			</div>
			<div style="clear: both;"></div>
			<!-- 푸터 -->
		<div class="footer">
<!-- 			<div class="container" id="footer_container"> -->
<!-- 				<br> -->
<!-- 				<div class="row"> -->
<!-- 					<div class="col-sm-2" style="text-align: center;"><h5>CopyRight © 2018</h5><h5>임진현(JinHyun)</h5></div> -->
<!-- 					<div class="col-sm-4">대표자 소개<h4>저는 18SADAN대표 임진현입니다</h4></div> -->
<!-- 					<div class="col-sm-2"><h4 style="text-align: center;">네비게이션</h4> -->
<!-- 						<div class="list-group"> -->
<!-- 							<a href="#" class="list-group-item">소개</a> -->
<!-- 							<a href="#" class="list-group-item">임원진</a> -->
<!-- 							<a href="#" class="list-group-item">업소소개</a> -->
<!-- 						</div>	 -->
<!-- 					</div> -->
<!-- 					<div class="col-sm-2"><h4 style="text-align: center;">SNS</h4> -->
<!-- 						<div class="list-group"> -->
<!-- 							<a href="#" class="list-group-item">페이스북</a> -->
<!-- 							<a href="#" class="list-group-item">유투브</a> -->
<!-- 							<a href="#" class="list-group-item">네이버</a> -->
<!-- 						</div> -->
<!-- 					</div> -->
<!-- 					<div class="col-sm-2"><h4 style="text-align: center;"><span class="glyphicon glyphicon-ok"></span>&nbsp;by 임진현</h4></div> -->
<!-- 				</div> -->
<!-- 			</div>			 -->
		</div>
		<!-- 푸터 -->
		
</div><!-- div전체끝 -->		
		
		
		

		


		
</body>
</html>