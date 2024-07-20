<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link rel="stylesheet" href="css/main-exerciseinfo-list.css">
</head>
<body>
    
    <div class="container">
        <h1>운동정보</h1>
        <div class="search-bar">
            <input type="text" placeholder="검색">
            <button>조회</button>
        </div>
        <table>
            <thead>
                <tr>
                    <th>번호</th>
                    <th>제목</th>
                    <th>이름</th>
                    <th>작성일</th>
                    <th>조회수</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="dto" items="${list}">
                    <tr>
                        <td>${dto.info_no}</td>
                        <td><a href="getContent.board?info_no=${dto.info_no}">${dto.title}</a></td>
                        <td>${dto.admin_no}</td>
                        <td><fmt:formatDate value="${dto.write_date}" pattern="yyyy년 MM월 dd일 HH시 mm분 ss초"/></td>
                        <td>${dto.hit}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <div class="pagination">
            <button>◀ Previous</button>
            <button>1</button>
            <button>2</button>
            <button>3</button>
            <span>...</span>
            <button>67</button>
            <button>Next ▶</button>
        </div>
        <div class="buttons">
            <input type="button" value="등록" class="combtn" onclick="location.href='main_exe_post_form.board';">
        </div>
    </div>

</body>
</html>
