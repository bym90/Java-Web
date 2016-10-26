<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../Base.css">
<title>JSP</title>
<script>
	// 자바 스크립트는 개발자가 만들어서 클라이언트에게 그대로 준후
	// 실행은 클라이언트가 하도록 하는 프로그램을 말한다.
	// 주로 하는 역할
	// 서버가 해야할 일 중에서 클라이언트쪽에서 담당할 수 있는 일을 
	// 할 수 있도록 하기 위해서이다.
	// 예를 들어 서버는 클라이언트가 보내준 데이터를 점검할 필요가 있다.(무결성 검사)
	function sendGuest(){
		// 방명록에 쓴 데이터를 클라이언트에게 주기 전에 먼저 점검을 하고
		// 온전한 데이터를 서버에게 전달함으로써 서버가 편하게 일을 할 수 있도록
		// 할 예정이다.
		
		// 1. 점검할 요소를 알아낸다.
		//	  나는 글쓴이를 입력하면 input 요소를 알아내고 싶다.
		//    명령어
		//    document.getElementById("알아낸 요소의 id값")
		//    참고 HTML문서 안에는 워칙적으로 id값은 유니크 해야한다.
		var wr = document.getElementById("writer");
		// 2. 요소의 속성을 이용해서 원하는 내용을 처리한다.
		//    참고 input 요소의 데이터는 value라는 속성이 가지고 있다.
		var wrData = wr.value; // 이 안에 입력한 글쓴이가 기억될 것이다.
							   // 이것은 String으로 기억될 것이므로
		if(wrData.length == 0 || wrData == ""){
			alert("글쓴이를 입력해 주세요");
			return;
		}
		
		var bo = document.getElementById("body");
		// bo.value = "안녕하세요" 데이터를 강제로 집어넣을 수도 있다.
		var boData = bo.value;
		if(boData.length == 0 || boData == ""){
			alert("글내용을 입력해 주세요");
			return;
		}
		// 점검이 끝났으므로 서버에 이 데이터를 보내야한다.
		// 서버에 데이터를 보낸느 행위를 submit이라고 하며
		// 이때 클라이언트는 서버에게 action 속성에 지정된 요청을 하게 된다.
		// 1. 폼 요소를 알아낸다.
		var form = document.getElementById("gfrm")
		// 2. 속성을 이용해서 그 속성값에 필요한 데이터를 기억한다.
		form.action = "../Guest/GuestWrite.do"
		// 한마디로 말해서 속성은 자바의 변수와 유사한 것으로
		// 데이터를 기억할 수도 있고, 데이터를 제공할 수도 있다.
		// 3. 마지막으로 이 폼의 데이터를 서버에 보내자. (기능)
		// 함수 submit();
		form.submit();
	}
</script>
</head>
<body>
<%--
	방명록 쓰기 폼
 --%>
	<form method="post" name="gfrm" id="gfrm" action="">
		<table>
			<tr>
				<td class="W100P">글쓴이</td>
				<td>
<%-- 요소를 만들때 name - 주로 서버에서 이 요소를 처리할 경우를 대비해서
				   id - 주로 자바스크립트나 JQuery등에서 이용할 경우를 대비해서
				   class - 주로 CSS를 처리하기 위해서
 --%>
					<input  class="W300P" type="text" name="writer" id="writer">
				</td>
			</tr>
			<tr>
				<td class="W100P">방명록 글</td>
				<td>
					<textarea class="W500P" rows="10px" name="body" id="body"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="글쓰기" onclick="sendGuest()">
<%--
	자바 스크립트는 클라이언트가 실행하는 프로그램이다.
	그러므로 클라이언트가 프로그램을 실행할 수 있도록 조치를 해주어야 한다.
	조치를 취하는 방법
	1. 이벤트를 이용하는 방법 90%
	=> 클라이언트가 특정한 행동을 했을 경우 프로그램이 실행되도록 하는 것
	2. 자동 실행 방법
	=> 함수를 이용하지 않고 프로그램을 작성하면 된다.	
 --%>
<%-- reset 단추는 폼에 있는 내용을 초기화 시키는 기능을 가진 단추이다. --%>
					<input type="reset" value="다시쓰기">
				</td>
			</tr>
		</table>	
	</form>
	<%--
		방명록 내용 부여주기
	 --%>
	<%
		// 원래 잊가업도 다음주가 되면 없어질 작업
		// 다음주에 JSTL을 배우면 이 작업도 하지 않아도 된다.
		// JSTL은 뷰에서는 자바를 사용하지 않도록 하기 위해서 만든 태그 라이브
		// 컨트롤러가 알려준 모델을 알아낸다.
		// 방법 request.getAttribute("키값");
		int[] num = (int[])	request.getAttribute("no");
		String[] body = (String[]) request.getAttribute("body");
		String[] writer = (String[]) request.getAttribute("writer");
		String[] date = (String[]) request.getAttribute("date");
		for(int i = 0; i< num.length; i++){
	%>
		<table class="TABLESTYLE1">
			<tr>
		 		<td>글번호</td>
		 		<td><%= num[i] %></td>
		 		<td>작성일</td>
		 		<td><%= date[i] %></td>
		 	</tr>
		 	<tr>
		 		<td>작성자</td>
		 		<td colspan="3"><%= writer[i] %></td>
		 	</tr>
		 	<tr>
		 		<td colspan="4"><%= body[i] %></td>
		 	</tr>	
		</table>
 	<%
		}
 	%>
</body>
</html>