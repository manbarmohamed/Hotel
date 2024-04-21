<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Management Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
          crossorigin="anonymous">
</head>
<body>

<div class="container">
    <div class="container py-3">
        <h3 class="text-center mb-5 fs-2">History Reservation </h3>
        
        <br>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>ID</th>
                <th>Room ID</th>
                <th>Start Date</th>
                <th>End Date</th>
                
            </tr>
            </thead>
            <tbody>
            <c:forEach var="res" items="${listreservation}">
                <tr>
                    <td><c:out value="${res.getId_res()}" /></td>
                    <td><c:out value="${res.getRoomId()}" /></td>
                    <td><c:out value="${res.getStartDate()}" /></td>
                    <td><c:out value="${res.getEndDate()}" /></td>
                 
                   
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>