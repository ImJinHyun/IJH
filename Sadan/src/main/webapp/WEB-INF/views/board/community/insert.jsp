<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<c:set var="path" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>추가</title>
<script type="text/javascript" src="${path }/ckeditor/ckeditor.js"></script>
<link rel="stylesheet" href="/resources/css/board_write.css">

<script type="text/javascript">
$(function(){
	$("#insert").on("click",function(){
		//글 내용 값넘기기
		$("#content").attr("value",CKEDITOR.instances.ckeditor.getData());
		
		//분류 비활성화 하면 값이 안넘어감, 그래서 풀어줘야함
		$("#sel1").removeAttr("disabled");
	});
	
	
	$("#sel1 option").each(function(){
		if($(this).val()=="${type}"){
			$(this).attr("selected","selected");
		};
		
	});
	

	
});
</script>
</head>
<body>
	<div class="boardhead">
		<!-- 글보기 헤더 감싸기 영역 -->
		<div class="warp_boardhead">
			<h3>${type } 등록</h3>
		</div>
	</div>
	<div class="div_clear"></div>
	<div class="container-fluid">
		<form class="form-horizontal" action="board_insert.do" method="post" role="form">
			<!-- 비밀글 -->
			<div class="form-group">
				<label class="control-label col-sm-1" for="pwd"
					style="padding-top: 11px">옵션 :</label>
			    <div class="col-sm-11"  style="padding-top: 11px">
			          <label><input type="checkbox" name="serect" value="1"> 비밀글</label>
			    </div>
			</div>
			<!-- 분류 -->
			<div class="form-group">
				<label class="control-label col-sm-1" for="email">분류 :</label>
				<div class="col-sm-11">
					<select class="form-control" id="sel1" name="business_type" disabled="disabled">
						<option>공지사항</option>
						<option>가입인사(등업)</option>
						<option>질문및답변</option>
						<option>정모와번개</option>
						<option>자유게시판</option>
						<option>여우게시판</option>
						<option>구인</option>														
					</select>
				</div>
			</div>
			<!-- 제목 -->
			<div class="form-group">
				<label class="control-label col-sm-1">제목 :</label>
				<div class="col-sm-11">
					<input type="text" class="form-control" id="subject" name="subject"
						placeholder="제목을 입력하세요">
				</div>
			</div>
			
			<!-- 본문 내용이 히든으로 넘어간다. -->
				<input type="hidden" name="content" id="content" />
				<input type="hidden" name="writer" id="writer" value="${login.nickname }">
			
			
			<!--     <div class="form-group">         -->
			<!--       <div class="col-sm-offset-2 col-sm-10"> -->
			<!--         <button type="submit" class="btn btn-default">Submit</button> -->
			<!--       </div> -->
			<!--     </div> -->


			<!-- 위지윅 -->

			<div class="ckeditor-div">
				<div class="form-group">
					<div class="col-lg-12">
						<textarea name="ckeditor" id="ckeditor"></textarea>
					</div>
				</div>
				<div class="form-group">
					<div class="col-lg-12" align="right">
						<button type="submit" class="btn btn-default" id="insert">저장</button>
					</div>
				</div>
			</div>
		</form>
	</div>
${pageContent.request.contextPath}


	<script>
		$(function() {
			CKEDITOR.replace('ckeditor', {//해당 이름으로 된 textarea에 에디터를 적용
				width : '100%',
				height : '400px',
				filebrowserImageUploadUrl : "${path}/imageUpload.do" ,//여기 경로로 파일을 전달하여 업로드 시킨다.
				enterMode:'2'
			});

			CKEDITOR.on('dialogDefinition', function(ev) {
				var dialogName = ev.data.name;
				var dialogDefinition = ev.data.definition;

				switch (dialogName) {
				case 'image': //Image Properties dialog
					//dialogDefinition.removeContents('info');
					//dialogDefinition.removeContents('Link');
					//dialogDefinition.removeContents('advanced');
					break;
				}
			});

		});
	</script>
</body>
</html>