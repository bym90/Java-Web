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
	<c:if test="${CHECK}">
	<%-- 삭제가 되었으면 목록보기로 보낸다. --%>
		<script>
		location.href = "../AnBoard/BoardList.bmw";
		</script>
	</c:if>
	<c:if test="${not CHECK}">
	<%-- 삭제가 되지않았으면 경고메세지 띄우고 상세보기로 보낸다. --%>
		<script>
			confirm("비밀번호가 틀렸습니다.")
			location.href = "../AnBoard/BoardView.bmw?no=${NO}&nowPage=${NOWPAGE}";
		</script>
	</c:if>  
</body>
</html>