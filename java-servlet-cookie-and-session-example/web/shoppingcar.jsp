<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2018/11/5
  Time: 下午9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Enumeration<String> items = session.getAttributeNames();
    while (items.hasMoreElements()) {
        String name = items.nextElement();
        String value = (String) session.getAttribute(name);
%>
        <h3><%=name%> * <%=value%></h3>
<%
    }
%>

<a href="CleanShoppingCar"><h3>清空购物车</h3></a>
</body>
</html>
