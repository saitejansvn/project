<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 isELIgnored="false"   pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Uom Data Page</h1>
<c:if test="${empty data}"><h3>No data avaiable of Shipment</h3></c:if>
<c:if test="${!empty data}">
<table  border= "1">
<tr>
<th>UomId</th>
<th>UomType</th>
<th>UomCode</th>
<th>UomEnabled</th>
<th>Metacode</th>
<th>AdjustSize</th>
<th>Note</th>
</tr>
<c:forEach items="${data}" var="uomdata">
<tr>
<td><c:out value="${uomdata.uomid}"></c:out></td>
<td><c:out value="${uomdata.uomtype}"></c:out></td>
<td><c:out value="${uomdata.uomcode}"></c:out></td>
<td><c:out value="${uomdata.enabled}"></c:out></td>
<td><c:out value="${uomdata.metacode}"></c:out></td>	
<td><c:out value="${uomdata.adjustsize}"></c:out></td>
<td><c:out value="${uomdata.note}"></c:out></td>
<td><a href="delete?id=${uomdata.uomid}">Delete</a></td>
</tr>
</c:forEach>
</table>
</c:if>
</body>
</html>