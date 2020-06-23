<%--
  Created by IntelliJ IDEA.
  User: just it
  Date: 2020/6/23
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

${param.username}
<br>

${param.age}
<br>

//没有学习jstl之前就一个一个写吧。
${paramValues.hobbies[0]}
<br>

${paramValues.hobbies[1]}
<br>

${paramValues.hobbies[2]}
<br>

</body>
</html>
