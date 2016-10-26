<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=styleSheet href="../Base.css">
<title>JSP</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script>	
	var count = 1;
	$(document).ready(function(){
		$("#abtn").click(function(){
				count = count + 1;
				var input = "<br id='br" + count + "'><input type='file' name='file"
				+ count + "' id='file" + count + "'>";
				$("#filearea").append(input);
		});
		$("#dbtn").click(function(){
			if(count == 1){
				// 최소 한개는 남기고
				return;
			}
			$("#file" + count).remove();
			$("#br" + count).remove();
			count = count - 1;
		});
		$("#wbtn").click(function(){
			// 폼의 내용을 서버에 제출시키면 된다.
			$("#wfrm").attr("action", "../FileBoard/BoardWriteProc.bmw");
			$("#wfrm").submit();
		});
	});
</script>
<body>
<%--
	파일 업로드를 위한 폼은 반드시 <form>에 enctype="multipart/form-data"가 설정되어야 한다. 
	
	폼의 데이터가 서버에 제출(submit)되는 방식
	1. parameter 방식
		-> 화면에 보이는 내용 즉, value값만 서버에 제출되는 방식
		  파일의 이름만 제출
	2. stream 방식
		-> 화면에 보이는 내용이 stream 처리되어서 제출되는 방식
		  파일의 내용도 같이 제출
		  
	파일 업로드란?
	파일 내용을 서버가 바당서 서버의 시스템에 저장하는 개념이므로
	반드시 파이르이 내용이 제출되어야 하고
	그러기 위해서는 parameter방식이 아닌 stream방식으로 submit 시켜야 한다.
 --%>
	<form method="post" id="wfrm" enctype="multipart/form-data">
		<table class="TABLESTYLE1 W600P">
			<tr>
				<th>작성자</th>
				<td colspan="2">${sessionScope.ID}</td>
			</tr>
			<tr>
				<th>제목</th>
				<td colspan="2">
					<input type="text" name="title" id="title">
				</td>
			</tr>
			<tr>
				<th>본문</th>
				<td colspan="2">
					<textarea name="body" id="body" cols="70" rows="10"></textarea>
				</td>
			</tr>
			<tr>
				<th>첨부파일</th>
				<td>
					<div id="filearea">
					<input type="file" name="file1" id="file1">
					</div>
				</td>
				<td>
					<input type="button" id="abtn" value="추가" class="BUTTON3">
					<input type="button" id="dbtn" value="삭제" class="BUTTON2">
				</td>
			</tr>
			<tr>
				<td colspan="3" align="center">
					<input type="button" id="wbtn" value="글쓰기" class="BUTTON1">
				</td>
			</tr>
		</table>
	</form>
 
</body>
</html>