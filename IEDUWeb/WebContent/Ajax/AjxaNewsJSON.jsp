<%-- JSON은 일반 텍스트 문서이다. 
	그러므로 뷰가 응답할때도 일반 텍스트 문서로 만들어서 응답해주어야 한다.
	contentType  "text/html" HTML문서
				 "text/xml" XML문서
				 "text/plain" 일반 text 문서
--%>
<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 나는 이번에는
	{"NEWS" : ["1번 제목", "2번 제목", "3번 제목", "4번 제목", "5번 제목"]}
	JSON이 어려운 이유
	응답 문서를 어떤 방식으로 만들지를 결정하는 과정이 어렵다.
	이것을 많은 경험을 통해서 이해해야 한다.
--%> 
{"NEWS" : [
<c:forEach var="title" items="${TITLE}" varStatus="stat">
	<c:if test="${stat.last}">
	"${title}"
	</c:if>
	<c:if test="${not stat.last}">
	"${title}",
	</c:if>
</c:forEach>
]}
