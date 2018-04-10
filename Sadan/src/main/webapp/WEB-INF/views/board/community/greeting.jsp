<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입인사(등업)</title>
<link rel="stylesheet" href="/resources/css/chatinglink.css">
<link rel="stylesheet" href="/resources/css/jeyu.css">
<link rel="stylesheet" href="/resources/css/pr.css">

</head>
<body>
	<div class="prfullssa_all">
		<div class="board_subject">
			<div class="board_main_subject">			
				<span>가입인사(등업)</span>							
			</div>
		</div>
	</div>
	<div>
	<select class="form-control">
	 	<option>제목</option> 
	 	<option>내용</option> 
	 	<option>제목+내용</option> 
	 	<option>글쓴이</option> 
	 	<option>글쓴이(댓글)</option> 
	 </select>
	 <input type="text" class="form-control" id="usr">
	 <button type="button" class="btn">검색</button>
	 </div>		 
	<table class="table table-hover">
		<thead class="main_tr">
			<tr>
				<th>제목</th>
				<th>글쓴이</th>
				<th>날짜</th>
				<th>조회</th>
				<th>추천</th>
			</tr>			
		</thead>
		<tbody>
			<tr>
				<td>18사단</td>
				<td>임진현</td>
				<td>2018-01-01</td>
				<td>1999</td>
				<td>욘사마</td>
			</tr>
			<tr>
				<td>임진현</td>
				<td>임진현</td>
				<td>임진현</td>
				<td>임진현</td>
				<td>임진현</td>
			</tr>
			<tr>
				<td>임진현</td>
				<td>임진현</td>
				<td>임진현</td>
				<td>임진현</td>
				<td>임진현</td>
			</tr>
		</tbody>
	</table>		
		<hr/>
		<a class="btn btn-default pull-right">글쓰기</a>		
		<div class="text-center">
			<ul class="pagination">
				<li><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
			</ul>
		</div>	
</body>
</html>