<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
</head>
<body>
<!-- 	<form method="GET" action="http://localhost:8080/IEDUWeb/P_0704/Out.jsp"> -->
	<%-- 하이퍼링크는 100% get이고
		 장점은 데이터 교환방식이므로 처리 속도가 빠르다.
		 단점은 요청 내용이 모두 노출되고 데이터 교환방식이므로 대량의 데이터는 문제가 생긴다.
		 
		 폼은 get이나 post 둘중에 선택할 수 있다. post의
		 장점은 요청 내용이 노출되지 않고, 스트림처리 방식이므로 많은 데이터도 데이터를 계속
		 흘려보내기 때문에 문제가 생기지 않는다.
		 단점은 내부적으로 스트림으로 변화해서 처리하므로 처리속도가 조금 느리다.
		 
		 get방식은 정보가 노출되고 post방식은 정보가 노출되지 않는다.--%>
	<form method="POST" action="http://localhost:8080/IEDUWeb/P_0704/Out.jsp">
		<input type="text"  name=id><br>
		<input type="submit" value="전송">
	</form>
 
</body>
</html>