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
<body>
<%-- 
	처음 게시판이 오픈되면 게시물이 없을 수도 있을것이다
	있는 경우와 없는 경우를 구분해서 처리하고 싶다면
--%>
<%--<c:if test="${empty LIST}">
		<table class="TABLESTYLE2">
			<tr>
				<td>
					아직 게시물이 없습니다. 첫 게시물의 주인공이 되세요.
				</td>
			</tr>
		</table>
	</c:if>
	<c:if test="${not empty LIST}">
		<table class="TABLESTYLE2">
			<tr>
				<td>
					게시물이 있습니다.
				</td>
			</tr>
		</table>
	</c:if>
--%>

	<c:choose>
		<c:when test="${empty LIST}">
		<table class="TABLESTYLE2">
			<tr>
				<td align="center">
					아직 게시물이 없습니다. 첫 게시물이 주인공이 되세요.
				</td>
			</tr>
		</table>
		</c:when>
		<c:otherwise>
		<table class="TABLESTYLE2">
			<%--첫번째 줄에는 목록 출력을 위한 제목을 출력한다--%>
			<thead>
			<tr>
				<td width="10%" >번호</td>
				<td width="40%">제목</td>
				<td width="15%">글쓴이</td>
				<td width="20%">날짜</td>
				<td width="*">조회수</td>
			</tr>
			</thead>
			<%--	
				두번째 줄 부터 목록을 출력한다.
				이 목록은 컨트롤러가 알려준 개수만큼 출력하면 된다.
			--%>
			<c:forEach var="data" items="${LIST}">
			<%--
			위의 명령은 컬렉션에 있는 데이터가 하나씩 나와서
			준비된 변수(data) 기억이 되고 반복되어진다.
			
			이 변수를 사용하는 방법
			1. 변수안에 있는 데이터가 일반 데이터(int, String) :${data}
			2. 변수안에 있는 데이터가 데이터 빈 클래스면	   :${data.get함수이름}
			엄밀히 말해서 변수이름이 아니고 get함수의 이름을 사용하는 것이다.
			우리는 불문율 의해서 변수이름을 이용해서 get 함수를 만들었으므로
			마치 변수 이름을 사용하는 것 처럼 보일 뿐이다.
			
			함수의 이름을 사용할 경우에는 첫글자는 반드시 소문자로 쓰고
			나머지 글자는 그대로(대소문자 구분하여) 사용한다.
			--%>
			<tr>
				<td>${data.no}</td>
				<td><a href="../ReBoard/BoardView.bmw?rbno=${data.no}&nowPage=${PINFO.nowPage}">${data.splittitle}</a></td>
				<td>${data.writer}</td>
				<td>${data.yydate}</td>
				<td>${data.hit}</td>
			</tr>
			</c:forEach>
		</table>
		
		</c:otherwise>
	</c:choose>
		<%--
	페이지 이동기능을 만들어보자.
 --%>
 		<table class="TABLESTYLE2">
 			<tr>
 				<td align="center">
 					<c:if test="${PINFO.startPage eq 1}">
 						[이전]
 					</c:if>
 					<c:if test="${PINFO.startPage ne 1}">
 						<a href="../ReBoard/BoardList.bmw?nowPage=${PINFO.startPage-1}" class="A">[이전]</a>
 					</c:if>
 				<%-- [이전단추] --%>
 				<%-- [1][2][3][4][5] --%>
 					<c:forEach var="page" begin="${PINFO.startPage}" end="${PINFO.endPage}" step="1">
 						<a href="../ReBoard/BoardList.bmw?nowPage=${page}" class="A">[ ${page} ]</a>
 					</c:forEach>
 				<%-- [다음단추] --%>
 					<c:if test="${PINFO.endPage eq PINFO.totalPage}">
 						[다음]
 					</c:if>
 					<c:if test="${PINFO.endPage ne PINFO.totalPage}">
 						<a href="../ReBoard/BoardList.bmw?nowPage=${PINFO.endPage + 1}" class="A">[다음]</a>
 					</c:if>
 				</td>
 			</tr>
 		</table>
		<table class="TABLESTYLE2">
		<tr>
			<%-- 부가 기능을 할 하이퍼링크를 만들자. --%>
			<td align="center" colspan="5">
				<a href="../ReBoard/BoardWriteForm.bmw" class="A">글쓰기</a>
<%--	
		하이퍼링크(<a>)는 원칙적으로 href 속성에 있는 요청을 GET 방식으로 
		하는 것이다.
--%>
			</td>
		</tr>
		</table>

</body>
</html>
