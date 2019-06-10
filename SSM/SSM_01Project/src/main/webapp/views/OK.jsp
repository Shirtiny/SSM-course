<%--
  Created by IntelliJ IDEA.
  User: Shirtiny
  Date: 2019/6/9
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--引入jstl，设置标签前缀为c--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>OK</h2><br>
<h1>Teacher集合</h1><br>

${requestScope.teachers}<br>

<h1>Teacher列表</h1><br>


<table >
    <tr style="background-color: aquamarine"><td width="50px">tid</td> <td width="80px">tname</td> <td width="120px">tmail</td></tr>
    <c:forEach items="${teachers}" var="teacher">
        <tr style="border-color: black;background-color: cyan"><td>${teacher.tid}</td> <td>${teacher.tname}</td> <td>${teacher.tmail}</td>
        <td><a href="${pageContext.request.contextPath}/spController/DeleteOneAuto/${teacher.tid}"><button style="color: red">删除</button></a> </td>
        <td><a href="${pageContext.request.contextPath}/spController/UpdateJump/${teacher.tid}"><button style="color: royalblue">修改</button></a> </td>
        </tr>
    </c:forEach>
</table>
<form method="post" action="${pageContext.request.contextPath}/spController/InsertOne">
    <table>
        <tr style="background-color: lawngreen">
<%--            宽度怎么改？--%>
            <input  type="text" name="tid" >
           <input type="text" name="tname" >
            <input type="text" name="tmail" >
            <button type="submit">增加</button></tr>
    </table>
</form>


<br>
</body>
</html>
