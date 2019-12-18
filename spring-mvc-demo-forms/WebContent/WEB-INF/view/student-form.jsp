<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		
		
		
		<br><br>
	
		Country:
		
		<form:select path="country">
		
			<!--<form:option value="India" label="India" />
			<form:option value="China" label="China" />
			<form:option value="Mexico" label="Mexico" />
			<form:option value="SriLanka" label="SriLanka" />-->
			
		<form:options items="${student.countryOptions}" />
			
		</form:select>
		
	    <br><br>
	    
	    Favourite language:
	    
	    Java <form:radiobutton path ="favouriteLanguage" value="Java"/>
	    C# <form:radiobutton path ="favouriteLanguage" value="C#"/>
	    Python<form:radiobutton path ="favouriteLanguage" value="Python"/>
	    Node <form:radiobutton path ="favouriteLanguage" value="Node"/>
	    
	   
	    <br><br>
	    
	    Linux<form:checkbox path="opertingSystems" value="Linux"/>
	    Windows<form:checkbox path="opertingSystems" value="Windows"/>
	    MAC<form:checkbox path="opertingSystems" value="MAC"/>
	    Unix<form:checkbox path="opertingSystems" value=" Unix"/>
	     
	    <br><br>
	
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>