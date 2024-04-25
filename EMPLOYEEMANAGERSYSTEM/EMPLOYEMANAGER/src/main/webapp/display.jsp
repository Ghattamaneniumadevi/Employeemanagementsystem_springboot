<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="2">

<tr>
<th>Id</th>
<th>NAME</th>
<th>DESIGIATION</th>
<th>SALARY</th>
</tr>

<tr>
<td>${employee.id}</td>
<td>${employee.name }</td>
<td>${employee.desigination}</td>
<td>${employee.salary}</td>
</tr>

</table>
<br><br>
<button><a href="index.jsp">BACK HOME</a></button>

</body>
</html>