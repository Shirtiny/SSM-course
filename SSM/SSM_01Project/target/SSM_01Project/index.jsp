<%--
  Created by IntelliJ IDEA.
  User: Shirtiny
  Date: 2019/6/9
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="spController/ShowAll">显示全部信息</a><br>
<br>
<h1>增加一个teacher</h1><br>
<form action="spController/InsertOne" method="post">
    id：<input type="text" name="tid"><br>
    name：<input type="text" name="tname"><br>
    mail：<input type="text" name="tmail"><br>
    <input type="submit" value="提交"><br>
</form>

<h1>删除一个teacher</h1><br>
<form action="spController/DeleteOne" method="post">
    输入要删除的id：<input type="text" name="tid">
    <input type="submit" value="删除"><br>
</form>
<br>
<a href="spController/DeleteOneAuto/3"><button style="color: red">删除3号</button></a>
</body>
</html>
