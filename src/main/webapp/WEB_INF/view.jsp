<%--
  Created by IntelliJ IDEA.
  User: wearf
  Date: 2021-10-10
  Time: 오후 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>view</title>
</head>
<body>
<form>
    <table border="1">
        <thead>
        <tr>
            <th>작성자</th>
            <td>${boardView.writer}</td>
            <th>작성일</th>
            <td>${boardView.b_date}</td>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td colspan="2">
                제목
            </td>
            <td colspan="2">
                ${boardView.name}
            </td>
        </tr>
        <tr>
            <td colspan="2">
                내용
            </td>
            <td colspan="2">
                ${boardView.content}
            </td>
        </tr>
        <tr>
            <td colspan="4">
                <button class="list_btn"><a href="/">홈으로</a></button>
                <button class="up_btn"><a href="/update">수정</a></button>
                <button class="del_btn"><a href="/delete">삭제</a></button>
            </td>
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>
