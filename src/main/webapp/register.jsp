<%--
  Created by IntelliJ IDEA.
  User: HP Omen 15
  Date: 26.01.2021
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // Java init code here
%>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet" href="main.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</head>
<body>
<div id="navbar">
    <ul>
        <li><a href="index.jsp">Main</a></li>
        <li><a href="profile.jsp">Profile</a></li>
        <li><a href="register.jsp">Register</a></li>
        <li><a href="login.jsp">Log in</a></li>
        <li><a href="logout.jsp">Log out</a></li>
    </ul>
</div>

<div class="container">
    <form action="${pageContext.request.contextPath}/RegistrationServlet" method="post">
        Username:<input type="text" name="username"/><br/>
        Password:<input type="password" name="password"/><br/>
        <input type="submit" value="register">
    </form>
</div>