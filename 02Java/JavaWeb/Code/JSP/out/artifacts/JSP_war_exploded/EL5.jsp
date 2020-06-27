<%--
  Created by IntelliJ IDEA.
  User: just it
  Date: 2020/6/23
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="Bean.User" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--模拟数据回显场景--%>
<%
    User user = new User();
    user.setGender("male");

    //数据回显
    request.setAttribute("user",user);
%>

<input type="radio" name="gender" value="male" ${user.gender=='male'?'checked':'' }>男
<input type="radio" name="gender" value="female" ${user.gender=='female'?'checked':'' }>女
</body>
</html>
