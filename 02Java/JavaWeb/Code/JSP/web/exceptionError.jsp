<%--
  Created by IntelliJ IDEA.
  User: just it
  Date: 2020/6/22
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>出错啦！</title>
</head>
<body>
    <%
        out.println("程序抛出了异常：" + exception);
    %>
</body>
</html>
