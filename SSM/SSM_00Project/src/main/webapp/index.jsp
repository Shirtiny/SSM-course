<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<body>



<a href="springController/showAll">显示全部teacher</a><br>

<form action="springController/insertOne" method="post">
<table>
  <tr> <td width="50px"> id:</td><td><input type="text" name="tid"></td></tr>
    <tr> <td width="50px"> name:</td><td><input type="text" name="tname"></td></tr>
    <tr> <td width="50px">mail:</td><td><input type="text" name="tmail"></td></tr>
    <tr> <td width="50px"> </td><td><input type="submit"value="提交"></tr>

</table>
</form><br>
<br>

</body>
</html>
