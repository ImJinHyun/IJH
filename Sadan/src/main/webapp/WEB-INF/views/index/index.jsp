<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>메인화면</title>
<link rel="stylesheet" href="/resources/css/index.css">
<script>
function openCity(evt, cityName) {
    var i, tabcontent, tablinks;
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }
    
    tablinks = document.getElementsByClassName("tablinks");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
    }
    document.getElementById(cityName).style.display = "block";
    evt.currentTarget.className += " active";
   
}
</script>

<script type="text/javascript">
$(function(){
	openCity(event, 'London');	
});
</script>

<style>
body {font-family: Arial;}

/* Style the tab */
.tab {
    overflow: hidden;
    border: 1px solid #ccc;
    background-color: #f1f1f1;
   
}

/* Style the buttons inside the tab */
.tab button {
    background-color: inherit;
    float: left;
    border: none;
    outline: none;
    padding: 11px 11px;   
    font-size: 13px;
}

/* Change background color of buttons on hover */
.tab button:hover {
    background-color: #ddd;
}

/* Create an active/current tablink class */
.tab button.active {
    background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
    display: none;
    padding: 6px 12px;
    border: 1px solid #ccc;
    border-top: none;
    margin-bottom: 10px;
}
</style>
</head>
<body>
	<div class="body_container">
		<div class="center_logo">
			<a href="#" onclick="return false;"><img width="100%" src="/images/main7.jpg"></a>					
		</div>
		<div class="center_logo">
			<a href="#" onclick="return false;"><img width="100%" src="/images/main8.jpg"></a>					
		</div> 
	</div>
<!-- 	<div class="tab_wrap"> -->
<!-- 		<div class="tab_1"> -->
<!-- 			<ul class="tab1_menu"> -->
<!-- 				<li><a href="#" onclick="return false;" id="first">강남</a></li> -->
<!-- 				<li><a href="#" onclick="return false;">비강남</a></li> -->
<!-- 				<li><a href="#" onclick="return false;">인천</a></li> -->
<!-- 				<li><a href="#" onclick="return false;">경기</a></li> -->
<!-- 				<li><a href="#" onclick="return false;">부산</a></li> -->
<!-- 				<li><a href="#" onclick="return false;">울산/경남/제주</a></li> -->
<!-- 				<li><a href="#" onclick="return false;">대구</a></li> -->
<!-- 				<li><a href="#" onclick="return false;">경북</a></li> -->
<!-- 				<li><a href="#" onclick="return false;">광주/전라</a></li> -->
<!-- 				<li><a href="#" onclick="return false;">대전/충청/세종</a></li> -->
<!-- 				<li><a href="#" onclick="return false;">강원</a></li> -->
<!-- 			</ul> -->
<!-- 			<div class="tab1_board"> -->
<!-- 				<div class="tab_2"> -->
<!-- 					<ul class="tab1_menu"> -->
<!-- 						<li id="first">???</li> -->
<!-- 						<li><a href="#" onclick="return false;">채팅방링크</a></li> -->
<!-- 						<li><a href="#" onclick="return false;">할인권현황</a></li> -->
<!-- 						<li><a href="#" onclick="return false;">초보자가이드</a></li> -->
<!-- 						<li><a href="#" onclick="return false;">공지사항</a></li> -->
<!-- 						<li><a href="#" onclick="return false;">제휴업소</a></li> -->
<!-- 						<li><a href="#" onclick="return false;">출근부PR</a></li> -->
<!-- 						<li><a href="#" onclick="return false;">이벤트업소배너</a></li>						 -->
<!-- 					</ul> -->
<!-- 					<div class="tab2_board"> -->
					
<!-- 					</div>두번째탭게시판영역 -->
<!-- 				</div>두번째탭전체영역 -->
<!-- 			</div>첫번째탭게시판영역 -->
<!-- 		</div>첫번째탭전체 -->
<!-- 	</div>탭전체 -->

