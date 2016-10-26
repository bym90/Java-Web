<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=styleSheet href="../Base.css">
<title>JSP</title>
</head>
<body>
<%-- 상세보기 --%>
	<table class="TABLESTYLE1">
 		<tr>
 			<td>글번호</td>
 			<td colspan="3">${DATA.no}</td>
 		</tr>
 		<tr>
 			<td>작성자</td>
 			<td>${DATA.id}</td>
 			<td>작성날짜</td>
 			<td>${DATA.date}</td>
 		</tr>
 		<tr>
 			<td>제목</td>
 			<td colspan="3">${DATA.title}</td>
 		</tr>
 		<tr>
 			<td>본문</td>
 			<td colspan="3">${DATA.brbody}</td>
 		</tr>
 	</table>
<%-- 파일목록 --%>
 	<table class="TABLESTYLE1">
 		<c:forEach var="data" items="${FLIST}">
 		<tr>
 			<td>
 			<!-- 일반적으로 요청할때 파일의 이름을 요청하면 자동으로 파일 다운로드가 된다. 
 				예> <a href="xxx.zip">xxx.zip</a>
 				이렇게 하면 단점
 				1. 그 파일은 반드시 서버 관리하(프로젝트 안)에 있어야한다.
 				2. 그 파일이 그림 파일이거나 txt파일이면 다운로드가 되지 않는다.
 				
 				이런 전제 조건 없이 모든 파일을 다운로드 시키기 위해서는 컨트롤러에서
 				처리해 주어야 한다.
 			-->
 			
 				<a href="../FileBoard/FileDownload.bmw?no=${data.no}">
 				${data.oriName} 
 				</a>
 				(<fmt:formatNumber value="${data.length}" pattern="#,###,###"/>)
 			</td>
 		</tr>
 		</c:forEach>
 	</table>
</body>
</html>