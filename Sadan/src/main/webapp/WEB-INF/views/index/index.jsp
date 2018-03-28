<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DB테스트</title>
<script type="text/javascript">
$(document).ready(function(){
	   
	  $('ul.tabs li').click(function(){
	    var tab_id = $(this).attr('data-tab');
	 
	    $('ul.tabs li').removeClass('current');
	    $('.tab-content').removeClass('current');
	 
	    $(this).addClass('current');
	    $("#"+tab_id).addClass('current');
	  })
	 
	})
</script>
</head>
<body>
	<div class="container" id="body_container">
		<div class="body_top_banner_all">
			<ul>
				<li class="main_domain_banner1"></li>
				<li class="main_domain_banner2"></li>
			</ul>
		</div>
	
	<div>

<!--   <!--  Nav tabs-->  -->
<!--  <div class="tab-content"> -->
<!--   <ul class="nav nav-tabs" role="tablist"> -->
<!--     <li role="presentation"><a href="#Gangnam" aria-controls="Gangnam" role="tab" data-toggle="tab">강남</a> -->
 
<!--     </li> -->
<!--     <li role="presentation"><a href="#Nongangnam" aria-controls="Nongangnam" role="tab" data-toggle="tab">비강남</a></li> -->
<!--     <li role="presentation"><a href="#Incheon" aria-controls="Incheon" role="tab" data-toggle="tab">인천</a></li> -->
<!--     <li role="presentation"><a href="#Busan" aria-controls="Busan" role="tab" data-toggle="tab">부산</a></li> -->
<!--     <li role="presentation"><a href="#Gyeonggido" aria-controls="Gyeonggido" role="tab" data-toggle="tab">경기</a></li> -->
<!--     <li role="presentation"><a href="#UKJ" aria-controls="UKJ" role="tab" data-toggle="tab">울산/경남/제주</a></li> -->
<!--     <li role="presentation"><a href="#Teagu" aria-controls="Teagu" role="tab" data-toggle="tab">대구</a></li> -->
<!--     <li role="presentation"><a href="#Kyungbuk" aria-controls="Kyungbuk" role="tab" data-toggle="tab">경북</a></li> -->
<!--     <li role="presentation"><a href="#Jeolla" aria-controls=Jeolla role="tab" data-toggle="tab">광주/전라</a></li> -->
<!--     <li role="presentation"><a href="#DCS" aria-controls="DCS" role="tab" data-toggle="tab">대전/충청/세종</a></li> -->
<!--   </ul> -->
 
  
<!--   <!--  Tab panes-->  -->
 
   
<!--   <div role="tabpanel" class="tab-pane" id="Nongangnam">비강남</div> -->
<!--   <div role="tabpanel" class="tab-pane" id="Incheon">인천</div> -->
<!--   <div role="tabpanel" class="tab-pane" id="Busan">부산</div> -->
<!--   <div role="tabpanel" class="tab-pane" id="Gyeonggido">경기</div> -->
<!--   <div role="tabpanel" class="tab-pane" id="UKJ">울산/경남/제주</div> -->
<!--   <div role="tabpanel" class="tab-pane" id="Teagu">대구</div> -->
<!--   <div role="tabpanel" class="tab-pane" id="Kyungbuk">경북</div> -->
<!--   <div role="tabpanel" class="tab-pane" id="Jeolla">광주/전라</div> -->
<!--   <div role="tabpanel" class="tab-pane" id="DCS">대전/충청/세종</div> -->
<!--  </div> -->

 
</div>
</div>

</body>
</html>