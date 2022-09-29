<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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

	<form action="updatePwOk" method="post">
		EMAIL : <%=email%><input type="hidden" name="email" value = "<%=email%>"><br/>
		<br/>
		PW : <input type="password" name="pw"><br/>
		<input type="submit" value="UPDATE">
	</form>
	
	    <div>
      <button onclick="history.back()">Back</button>
    </div>
</body>
</html>