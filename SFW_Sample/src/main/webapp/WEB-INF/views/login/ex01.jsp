<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>아이디 중복검사</h2>
	<table class="table table-bordered">
		<tr>
			<th>아이디</th>
			<td><input type="text" name="email" id="email"
				class="form-control" /> <input type="button" id="btnCheck"
				value="중복확인"> <span id="result"></span></td>
		</tr>
	</table>

	<script type="text/javascript"
		src="https://code.jquery.com/jquery-3.4.1.js"></script>
	<script>
		$('#btnCheck').click(function() {
			if ($('#email').val() != '') {
				// 아이디를 서버로 전송 > DB 유효성 검사 > 결과 반환받기
				$.ajax({
					type : 'GET',
					url : 'http://localhost:8282/ex/emailCk?email='+$('#email').val(),
					success : function(result) {
						if (result == '0') {
							$('#result').text('사용 가능한 아이디입니다.');
						} else {
							$('#result').text('이미 사용중인 아이디입니다.');
						}
					},
					error : function(a, b, c) {
						console.log(a, b, c);
					}
				});
			} else {
				alert('email을 입력하세요.');
				$('#email').focus();
			}
		});
	</script>
</body>
</html>

