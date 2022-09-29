<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/WEB-INF/include/header.jsp"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<c:forEach var="nullinquire" items="${nullinquire}">
		<div>------------------------------------------------</div>
		<div>작성자 : ${nullinquire.email} 날짜 : ${nullinquire.at_time}</div>
		<div>------------------------------------------------</div>
		<div><a href = "answer.do?question=${nullinquire.question}&&idx=${nullinquire.idx}">질문 : ${nullinquire.question}</a></div>
		<div>답변 : ${nullinquire.answer}</div>
		<div>================================================</div>
		<br/>
	</c:forEach>

</body>
</html>