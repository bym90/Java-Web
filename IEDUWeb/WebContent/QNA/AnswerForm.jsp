<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=stylesheet href=../Base.css>
<title>JSP</title>
</head>
<script>
	function AnswerCheck(){
		// 무결성 검사하시고...
		// 서버에 전송한다.
		var form = document.getElementById("afrm");
		form.action = "../QNA/AnswerProc.kim";
		form.submit();
	}
</script>
<body>
<%
	String nick = (String) session.getAttribute("NICK");
	int qno = (int) request.getAttribute("QNO");
%>
	<form method="post" id="afrm">
<%--
	form에 있는 데이터를 서버에게 보내는 행위를 submit이라고 한다.
	이때는 ★★★
	<form>~</form>안에 있는 데이터만 서버에게 전송된다.
	밖에 있는 데이터는 서버에게 전송되지 않는다.
	
	그러므로 서버로 보내야 하는 모든 데이터는 반드시 <form>안에 있어야 한다.
	문제는
	화면에 보이면 곤란하고 서버엔느 보내야 하는 데이터가 존재하면?
	
	이때 사용하는 도구가 <input type="hidden">이다.
	이것을 사용하면 화면에는 보이지 않고 그 내용은 서버에 전달되어진다.
 --%>	
 		<input type="hidden" name="qno" value="<%=qno%>"> <%--세션을 통해서 가져갈수 없나 복습하기!! --%>
		<table class="TABLESTYLE1">
			<tr>
				<td>글쓴이</td>
				<td>
					<input type="text" name="wrtier" id="wirter" value="<%=nick%>">	
				</td>
			</tr>
			<tr>
				<td>답변내용</td>
				<td>
					<textarea name ="body" id="body"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input class="BUTTON1" type="button" value="답변하기" Onclick="AnswerCheck()">
				</td>
			</tr>
		</table>
	</form>
 
</body>
</html>