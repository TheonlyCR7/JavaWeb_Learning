<%--
  Created by IntelliJ IDEA.
  User: just it
  Date: 2020/6/22
  Time: 9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>包含页头和页尾进来</title>
</head>
<body>
<jsp:directive.include file="head.jsp">

</jsp:directive.include>
<jsp:directive.include file="foot.jsp">

</jsp:directive.include>

<%@include file="head.jsp" %>

<%
    String ss = request.getParameter("username");
    out.println("传递过来的参数是: " + ss);
%>

<%@include file="foot.jsp" %>
</body>
</html>
