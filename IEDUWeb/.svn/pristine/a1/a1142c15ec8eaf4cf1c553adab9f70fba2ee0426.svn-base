<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- JSTL 중 Core를 사용할 준비를 한다 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=stylesheet href=../Base.css>
<title>JSP</title>
</head>
<script>
	function ReplyCheck() {
		// 무결성 검사 하시고...
		
		// 서버에게 데이터를 보낸다.
		var form = document.getElementById("rfrm");
		form.action = "../ReBoard/ReplyProc.bmw";
		form.submit();
	}
	
	function ModifyShow(no){
		// 이번호에 해당하는 테이블을 알아낸다.
		var ta = document.getElementById("t" + no);
		// 화면에서 그 테이블을 숨기도록 한다.
		ta.style.display = "none";
		
		// 폼 테이블을 알아낸다.
		var mt = document.getElementById("m" + no);
		// 이 테이블을 화면에 출력한다.
		mt.style.display = ""; // default 기본값 block
	}

	function ReplyModifyCheck(no) {
		//	해당 번호에 대한 폼을 알아낸다.
		var	form = document.getElementById("frm" + no);
		//	무결성 검사하시고
		
		form.action = "../ReBoard/ReplyModifyProc.bmw";
		form.submit();
	}
</script>
<body>
<%--	상세보기 내용을 출력하고 --%>
	<table class="TABLESTYLE3">
		<tr>
			<th>번호</th>
			<td>${DATA.no}</td>
			<th>조회수</th>
			<td>${DATA.hit}</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${DATA.writer}</td>
			<th>작성날짜</th>
			<td>${DATA.yydate}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td colspan="3">${DATA.splittitle}</td>
		</tr>
		<tr>
			<td colspan="4">${DATA.brbody}</td>
		</tr>
	</table>
	
	
	
<%--	부가 기능을 만들고 --%>
	<table class="TABLESTYLE3">
		<tr>
			<td align="center">
				<a href="../ReBoard/BoardList.bmw?nowPage=${NOWPAGE}">목록보기</a>
				<a href="../ReBoard/BoardModifyForm.bmw?rbno=${DATA.no}&nowPage=${NOWPAGE}">수정하기</a>				
				<a href="../ReBoard/BoardDelete.bmw?rbno=${DATA.no}">삭제하기</a>
				<a href="../ReBoard/GoodProc.bmw?rbno=${DATA.no}&nowPage=${NOWPAGE}">추천[ ${DATA.good} ]</a>
			</td>
		</tr>
	</table>
	
	
	
<%--	답글 보기를 출력하고 --%>
	<c:forEach var="data" items="${RLIST}">
		<table class="TABLESTYLE1" id="t${data.no}">
			<tr>
				<th>번호</th>
				<td>${data.no}</td>
				<th>날짜</th>
				<td>${data.yydate}</td>
			</tr>	
			<tr>
				<th>글쓴이</th>
				<td colspan="2">${data.writer}</td>
				<td>
					<a href="#" Onclick="ModifyShow(${data.no})" class="A">수정</a>
					<a href="../ReBoard/ReplyDelete.bmw?rpno=${data.no}&rbno=${DATA.no}&nowPage=${NOWPAGE}" class="A">삭제</a>
				</td>
			</tr>
			<tr>
				<td colspan="4">${data.brbody}</td>
			</tr>
		</table>
		
		
		<%-- 각각 답글의 수정하는 폼을 미리 만들어 놓는다. 
			다만 처음에는 보이지 않도록 한다.
		--%>
		<form method="post" id="frm${data.no}">
		<%--	같이 보내야할 데이터는 히든으로 숨겨 놓는다. --%>
			<input type="hidden" name="rpno" value="${data.no}">		
			<input type="hidden" name="rbno" value="${DATA.no}">		
			<input type="hidden" name="nowPage" value="${NOWPAGE}">		
			<table class="TABLESTYLE1" id="m${data.no}" style="display:none;">
				<tr>
					<th>글쓴이</th>
					<td>
						<input type="text" name="writer" id="writer" value="${data.writer}">
					</td>
				</tr>
				<tr>
					<th>답글</th>
					<td>
						<textarea name="body" id="body">${data.body}</textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<a href="#" onClick="ReplyModifyCheck(${data.no})">수정완료</a>
					</td>
				</tr>
			</table>
		</form>
	</c:forEach>
	
	
	
<%--	답글 쓰기 폼을 만든다. --%>
 	<form method="post" name="rfrm" id="rfrm">
 	<input type="hidden" name="rbno" value="${DATA.no}">
 	<input type="hidden" name="nowPage" value="${NOWPAGE}">
	<%-- 답글을 쓸 경우에는 반드시 이글이 어떤 글에대한 답글인지를 알려주어야한다.
		form에 있는 데이터를 보내는 경우에는 따로 데이터를 보낼 수 없다.
		반드시 폼안에 있어야 한다.
	 --%>
		<table class="TABLESTYLE2">
			<tr>
				<th>글쓴이</th>
				<td>
					<input type="text" name="writer" id="writer">
				</td>
			</tr>
			<tr>
				<th>답글</th>
				<td>
					<textarea name="body" id="body" cols="50" rows="10"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<a href="#" Onclick="ReplyCheck()">답글쓰기</a>
				</td>
			</tr>
		</table>
	</form>
	
 
</body>
</html>