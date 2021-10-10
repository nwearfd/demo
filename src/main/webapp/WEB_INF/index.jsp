<%--
  Created by IntelliJ IDEA.
  User: wearf
  Date: 2021-09-22
  Time: 오후 6:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Dashboard - SB Admin</title>
        <link rel="stylesheet" href="resources/css/style.css">
    </head>
    <body class="sb-nav-fixed">
    <table id="datatablesSimple" border="1">
        <colgroup>
            <col width="10%">
            <col width="40%">
            <col width="20%">
            <col width="30%">
        </colgroup>
        <thead>
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>작성일</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="list" items="${boardList}">
            <tr>
                <td><a href="/view?idx=${list.idx}">${list.idx}</a></td>
                <td>${list.name}</td>
                <td>${list.writer}</td>
                <td>${list.b_date}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    </body>
</html>
