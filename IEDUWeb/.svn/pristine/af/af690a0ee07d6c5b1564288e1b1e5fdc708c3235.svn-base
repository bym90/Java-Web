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
<body>
<%-- 검색하기 기능 --%>
 
<%-- 목록출력 --%>
	<table class="TABLESTYLE3 W700P">
		<thead>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>글쓴이</td>
			<td>작성날짜</td>
			<td>조회수</td>
		</tr>
		</thead>
		<c:forEach var="data" items="${LIST}">
			<tr>
				<td>${data.no}</td>
<%-- 답글일 경우 들여쓰기를 해야한다. --%>
				<td>
				<c:if test="${data.step ne 0}">
					<c:forEach var="temp" begin="1" end="${data.step}">
						&nbsp;&nbsp;
					</c:forEach>
					┗▷
				</c:if>
					<a href="../AnBoard/BoardHit.bmw?no=${data.no}&nowPage=${PINFO.nowPage}&target=search&key=${KEY}&text=${TEXT}">${data.title}</a>
				</td>
				<td>${data.writer}</td>
				<td>${data.date}</td>
				<td>${data.hit}</td>
			</tr>
		</c:forEach>
	</table>
<%-- 페이지 이동 기능 --%>
	<table class="TABLESTYLE3 W700P">
		<tr>
			<td align="center">
			<c:if test="${PINFO.startPage eq 1}">
				<input type="button" value="이전" class="BUTTON1">
			</c:if>
			<c:if test="${PINFO.startPage ne 1}">
				<a href="../AnBoard/BoardSearch.bmw?nowPage=${PINFO.startPage - 1}&key=${KEY}&text=${TEXT}"><input type="button" value="이전" class="BUTTON1"></a>
			</c:if>
			<c:forEach var="page" begin="${PINFO.startPage}" end="${PINFO.endPage}">
				<a href="../AnBoard/BoardSearch.bmw?nowPage=${page}&key=${KEY}&text=${TEXT}"><input type="button" value="${page}" class="BUTTON2"></a>
			</c:forEach>
			<c:if test="${PINFO.endPage eq PINFO.totalPage}">
				<input type="button" value="다음" class="BUTTON1">
			</c:if>
			<c:if test="${PINFO.endPage ne PINFO.totalPage}">
				<a href="../AnBoard/BoardSearch.bmw?nowPage=${PINFO.startPage + 1}&key=${KEY}&text=${TEXT}"><input type="button" value="다음" class="BUTTON1"></a>
			</c:if>
			</td>
		</tr>
	</table>
<%-- 부가 기능 --%>
</body>
</html>