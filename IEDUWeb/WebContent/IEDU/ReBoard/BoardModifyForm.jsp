<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=stylesheet href=../Base.css>
<title>JSP</title>
</head>
<script>
	function ModifyCheck(){
		var form = document.getElementById("mfrm");
		form.action ="../ReBoard/BoardModifyProc.bmw";
		form.submit();
	}
</script>
<body>
<%--
	수정할 수 있는 폼을 만들어 준다.
 --%>
 	<form method="post" name="mfrm" id="mfrm">
 	<%-- 같이 보내야할 데이터가 몇개 더있으므로... 숨겨서 보낸다. --%>
 	<input type="hidden" name="rbno" value="${DATA.no}">
 	<input type="hidden" name="nowPage" value="${NOWPAGE}">
 		<table class="TABLESTYLE1 W450P">
 			<tr>
 				<th>글쓴이</th>
 				<td>
 				<%--
 					<input>에 value 속성은
 					그 입력상자에 기본적으로표시할 내용을 기록하는 속성이다.
 				 --%>
 					<input type="text" name="writer" id="writer" value="${DATA.writer}" readonly>
 				</td>
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
 				<%--
 					<textarea>는 value로 출력하지 않고
 					<textarea></textarea>사이에 일반 데이터 방식으로 출력한다.
 				 --%>
 					<textarea name="body" id="body" cols="50" rows="10">${DATA.body}</textarea>
 				</td>
 			</tr>
 			<tr>
 				<td colspan="2" align="center">
 					<a href="#" onClick="ModifyCheck()" class="A">수정하기</a>
 				</td>
 			</tr>
 		</table>
 	
 	</form>
 
</body>
</html>