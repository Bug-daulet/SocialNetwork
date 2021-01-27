<%--
  Created by IntelliJ IDEA.
  User: HP Omen 15
  Date: 26.01.2021
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error page</title>
</head>
<body>
<%
    String message = (String) request.getAttribute("error");
%>
<h1>Error occurred!</h1>
<h2 style="color: red">Message: <%=message%></h2><br>
</body>
</html>
