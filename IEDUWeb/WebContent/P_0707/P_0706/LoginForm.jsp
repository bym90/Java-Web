<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP</title>
</head>
<body>
<%--
	★★★
	URL을 지정하는 방법
	1. 절대주소 지정하는 방법
	http://부터 모두다 기술하는 방법
	장점: 주소를 이해하기 쉽게 입력할 수 있다.
	단점: 서버의 주소가 달라지면 수정해야 한다.
		  주소의 길이가 길어진다.
	2. 상대주소 지정하는 방법
	현재 문서가 보이는 주소와 요청할 문서의 주소를 비교해서
	같은 부분까지는 생략하고 다른 부분만 기술하는 방법
	장점: 서버의 주소가 달라지더라도 수정할 필요가 없다.
	단점: 주소를 이해하기 어렵다.
		  주소의 길이가 짧아진다.
	
	예>	현재 문서
		http://localhost:8080/IEDUWeb/P0706/LoginForm.jsp
		로그인 처리문서
		http://localhost:8080/IEDUWeb/P0706/LoginProc.jsp
	
		결론	LoginProc.jsp		만 기록하면 된다.
	
	예>	현재 문서
		http://localhost:8080/IEDUWeb/P0705/LoginForm.jsp
		로그인 처리문서
		http://localhost:8080/IEDUWeb/P0706/LoginProc.jsp
	
		결론	../P0706/LoginProc.jsp
		참고	..	이란		한단계 위로 올라가세요.
		
	예>	현재 문서
		http://localhost:8080/IEDUWeb/LoginForm.jsp
		로그인 처리문서
		http://localhost:8080/IEDUWeb/P0706/LoginProc.jsp
	
		결론	./P0706/LoginProc.jsp
		참고	.	이란	자기 자신을 표현하는 기호이다.	
--%>

	<form method="post" action="LoginProc.jsp">
		<table widht="500" align="center" border="1">
			<tr>
				<td width="20%">아이디</td>
				<td>
					<input type="text" name="id">
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input type="password" name="pw">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="로그인">
				</td>
			</tr>
		</table>	
	</form>
 
</body>
</html>