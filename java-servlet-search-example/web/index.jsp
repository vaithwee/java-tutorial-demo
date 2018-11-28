<%--
  Created by IntelliJ IDEA.
  User: vaith
  Date: 2018/11/28
  Time: 下午8:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Search</title>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="js/words.js"></script>
  </head>
  <body>
  <center>
    <input type="text" name="keyword" id="keyword" style="width: 600px; height: 50px; border: 1px solid black" onkeyup="getWords()" />
    <input type="submit" value="Word一下" style="width: 100px; height: 50px;border: 1px solid black; font-size: medium;" />
    <div id="words" style="width: 600px; height: 400px; border: 1px solid black;position:relative; left : -54px; display: none;"></div>
  </center>
  </body>
</html>
