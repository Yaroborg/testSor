<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Users</title>
</head>
<body>
<h2>Users</h2>
<a href="users/add">Add User</a>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>
                <a href="users/edit?id=${user.id}">Edit</a>
                <a href="users/delete?id=${user.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
