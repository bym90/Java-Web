<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, QNA.*"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP</title>
<link rel="stylesheet" href="../Base.css">
</head>
<script>
	function QuestionWrite() {
		// submit()은 폼에 있는 데이터를 서버에 보낼때 사용하는 명령이다.
		// 일반적인 요청은 location이라는 내장객체를 이용해서 처리한다.
		// 이 객체는 하이퍼링크에 관련된 내용을 관리하는 내장 객체이다.
		// 주요 속성(변수)
		// href 요청할 URL를 기억하는 속성
		location.href = "../QNA/QuestionForm.kim";
		// 이렇게 하면 자바 스크립트의 속성은 실행까지 담당하므로...
		// 요청이 이루어진다.
		// 위의 것은
		// <a href="../QNA/QuestionForm.kim">눌러봐</a>와 동이란 것이다.
	}
	
	function ShowProc(no) {
		var	trs = document.getElementById("tr" + no);
		var	status = trs.style.display;
		if(status == "none") {
			trs.style.display = "block";
		}
		else {
			trs.style.display = "none";
		}
	}
	
	function AnswerProc(no) {
		// 답변을 하려면 답변하기 폼을 요청을 한다.
		// 답변이라는 개념은 무슨 질문에 대한 답변인지를 알아야 한다.
		// 그래서 클라리언트쪽(관리자)에서는 단추를 누르면 무슨질문에 대한
		// 답인지를 서버에게 알려주어야 할 것이다
		// 문제
		// 무엇을 알려주면 서버는 무슨질문인지를 알 수 있을까요?
		// 질문 번호를 알려준다. (릴레이방식)
	
		// 하이퍼링크 방식으로 요청을 한다.
		// http://localhost:8080/IEDUWeb/QNA/AnswerForm.kim
		// 이떄 부가정보를 보내고 싶으면
		// http://localhost:8080/IEDUWeb/QNA/AnswerForm.kim?키값=데이터&키값=데이터
		// 의 형식으로 보내야 한다.
		location.href ="../QNA/AnswerForm.kim?qno="+ no;
	}
</script>
<body>
	<%--
	1. 질문 목록을 보여준다.
 --%>
	<table class="TABLESTYLE1 W700P">
		<tr>
			<td width="10%">글번호</td>
			<td width="45%">제목</td>
			<td width="10%">작성자</td>
			<td width="35%" colspan="3">작성일</td>
			
		</tr>
	</table>
		<%-- 실제 목록을 출력한다. --%>
		<%
	// 컨트롤러가 알려준 모델을 꺼낸다.
	ArrayList list = (ArrayList) request.getAttribute("LIST");
	// 목록의 개수만큼 반복한다.
	for(int i=0; i<list.size(); i++){
		// 한줄의 데이터를 꺼낸다.
		QNAData data = (QNAData) list.get(i);
%>
	<table class="TABLESTYLE1 W700P">
		<tr>
			<td width="10%"><%= data.qNO %></td>
			<td width="45%"><%= data.qTitle %></td>
			<td width="10%"><%= data.qWriter %></td>
			<td width="15%"><%= data.qDate %></td>
			<td width="10%"><input class="BUTTON2" type="button" value="답변하기" Onclick="AnswerProc(<%= data.qNO%>)"></td>
			<td width="10%"><input class="BUTTON1" type="button" value="상세보기" Onclick="ShowProc(<%= data.qNO%>)"></td>
		</tr>
	</table>
	<table class="TABLESTYLE2 W700P" id="tr<%= data.qNO %>" style="display:none">
		<tr>
			<td width="100">질문</td>
			<td width="900" colspan="3"><%= data.qQuestion %></td>
		</tr>
		<tr>
			<td width="100">답변자</td>
			<td width="400"><%= data.aWriter %></td>
			<td width="100">답변일</td>
			<td width="400"><%= data.aDate %></td>
		</tr>
		<tr>
			<td width="100">답변</td>
			<td width="900" colspan="3"><%= data.aAnswer %></td>
		</tr>
	</table>
<%
	}
%>





	<%--
	2. 질문을 쓸 수 있는 단추를 만들어 준다.
 --%>
	<table class="TABLESTYLE1 W50P">
		<tr>
			<td align="right"><input class="BUTTON1" type="button" value="질문하기" OnClick="QuestionWrite()"> 
	<%--
	이 단추는 <a href="요청내용">하는 하이퍼링크로 만들어도 된다.
 --%>		</td>
		</tr>
	</table>
</body>
</html>