<div class="tab" id="tab1">
  <button class="tablinks" onclick="openCity(event, 'London')">제휴업소</button>
  <button class="tablinks" onclick="openCity(event, 'GangNam')">강남</button>
  <button class="tablinks" onclick="openCity(event, 'NonGangNam')">비강남</button>
  <button class="tablinks" onclick="openCity(event, 'Incheon')">인천</button>
  <button class="tablinks" onclick="openCity(event, 'Gyeonggi')">경기</button>
  <button class="tablinks" onclick="openCity(event, 'Busan')">부산</button>
  <button class="tablinks" onclick="openCity(event, 'UKJ')">울산/경남/제주</button>
  <button class="tablinks" onclick="openCity(event, 'Taegu')">대구</button>
  <button class="tablinks" onclick="openCity(event, 'Kyungbuk')">경북</button>
  <button class="tablinks" onclick="openCity(event, 'GJ')">광주/전라</button>
  <button class="tablinks" onclick="openCity(event, 'TCS')">대전/충청/세종</button>
  <button class="tablinks" onclick="openCity(event, 'Gangwon')">강원</button>
</div>
<div class="tab">
  <button class="tablinks" onclick="openCity(event, 'click')">클릭한지역</button>
  <button class="tablinks" onclick="openCity(event, 'chatlink')">채팅방링크</button>
  <button class="tablinks" onclick="openCity(event, 'discount')">할인권현황</button>
  <button class="tablinks" onclick="openCity(event, 'choboguide')">초보자가이드</button>
  <button class="tablinks" onclick="openCity(event, 'gongji')">공지사항</button>
  <button class="tablinks" onclick="openCity(event, 'jeyu')">제휴업소</button>
  <button class="tablinks" onclick="openCity(event, 'attendecePr')">출근부PR</button>
  <button class="tablinks" onclick="openCity(event, 'eventbanner')">이벤트업소배너</button>
  
</div>


<div id="London" class="tabcontent">
  <h3>제휴업소</h3>
  <h3>제휴업소</h3>
  <h3>제휴업소</h3>
  <h3>제휴업소</h3>
  <h3>제휴업소</h3>
</div>
<div id="GangNam" class="tabcontent">
  <h3>강남</h3>
</div>
<div id="NonGangNam" class="tabcontent">
  <h3>비강남</h3>
</div>
<div id="Incheon" class="tabcontent">
  <h3>인천</h3>
</div>
<div id="Gyeonggi" class="tabcontent">
  <h3>경기</h3>
</div>
<div id="Busan" class="tabcontent">
  <h3>부산</h3>
</div>
<div id="UKJ" class="tabcontent">
  <h3>울산경북제주</h3>
</div>
<div id="Taegu" class="tabcontent">
  <h3>대구</h3>
</div>
<div id="Kyungbuk" class="tabcontent">
  <h3>경북</h3>
</div>
<div id="GJ" class="tabcontent">
  <h3>광주전라</h3>
</div>
<div id="TCS" class="tabcontent">
  <h3>대전충청세종</h3>
</div>
<div id="Gangwon" class="tabcontent">
  <h3>강원</h3>
</div>
<div id="click" class="tabcontent">
  <h3>클릭한지역보이기</h3>
</div>
<div id="chatlink" class="tabcontent">
  <h3>채팅방링크</h3>
</div>
<div id="discount" class="tabcontent">
  <h3>할인권현황</h3>
</div>
<div id="choboguide" class="tabcontent">
  <h3>초보자가이드</h3>
</div>
<div id="gongji" class="tabcontent">
  <h3>공지</h3>
</div>
<div id="jeyu" class="tabcontent">
  <h3>제휴업소</h3>
</div>
<div id="attendecePr" class="tabcontent">
  <h3>출근부PR</h3>
</div>
<div id="eventbanner" class="tabcontent">
  <h3>이벤트배너</h3>
