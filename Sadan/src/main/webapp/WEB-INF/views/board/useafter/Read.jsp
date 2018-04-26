<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판읽기</title>
<link rel="stylesheet" href="/resources/css/board_read.css">

<script type="text/javascript">
$(function(){

	//#=id / .class 선택자를 .on했을 때("click") 클릭했을 때 function() - 기능을 하겠다. 
	$("#useafter_list").on("click",function(){
		location.href="/useafter/fullssa.do?business_type=룸/풀싸롱";
	});
	
	$("#useafter_delete").on("click",function(){
		$("#useafter_Form").attr("action","board_delete.do").submit();
	});
	
	$("#useafter_modify").on("click",function(){
		$("#useafter_Form").attr("action","board_modify.do").submit();
	});
	
	$("#useafter_answer").on("click",function(){
		
		$("#useafter_Form").attr("action","board_answer.do").submit();
	});
	
	$("#recommand").on("click",function(){
		$("#useafter_Form").attr("action","recommand.do").submit();
	});
	
	
	
	
	// 게시글을 추천 후 성공/실패를 한번만 경고 창을 띄운다.
	var result = "${msg }";
	if(result=="RECOMMANDSUCCESS")
		alert("게시글이 추천 되었습니다.");
	
	if(result=="RECOMMANDFAILED")
		alert("추천은 게시글당 1번만 가능합니다.");
	
	if(result == "REPLY_INSERT_FAILED")
		alert("댓글 작성에 실패하였습니다.관리자에게 문의해 주세요");

	if(result == "REPLY_UPDATE_SUCCESS")
		alert("댓글이 수정되었습니다.");
	
	if(result == "REPLY_UPDATE_FAILED")
		alert("댓글 수정에 실패하였습니다.관리자에게 문의해 주세요");
	
	if(result == "REPLY_DELETE_SUCCESS")
		alert("댓글이 삭제되었습니다.");
	
	if(result == "REPLY_DELETE_FAILED")
		alert("댓글 삭제에 실패하였습니다.관리자에게 문의해 주세요");
	
	//수정 클릭시
	$(".btn_reply_modify").click(function(){
		var content = $(this).parent().parent().children("#reply_text").val();
		
		var rno =  $(this).parent().parent().children("#reply_info").children("#rno").attr("value");
		
		$("#reply_update").remove();
		$("#reply_answer").remove();
		$(this).parent().parent().children("#content").append("<form class='reply_update' action='replies_update.do' id='reply_update' method='post'>"
			+"<input type='hidden' name='no' value='${useafter.no }'/>"
			+"<input type='hidden' name='rno' value='"+rno+"'/>"
				+"<input type='hidden' name='replyer' value='${login.nickname }''/>"
					+"<textarea rows='5' cols='100' class='reply_text' required='required' name='replytext'>"+content+"</textarea>"
					+"<button type='submit'>수정</button>"
					+"<input type='checkbox' name='secret'> 비밀글"
					
					+"<div class='div_clear'></div>"
					+"</form>"
					);
	});
	
	
	//답글 클릭시
	$(".btn_reply_answer").click(function(){
	
		var rno =  $(this).parent().parent().children("#reply_info").children("#rno").attr("value");
		var answer_num =  $(this).parent().parent().children("#reply_info").children("#answer_num").attr("value");
		$("#reply_answer").remove();
		$("#reply_update").remove();
		$(this).parent().parent().children("#content").append("			<form class='reply_answer' action='replies_answer.do' id='reply_answer' method='post'>"
			+"<input type='hidden' name='no' value='${useafter.no }'/>"
			+"<input type='hidden' name='answer_num' value='"+answer_num+"'/>"
				+"<input type='hidden' name='replyer' value='${login.nickname }''/>"
					+"<textarea rows='5' cols='100' class='reply_text' required='required' name='replytext'></textarea>"
					+"<button type='submit'>등록</button>"
					+"<input type='checkbox' name='secret'> 비밀글"
					
					+"<div class='div_clear'></div>"
					+"</form>");
	});
	
	
	
	$(".btn_reply_delete").on("click",function(){
		if(confirm("댓글을 삭제하시겠습니까?")){
			var rno =  $(this).parent().parent().children("#reply_info").children("#rno").attr("value");
			var no = ${useafter.no};
			location.href="/useafter/replies_delete.do?rno="+rno+"&no="+no;
		}
	});
	
	
	
	
});
</script>
<script type="text/javascript">


