<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HotelDetails</title>
</head>
<body>

<c:if test="${!empty clients}">
	<table>
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Rating</td>
			<td>Rate</td>
			<td>Available Rooms</td>
		</tr>
		<c:forEach items="${clients}" var="client" >
			<tr>
			<td>${client.id}</td>
					
				<td><a href="HotelBooking/${client.name}">${client.name}</a></td>
				<td>${client.rating}</td>
				<td>${client.rate}</td>
				<td>${client.availableRooms}</td>
				</tr>	
		</c:forEach>
		
		<tr><td>Click a Hotel name to start Booking</td></tr>
	</table>
</c:if>

</body>
</html>