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
<%-- 답글을 달았으니 보여줄것은 없고
	 대신 상세보기를 다시 보여주고 싶다.
 --%>
 	<c:redirect url="../ReBoard/BoardView.bmw">
 		<c:param name="rbno" value="${RBNO}"/>
 		<c:param name="nowPage" value="${NOWPAGE}"/>
 	</c:redirect>
</body>
</html>