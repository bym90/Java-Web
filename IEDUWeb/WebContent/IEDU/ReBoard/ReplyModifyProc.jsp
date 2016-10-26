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
	<c:redirect url="../ReBoard/BoardView.bmw">
		<c:param name="rbno" value="${RBNO}"/>
		<c:param name="nowPage" value="${NOWPAGE}"/>
	</c:redirect>
 
</body>
</html>