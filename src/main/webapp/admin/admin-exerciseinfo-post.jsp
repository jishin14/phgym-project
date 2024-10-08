<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!--  글작성하기 -->

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>운동정보작성</title>
	<link rel="stylesheet" href="../admin/css/admin-exerciseinfo-post.css">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
	<link rel="stylesheet" href="../include/css/admin-navigation.css">
    
    <script>
        function validateForm() {
            var adminNo = document.getElementById("writer").value;
            
            
            if (isNaN(adminNo) || adminNo.trim() === "") {
                alert("관리자 번호는 숫자만 입력해야 합니다.");
                return false; // 
            }

            return true;
        }
    </script>
	
</head>
<body>
	<div class="content">

		<jsp:include page="../include/admin-navigation.jsp" />


		<!--  여기에 넣어주시면 됩니다. -->
		<div class="main">
			<section id="wrap">

	<div class="form-container">
        <div class="header1">
            <input type="button" class="back-btn" value="←"onclick="location.href='main_exe_list.board'">
            <span class="header-title">글 작성하기</span>
            <div class="header-icons">
                <button class="icon-btn">⋮</button>
            </div>
        </div>
		
        <form action="main_exe_post_regist.board" method="post" onsubmit="return validateForm()">
            <input type="text" id="title" name="title" placeholder="제목을 입력하세요">
            <input type="text" id="writer" name="adminNo" size="10" placeholder="관리자 번호를 입력하세요" required>

            <label for="content"></label>
            <textarea id="content" name="content" placeholder="내용을 입력하세요"></textarea>

            <div class="buttons">
                <input type="submit" value="등록" class="reset-btn" >
                <input type="reset" value="초기화" class="submit-btn">
            </div>
        </form>
    </div>
    </section>
    </div>
</div>
</body>
</html>