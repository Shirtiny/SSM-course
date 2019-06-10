<%@ page import="com.SH.Bean.User" %><%--
  Created by IntelliJ IDEA.
  User: Shirtiny
  Date: 2019/5/29
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<!--由于容器版本问题，高版本在jsp头部加入 isELIgnored="false" 来启用EL表达式的使用-->
<!-- request作用域-->
request作用域:<br>
${requestScope.user1.uname } -${requestScope.user1.upassword}<br>
<%--${user1.uname } -${user1.upassword}<br>--%>

${requestScope.user2.uname } -${requestScope.user2.upassword}<br>
<%--${user2.uname } -${user2.upassword}<br>--%>



<!--session作用域 -->
session作用域:<br>
${sessionScope.user1.uname } -${sessionScope.user1.upassword}<br>
<%--${user1.uname } -${user1.upassword}<br>--%>

${sessionScope.user2.uname } -${sessionScope.user2.upassword}<br>
<%--${user2.uname } -${user2.upassword}<br>--%>

</body>
</html>
