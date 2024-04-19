<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<meta charset="UTF-8">
	<title>Hotel Sunset Paradise</title>
	<!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
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
                <c:forEach var="room" items="${listrooms}">
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