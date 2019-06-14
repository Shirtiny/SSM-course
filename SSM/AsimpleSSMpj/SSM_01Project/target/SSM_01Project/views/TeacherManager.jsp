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






<br>
<a href="${pageContext.request.contextPath}/spController/SelectByPage"><h2>显示分页列表</h2></a><br>

共有<font style="color: royalblue ;font-size:20px" >${requestScope.teacherCount}</font>个Teacher<br>
当前第<font style="color: royalblue;font-size:20px">${requestScope.pagenum}</font>页<br>
每个分页最多有<font style="color: royalblue;font-size:20px">${requestScope.pagesize}</font>行<br>
总共<font style="color: royalblue;font-size:20px">${pageCount}</font>页

<form method="post" action="${pageContext.request.contextPath}/spController/SelectByPage">
    要跳转的页码（默认1）：<input type="text" name="pagenum"><br>
    设置每页行数（默认5）:<input type="text" name="pagesize">
    <input type="submit" value="确定"><br>
</form><br>
<table>
    <tr style="background-color: chartreuse;">
        <td width="50px">tid</td><td width="80px">tname</td><td width="120px">tmail</td>
    </tr>
<c:forEach items="${requestScope.teachersPage}" var="teacherLine">
    <tr style="background-color: deepskyblue">
        <td> ${teacherLine.tid}</td>  <td>${teacherLine.tname}</td> <td>${teacherLine.tmail} </td>
        <td><a href="${pageContext.request.contextPath}/spController/DeleteOneAuto/${teacherLine.tid}?path=${pageContext.request.contextPath}/spController/SelectByPage"><button style="color: red">删除</button></a> </td>
        <td><a href="${pageContext.request.contextPath}/spController/UpdateJump/${teacherLine.tid}?path=${pageContext.request.contextPath}/spController/SelectByPage"><button style="color: royalblue">修改</button></a> </td>
    </tr>
</c:forEach>
</table>
<br>
<form method="post" action="${pageContext.request.contextPath}/spController/InsertOne?path=spController/SelectByPage">
    <table>
        <tr style="background-color: lawngreen">
            <input  type="text" name="tid" class="change1">
            <input type="text" name="tname" class="change2">
            <input type="text" name="tmail" class="change3">
            <button type="submit">增加teacher</button></tr>
    </table>
</form>



<%
    int pagenum=(int)request.getAttribute("pagenum");
    int pageCount=(int)request.getAttribute("pageCount");
%>
     <%
         if (pagenum==1){
     %>

            <a href="${pageContext.request.contextPath}/spController/SelectByPage?pagenum=1&pagesize=${pagesize}">首页</a>
            <a href="">上一页</a>
            <a href="${pageContext.request.contextPath}/spController/SelectByPage?pagenum=${pagenum+1}&pagesize=${pagesize}">下一页</a>
            <a href="${pageContext.request.contextPath}/spController/SelectByPage?pagenum=${pageCount}&pagesize=${pagesize}">尾页</a>
<%
        }else if (pagenum==pageCount){
%>
<a href="${pageContext.request.contextPath}/spController/SelectByPage?pagenum=1&pagesize=${pagesize}">首页</a>
<a href="${pageContext.request.contextPath}/spController/SelectByPage?pagenum=${pagenum-1}&pagesize=${pagesize}">上一页</a>
<a href="">下一页</a>
<a href="${pageContext.request.contextPath}/spController/SelectByPage?pagenum=${pageCount}&pagesize=${pagesize}">尾页</a>
<%
    }else {
%>
<a href="${pageContext.request.contextPath}/spController/SelectByPage?pagenum=1&pagesize=${pagesize}">首页</a>
<a href="${pageContext.request.contextPath}/spController/SelectByPage?pagenum=${pagenum-1}&pagesize=${pagesize}">上一页</a>
<a href="${pageContext.request.contextPath}/spController/SelectByPage?pagenum=${pagenum+1}&pagesize=${pagesize}">下一页</a>
<a href="${pageContext.request.contextPath}/spController/SelectByPage?pagenum=${pageCount}&pagesize=${pagesize}">尾页</a>
<%
    }
%>
<br>


<br>


<br>
</body>
</html>
