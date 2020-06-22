<%--
  Created by IntelliJ IDEA.
  User: just it
  Date: 2020/6/22
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="exceptionError.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--模拟空指针异常的错误--%>
<%
    String sss = null;
    sss.length();
%>
</body>
</html>
