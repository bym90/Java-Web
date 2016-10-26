<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
</head>
<body>
	

	<p>당신의 이름은 <%=getName()%> 입니다</p>

<%! 
	// 전역 변수를 만들거나 함수를 만들고 싶을때
    // 위치를 바꾼 상태
 	String[] name = {"A", "B", "C", "D", "E"};
	public String getName(){
		int pos = (int)(Math.random()*(4-0+1)+0);
	    return name[pos];
	}
%>
 
</body>
</html>