</div>


	
	<div class="tab_wrap_gallary">
		<div class="tab_wrap_gallary_menuall">
			<ul class="tab_wrap_gallary_menu">
					<li id="first">갤러리</li>
					<li><a href="#" onclick="return false;">업소</a></li>
					<li><a href="#" onclick="return false;">가슴</a></li>
					<li><a href="#" onclick="return false;">엉덩이</a></li>
					<li><a href="#" onclick="return false;">레이싱</a></li>
					<li><a href="#" onclick="return false;">기타</a></li>
			</ul>
		</div>
		<div class="tab_wrap_gallary_board">
			<div class="photo"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
			<div class="photo"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
			<div class="photo"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
			<div class="photo"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
			<div class="photo"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
			<div class="photo"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>		
		</div>
	</div>
	
	<div class="tab_wrap">
		<div class="tab_1">
			<ul class="tab1_menu">
				<li><a href="#" onclick="return false;" id="first">PR출근부</a></li>
				<li><a href="#" onclick="return false;">채팅방링크</a></li>
				<li><a href="#" onclick="return false;">할인권현황</a></li>
				<li><a href="#" onclick="return false;">초보자가이드</a></li>
				<li><a href="#" onclick="return false;">공지사항</a></li>
				<li><a href="#" onclick="return false;">제휴업소</a></li>
				<li><a href="#" onclick="return false;">출근부PR</a></li>
				<li><a href="#" onclick="return false;">이벤트업소배너</a></li>
			</ul>
			<div class="tab1_board">
			
			</div>
		</div>
	</div>
	
	<div class="tab_wrap_gallary">
		<div class="tab_wrap_gallary_menuall">
			<ul class="tab_wrap_gallary_menu">
					<li id="first">갤러리</li>
					<li><a href="#" onclick="return false;">업소</a></li>
					<li><a href="#" onclick="return false;">가슴</a></li>
					<li><a href="#" onclick="return false;">엉덩이</a></li>
					<li><a href="#" onclick="return false;">레이싱</a></li>
					<li><a href="#" onclick="return false;">기타</a></li>
			</ul>
		</div>
		<div class="tab_wrap_gallary_board">
			<div class="photo"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
			<div class="photo"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
			<div class="photo"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
			<div class="photo"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
			<div class="photo"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
			<div class="photo"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>		
		</div>
	</div>
	
	<div class="tab_wrap">
		<div class="tab_1">
			<ul class="tab1_menu">
				<li><a href="#" onclick="return false;" id="first">생활관</a></li>
				<li><a href="#" onclick="return false;">번개모임</a></li>
				<li><a href="#" onclick="return false;">자유게시판</a></li>
				<li><a href="#" onclick="return false;">만화게시판</a></li>
				<li><a href="#" onclick="return false;">유머게시판</a></li>
				<li><a href="#" onclick="return false;">언니일기장</a></li>
			</ul>
			<div class="tab1_board">
			
			</div>
		</div>
	</div>
	
	<div class="tab_wrap_gallary">
		<div class="tab_wrap_gallary_menuall">
			<ul class="tab_wrap_gallary_menu">
					<li id="first">갤러리</li>
					<li><a href="#" onclick="return false;">업소</a></li>
					<li><a href="#" onclick="return false;">가슴</a></li>
					<li><a href="#" onclick="return false;">엉덩이</a></li>
					<li><a href="#" onclick="return false;">레이싱</a></li>
					<li><a href="#" onclick="return false;">기타</a></li>
			</ul>
		</div>
		<div class="tab_wrap_gallary_board">
			<div class="photo"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
			<div class="photo"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
			<div class="photo"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
			<div class="photo"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
			<div class="photo"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>
			<div class="photo"><a href="#" onclick="return false;"><img src="/images/main2.png"></a></div>		
		</div>
	</div>
	
	
	
</body>
</html>