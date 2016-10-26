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
<%-- 목록보기로 보내도록 한다. --%>
 	<c:redirect url="../AnBoard/BoardList.bmw">
 		<c:param name="nowPage" value="${NOWPAGE}"/>
 	</c:redirect>
</body>
</html>