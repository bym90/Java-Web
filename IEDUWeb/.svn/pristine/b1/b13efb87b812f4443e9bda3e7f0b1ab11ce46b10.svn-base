<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP</title>
</head>
<body>
<%-- 조회수가 증가되면 자동으로 상세보기로 가야한다. --%>
	<c:redirect url="../AnBoard/BoardView.bmw">
		<c:param name="no" value="${NO}"/>
		<c:param name="nowPage" value="${NOWPAGE}"/>
		<c:param name="target" value="${TARGET}"/>
		<c:param name="key" value="${KEY}"/>
		<c:param name="text" value="${TEXT}"/>
	</c:redirect>
 
</body>
</html>