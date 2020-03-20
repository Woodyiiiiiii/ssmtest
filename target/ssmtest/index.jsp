<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020-03-20
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <a href="account/findAll">测试查询所有</a><br>

    <h3>保存测试</h3>
    <form action="account/save" method="post">
        name:<input type="text" name="name">
        password:<input type="password" name="password"/>
        <input type="submit" name="submit"/>
    </form>

</body>
</html>
