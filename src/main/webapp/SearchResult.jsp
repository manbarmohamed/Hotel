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
       <section class="container mt-5">  
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
				    <button class="btn btn-primary w-25 mx-2">Réserver</button>
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