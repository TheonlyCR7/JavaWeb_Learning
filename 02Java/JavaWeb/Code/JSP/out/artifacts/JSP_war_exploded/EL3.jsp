<%--
  Created by IntelliJ IDEA.
  User: just it
  Date: 2020/6/23
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/EL4.jsp" method="post">
    用户名：<input type="text" name="username"><br>
    年龄：<input type="text " name="age"><br>
    爱好：
    <input type="checkbox" name="hobbies" value="football">足球
    <input type="checkbox" name="hobbies" value="basketball">篮球
    <input type="checkbox" name="hobbies" value="table tennis">兵乓球<br>
    <input type="submit" value="提交"><br>
</form>
</body>
</html>
