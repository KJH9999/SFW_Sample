<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="../include/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<title>문의사항</title>
	<c:forEach var="myinquire" items="${myinquire}">
		<div>작성자 : ${myinquire.email}  날짜 : ${myinquire.at_time}</div>
		<div>------------------------------------------------</div>
		<div>질문 : ${myinquire.question}</div>
		<div>답변 : ${myinquire.answer}</div>
		<div>================================================</div>
		<br/>
	</c:forEach>

	<a href="writeinquire">문의하기</a>
	<div>
		<button onclick="history.back()">Back</button>
	</div>
</body>
</html>