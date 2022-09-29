<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header.jsp"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>USER List</title>
</head>
<body>
	<form action="searchUser">
		이름 <input type="text" name="name"> <br/>
		<input type="submit" value="검색">
	</form>
	<br/>
	
	<table border="1">
		<tr>
			<td> email </td>
			<td> 이름 </td>
			<td> 번호</td>
			<td> 생년월일 </td>
			<td> 성별 </td>
		</tr>
			<c:forEach items="${userlist}" var="userlist">
			<tr>
			<td>${userlist.email}</td>
			<td>
				  <a href="contentView.do?idx=${userlist.email}"> ${userlist.name}</a>
			</td>
			<td>${userlist.number}</td>
			<td>${userlist.birth_date}</td>
			<td>${userlist.gender}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>