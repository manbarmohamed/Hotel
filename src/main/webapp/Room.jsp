<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style><%@include file ="/CSS/header.css"%></style>
<style><%@include file ="/CSS/style.css"%></style>
</head>
<body>


<%@include file ="/Home.jsp"%>
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
                                <p class="card-text">${room.getDescription()}</p>
                                <p class="card-text">${room.getCapacity()}</p>
                                <button class="btn btn-dark view-details-btn" onclick="displayReoomDetails(${room.getId_room()})">Reserve</button>
                                <button class="btn btn-dark view-details-btn" onclick="displayRoomDetails(${room.getId_room()})">View Details</button>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </section>
</body>
</html>