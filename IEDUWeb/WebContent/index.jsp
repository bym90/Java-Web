<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
</head>
<body>
	<a href="http://localhost:8080/IEDUWeb/P_0705/SurveyMain.jsp">��������</a><br>
	<%--
		���� index�� http://localhost:8080/IEDUWeb/index.jsp
		�������� 	 http://localhost:8080/IEDUWeb/P_0706/LoginForm.jsp --%>
	<a href="./Login/LoginForm.kim">�α���</a>
	<%-- �α��ο� ������ ����� ���ؼ� �Խ����� ������ �� �ֵ��� �غ��ڵ�.
		��, �޴� �߿��� �α��ο� �����ϸ� �Խ��� ��� ���⸦ �� �� �ֵ��� �����ְڴ�.
		�α����� ���������� �Խ��� ��Ϻ��� �޴��� �������� �ʰڴ�.
		
		JSTL���� ������ �̿��ϴ� ���
		${sessionScope.Ű��}
		��> ���ǿ� ID��� �޸� �ִ��� Ȯ���Ϸ���
		<c:if test="${not empty sessionScope.ID}"> ��� �ϸ� �ȴ�. --%>
		
		<c:if test="${not empty sessionScope.ID}">
			<a href="./AnBoard/BoardList.bmw">�亯�� �Խ���</a>
			<a href="./FileBoard/BoardList.bmw">���Ͼ��ε� �Խ���</a>
		</c:if>
</body>
</html>