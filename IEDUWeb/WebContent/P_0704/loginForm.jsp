<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
<style>
	body {
		font-family : 굴림;
		font-size : 12px;
	}
	table{
/* 		position : absolute; 
 		right : 0px; */
 		float : right;
		width : 300px;
		border-top : 2px solid red;
		border-bottom : 2px solid red;
		border-collaspse : collapse;
		
	}
	td, tr{
		border-bottom : 1px solid yellow;
		height : 30px;
	}
	/* table{
		border-collapse : collapse;
		width : 70%;
		height : 50px;
	}
	table tr td{
		border : 1px solid black;
	}
	tr {
		height : 50px;
	}
	td.title{
		width : 20%;
		text-align : right;
		padding : 20px;
	}
	td.input{
		width : 80%;
		vertical-align : top;
	} */
</style>
</head>
<body>
	<%-- 이 문서는 폼을 제공하기 위한 문서 --%>
	<%-- 
	form을 만들때 가장 중요한 속성
	method 서버에 데이터를 전송하는 방식을 지정하는 것으로 get, post방식 중 하나를 선택
	action 이 ㅠㅗㅁ에 있는 데이터를 방아서 처리할 요청URL을 기록하는 부분
	우리로 말하면 로그인을 처리할 문서 URL을 지정하는 부분
	--%>
	<form method="post"
		action="http://localhost:8080/IEDUWeb/P_0704/loginFormReceive.jsp">
		<table align="center">
			<tr>
				<td class="title">아이디</td>
				<td class="input">
			<%-- 
			폼에 의해서 데이터를 보내면
			name=""하는 부분이 키값이 된다.
			즉, 서버는 이 name의 값을 이용해서 이 입력상자에 입력된 내용을 알아내게 된다.
			name 속성을 지정하지 않으면 그 데이터는 서버에서 알 수 없다.
			--%> 
				<input type="text" name="id" style="width:130px; border:1px solid green">
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pw" style="width:130px; border:1px solid green"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="로그인"> <%-- 단추를 만드는 방법은 4가지
				 그중 두가지 단추는 이미 기능을 가지고 있는 단추이다.
				 <input type="submit">
				 => 서버 폼에 있는 데이터를 전달하면 처리를 요철하는 기능을 가진 단추.
				 	데이터를 전달하는 작업을 "제출"이라는 표현을 쓰고 이것이 영어로 submit이라 한다.
				 	이 단추는 폼에 있는 데이터를 서버에 전송하면서 action에 기록한 요청을 하게 되는 것이다.
				 <input type="reset">
				 => 폼에 있는 애용르 초기화(지우는 작업x)시키는 기능을 가진 단추.
				 기능이 없는 단추
				 <input type="button">
				 <input type="image"> --%></td>
			</tr>
		</table>
	</form>
</body>
</html>