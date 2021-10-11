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
<form action="/insert.do" method="post">
    <table border="1">
        <thead>
        <tr>
            <th>작성자</th>
            <td>
                <input type="text" name="writer">
            </td>
            <th>작성일</th>
            <td>
                <input type="text" name="b_date">
            </td>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td colspan="2">
                제목
            </td>
            <td colspan="2">
                <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                내용
            </td>
            <td colspan="2">
                <textarea name="content"></textarea>
            </td>
        </tr>
        <tr>
            <td colspan="4">
                <button class="list_btn">등록완료</button>
            </td>
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>
