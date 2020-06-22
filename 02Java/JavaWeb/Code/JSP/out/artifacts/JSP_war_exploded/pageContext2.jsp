<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>在page域对象获取request域对象的属性</title>
</head>
<body>

<%
    //使用重载的方法获取request域对象的属性
    String value = (String) pageContext.getAttribute("name", PageContext.REQUEST_SCOPE);
    System.out.println(value);
    //使用findAttribute查找2.jsp中request域对象的属性
    String value1 = (String) pageContext.findAttribute("name");
    System.out.println(value1);
%>

</body>
</html>