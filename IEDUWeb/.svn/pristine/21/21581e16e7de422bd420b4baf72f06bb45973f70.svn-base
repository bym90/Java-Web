<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=styleSheet  href="../Base.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<title>JSP</title>
</head>
<script>
	$(document).ready(function(){
		// JQuery는 이벤트 등록과 실행을 모두 자바스크립트에서 처리한다.
		$("#aBtn").click(function(){
			$(location).attr("href", "../AnBoard/AnWriteForm.bmw?no=${DATA.no}&nowPage=${NOWPAGE}");
		});
		// 자바 스크립트 안에 JSTL명령을 사용할 경우에는
		// 이 명령은 반드시 ""로 처리해 주어야한다.
		// 이 경우 ""가 중첩되는 현상이 생길 수 있다.
		// 이런 경우에는 중첩되는 안쪽 "는 \"로 처리한다.
		// 아니면 ""와 ''를 번갈아가면서 사용할 수 있다.
		// 예> "	 '   " "    '	 "
		$("#lBtn").click(function(){
			<c:choose>
				<c:when test="${TARGET eq 'list'}">
					$(location).attr("href", "../AnBoard/BoardList.bmw?nowPage=${NOWPAGE}");
				</c:when>
				<c:when test="${TARGET eq 'search'}">
					$(location).attr("href", "../AnBoard/BoardSearch.bmw?nowPage=${NOWPAGE}&key=${KEY}&text=${TEXT}");
				</c:when>
				<c:otherwise>
					$(location).attr("href", "../AnBoard/BoardList.bmw?nowPage=${NOWPAGE}");
				</c:otherwise>
			</c:choose>
		});
		
		$("#mBtn").click(function(){
			// 비밀번호를 입력 받아서
			// 이 비밀번호를 같이 알려주어야 한다.
			// 문제
			// 비밀번호는 화면에 노출되면 안되는 중요한 개인 정보이다.
			// GET방식은 화면에 노출이 된다.
			// 이처럼 문제가 되는 경우에는 POST방식으로 보내는 것이 안전하다.
			// 해결방법
			// => 임시로 폼을 만들고 그 폼안에 필요한 정보를 숨겨놓은 후
			// 그 폼을 submit시키는 방식으로 편법 처리해야 한다.
			// 1. 비밀번호를 입력받는다.
			var pw = prompt("비밀번호를 입력해주세요", "비밀번호"); 
			// prompt() 한주르이 데이터를 입력받는 입력상자를 만들어 주는 명령
			// JOptionPane.showInputDialog()에 해당하는 명령
			// pw 변수에는 입력한 비밀번호가 기억된다.
			// 무결성 검사하고
			// 이 내용을 임시폼에 준비된 hidden에 입력해 놓는다.
			$("#password").val(pw);
			// val() 내용을 알아내는 기능
			// val(??) ??내용을 기록하는 기능
					
			// 폼을 submit 시킨다.
		
			$("#imsifrm").attr("method", "POST");
			$("#imsifrm").attr("action", "../AnBoard/ModifyForm.bmw?nowPage=${NOWPAGE}");
			$("#imsifrm").submit();
			
			// 참고 JQuery라는 체인이라느 기능이 있다.
			// 이것은 같은 요소에 필요한 기능을 체인처럼 묶어서 처리할 수 있다.
			// 형식
			// 요소.함수().함수().함수().....
// 			$("#imsifrm").attr("method", "POST").attr("action", "../AnBoard/MoidfyForm.bmw").submit();
		});
		jQuery("#dBtn").click(function(){
			// 비밀번호를 prompt를 이용해서 받고
			$pw = prompt("비밀번호를 입력해 줄래?", "");
			// 무결성 검서하가ㅗ
			// 이것을 폼에 숨겨서
			$("#password").val($pw);
			// 이것을 폼에 숨겨서 서브밋한다.
			$("#imsifrm").attr("action", "../AnBoard/DeleteProc.bmw");
			$("#imsifrm").submit();
		});
		
		jQuery("#gBtn").click(function(){
			$(location).attr("href", "../AnBoard/GoodBadProc.bmw?no=${DATA.no}&nowPage=${NOWPAGE}&flag=1");
		});
		
		jQuery("#bBtn").click(function(){
			$(location).attr("href", "../AnBoard/GoodBadProc.bmw?no=${DATA.no}&nowPage=${NOWPAGE}&flag=2");
		});
	});
</script>
<body>


<%-- 상세보기 보여주고 --%>
	<table class="TABLESTYLE3 W600P">
		<tr>
			<th>번호</th>
			<td>${DATA.no}</td>
			<th>조회수</th>
			<td>${DATA.hit}</td>
		</tr>
		<tr>
			<th>글쓴이</th>
			<td>${DATA.writer}</td>
			<th>작성날짜</th>
			<td>${DATA.date}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td colspan="3">${DATA.title}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td colspan="3">${DATA.brbody}</td>
		</tr>
	</table>

<%-- 기타기능 만들고 --%>

	<table class="TABLESTYLE3 W600P">
		<c:if test="${sessionScope.ID ne DATA.writer}">
		<tr>
			<td align="center">
				<input type="button" id="gBtn" value="좋아요 (${DATA.good})" class="BUTTON1">
				<input type="button" id="bBtn" value="나빠요 (${DATA.bad})" class="BUTTON1">
			</td>
		</tr>
		</c:if>
		<tr>
			<td align="center">
				<input type="button" id="lBtn" value="목록보기" class="BUTTON3">
			<c:if test="${sessionScope.ID eq DATA.writer}">
				<input type="button" id="mBtn" value="수정하기" class="BUTTON3">
				<input type="button" id="dBtn" value="삭제하기" class="BUTTON3">
			</c:if>
				<input type="button" id="aBtn" value="답글달기" class="BUTTON3">
			</td>
		</tr>
	</table>
 	
 	<%-- 임시로 사용할 폼을 만든다. --%>
 	<form id="imsifrm">
 	<%-- 이 안에 필요한 모든 데이터를 숨겨놓는다. --%>
 		<input type="hidden" name="no" id="no" value="${DATA.no}">
 		<input type="hidden" name="nowPage" id="nowPage" value="${NOWPAGE}">
 		<input type="hidden" name="password" id="password">
 	</form>
 	
</body>
</html>