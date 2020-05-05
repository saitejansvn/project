<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   isELIgnored="false" pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ShipmentDataPage</title>
</head>
<body>
<h3>Welcome to Shipment DataPage</h3>
<c:if test="${empty data}">
<h3>No data avaiable of Shipment</h3>
</c:if>
<c:if test="${!empty data}">
<table border="1px soild black">
 <tr>
    <th>ShipmentId</th>
    <th>ShipmentMode</th>
     <th>ShipmentCode</th>
     <th>enableShipment</th>
      <th>ShipmentGrade</th>
      <th>note</th>
      <th>Operations</th>
  </tr>
<c:forEach items="${data}" var="shipment">
<tr>
<td><c:out value="${shipment.shipmentid}"></c:out></td>
<td><c:out value="${shipment.shipmentMode}"></c:out></td>
<td><c:out value="${shipment.shipmentCode}"></c:out></td>
<td><c:out value="${shipment.enableShipment}"></c:out></td>
<td><c:out value="${shipment.shipmentGrade}"></c:out></td>
<td><c:out value="${shipment.shipDesc}"></c:out></td>
<td><a href="delete?id=${shipment.shipmentid}">Delete</a></td>
</tr>
</c:forEach>
</table>
</c:if>
${delete}
</body>
</html>