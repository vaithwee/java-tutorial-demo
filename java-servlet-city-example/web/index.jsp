<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2018/11/28
  Time: 下午9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
  <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <%--<script type="text/javascript" src="js/city.js"></script>--%>
    <script type="text/javascript" src="js/city_json.js"></script>
  </head>
  <body>

  省份<select id="province" name="province">
    <option value="">--请选择--</option>
    <option value="1">福建</option>
    <option value="2">广东</option>
    <option value="3">北京</option>
  </select>
  城市<select id="city" name="city">
    <option value="">--请选择--</option>
  </select>
  </body>
</html>
