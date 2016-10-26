<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP</title>
</head>
<body>
<%-- 수정하기 작업이 끝나면 보여줄 내용은 없고
	대신 다른 문서를 보여준다.
	글의 상제 보기를 다시 보여주도록 한다.
 --%>
 	<c:redirect url="../ReBoard/BoardView.bmw">
 		<c:param name="nowPage" value="${NOWPAGE}"/>
 		<c:param name="rbno" value="${RBNO}"/>
 	</c:redirect>
 
</body>
</html>