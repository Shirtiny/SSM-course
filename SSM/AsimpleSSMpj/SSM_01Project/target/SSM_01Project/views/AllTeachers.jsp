<%--
  Created by IntelliJ IDEA.
  User: Shirtiny
  Date: 2019/6/11
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        .change1{
            float: left;
            display: block;
            width: 60px;
        }
        .change2{
            float: left;
            display: block;
            width: 90px;
        }
        .change3{
            float: left;
            display: block;
            width: 150px;
        }
    </style>
</head>
<body>
<a href="${pageContext.request.contextPath}/spController/ShowAll"><h2>显示全部信息</h2></a><br>

<table >
    <tr style="background-color: aquamarine"><td width="50px">tid</td> <td width="80px">tname</td> <td width="120px">tmail</td></tr>
    <c:forEach items="${teachers}" var="teacher">
        <tr style="border-color: black;background-color: cyan"><td>${teacher.tid}</td> <td>${teacher.tname}</td> <td>${teacher.tmail}</td>
            <td><a href="${pageContext.request.contextPath}/spController/DeleteOneAuto/${teacher.tid}?path=${pageContext.request.contextPath}/spController/ShowAll"><button style="color: red">删除</button></a> </td>
            <td><a href="${pageContext.request.contextPath}/spController/UpdateJump/${teacher.tid}?path=${pageContext.request.contextPath}/spController/ShowAll"><button style="color: royalblue">修改</button></a> </td>
        </tr>
    </c:forEach>
</table>
<form method="post" action="${pageContext.request.contextPath}/spController/InsertOne?path=spController/ShowAll">
    <table>
        <tr style="background-color: lawngreen">
            <%--            宽度怎么改？--%>
            <input  type="text" name="tid" class="change1">
            <input type="text" name="tname" class="change2">
            <input type="text" name="tmail" class="change3">
            <button type="submit">增加teacher</button></tr>
    </table>
</form>
<br>
<a href="${pageContext.request.contextPath}/spController/SelectByPage"><h2>显示分页列表</h2></a><br>
</body>
</html>
