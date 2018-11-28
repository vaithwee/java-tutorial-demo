<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2018/11/28
  Time: 下午9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<table width="100%">


<c:forEach var="word" items="${list}">
    <tr>
        <td>${word.word}</td>
    </tr>
</c:forEach>
</table>