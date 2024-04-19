<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var="room" items="${listrooms}">
    <p><c:out value="${room.getId_room()}"></c:out></p>
    <p><c:out value="${room.getType()}"></c:out></p>
    <p><c:out value="${room.getPrice()}"></c:out></p>
    <p><c:out value="${room.getEquipement()}"></c:out></p>
    <p><c:out value="${room.getAvailability()}"></c:out></p>
</c:forEach>
</body>
</html>