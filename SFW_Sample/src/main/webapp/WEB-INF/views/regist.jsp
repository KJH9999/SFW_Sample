<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script>
	function onClickRadio(payValue) {
		let pay = document.getElementsByName("pay")[0];
		pay.value = payValue;
	}
</script>
</head>
<body>
	<h1>등록하기</h1>
	<%
		Object s_email = session.getAttribute("email");
		String email = (String) s_email;
	%>
<form action="registOk" method="get">
	EMAIL(등록자) : <%=email%>
	<input type="hidden" name="email" value="<%=email%>"><br /> 
	<input type="hidden" name="pay" value="0">
	1개얼 <input name="slct" type="radio" value="1" onclick=onClickRadio(60000) ><br/>
	3개월<input name="slct" type="radio" value="3" onclick=onClickRadio(150000)><br/>
	6개월<input name="slct" type="radio" value="6"onclick=onClickRadio(250000)><br/>
	1년<input name="slct" type="radio" value="12"onclick=onClickRadio(360000)><br/>
	<input type="submit" value="결제하기">
</form>

</body>
</html>