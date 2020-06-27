<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ page import="Bean.User" %><%--
  Created by IntelliJ IDEA.
  User: just it
  Date: 2020/6/26
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    User user = new User();
    String likes = "sing";
    user.setLikes(likes);

    //数据回显
    request.setAttribute("user",user);
%>


<%--java的字符数组以","号分割开，首先拼接成一个字符串，再判读该字符串有没有包含关键字，如果有就checked--%>
<label>
    <input type="checkbox"${ fn:contains(fn:join(user.likes,","),"sing")?'checked':'' }>
</label>唱歌
<label>
    <input type="checkbox"${ fn:contains(fn:join(user.likes,","),"dance")?'checked':'' }>
</label>跳舞

</body>
</html>
