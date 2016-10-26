<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<link rel=styleSheet href="../Base.css">
<title>JSP</title>
</head>
<script>
	$(document).ready(function(){
		$("#wBtn").click(function(){
			// 무결성 검사 하시오
			// JQuery에서는 자바스크립트 형태의 변수도 사용할 수 있고
			// JQuery 형태의 변수도 사용할 수 있다.
			// JQuery 형태의 변수 => $변수이름
			$title = $("#title").val();
			if($title == "") {
				alert("제목을 입력해주세요");
				return;
			}
			$body = $("#body").val();
			if($body == "") {
				alert("내용을 입력해주세요")
				return;
			}
			$password = $("#password").val();
			if($password == "") {
				alert("비밀번호를 입력해주세요")
				return;
			}
			//	서버로 데이터를 보낸다.
			//	1.	method를 지정해야 하고
			$("#afrm").attr("method", "POST");
			//	2.	action 지정하고
			$("#afrm").attr("action", "../AnBoard/AnWriteProc.bmw");
			//	3.	submit() 시킨다.
			$("#afrm").submit();
		});
		
		$("#rBtn").click(function(){
			$("#afrm").each(function(){
				this.reset();
			});
		});
		
		$("#lBtn").click(function(){
			$(location).attr("href", "../AnBoard/BoardList.bmw?no=${NO}&nowPage=${NOWPAGE}");
		});
		
		$("#vBtn").click(function(){
			$(location).attr("href", "../AnBoard/BoardView.bmw?no=${NO}&nowPage=${NOWPAGE}");
		});
	});
</script>
<body>
	<%-- 글쓰기 폼을 만들어 주면 된다. --%>
	<form id="afrm">
		<input type="hidden" name="no" value="${NO}">
		<input type="hidden" name="nowPage" value="${NOWPAGE}">
		<table class="TABLESTYLE3 W500P">
			<tr>
				<th>글쓴이</th>
				<td><input type="text" value="${sessionScope.NICK}" readonly>
				</td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" id="title"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="body" id="body" cols="50" rows="10"></textarea></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="password" id="password">
					<small>삭제나 수정을 위해서 필요합니다.</small></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="button" id="wBtn" value="글쓰기" class="BUTTON1"> 
				<input type="button" id="rBtn" value="다시쓰기" class="BUTTON1">
				<input type="button" id="lBtn" value="목록보기" class="BUTTON1"> 
				<input type="button" id="vBtn" value="상세보기" class="BUTTON1"></td>
			</tr>
		</table>
	</form>
</body>
</html>