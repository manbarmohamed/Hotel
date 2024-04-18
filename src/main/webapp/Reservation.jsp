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
	<c:forEach var="res" items="${listreservation}">
	    <p><c:out value="${res.getId_res()}"></c:out></p>
	    <p><c:out value="${res.getRoomId()}"></c:out></p>
	    <p><c:out value="${res.getStartDate()}"></c:out></p>
	    <p><c:out value="${res.getEndDate()}"></c:out></p>
</c:forEach>
<h1>Make a Reservation</h1>
    <form action="reservation" method="post">
    
            <label for="id_res">Id reservation:</label>
        <input type="text" id="id_res" name="id_res" required><br>
        <label for="roomId">Room ID:</label>
        <input type="text" id="roomId" name="roomId" required><br>
        
        <label for="startDate">Start Date:</label>
        <input type="date" id="startDate" name="startDate" required><br>
        
        <label for="endDate">End Date:</label>
        <input type="date" id="endDate" name="endDate" required><br>
        
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>