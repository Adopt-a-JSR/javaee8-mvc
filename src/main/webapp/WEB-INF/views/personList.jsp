<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
</head>
<body>
<table>
    <tr>
        <td>Name</td>
        <td>Lastname</td>
        <td></td>
    </tr>
    <c:if test="${empty people}">
        <tr>
            <td colspan="3">There are no people.</td>
        </tr>
    </c:if>
    <c:forEach items="${people}" var="person" varStatus="status">
        <tr>
            <td>${person.name}</td>
            <td>${person.lastname}</td>
            <td><a href="delete?personId=${status.index}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<a href="new">Add person</a>
</body>
</html>
