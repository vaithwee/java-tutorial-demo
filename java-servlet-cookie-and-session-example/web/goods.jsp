<%@ page import="xyz.vaith.servlet.CookieUtil" %><%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2018/11/5
  Time: 下午8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="goods?id=1"><h3>iPhone XS Max</h3></a>
<a href="goods?id=2"><h3>XIAOMI MIX 3</h3></a>
<a href="goods?id=3"><h3>HUAWEI Mate Pro 20</h3></a>
<a href="goods?id=4"><h3>SAMSUNG Note 9</h3></a>
<a href="goods?id=5"><h3>MacBook Pro 2018</h3></a>

<hr />
<h1>History</h1>
<% Cookie cookie = CookieUtil.findCookie(request.getCookies(), "history");
    if (cookie != null) {
        String[] ids = cookie.getValue().split("#");
        for (String id : ids) {
            String[] goods = {"iPhone XS Max", "XIAOMI MIX 3","HUAWEI Mate Pro 20","SAMSUNG Note 9","MacBook Pro 2018"};
            String name = goods[Integer.parseInt(id) - 1];
%>
        <a href="goods?id=<%=id%>"><h3><%=name%></h3></a>
<%
        }
    }
%>

<hr />
<a href="ClearHistory"><h3>Clean History</h3></a>
</body>
</html>
