<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2018/11/20
  Time: 下午10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table width="100%" align="center" border="1">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>手机</td>
        <td>生日</td>
        <td>兴趣</td>
        <td>简介</td>
    </tr>
    <c:forEach items="${list }" var="stu">
        <tr align="center">
            <td>${stu.id }</td>
            <td>${stu.name }</td>
            <td>${stu.gender }</td>
            <td>${stu.phone }</td>
            <td>${stu.birthday }</td>
            <td>${stu.hobby }</td>
            <td>${stu.desc }</td>
            <td></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
