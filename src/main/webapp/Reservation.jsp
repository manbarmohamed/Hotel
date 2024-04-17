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

</body>
</html>