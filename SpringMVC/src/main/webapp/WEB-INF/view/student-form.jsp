<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- Spring form tag library -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
                                 <!-- Student model -->
    <form:form action="display" modelAttribute="std"> 
    
    <!-- Textbox -->
    First Name : <form:input path="firstName"/>
    <br><br>
    
    Last Name: <form:input path="lastName"/>
    
    <br><br>
    
    <!-- Picklist-->
    <form:select path="country">
      <option value="CA">Canada</option>
      <option value="US">Unites States</option>
      <option value="China">China</option>
      <option value="France">France</option>
      <option value="India">India</option>
      <option value="Spain">Spain</option>
    </form:select>
    
    <br><br>
    <!--Radio Button-->
    
    Favorite Language:
    
    JAVA <form:radiobutton value="Java" path="favouriteLanague"/>
    C#  <form:radiobutton value="C#" path="favouriteLanague"/>
    Python <form:radiobutton value="Python" path="favouriteLanague"/>
    Ruby  <form:radiobutton value="Ruby" path="favouriteLanague"/>
    
    <br><br>
    <!-- Checboxes -->
      
    Operating Systems:
    
    Linux <form:checkbox value="Linux" path="operatingSystem"/>
    Mac OS <form:checkbox value="Mac" path="operatingSystem"/>
    MS Windows <form:checkbox value="Windows" path="operatingSystem"/>
  
   <br><br>
   
   <input type="submit" value="Submit" />

</form:form>

</body>
</html>