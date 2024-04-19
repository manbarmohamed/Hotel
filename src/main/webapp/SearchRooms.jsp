<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<meta charset="UTF-8">
	<title>Hotel Sunset Paradise</title>
	<style><%@include file ="/CSS/header.css"%></style>
	<!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<%@include file="/Header.jsp" %>
<!-- Formulaire de recherche et de filtrage -->
        <form action="search" method="POST" class="mb-3">
            <div class="form-row">
	            <div class="col-md-4 mb-3">
	                    <label for="inputSearch">Search by id</label>
	                    <input type="Number" class="form-control" id="inputSearch" name="inputSearch">
	                </div>
	            <div class="col-md-4 mb-3">
						<label for="inputType">Filtre by type</label>
							<select class="form-control" id="inputType" name="inputType">
							    <!-- Options pour les postes -->
							    <option value="">All Types</option>
							    <option value="Suite">Suite</option>
							    <option value="Single">Single</option>
							    <option value="Double">Double</option>
							</select>
	                </div>
	                <div class="col-md-4 mb-3">
	                    <label for="inputCapacity">Filtre by CapacityCapacity</label>
		                    <select class="form-control" id="inputCapacity" name="equipement">
							    <!-- Options pour les départements -->
							    <option value="">All Capacities</option>
							    <option value="TV">TV</option>
							    <option value="WIFI">WIFI</option>
							    <option value="Jacuzzi">Jacuzzi</option>

							</select>
					</div>
           		</div>
            <button type="submit" class="btn btn-primary">Rechercher</button>
        </form>
<!-- Tableau pour afficher la liste des employés -->
        
        
        
        
       
       <section class="container mt-5">
            <h2 class="text-center mb-4">Available Rooms</h2>
            <div class="row row-cols-1 row-cols-md-3 g-4">
                <!-- Room Cards - Dynamically Generated -->
                <c:forEach var="room" items="${listrooms}">
                    <div class="col">

                        <div class="card">
                            <img src="${room.getUrl_img()}" class="card-img-top" alt="${room.getType()}">
                            <div class="card-body">
                                <div class="d-flex justify-content-between">
                                    <h5 class="card-title">${room.getType()}</h5>
                                </div>
                                <p class="card-text">${room.getPrice()}</p>
                                <p class="card-text">${room.getEquipement() }</p>
                                <p class="card-text">${room.getAvailability() ? "Yes" : "No"}</p>
                                <button class="btn btn-dark view-details-btn" onclick="displayReoomDetails(${room.getId_room()})">Reserve</button>
                                <button class="btn btn-dark view-details-btn" onclick="displayRoomDetails(${room.getId_room()})">View Details</button>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </section>
       
                <!-- Code JSP pour afficher la liste des employés -->
       

        <!-- Include Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>