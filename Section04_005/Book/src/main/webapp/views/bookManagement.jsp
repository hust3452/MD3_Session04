<%--
  Created by IntelliJ IDEA.
  User: Nguyen Quang Phu
  Date: 2025/10/26
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>BOOK ID</th>
        <th>BOOK TITLE</th>
        <th>BOOK AUTHOR</th>
        <th>BOOK PRICE</th>
        <th>DESCRIPTION</th>
    </tr>
    <tbody>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.price}</td>
            <td>${book.description}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
