<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
</head>
<body>
	<a href="http://localhost:8080/IEDUWeb/P_0705/SurveyMain.jsp">설문조사</a><br>
	<%--
		현재 index는 http://localhost:8080/IEDUWeb/index.jsp
		목적지는 	 http://localhost:8080/IEDUWeb/P_0706/LoginForm.jsp --%>
	<a href="./Login/LoginForm.kim">로그인</a>
	<%-- 로그인에 성공한 사람에 한해서 게시판을 선택할 수 있도록 해보겠따.
		즉, 메뉴 중에서 로그인에 성공하면 게시판 목록 보기를 할 수 있도록 보여주겠다.
		로그인이 되지않으면 게시판 목록보기 메뉴를 보여주지 않겠다.
		
		JSTL에서 세션을 이용하는 방법
		${sessionScope.키값}
		예> 세션에 ID라는 메모가 있는지 확인하려면
		<c:if test="${not empty sessionScope.ID}"> 라고 하면 된다. --%>
		
		<c:if test="${not empty sessionScope.ID}">
			<a href="./AnBoard/BoardList.bmw">답변형 게시판</a>
			<a href="./FileBoard/BoardList.bmw">파일업로드 게시판</a>
		</c:if>
</body>
</html>