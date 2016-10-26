<?xml version="1.0" encoding="UTF-8"?>
<%@ page language="java" contentType="text/xml; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--  이문서가 xml 문서가 되기 위해서는 
	1. 첫 행은 반드시 xml 헤더로 시작해야 한다.
	2. 반드시 최사위 ROOT 태그가 딱 하나만 존재 해야한다.
 -->
<NEWSS>
	<!-- 이제 필요한 데이터와 태그를 붙여서 보내주면 된다.
		우리는 뉴스의 제목만 보내줄 것이므로...
		<NEWS>
			<TITLE>내용</TITLE>
		</NEWS> 
	-->
	<c:forEach var ="news" items="${TITLE}">
		<NEWS>
			<TITLE>${news}</TITLE>
		</NEWS>
	</c:forEach>
</NEWSS>