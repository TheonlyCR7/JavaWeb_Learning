<%--
  Created by IntelliJ IDEA.
  User: just it
  Date: 2020/6/23
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--pageContext内置对象--%>
<%
    pageContext.setAttribute("pageContext1", "pageContext");
%>
pageContext内置对象：${pageContext.getAttribute("pageContext1")}
<br>

<%--pageScope内置对象--%>
<%
    pageContext.setAttribute("pageScope1","pageScope");
%>
pageScope内置对象:${pageScope.pageScope1}
<br>

<%--requestScope内置对象--%>
<%
    request.setAttribute("request1","reqeust");
%>
requestScope内置对象:${requestScope.request1}
<br>

<%--sessionScope内置对象--%>
<%
    session.setAttribute("session1", "session");
%>
sessionScope内置对象：${sessionScope.session1}
<br>

<%--applicationScope内置对象--%>
<%
    application.setAttribute("application1","application");
%>
applicationScopt内置对象：${applicationScope.application1}
<br>

<%--header内置对象--%>
header内置对象：${header.Host}
<br>

<%--headerValues内置对象,取出第一个Cookie--%>
headerValues内置对象：${headerValues.Cookie[0]}
<br>


<%--Cookie内置对象--%>
<%
    Cookie cookie = new Cookie("Cookie1", "cookie");
%>
Cookie内置对象：${cookie.JSESSIONID.value}
<br>

<%--initParam内置对象，需要为该Context配置参数才能看出效果【jsp配置的无效！亲测】--%>

initParam内置对象:${initParam.name}

<br>

</body>
</html>
