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
		// 이 메인 화면 경우에 따라서 두가지 모습으로 변해햐 한다.
		// 그 경우는 로그인을 한 경우와 하지 않은 경우를 이용해서 변해야 한다.
		// 두 사람의 차이점은 수첩에 id혹은 nick의 정보가 있는가 없는가이다.
		String id = (String) session.getAttribute("ID");
		String nick = (String) session.getAttribute("NICK");
	%>
	<table width="1000" border="1" align="center">
		<tr height="100">
			<td colspan="2">
				위쪽메인화면
			</td>
		</tr>
		<tr height="600">
			<td width="80%">
				메인화면
			</td>
			<td valign="top">
			<%
				if(id != null && id.length() != 0){
			%>
				<table border="1" align="centet" width="100%">
					<tr>
						<td align="center"><%= nick %> 환영^^</td>
					</tr>
					<tr>
						<td align="center"><a href="LogoutProc.jsp">로그아웃</a></td>
					</tr>
				</table>
			<%
				}
				else{
			%>
				
				<form method="post" action="LoginProc.jsp">
					<table border="1" align="center" width="100%">
						<tr>
							<td>아이디</td>
							<td><input type="text" name="ID"></td>
						</tr>
						<tr>
							<td>비밀번호</td>
							<td><input type="password" name="PW"></td>
						</tr>
						<tr>
							<td colspan="2" align="center">
								<input type="submit" value="로그인">
							</td>
						</tr>	
					</table>
				</form>
			</td>
		</tr>
		<tr height="100">
			<td colspan="2">
				아래쪽메인화면
			</td>
		</tr>		
	</table>
 			<%
				}
 			%>
</body>
</html>