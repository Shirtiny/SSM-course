<%--
  Created by IntelliJ IDEA.
  User: Shirtiny
  Date: 2019/5/25
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="spController/test">sd</a>
<form action="spController/test" method="post">
    <table>
        <tr><td>用户名</td><td><input type="text" name="uname"></td> </tr>
        <tr><td>密码</td><td><input type="password" name="upassword"></td> </tr>
        <tr><td>SB验证</td><td><input type="text" name="uSB"></td> </tr>
        <tr><td></td><td><input type="submit" value="post方式提交"></td> </tr>
    </table>
</form>

<a href="spController/sout/kimet">get方式，传递一个kimet的uname给输出方法</a>
<br>
<br>
<br>
<!--Post方式，调用后台增加 -->
<form action="spController/PostOne/1" method="post">
    <input type="hidden" name="_method" value="post">
    <input type="submit" value="post(增加1号)">
</form>
<!-- Delete方式，调用后台删除-->
<form action="spController/DeleteOne/2" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="delete（删除2号）">
</form>
<!--Put方式，调用后台修改 -->
<form action="spController/PutOne/3" method="post">
    <input type="hidden" name="_method" value="put">
    <input type="submit" value="Put（修改3号）">
</form>
<!--Get方式，调用后台查询 -->
<form action="spController/GetOne/4" method="post">
    <input type="hidden" name="_method" value="get">
    <input type="submit" value="Get（查询4号）">
</form>


<!--接收用户输入的表单数据 -->
<br>接收用户输入的表单数据
    <form method="post" action="spController/GetForm">
    输入用户名<input type="text" name="uname"><br>
    输入密码<input type="password" name="upassword"><br>
        性别（选填,默认男）：<input type="text"  name="usex" >
        <br>
        <input type="submit">
    </form>


<!--调用后台的获取浏览器消息头的方法 -->
<br>调用后台的获取浏览器消息头的方法
<a href="spController/GetHeader">获取浏览器的消息头中的accpet-language</a>



<!-- 调用后台的获取Cookie的方法-->
<br>调用后台的获取Cookie的方法
<a href="spController/GetCookie">获取浏览器Cookie中的JSESSIONID</a>



<!--springMVC直接匹配和接收对象的属性，并且支持级联属性,这里设定User中有个UserCard类的ucard属性-->
<br>springMVC直接匹配和接收对象的属性，并且支持级联属性,这里设定User中有个UserCard类的ucard属性
<form method="post" action="spController/GetUser">
    输入用户名<input type="text" name="uname"><br>
    输入密码<input type="password" name="upassword"><br>
    用户id<input type="text" name="uid"><br>
    用户卡的id<input type="text" name="ucard.cid"><br>
    用户卡的名称<input type="text" name="ucard.cname">
    <br>
    <input type="submit">
</form>


    <!--使用原生态的servlet来接收 -->
    <br>使用原生态的servlet来接收
    <form method="post" action="spController/UseOldServlet">
        输入用户名：<input type="text" name="uname">
        输入密码：<input type="password" name="upassword">
        <input type="submit">
    </form>

</body>
</html>
