<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
</head>
<body>
New person
<form action="add" method="post">
    <label>Name</label>
    <input type="text" name="name">

    <label>Lastname</label>
    <input type="text" name="lastname">

    <input type="submit" value="Add">
</form>
<c:if test="${not empty errors}">
    <ol>
        <c:forEach items="${errors}" var="error">
            <li>${error}</li>
        </c:forEach>
    </ol>
</c:if>
</body>
</html>
