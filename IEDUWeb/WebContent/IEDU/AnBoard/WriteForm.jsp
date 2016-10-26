<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<link rel=stylesheet href="../Base.css">
<title>JSP</title>
</head>
<script>
	$(document).ready(function(){
		$("#wBtn").click(function(){
			// 무결성 검사 하는 방법
			// 1. 요소의 내용을 알아낸다.
			// $(요소).val();
			var title = $("#title").val();
			// 2. 검사를 한다.
			if(title == "") {
				alert("제목을 입력해주세요");
				return;
			}
			var body = $("#body").val();
			if(body == ""){
				alert("내용을 입력해주세요");
				return;
			}
			var password = $("#password").val();
			if(password == ""){
				alert("비밀번호를 입력해주세요");
				return;
			}
			
			// 무결성 검사가 끝났으면
			// 이제 서버에 데이터를 보낸다.
			// 1. 폼을 알아내고
			$("#wfrm").attr("action", "../AnBoard/WriteProc.bmw");
			// 2. submit 시킨다.
			// 형식 $(폼).submit();
			$("#wfrm").submit();
		});
		$("#rBtn").click(function(){
			// 자바 스크립트 방식
			// var form = document.getElementById("wfrm")
			// from.reset();
			// JQeury는 이번만큼은 오히려 더 복잡하다.
			// 왜냐하면 jQuery는 폼의 모든 내용을 한번에 리셋 시킬 수 없고
			// 하나씩 찾아서 리셋 시켜야 한다.
			// 방법
			// 폼의 모든 요소를 찾은 후 
			// $(폼).each(function(){}); 모든 요소를 찾는 것
			// 그 요소를 리셋 시킨다.
			// 요소.reset();
			$("#wfrm").each(function(){
				// 요소는 이것이 반복되면 요소 하나씩을 찾아서 this라는 예약어에
				// 기억해 놓는다.
				this.reset();
			});
		});
		$("#lBtn").click(function(){
			// 하이퍼링크
			$(location).attr("href", "../AnBoard/BoardList.bmw");
		});
	})
</script>
<body>
	<c:if test="${ISLOGIN eq false}">
	<%-- 세션이 없으면 메인이나 적당한 화면으로 내보내기 --%>
		<c:redirect url="../"/>
	</c:if>
 	<%-- 글쓰기 폼을 만들어준다. --%>
 	<form method="post" id="wfrm">
 		<table class="TABLESTYLE2 W500P">
 			<tr>
 				<th>아이디</th>
 				<td>
 					<input type="text" value="${sessionScope.NICK}" readOnly>
 				</td>
 			</tr>
 			
 			<tr>
 				<th>제목</th>
 				<td>
 					<input type="text" name="title" id="title">	
 				</td>
 			</tr>
 			
 			<tr>
 				<th>본문</th>
 				<td>
 					<textarea name="body" id="body" cols="50" rows="10"></textarea>
 				</td>
 			</tr>
 			
 			<tr>
 				<th>비밀번호</th>
 				<td>
 					<input type="password" name="password" id="password">
 					<small>삭제나 수정을 위해서 필요합니다.</small>
 				</td>
 			</tr>
 			
 			<tr>
 				<td colspan="2" align="center">
 					<input type="button" id="wBtn" value="글쓰기" class="BUTTON1">
					<input type="button" id="rBtn" value="다시쓰기" class="BUTTON2">
					<input type="button" id="lBtn" value="목록보기" class="BUTTON3">
 				</td> 				
 			</tr>
 		</table>
 	</form>
</body>
</html>