<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    With CSRF
    <form action="csrf" method="post">
        <input type="hidden" name="${mvc.csrf.name}" value="${mvc.csrf.token}">
        <input type="submit" value="Send">
    </form>

    Without CSRF
    <form action="csrf" method="post">
        <input type="submit" value="Send">
    </form>
</body>
</html>
