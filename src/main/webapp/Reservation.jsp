<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style><%@include file ="/CSS/style.css"%></style>
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
    
           
        
        <label for="startDate">Start Date:</label>
        <input type="date" id="startDate" name="startDate" required><br>
        
        <label for="endDate">End Date:</label>
        <input type="date" id="endDate" name="endDate" required><br>
        
        
        <input type="submit" value="Submit">
    </form>
    
    <form id="reservation-form" action="reservation" method="post">
  <h2>Réservation de chambre</h2>
  
  <div class="form-group">
    <label for="endDate">End Date:</label>
    <input type="date" id="check-in-date" name="endDate" required>
  </div>
  
  <div class="form-group">
    <label for="startDate">Start Date:</label>
    <input type="date" id="check-out-date" name="startDate" required>
  </div>
  
  <div class="form-group">
    <label for="room-type">Type de chambre :</label>
    <select id="room-type" name="room-type" required>
      <option value="">Sélectionnez un type de chambre</option>
      <option value="single">Chambre simple</option>
      <option value="double">Chambre double</option>
      <option value="suite">Suite</option>
    </select>
  </div>
         
  <div class="form-group">
    <label for="id_res">Id reservation:</label>
    <input type="text" id="num-guests" name="id_res" required>
  </div>
  
  <div class="form-group">
    <label for="roomId">Room ID: </label>
    <input type="text" id="name" name="roomId" required>
  </div>
  
  
  
  <button type="submit">Réserver</button>
</form>
    
</body>
</html>