$(".clicksel").on("load",function(){
	alert(1);
});
</script>
</head>
<body>
	<!-- 글보기 헤더 영역 -->
	<div class="boardhead">
		<!-- 글보기 헤더 감싸기 영역 -->
		<div class="warp_boardhead">
			<h3>룸싸롱 풀싸롱</h3>
		</div>
	</div>
	<!-- div 줄 바꿈 -->
	<div class="div_clear"></div>
	<!-- 버튼 감싸기 -->
	<div class="wrap_button">
		<button type="button" class="btn btn-primary link_button" id="useafter_list">목록</button>
		<button type="button" class="btn btn-primary link_button" id="useafter_delete">삭제</button>
		<button type="button" class="btn btn-primary link_button" id="useafter_modify">수정</button>
		<button type="button" class="btn btn-primary link_button" id="useafter_answer">답변</button>
	</div>
	<div class="div_clear"></div>
	
	<!-- 바디 전체 -->
	<div class="warp_bodyall">

		<form id="useafter_Form"> 
			<!-- 히든으로 보낼 데이터들 -->
			<input type="hidden" value="${useafter.no }" name="no">
			<input type="hidden" value="${useafter.business_type }" name="business_type">
			<input type="hidden" value="${useafter.answer_num }" name="answer_num">
		</form>
		
	
		<!-- 바디 내용 -->
		<div class="board_body">
			
			<!-- 제목영역 -->
			<!-- 제목감싸기 -->
			<div class="warp_title">
			
				<!-- 제목 헤더 감싸기 -->
				<div class="title">

					<a href="#">${useafter.subject }</a>

				</div>
				
				<!-- 작성일, ip주소, 조회, 추천 -->
				<div class="board_info">
					<div style="float: left; color: gray;">
						<span class="info_bt">작성일 : </span>
						<span class="info_st">${useafter.dates } | </span> 
						 <span class="info_bt">조회 : </span>
						 <span class="info_st">${useafter.hit } | </span>
						<span  class="info_bt">추천 : </span>
						<span style="color: blue; font-size:10px;">${useafter.recommand }</span>
					</div>
					<div style="float: right; color: #aaa;"></div>
					<div class="div_clear"></div>
				</div>
				<!-- 작성일 조회 추천 날짜 끝 -->
				
		</div>
		<!-- 제목 끝 -->
		<div class="div_clear">
		</div>
		
		<!-- 본문 감싸기 -->
		<div class="board_warp">
		
		<!-- 글 본문 시작 -->
			<!-- 예약문의시 18사단 회원임을 알려주세요 -->
			<div class="sale">
				<img src="/images/test_img/18sadan_member.gif" />
			</div>
				<div class="clear"></div>

			<!-- 본문 내용 시작 -->
			<div class="body_content">
				${useafter.content }
			</div>
			
		
			
			<!-- 본문 내용 끝 -->
			<br><br>
			<button id="recommand">추천</button>
			<button>신고</button>
			<br><br>
			</div>		<!-- 본문 감싸기 끝 -->
			
			<!-- 댓글 시작 -->
			<!-- 댓글 목록 감싸기 -->
			<div	class="reply_list">
			<c:forEach var="reply" items="${useafter_reply }" varStatus="status">
			<div class="clicksel" id="${status.index }">
			<div class="reply_right_wrap"  id="wrap_reply">
			
				<div class="reply_info" id="reply_info">
					${reply.replyer } 	<span class="info_bt">작성일 : </span><span class="info_st">${reply.regdate }  </span>
					 
					 <input type="hidden" value="${reply.answer_seq}" id="answer_seq" class="answer_seq">
					 <input type="hidden" value="${reply.answer_num}" id="answer_num" name="answer_num">
					 <input type="hidden" value="${reply.rno}" id="rno" name="rno">
				</div>
				
				<div class="reply_modify">
				<c:choose>
					<c:when test="${reply.replyer == login.nickname }">
					<span class="btn_reply_modify reply_bt cursor"  >수정 | </span> <span class="btn_reply_answer reply_bt cursor"  id="">답변 | </span>			<span class="btn_reply_delete reply_st cursor"  id="btn_reply_delete">삭제</span>
					
					</c:when>
					<c:otherwise>
					<span class="reply_st cursor">신고</span> 			<span class="btn_reply_answer reply_bt cursor"  id=""> | 답변</span>
					</c:otherwise>
				</c:choose>
				
				</div>
				<div class="div_clear" id="reply_in"></div>
				<div class="reply_content" id="content" >${reply.replytext }</div>
				<input type="hidden" value="${reply.replytext }" id="reply_text">
				</div>
				
				<script type="text/javascript">
				if(${reply.answer_seq} > 0){
					$("#${status.index}").children("#wrap_reply").before("<div class='answer'>RE : </div>");
					$("#${status.index}").children("#wrap_reply").attr("style","width : 95%;");
				};
			</script>
				</div>
				<div class="div_clear"></div>
			</c:forEach>
			</div>
			
			
				<!-- 댓글 쓰기 부분 감싸기 -->
			
			<form class="reply_insert" action="replies_insert.do" method="post">
			<input type="hidden" name="no" value="${useafter.no }"/>
			<input type="hidden" name="replyer" value="${login.nickname }"/>
				<textarea  rows="5" cols="100" class="reply_text" required="required" name="replytext"></textarea>
				<button>등록</button>
				<input type="checkbox" name="secret"> 비밀글
				
				<div class="div_clear"></div>
			</form>
			
		</div>
		<!-- 바디 내용 끝 -->
		
	</div><!-- 바디 전체 감싸는 부분 끝 -->
	
</body>
</html>