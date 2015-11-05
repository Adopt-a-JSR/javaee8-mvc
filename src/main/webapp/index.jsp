<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
MVC 1.0 ${mvc.config.properties.get("mvcVersion")} Application
<br>
<a href="app/book/list">People List</a>
<p><a href="app/csrf">CSRF</a></p>

<p>ContextPath <b>mvc.contextPath</b> ${mvc.contextPath}</p>
<p>ApplicationPath <b>mvc.applicationPath</b> ${mvc.applicationPath}</p>

<p>HTML Encoder <b>mvc.encoders.html("&")</b> ${mvc.encoders.html("&")}</p>
<p>JS Encoder <b>mvc.encoders.js("&")</b> ${mvc.encoders.js("&")}</p>
</body>
</html>
