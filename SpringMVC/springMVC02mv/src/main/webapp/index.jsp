<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<body>
<h2>Hello World!</h2>


<a href="spController/testModelAndView">testM&V</a><br>
<a href="spController/testModel">testModel</a>

<br>
输入用户信息<br>
<form action="spController/GetUser" method="post">
   用户名 <input type="text" name="uname"><br>
    密码<input type="password" name="upassword"><br>
    用户卡名<input type="text" name="cname"><br>
    id<input type="text" name="cid"><br>
    <input type="submit" value="提交">
</form><br><br>
<br><br>
<br><br>


修改用户信息<br>
<form action="spController/updateOne" method="post">
   用户名 <input type="text" name="uname"><br>

    id<input type="hidden" value="1" name="uid"><br>
    <input type="submit" value="提交">
</form>

<br><br>
<br><br>
直接通过springMVC跳转页面<br>
<a href="viewC">viewC</a><br>
<a href="22.jpg">图片</a><br>

测试转换器，按以下格式输入：用户名-密码-性别-id <br>
<form action="spController/testConvertor" method="post">
    <input type="text" name="UserString">
    <input type="submit" value="转换">
</form><br>

测试日期数据格式化，按以下格式输入生日:年-月-日 <br>
<form action="spController/testDateFormat" method="post">
    id:<input type="text" name="cid"><br>
    卡名：<input type="text" name="cname"><br>
    生日：<input type="text" name="cbirthday"><br>
    <input type="submit" value="提交用户卡信息">
</form><br>
</body>
</html>
