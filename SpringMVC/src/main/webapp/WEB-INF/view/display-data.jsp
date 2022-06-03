<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
  The student name is :  ${std.firstName}   ${std.lastName}
   
  <br><br>
  
  Country : ${std.country}
  
  <br><br>
  
  Favourite Language is :${std.favouriteLanague} 
  
  <br><br>  
  
  
  Operating Systems:
  
  <ul>
  <c:forEach var="os" items="${std.operatingSystem}">
   <li>${os}</li>
  </c:forEach>
  </ul>
 
  
</body>
</html>