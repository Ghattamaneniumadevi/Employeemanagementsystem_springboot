<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="modify" modelAttribute="employee">

<form:label path="id">ID:</form:label>
<form:input path="id"/><br><br>

<form:label path="name">NAME:</form:label>
<form:input path="name"/><br><br>

<form:label path="desigination">DESIGINATION:</form:label>
<form:input path="desigination"/><br><br>


<form:label path="salary">SALARY:</form:label>
<form:input path="salary"/><br><br>

<input type="submit" value="Update Employee"> 

</form:form>

</body>
</html>