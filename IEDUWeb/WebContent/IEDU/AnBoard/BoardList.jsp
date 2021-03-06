<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="../lib/jquery.js"></script>
<%-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
	둘 중에 아무거나 써도 무방하다.
 --%>
<script>
	$(document).ready(function(){
		// 글쓰기 단추를 누르면 뭔가를 실행하고자 한다.
		// 1. 단추를 선택한다
		// $("#wBtn")
		// 2. 이벤트 선택한다.
		// click
		$("#wBtn").click(function(){
			// 자바스크립트처럼
// 			location.href = "../AnBoard/WriteForm.bmw"; // 로 해도 관계없다.
			// JQuery 방식
			// location은 <a> 태그를 의미하는 예약된 용어이다.
			// <a href=""> href는 <a> 태그의 속성이다.
			$(location).attr("href", "../AnBoard/WriteForm.bmw");
			// 참고 자바스크립트의 모든 클래스는 JQuery에서는 요소가 된다.
			// 예> document.???? -> $(documnet) 이처럼 요소가 된다.
		});
	});
	
	$(document).ready(function(){
		$("#sBtn").click(function(){
			// 무결성검사
			$text = $("#text").val();
			if($text == ""){
				alert("내용을 입력하세요");
				return;
			}
			// 서버 제출
			$("#sfrm").attr("action", "../AnBoard/BoardSearch.bmw")
			$("#sfrm").submit();
		});
	});
</script>
<link rel=stylesheet href="../../Base.css">
<title>JSP</title>
</head>
<body>
<%-- 목록보기 --%>
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
<!-- 지금 출력할 글이 답글이면 조금 들여쓰기를 해야 하낟.
	들여쓸 간격은 step이 알고있다.
	
	HTML은 여러개의 공백을 쓰더라도 하나로 인정한다.
	강제로 공백을 만들어 주어야 한다.
	공백을 만들어주는 예약어 &nbsp;
-->
<!-- 해야할 일이 하나더 있는데 이것은 답글쓰기를 한 후 처리한다. -->
				<td>
				<c:if test="${data.step ne 0}">
					<c:forEach var="step" begin="1" end="${data.step}">
						&nbsp;&nbsp;&nbsp;
					</c:forEach>
						└▷
				</c:if>
				<a href="../AnBoard/BoardHit.bmw?no=${data.no}&nowPage=${PINFO.nowPage}&target=list">${data.title}</a></td>
				<td>${data.writer}</td>
				<td>${data.date}</td>
				<td>${data.hit}</td>
			</tr>
		</c:forEach>
	</table>



<%-- 페이지 나눔 기능 만들고 --%>
	<table class="TABLESTYLE3 W700P">
		<tr>
			<td align="center">
<%-- [이전] [1][2][3][4][5] [다음] --%>
				<c:if test="${PINFO.startPage eq 1}">
					<input type="button" value="이전" class="BUTTON1">
				</c:if>
				<c:if test="${PINFO.startPage ne 1}">
					<a href="../AnBoard/BoardList.bmw?nowPage=${PINFO.startPage - 1}"><input type="button" value="이전" class="BUTTON1"></a>
				</c:if>
				<c:forEach var="page" begin="${PINFO.startPage}" end="${PINFO.endPage}">
					<c:if test="${page eq PINFO.nowPage}">
						<input type="button" value="${page}" class="BUTTON2">
					</c:if>
					<c:if test="${page ne PINFO.nowPage}">
						<a href="../AnBoard/BoardList.bmw?nowPage=${page}"><input type="button" value="${page}" class="BUTTON2"></a>
					</c:if>
				</c:forEach>
				<c:if test="${PINFO.endPage eq PINFO.totalPage}">
					<input type="button" value="다음" class="BUTTON1">
				</c:if>
				<c:if test="${PINFO.endPage ne PINFO.totalPage}">
					<a href="../AnBoard/BoardList.bmw?nowPage=${PINFO.endPage + 1}"><input type="button" value="다음" class="BUTTON1"></a>
				</c:if>
			</td>
		</tr>
	</table>



<%-- 기타기능 --%>
	<table class="TABLESTYLE3 W700P">
		<tr>
			<td align="center">
				<input type="button" id="wBtn" value="글쓰기" class="BUTTON3">
			</td>
		</tr>
	</table>
	
	
<%-- 검색기능 --%>
	<form method="post" id="sfrm">
		<table class="TABLESTYLE3 W700P">
			<tr>
				<td align="center">
<%--
	콤보상자를 선택하면 선택한 항목의 value값이 서버에 전달된다.
	즉, 제목을 선택하면 서버에는 '제목'이 가는것이 아니고 '2'가 전달된다.
	value값이 서버로 전달되는 입력요소: 콤보상자, 목록상자, 라디오상자, 체크단추
 --%>
					<select name="key" id="key">
						<option value="1">글쓴이</option>
						<option value="2">제목</option>
						<option value="3">본문</option>
						<option value="4">제목 + 본문</option>
					</select>
<%--
	HTML 5 에서는 검색할 입력상자는 type="search"로 만들도록 권장하고 있다.
 --%>
					<input type="search" name="text" id="text">
					<input type="button" id="sBtn" value="검색하기" class="BUTTON2">
				</td>
			</tr>
		</table>
	</form>
 
</body>
</html>