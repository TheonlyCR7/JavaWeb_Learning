<%--
  Created by IntelliJ IDEA.
  User: just it
  Date: 2020/6/23
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%--这里需要导入Person类--%>
<%@ page import="Bean.Person" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bean</title>
</head>
<body>

<jsp:useBean id="person" class="Bean.Person" scope="page"/>

<%--指定属性名称为age--%>
<jsp:setProperty name="person" property="age"/>
<%
    person.setAge(23);
    out.println(person.getAge());
%>
<jsp:useBean id="person" class="Bean.Person" scope="session"/>
<jsp:setProperty name="person" property="age" value="22"/>

<%

    //new出对象
    Person person1 = new Person();
    person1.setName("lmc");
    out.println(person1.getName());

    session.setAttribute("name", "aaa");
%>

</body>
</html>
