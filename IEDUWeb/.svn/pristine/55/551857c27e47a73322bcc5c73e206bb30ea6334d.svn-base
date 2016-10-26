<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP</title>
</head>
<body>
<%
	// 모델을 알아낸다.
	boolean isLogin = (boolean) request.getAttribute("ISMEMBER");
	if(isLogin == true){
		// 컨트롤러가 로그인에 성공했다고 알려주었니?
		// 성공하면 보여줄 요청을 다시한다.
		// 나는 성공하면 질문 목록을 보여주고 싶다.
		response.sendRedirect("../");
	}
	else{
		// 컨트롤러가 로그인에 실패했다고 알려주었니?
		// 다시 로그인 화면을 보여주고 싶다.
		response.sendRedirect("../Login/LoginForm.kim");

	}
%>
 
</body>
</html>