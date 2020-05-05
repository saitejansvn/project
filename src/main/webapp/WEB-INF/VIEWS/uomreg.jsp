<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
isELIgnored="false"	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UomRegisterPage</title>
<style>
h1 {
	color: blue;
	text-align: center;
}
</style>
</head>
<body>
	<h1>Welcome to Uom Registration Page</h1>
	<form:form action="insert" method="post" modelAttribute="uom">
		<pre>
UomType:<form:select path="uomtype">
         <form:option value="Pack">Pack</form:option>
          <form:option value="NoPack">NoPack</form:option>
          <form:option value="NA">Na</form:option>
         </form:select>
UomCode:<form:input path="uomcode" />
Enabled:<form:radiobutton path="enabled" value="Yes" />Yes
        <form:radiobutton path="enabled" value="No" />No
MetaCode:<form:input path="metacode" />
AdjustSize:<form:radiobutton path="adjustsize" value="Large" />Large
           <form:radiobutton path="adjustsize" value="Middle" />Middle
           <form:radiobutton path="adjustsize" value="small" />Small
Note:<form:input path="note" />
<input type="submit" value="register">
<a href="viewdata">ViewData</a>
</pre>
	</form:form>
	${data}
</body>
</html>