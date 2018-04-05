<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DB테스트</title>
<script type="text/javascript" src="/resources/ckeditor/ckeditor.js"></script>
<link rel="stylesheet" href="/resources/css/board_write.css">
</head>
<body>
	<div class="boardhead">
		<!-- 글보기 헤더 감싸기 영역 -->
		<div class="warp_boardhead">
			<h3>룸싸롱 풀싸롱</h3>
		</div>
	</div>
	<div class="div_clear"></div>

	<div class="container-fluid">
		<form class="form-horizontal">
			<!-- 비밀글 -->
			<div class="form-group">
				<label class="control-label col-sm-1" for="pwd"
					style="padding-top: 11px">옵션 :</label>
				<div class="col-sm-offset col-sm-3">
					<div class="checkbox">
						<label><input type="checkbox">비밀글</label>
					</div>
				</div>
			</div>
			<!-- 분류 -->
			<div class="form-group">
				<label class="control-label col-sm-1" for="email">분류 :</label>
				<div class="col-sm-11">
					<select class="form-control" id="sel1">
						<option>인천</option>
						<option>주안</option>
						<option>광주</option>
						<option>가평벚꽃</option>
						<option>인천</option>
						<option>주안</option>
						<option>광주</option>
						<option>가평벚꽃</option>
						<option>인천</option>
						<option>주안</option>
						<option>광주</option>
						<option>가평벚꽃</option>
					</select>
				</div>
			</div>
			<!-- 제목 -->
			<div class="form-group">
				<label class="control-label col-sm-1" for="subject">제목 :</label>
				<div class="col-sm-11">
					<input type="text" class="form-control" id="subject"
						placeholder="제목을 입력하세요">
				</div>
			</div>


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
						<button type="submit" class="btn btn-default">저장</button>
					</div>
				</div>
			</div>
		</form>
	</div>



	<script>
		$(function() {
			CKEDITOR.replace('ckeditor', {//해당 이름으로 된 textarea에 에디터를 적용
				width : '100%',
				height : '400px',
				filebrowserImageUploadUrl : '/community/imageUpload' //여기 경로로 파일을 전달하여 업로드 시킨다.
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