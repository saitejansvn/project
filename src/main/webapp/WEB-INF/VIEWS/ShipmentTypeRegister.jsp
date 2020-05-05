<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
isELIgnored="false"	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  background-image: url('../resources/ship.jpeg');
  background-repeat: no-repeat;
  background-attachment: fixed; 
  background-size: cover;
  background-position: center;
  }
h3 {
	text-align: left;
}

h1 {
	color: blue;
	text-align: center;
}
</style>
</head>
<body>
	<h1>Welcome to ShipmentType RegisterPage</h1>
	<h3>----------Registration of Shipment------</h3>
	<form:form action="save" method="post" modelAttribute="shipmentType">
		<pre>
ShipmentMode:<form:select path="shipmentMode">
             <form:option value="--">--</form:option>
             <form:option value="Air">AIR</form:option> 
             <form:option value="Truck">Truck</form:option>
             <form:option value="Ship">Ship</form:option>
             <form:option value="Train">Train</form:option>
            </form:select> 
ShipmentCode:<form:input path="shipmentCode" />    
EnableShipment:<form:select path="enableShipment">
               <form:option value="yes">YES</form:option>
               <form:option value="no">NO</form:option>
               </form:select>
ShipmentGrade:<form:radiobutton path="shipmentGrade" value="A" />A 
              <form:radiobutton path="shipmentGrade" value="B" />B
              <form:radiobutton path="shipmentGrade" value="C" />C
Description:<form:textarea path="shipDesc" />               
<input type="submit" value="Register">           
</pre>	
</form:form>
	${id}
	<a href="viewall">ViewData</a>
</body>
</html>