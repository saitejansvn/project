<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
h1
{
text-align: center;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>WELCOME TO ORDER REGISTER PAGE</h1>
<form:form action="save" method="post" modelAttribute="orderMethod">
<pre>
OrderMode:<form:radiobutton path="orderMode" value="YES"/>YES
          <form:radiobutton path="orderMode" value="No"/>NO
ORDERCODE:<form:input path="orderCode"/>          
EecuteType:<form:select path="orderExeType">
           <form:option value="--select--">--select--</form:option>
           <form:option value="FIFO">FIFO</form:option>
           <form:option value="LIFO">LIFO</form:option>
           <form:option value="FEFO">FEFO</form:option>
          </form:select>
ORDERACCEPT:<form:checkbox path="orderAccept" value="MULTI-MODEL"/>MULTI-MODEL
            <form:checkbox path="orderAccept" value="ACCEPTRETURN"/>ACCEPTRETURN
            <form:checkbox path="orderAccept" value="SERVICEEXTEND"/>SERVICEEXTEND
DESCIPRITION:<form:textarea path="orderDecs"/>
<input type="submit" value="PLACE-ORDER">                      
</pre>
</form:form>
${data}
</body>
</html>