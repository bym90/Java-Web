<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
<script>
	// �����ϱ� ���߸� ������ �ؾ��� �ൿ�� ���α׷����� ������.
	function JoinProc() {
		// �����ϱ��?
		// ������ ������ �׸��� �������� �ָ鼭 ������ �䱸�ϴ°���
		// �ǹ��ϹǷ� ���� �����ؾ� �Ѵ�.
		var f = document.getElementById("surveyForm");
		// �� ���� �׼�(�� ���� �����͸� �������� ����)�� �����Ѵ�.
		f.action = "http://localhost:8080/IEDUWeb/P_0705/SurveyInsert.jsp"
		// �� ���� �����͸� �������� �����ϸ鼭(submit) ��Ű�鼭 ������ �䱸�Ѵ�.
		f.submit();
	}
	// ������� ���߸� ������ �ؾ��� �ൿ�� ���α׷����� ������.
	function  ResultProc() {
		// �ڹ� ��ũ��Ʈ�� �����۸�ũ�� �����ϴ¹��
		document.location.href = "http://localhost:8080/IEDUWeb/P_0705/SurveyResult.jsp";
	}
</script>
<style>
	table{
		width : 800px;
		margin : auto;
		border : 1px solid black;
		border-collapse : collapse;
	}
	tr, td{
		border : 1px solid black;
	}
</style>
</head>
<body>
<%-- �������� �׸��� �����ְ� �� �� �ϳ��� ������ �� �ִ� ���� ��������. 
	Ư�� ��ҿ� id�� �����ϴ� ������
	1. CSS�� �����ϱ� ���ؼ�
	2. JavaScript�� JQuery��� �� ��Ҹ� �����ϱ� ���ؼ�
	class�� name�� ����ũ���� �ʾƵ� �ȴ�. ������ id�� ����ũ�� �����Ѵ�.--%>
 	<form method="post" id="surveyForm" action="">
 		<table>
 			<tr>
 				<td align="center">�������� �α� ����?</td>
 			</tr>
 			<tr>
 			<%-- ���� ���ߴ� �׷��� �̷��� �Ѵ�. �̱׷��� name�Ӽ��� ���� �������ν�
 			�ڵ������� �׷��� �̷������. 
 			
 			�������� ���°��� ���� ������ value���� ���޵ȴ�.
 			��, 1���� �����ϸ� �������� "dap_1"�̶�� �����Ͱ� ���޵ȴ�.
 			 	2���� �����ϸ� �������� "dap_2"�̶�� �����Ͱ� ���޵ȴ�.--%>
 				<td>
 					<input type="radio" name="survey" value="dap_1">
 					1. ������
 				</td>
 			</tr>
 			<tr>
 				<td>
 					<input type="radio" name="survey" value="dap_2">
 					2. �渮
 				</td>
 			</tr>
 			<tr>
 				<td>
 					<input type="radio" name="survey" value="dap_3">
 					3. ������
 				</td>
 			</tr>
 			<tr>
 				<td>
 					<input type="radio" name="survey" value="dap_4">
 					4. �ʾ�
 				</td>
 			</tr>
 			<tr>
 				<td align="center">
 					<input type="button" value="�����ϱ�" Onclick="JoinProc()">
 					<input type="button" value="�������" Onclick="ResultProc()">
 				</td>
 			</tr>
 			
 		</table>
 	</form>
</body>
</html>