<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: just it
  Date: 2020/6/26
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    Integer sessionCount = 0;
    Integer applicationCount = 0;
%>
<c:set var="sessionCount" value="${sessionCount+1}" scope="session"/>

<c:set var="applicationCount" value="${applicationCount+1}" scope="application"/>

</body>
</html>
