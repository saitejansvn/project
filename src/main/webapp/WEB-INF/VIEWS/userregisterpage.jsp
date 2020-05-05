<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserRegistrationpage</title>
</head>
<body>
<h1>--WELCOME TO USERMODULE REGISTRATION PAGE--</h1>
<form:form action="save" method="post" modelAttribute="user">
<pre>
UserType:<form:radiobutton path="usertype" value="Vendor"/>vendor
         <form:radiobutton path="usertype" value="Customer"/>Customer
UserCode:<form:input path="usercode"/>
UserFor:<form:select path="userfor">
         <form:option value="--SELECT--">--SELECT--</form:option>
         <form:option value="PURCHASE">PURCHASE</form:option>
         <form:option value="SALE">SALE</form:option>
         </form:select>
UserEmail:<form:input path="useremail"/>
UserContanct:<form:input path="usercontanct"/>
UserIdType:<form:select path="useridtype">
           <form:option value="--SELECT---">SELECT</form:option>
           <form:option value="AADHAR">AADHAR</form:option>
           <form:option value="VOTER">VOTER</form:option>
           <form:option value="PANCARD">PANCARD</form:option>
           </form:select>
IDNUMBER:<form:input path="useridtype"/>  
<input type="submit" value="REGISTERUSER">                 
</pre>
</form:form>
</body>
</html>