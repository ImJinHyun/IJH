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

<decorator:usePage id="thePage"/>
<% String selection = thePage.getProperty("meta.selection"); %>

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

<script>

</script>
<decorator:head />
</head>

<body>
<div class="all">
									
			<div class="header">
				<div class="warpheader">
				<div class="header_1">				
					<span><img src="/images/main4.png">&nbsp;18사단 공식트위터 <a>http://twitter.com/18sadan_com</a> 팔로우해주세요</span>
				</div>
				<div class="header_2">
					<a href="/Index/main.do"><img src="/images/main1.png" class="mainlogo1"></a>
					<a href="/Index/main.do"><img src="/images/main2.png"></a>
					<a href="/Index/main.do"><img src="/images/main3.png"></a>
				</div>
				<div class="header_3">
					<span class="ground1">유흥그라운드</span><img src="/images/main6.png"><p><span>구글에서</span><span class="ground2">유흥그라운드</span><span>를 검색해주세요</span></p>
				</div>
				<div class="header_4">
					<nav class="navbar navbar-inverse ">
					  <div class="container-fluid">
					    <ul class="nav navbar-nav">
					      <li><a href="/headmenu_all/jehyu.do" id="jehyu">제휴업소</a></li>
					      <li><a href="/headmenu_all/useafter.do">이용후기</a></li>
					      <li><a href="/headmenu_all/community.do">커뮤니티</a></li>
					      <li><a href="/headmenu_all/entertainment.do">엔터테인먼트</a></li>
					      <li><a href="/headmenu_all/uggallary.do" id="ugimage">유그이미지</a></li>
					      <li><a href="/headmenu_all/calendar.do">출석부</a></li>
					      <li><a href="/headmenu_all/eventzone.do">이벤트존</a></li>
					      <li><a href="/headmenu_all/servicecenter.do">고객센터</a></li>
					      <li><a href="/headmenu_all/contactus.do">제휴문의</a></li>
					    </ul>
					  </div>
					</nav>
				</div><!-- header_4 -->
				</div><!-- warpheader -->
			</div><!-- header -->
			
			<div class="bodya">
				<div class=wrapbody>
				<div class="left_body">
					<div class="login">
						  <form>
						    <div class="input-group">
						      <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
						      <input id="id" type="text" class="form-control" name="id" placeholder="id">
						    </div>
						    <div class="input-group">
						      <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
						      <input id="password" type="password" class="form-control" name="password" placeholder="Password">
						    </div>
						    <div class="checkbox">
						    	<label>
							    	<input type="checkbox" value="자동로그인">
							    	<span>자동로그인</span>						    	
							    </label>										   							
						   			<button type="button" class="btn btn-sm">로그인</button>
						   		<div class="member">				    	
							    	<a href="#" data-toggle="popover" data-content="고객센터로 문의해주세요^^" class="find1 ">아이디/비번찾기</a>
							    		<span class="find2">|</span>
							    	<a href="/member/member.do">회원가입</a>
						  		</div> 
						    </div>
						      
						  </form>  										
					</div><!-- login -->
			
			
				<div class="left_body_menu" id="left_body_menu">
						<div class="container">
						<div class="row">
							<div class="span6">						
							<ul class="nav nav-tabs nav-stacked">
								<li class="active">
								<li class="left_subject"><a href="#" onclick="return false;">a</a></li>
								<li><a href="/leftmenuboard/fullssa.do">룸/B</a></li>
								<li><a href="/leftmenuboard/songnightbar.do">C/나이트/바</a></li>
								<li><a href="/leftmenuboard/aroma.do">D</a></li>
								<li><a href="/leftmenuboard/masage.do">출장마사지</a></li>
								<li><a href="/leftmenuboard/sportsmasage.do">스포츠마사지</a></li>
								<li><a href="/leftmenuboard/kissroom.do">키스방</a></li>
								<li><a href="/leftmenuboard/office.do">오피</a></li>
								<li><a href="/leftmenuboard/resttel.do">휴게텔</a></li>
								<li><a href="/leftmenuboard/etc.do">기타업소</a></li>  
								<li><a href="/leftmenuboard/chat.do">채팅방링크</a></li>
								<li><a href="#" onclick="return false;">할인권현황</a></li> 
								<li><a href="#" onclick="return false;">초보자가이드</a></li> 
								<li><a href="#" onclick="return false;">공지사항</a></li>
								<li><a href="#" onclick="return false;">제휴업소</a></li>
								<li><a href="#" onclick="return false;">이벤트업소배너</a></li>
								<li class="left_subject"><a href="#" onclick="return false;">출근부PR</a></li>	
								<li><a href="/leftmenuboard/prfullssa.do">룸/풀싸롱PR</a></li>
								<li><a href="/leftmenuboard/prsongnightbar.do">노래방/나이트/바PR</a></li>
								<li><a href="/leftmenuboard/praroma.do">아로마PR</a></li>
								<li><a href="/leftmenuboard/prmasage.do">출장마사지PR</a></li>
								<li><a href="/leftmenuboard/prsportsmasage.do">스포츠마사지PR</a></li>
								<li><a href="/leftmenuboard/prkissroom.do">키스방PR</a></li>
								<li><a href="/leftmenuboard/proffice.do">오피PR</a></li>
								<li><a href="/leftmenuboard/prresttel.do">휴게텔PR</a></li>
								<li><a href="/leftmenuboard/pretc.do">기타업소PR</a></li> 
							</ul>						
						</div>
						</div>
						</div>	
				</div>
				
				<div class="login"><!-- 로그인했을시 화면 -->
					<div class="loing_after_all">
						<div class="login_after1">
							<div class="login_logo"><img src="/images/main1.png" width="70px" height="70px"></div>		
						</div><!-- login_after1끝 -->
						<div class="login_after2">
							<div class="login_nick_logo">
								<img src="/images/main1.png" width="30px" height="25px">
							</div><!-- login_nick_logo끝 -->
						
							<div class="nick">
								<span>울랄라비데</span>
							</div>
						</div><!-- login_nick_logo_all끝 -->
						<div class="login_point">
							<ul>
								<li><a href="#" onclick="return false;">쪽지 : 0</a></li>
								<li><a href="#" onclick="return false;">포인트 : 0</a></li>
								<li><a href="#" onclick="return false;">레벨 : 14</a></li>
							</ul>
						</div>	
					</div><!-- loing_after_all 끝 -->
					<div class="loing_after_all2">	
						  <button type="button" class="btn btn-primary">내글반응</button>
						  <button type="button" class="btn btn-primary">내가쓴글</button>
						  <button type="button" class="btn btn-primary">정보수정</button>
						  <button type="button" class="btn btn-primary">로그아웃</button>
					</div>
					
						  										
				</div><!-- login -->
				
				</div><!-- left_body -->
				<div class="wrapcenter_body">
					<div class="center_body">
						<article>
						
						<decorator:body />
						</article>
					</div>										
				</div>
				<div class="right_body">
					<div class="right_banner_all">
						<div class="banner_all"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
						<div class="banner_all"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
						<div class="banner_all"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
						<div class="banner_all"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
						<div class="banner_all"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
						<div class="banner_all"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
						<div class="banner_all"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
						<div class="banner_all"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
						<div class="banner_all"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
						<div class="banner_all"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>					
					</div>
					
				</div>
				
				<!-- right_body끝 -->
				</div>
				
			</div>
			<div style="clear: both;"></div>
			<!-- 푸터 -->
			<div class="footer">
  				<span>유흥그라운드</span>
			</div>
			<!-- 푸터 -->
		
		
</div><!-- div전체끝 -->
		
		
		
		

		


		
</body>
</html>