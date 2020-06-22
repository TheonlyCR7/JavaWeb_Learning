<%--
  Created by IntelliJ IDEA.
  User: just it
  Date: 2020/6/22
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取八大内置对象</title>
</head>
<body>
<%

    System.out.println("Session: " + pageContext.getSession());
    System.out.println("Request: " + pageContext.getRequest());
    System.out.println("Response: " + pageContext.getResponse());

    System.out.println("Exception: " + pageContext.getException());

    System.out.println("Page: " + pageContext.getPage());
    System.out.println("Config: " + pageContext.getServletConfig());
    System.out.println("ServletContext: " + pageContext.getServletContext());
    System.out.println("Out: " + pageContext.getOut());

    request.setAttribute("name","lmc");

    pageContext.include("pageContext2.jsp");

%>

</body>
</html>
