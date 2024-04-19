<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>
<body>
<!-- Tableau pour afficher la liste des employés -->
        <table class="table">
            <thead>
                <tr>
                	<th scope="col">RoomId</th>
                    <th scope="col">RoomType</th>
                    <th scope="col">RoomPrice</th>
                    
                    <th scope="col">RoomEquipement</th>
                    <th scope="col">RoomAvailibilty</th>
                    
                    
                </tr>
            </thead>
            <tbody>
                <!-- Code JSP pour afficher la liste des employés -->
                <c:forEach var="room" items="${arrayRoom}">
    <tr>
        <td>${room.getId_room()}</td>
        <td>${room.getType()}</td>
        <td>${room.getPrice()}</td>
		<td>${room.getEquipement() }</td>
        
        <td>
                    <c:if test="${room.getAvailability()  eq true}">
                        Yes
                    </c:if>
                    <c:if test="${room.getAvailability()  ne true}">
                        No
                    </c:if>
         </td>

   </tr>
</c:forEach>

            </tbody>
        </table>
        <!-- Include Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>