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
<h1>ADMIN 전체 문의사항</h1>
	<c:forEach var="allinquire" items="${allinquire}">
		<div>------------------------------------------------</div>
		<div>작성자 : ${allinquire.email} 날짜 : ${allinquire.at_time}</div>
		<div>------------------------------------------------</div>
		<div><a href = "answer.do?question=${allinquire.question}&&idx=${allinquire.idx}">질문 : ${allinquire.question}</a></div>
		<div>답변 : ${allinquire.answer}</div>
		<div>================================================</div>
		<br/>
	</c:forEach>
	
	<button onclick="history.back()">Back</button>

</body>
</html>