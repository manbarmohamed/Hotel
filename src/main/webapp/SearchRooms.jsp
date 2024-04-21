<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<meta charset="UTF-8">
	<title>Hotel Sunset Paradise</title>
	<style><%@include file ="/CSS/header.css"%></style>
		<style>
.hotel-room-card {
  display: flex;
  background-color: #fff;
  border-radius: 10px;
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
  overflow: hidden;
}

.room-image {
  flex: 0 0 40%;
  overflow: hidden;
}

.room-image img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.room-details {
  flex: 1;
  padding: 20px;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
}

.room-type {
  font-size: 24px;
  font-weight: bold;
  margin-bottom: 10px;
}

.room-description {
  font-size: 16px;
  color: #666;
  margin-bottom: 20px;
}

.room-features {
  display: flex;
  flex-wrap: wrap;
  margin-bottom: 20px;
}

.room-features .feature {
  display: flex;
  align-items: center;
  margin-right: 20px;
  font-size: 14px;
  color: #666;
}

.room-features .feature i {
  margin-right: 5px;
}

.room-price {
  display: flex;
  align-items: baseline;
  font-size: 20px;
  font-weight: bold;
  margin-bottom: 20px;
}

.room-price .price {
  color: #007bff;
  margin-right: 5px;
}

.room-price .per-night {
  font-size: 16px;
  color: #666;
}

.btn.btn-primary {
  background-color: #007bff;
  border-color: #007bff;
  color: #fff;
  padding: 10px 20px;
  font-size: 16px;
  border-radius: 5px;
  transition: background-color 0.3s ease;
}

.btn.btn-primary:hover {
  background-color: #0056b3;
}

</style>
	
	<!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style><%@include file ="/CSS/header.css"%></style>
<style><%@include file ="/CSS/style.css"%></style>
    
</head>
<body>
<%@include file="/Header.jsp" %>
<!-- Formulaire de recherche et de filtrage -->
  <%@include file="/Home.jsp" %>  
      <%@include file="/About.jsp" %>  
    

<form action="search" method="POST"   class="d-flex align-items-center">

         <input  type="text" id="roomType" name="type" placeholder="Type de Chambre" required class="form-control mx-2">
         <input  type="text" id="roomCapacity" name="capacity" placeholder="Type de Chambre" required class="form-control mx-2">
         
         <input type="submit" value="Search" class="btn btn-primary buttoncolor">
    </form>

		
      <section class="container mt-5">  
      <h1 class= "text-center " id="rooom">Rooms Availablies</h1>
       <c:forEach var="room" items="${listrooms}">
		<div class="hotel-room-card my-3">
		  <div class="room-image">
		    <img src="${room.getUrl_img()}" alt="Room Image">
		  </div>
		  <div class="room-details">
		    <h3 class="room-type">${room.getType()}</h3>
		    <p class="room-description">${room.getDescription()}</p>
		    <div class="room-features">
		      <div class="feature">
		        <i class="fas fa-bed"></i>
		        <span>${room.getEquipement() }</span>
		      </div>
		      
		    </div>
		    <div class="room-price">
		      <span class="price">${room.getPrice()} $</span>
		      <span class="per-night">/night</span>
		    </div>
			<div class="d-flex justify-content-start w-100 gap-5">
				    <a href="res?id=${room.getId_room()}?img=${room.getUrl_img()}?type=${room.getType()}" class="btn btn-primary w-25 mx-2" >Réserver</a>
		    		<button class="btn btn-danger w-25">Cancel</button>
			</div>
		  </div>
		</div>
       </c:forEach>
</section>
        <!-- Include Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>