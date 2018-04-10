<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8">
        <!-- meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0"/ -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>회원정보 수정</title>
        <!-- Bootstrap -->
        <link href="/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="/resources/css/member.css">
 <script type="text/javascript">
		// 글쓰기가 완료 했거나 글삭제가 완료된 상태에서 리스트로 넘어오면 메시지를 출력한다.
		var result = "${msg }";
		if(result=="MODIFYSUCCESS")
			alert("정보수정이 완료되었습니다..");
</script>
    </head>
<body>
<h1 class="memberjoin">*회원정보 수정*</h1>
<form class="form-horizontal" role="form" method="post" action="/member/memModify.do">
<input name="grade" value="${login.grade }" type="hidden">
		<div class="input-group-all">
            <div class="input-group">
		    	<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
				<input id="id" type="text" class="form-control" name="userId" placeholder="아이디" value="${login.userId }" readonly="readonly">
			</div>
            <div class="input-group">
			    <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
			    <input id="password" type="password" class="form-control" name="password" placeholder="수정할 비밀번호" name=password]>
		    </div>
		    <div class="input-group">
			    <span class="input-group-addon"><i class="glyphicon glyphicon-ok"></i></span>
			    <input id="passwordcheck" type="password" class="form-control" name="passwordcheck" placeholder="비밀번호확인">
		    </div>
            <div class="input-group">
			    <span class="input-group-addon"><i class="glyphicon glyphicon-king"></i></span>
			    <input id="nickname" type="text" class="form-control" name="nickname" placeholder="닉네임" value="${login.nickname }">
		    </div>             
            <div class="input-group">
			    <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
			    <input id="email" type="email" class="form-control" name="email" placeholder="이메일" value="${login.email }">
		    </div>
		                    
            <div class="input-group">
            	<span class="input-group-addon"><i class="glyphicon glyphicon-eye-open" ></i></span>              
                    <select class="form-control" name="sex" id="genders">
                        <option value="M">남</option>
                        <option value="F">여</option>
                    </select>       
            </div>
         </div>                            
            <div class="form-group">
                <div class="button_group">
                    <button type="submit" class="btn btn-default" >회원가입</button>
                     <button type="reset" class="btn btn-default">취소</button>
                </div>
            </div>
            <hr/>
</form>
        

</body>
</html>