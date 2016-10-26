<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=styleSheet href="../Base.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$("#wbtn").click(function(){
				// 글쓰기 폼 요청
				$(location).attr("href", "../FileBoard/BoardWriteForm.bmw");
		});
	});
</script>
<title>JSP</title>
</head>
<body>
<%-- 목록보기 --%>
	<table class="TABLESTYLE3">
		<thead>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
		</tr>
		</thead>
		<c:forEach var="data" items="${LIST}">
			<tr>
				<td>${data.no}</td>
				<td>
				<a href="../FileBoard/BoardView.bmw?no=${data.no}">${data.title}</a>
				</td>
				<td>${data.id}</td>
				<td>${data.date}</td>
			</tr>
		</c:forEach>
	</table>
<%-- 기타기능 --%>
 	<table class="TABLESTYLE3">
 		<tr>
 			<td align="center">
 				<input type="button" id="wbtn" value="글쓰기" class="BUTTON3">
 			</td>
 		</tr>
 	</table>
</body>
</html>