
<%--
  Created by IntelliJ IDEA.
  User: just it
  Date: 2020/6/26
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--创建出JavaBean对象，设置为session范围的属性--%>
<jsp:useBean id="person" class="Bean.Person" scope="session"/>

<%--获取到person对象，设置age属性的值为32--%>
<c:set target="${person}" property="age" value="32"/>

${person.age}

</body>
</html>
