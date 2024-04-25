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
<form:form action="remove" modelAttribute="employee">
<form:label path="id">ENTER TO SEARCH</form:label>
<form:input path="id"/><br><br>
<input type="submit" value="remove">

</form:form>

</body>
</html>