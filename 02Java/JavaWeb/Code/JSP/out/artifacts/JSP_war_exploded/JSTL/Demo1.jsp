<%--
  Created by IntelliJ IDEA.
  User: just it
  Date: 2020/6/26
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSTL的简单使用</title>
</head>
<body>

<%
    session.setAttribute("name", "LMC");
%>

<c:out/>标签支持标签体，default属性上的数据可以写在标签体中
<br>
<c:out value="${name}" escapeXml="true">您要的数据找不着</c:out>
<br>
<c:out value="${name}" default="您要的数据找不着" escapeXml="true"/>
<br>
</body>
</html>
