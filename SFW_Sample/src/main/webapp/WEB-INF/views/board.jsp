<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
		Object s_email = session.getAttribute("email");
		String email = (String)s_email;
	%>
	
	<table border="1">
		<tr>
			<td> 번호 </td>
			<td> 제목 </td>
			<td> 작성자 </td>
			<td> 날짜 </td>
			<td> 조회수 </td>
		</tr>
			
			<!-- 담는 그릇 dtos model set attribute -->
			
			<c:forEach items="${boardlist}" var="boardlist">
			<tr>
			<td>${boardlist.idx}</td>
			<td>
				  <a href="contentView.do?idx=${boardlist.idx}"> ${boardlist.title}</a>
			</td>
			<td>${boardlist.email}</td>
			<td>${boardlist.at_time}</td>
			<td>${boardlist.hit}</td>
			</tr>
		</c:forEach>
			<tr>
				<td colspan="5"> <a href="writeview">글작성 </a></td>
			</tr>
	</table>
	
    <div>
      <button onclick="history.back()">Back</button>
    </div>

</body>
</html>