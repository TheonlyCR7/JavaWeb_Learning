<%--
  Created by IntelliJ IDEA.
  User: just it
  Date: 2020/6/26
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="fn" uri="/WEB-INF/EL.tld" %>

<html>
<head>
    <title>自定义函数</title>
</head>
<body>


<%--将分割成的字符数组用"."拼接成一个字符串--%>
join:${fn:join(fn:split("zhong,fu,cheng","," ),"." )}<br>
<%--完成了HTML转义的功能   以纯文本显示 --%>
${fn:filter("<a href='#'>点我</a>")}
<br>
<a href='#'>点我</a>
</body>
</html>