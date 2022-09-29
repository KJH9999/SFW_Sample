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
	<h1> Ranker</h1>
		<table border="1">
		<tr>
			<td> RANK </td>
			<td> NAME </td>
			<td> BENCHPRESS </td>
		</tr>
	<c:forEach var="benchlist" items="${benchlist}" varStatus="status" >
			<tr>
			<td>${status.count}</td>
			<td>${benchlist.name}</td>
			<td>${benchlist.bench} </td>
		</tr>
	</c:forEach>
</table>

		<table border="1">
		<tr>
			<td> NAME </td>
			<td> DEADLIFT  </td>
		</tr>
	<c:forEach var="deadlist" items="${deadlist}">
			<tr>
			<td>${deadlist.name}</td>
			<td>${deadlist.dead} </td>
		</tr>
	</c:forEach>
</table>


		<table border="1">
		<tr>
			<td> NAME </td>
			<td>SQUAT </td>
		</tr>
	<c:forEach var="squatlist" items="${squatlist}">
			<tr>
			<td>${squatlist.name}</td>
			<td>${squatlist.squat} </td>
		</tr>
	</c:forEach>
</table>

		<table border="1">
		<tr>
			<td> NAME </td>
			<td> TOTAL  </td>
		</tr>
	<c:forEach var="totallist" items="${totallist}">
			<tr>
			<td>${totallist.name}</td>
			<td>${totallist.total} </td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
