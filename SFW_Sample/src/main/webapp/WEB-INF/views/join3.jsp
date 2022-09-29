<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body class="body-wrapper">

	<section class="login py-5 border-top-1">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-lg-5 col-md-8 align-item-center">
					<div class="border border">
						<h3 class="bg-gray p-4">회원가입</h3>

						<form id="regForm" action="joinOk" method="post">
							<fieldset class="p-4">
								<div class="hre">
									<input type="text" placeholder="email"
										class="border p-3 w-100 my-2" id="email" name="email">
									<input type="button" value="중복확인" class="dup"
										onclick="winopen()">
								</div>
								<input type="password" placeholder="비밀번호"
									class="border p-3 w-100 my-2" id="pw" name="pw"> <input
									type="text" placeholder="성별" class="border p-3 w-100 my-2"
									id="gender" name="gender"> <input type="text"
									placeholder="이름" class="border p-3 w-100 my-2" id="name"
									name="name"> <input type="text" placeholder="생년월일"
									class="border p-3 w-100 my-2" id="birth_date" name="birth_date">
								<input type="text" placeholder="연락처"
									class="border p-3 w-100 my-2" id="phone" name="phone">
								<div class="loggedin-forgot d-inline-flex my-3"></div>
								<button type="submit" id="submit"
									class="d-block py-3 px-4 bg-primary text-white border-0 rounded font-weight-bold">회원가입</button>
							</fieldset>
						</form>

					</div>
				</div>
			</div>
		</div>
	</section>
	<script>
		function fn_emailChk() {
			$.ajax({
				url : "emailChk.do",
				type : "post",
				dataType : "json",
				data : {
					"email" : $("#email").val()
				},
				success : function(data) {
					if (data == 1) {
						alert("중복된 아이디입니다.");
					} else if (data == 0) {
						$("#emailChk").attr("value", "Y");
						alert("사용가능한 아이디입니다.");
					}
				}
			})
		}
		
		function winopen(){
				window.open("joinIdCheck.jsp?email="+document.fr.email.value,"","width=500, height=300");
		}
	</script>
</body>

</html>