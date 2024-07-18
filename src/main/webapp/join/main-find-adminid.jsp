<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>



<link rel="stylesheet" href="nav/main-navigation.css">
<link rel="stylesheet" href="nav/test.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<link rel="stylesheet" href="css/main-find-adminid.css">
</head>
<body>


	<nav>
		<ul class="main_nav">
			<a><img src="nav/logo_light.webp"></a>
			<li><a> 헬스장 소개 </a></li>
			<li><a> 프로모션 </a></li>
			<li><a> 문의 / 고객센터 </a></li>
			<li><a> 오시는 길 </a></li>

			<li class="gnb"><input type="button" value="마이페이지"> <input
				type="button" value="로그아웃"></li>
		</ul>

	</nav>


	<!--  여기 아래에 넣으세요!  -->
	<section>


		<div class="wrap">
			<h3>관리자 아이디 찾기</h3>
			<div class="login_page">
				<div class="login_wrap">
					<form action="adminIdFind.join" method="post">
						<div class="id">
							<p>이름</p>
							<input type="text" name="adminName" placeholder="이름을 입력하세요."
								required="required">
						</div>

						<div class="email">
							<p>이메일</p>
							<input type="email" name="email" placeholder="이메일을 입력하세요."
								required="required">
						</div>

						<div class="number">
							<p>연락처</p>
							<input type="text" name="number" placeholder="연락처를 입력하세요."
								required="required">
						</div>
						<input type="submit" value="아이디찾기">
					</form>
				</div>
			</div>
		</div>
	</section>

	<script>
	var adminIdFind = ${!empty adminIdFind};
	if(adminIdFind) {
		alert("${adminIdFind}");
	}
	</script>
</body>
</html>