<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<link rel=styleSheet href="../Base.css">
<title>JSP</title>
</head>
<script>
	$(document).ready(function(){
		$("#wBtn").click(function(){
			// 무결성 검사하고
			$title = $("#title").val();
			if($title == ""){
				alert("제목을 입력하세요");
				return;
			}
			
			$body = $("#body").val();
			if($body == ""){
				alert("내용을 입력하세요");
				return;
			}
			// 폼의 데이터를 서버에 보낸다.
			$("#mfrm").attr("action", "../AnBoard/ModifyProc.bmw");
			$("#mfrm").submit();
		});
	});
</script>
<body>
	<c:if test="${CHECK}">
		<%-- 폼을 보여줄것이며 --%>
		<form id="mfrm" method="post">
			<input type="hidden" name="no" value="${NO}">
			<input type="hidden" name="nowPage" value="${NOWPAGE}">
			<table class="TABLESTYLE1 W500P">
				<tr>
					<th>글쓴이</th>
					<td>${sessionScope.NICK}</td>
				</tr>
				<tr>
					<th>제목</th>
					<td>
						<input type="text" name="title" id="title" value="${DATA.title}">
					</td>
				</tr>
				<tr>
					<th>본문</th>
					<td>
						<textarea name="body" id="body" cols="50" rows="10">${DATA.brbody}</textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="button" id="wBtn" value="수정하기" class="BUTTON2">
						<input type="button" id="rBtn" value="다시쓰기" class="BUTTON2">
						<input type="button" id="lBtn" value="목록보기" class="BUTTON2">
						<input type="button" id="vBtn" value="상세보기" class="BUTTON2">
					</td>
				</tr>
				
			</table>
		</form>
	</c:if>
 	<c:if test="${not CHECK}">
 		<%-- 다른 폼으로 보낼 것이다. --%>
 		<script>
 			confirm("비밀번호가 틀려서 수정할 수 없습니다.");
 			location.href = "../AnBoard/BoardView.bmw?no=${NO}&nowPage=${NOWPAGE}"; 
 		</script>
	</c:if>
</body>
</html>