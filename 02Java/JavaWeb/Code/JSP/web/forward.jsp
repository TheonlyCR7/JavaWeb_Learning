<%--
  Created by IntelliJ IDEA.
  User: just it
  Date: 2020/6/22
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>访问后跳转</title>
</head>
<body>

<jsp:forward page="site.jsp">
    <jsp:param name="username" value="lmc"/>
</jsp:forward>
</body>
</html>
