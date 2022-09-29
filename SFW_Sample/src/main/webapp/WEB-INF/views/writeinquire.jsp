<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>글쓰기</h1>
	<%
		Object s_email = session.getAttribute("email");		
		String email = (String)s_email;
	%>
<form action="writeinquireOk" method = "get">
	EMAIL(작성자) : <%=email%>
	<input type="hidden" name="email" value = "<%=email%>"><br/>
	질문사항 : <input type="text" name = "question">
<input type="submit" value ="문의하기">
</form>

    <div>
      <button onclick="history.back()">Back</button>
    </div>
</body>
</html>