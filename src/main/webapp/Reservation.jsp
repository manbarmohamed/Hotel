<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style><%@include file ="/CSS/style.css"%></style>
<style><%@include file ="/CSS/header.css"%></style>

<!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<%@include file ="/Header.jsp"%>
<%@include file ="/Home.jsp"%>
	
    
    <div class="form-div">
    <h1 class="text-center">Make a Reservation</h1>
    <form id="reservation-form" action="reservation" method="post">
  
  <div class="form-group">
    <label for="endDate">End Date:</label>
    <input type="date" id="check-in-date" name="endDate" required>
  </div>
  
  <div class="form-group">
    <label for="startDate">Start Date:</label>
    <input type="date" id="check-out-date" name="startDate" required>
  </div>      
   
  <div class="form-group">
    <label for="roomId">Room ID: </label>
    <input type="text" id="name" name="roomId" required>
  </div>
  
  
  
  <button type="submit">Réserver</button>
</form>
    </div>
    
    
            <!-- Include Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    
</body>
</html>