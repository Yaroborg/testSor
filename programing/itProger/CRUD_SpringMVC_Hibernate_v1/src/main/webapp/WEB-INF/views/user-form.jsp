<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Form</title>
</head>
<body>
<h2>User Form</h2>
<form action="save" method="post">
    <input type="hidden" name="id" value="${user.id}" />
    <p>Name: <input type="text" name="name" value="${user.name}" /></p>
    <p>Email: <input type="text" name="email" value="${user.email}" /></p>
    <p><input type="submit" value="Save" /></p>
</form>
<a href="users">Back to list</a>
</body>
</html>

