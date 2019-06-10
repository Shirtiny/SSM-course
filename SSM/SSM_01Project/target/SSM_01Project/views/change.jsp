<%--
  Created by IntelliJ IDEA.
  User: Shirtiny
  Date: 2019/6/9
  Time: 23:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>修改${tid}号teacher</h1>
<form method="post" action="${pageContext.request.contextPath}/spController/UpadateOne/${tid}">
    <table>
        <tr> id：${tid}</tr>
   <tr> <td>tname：<input type="text" name="tname"></td> </tr>
        <tr><td>tmail：<input type="text" name="tmail"></td></tr>
        <tr><td><input type="submit" value="修改"></td></tr>
    </table>
</form>
</body>
</html>
