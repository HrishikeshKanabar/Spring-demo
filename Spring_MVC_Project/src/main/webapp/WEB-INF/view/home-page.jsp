<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<head>
<style>
body {
  background-image: url("https://previews.123rf.com/images/bondd/bondd1908/bondd190800050/128001064-school-study-concept-background-simple-pattern-on-a-white-background-different-multi-colored-pencils.jpg");
  background-repeat: no-repeat;
  background-size: 100% 800px;
  
}

/* The flip card container - set the width and height to whatever you want. We have added the border property to demonstrate that the flip itself goes out of the box on hover (remove perspective if you don't want the 3D effect */
.flip-card {
  background-color: transparent;
  width: 300px;
  height: 200px;
  border: 1px solid #f1f1f1;
  perspective: 1000px; /* Remove this if you don't want the 3D effect */
}

/* This container is needed to position the front and back side */
.flip-card-inner {
  position: relative;
  width: 100%;
  height: 100%;
  text-align: center;
  transition: transform 0.8s;
  transform-style: preserve-3d;
}

/* Do an horizontal flip when you move the mouse over the flip box container */
.flip-card:hover .flip-card-inner {
  transform: rotateY(180deg);
}

/* Position the front and back side */
.flip-card-front, .flip-card-back {
  position: absolute;
  width: 100%;
  height: 100%;
  -webkit-backface-visibility: hidden; /* Safari */
  backface-visibility: hidden;
}

/* Style the front side (fallback if image is missing) */
.flip-card-front {
  background-color: #bbb;
  color: black;
}

/* Style the back side */
.flip-card-back {
  background-color: dodgerblue;
  color: white;
  transform: rotateY(180deg);
}


</style>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
     <!-- Custom CSS -->
    <link href="/Spring_MVC_Project/resources/static/css/style.css" rel="stylesheet">
    <!-- Add icon library -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
<title>Coaching Services</title>

</head>
<body>

<nav class="navbar navbar-inverse">
    <div class="text-center ">
     <h1   style="color:white;font-size:24px;font-weight:bold">Coaching Services</h1>
    </div>
 
</nav>
<table>
<tr>
<td>
<div class="flip-card">
  <div class="flip-card-inner">
    <div class="flip-card-front">
       <h1>Baseball Coach</h1>
       <p>Hover over to get Instructions and fortune</p>
    </div>
    <div class="flip-card-back">
     <h3>Coach Name : John Doe</h3>
      <p>Instruction : ${insBase} </p>
      <p>Fortune : ${forBase}</p>
    </div>
  </div>
</div>
</td>
<td>
<div class="flip-card">
  <div class="flip-card-inner">
    <div class="flip-card-front">
       <h1>Ping Pong Coach</h1>
       <p>Hover over to get Instructions and fortune</p>
    </div>
    <div class="flip-card-back">
      <h3>Coach Name : John Doe</h3>
      <p>Instruction : ${insBase} </p>
      <p>Fortune : ${forBase}</p>
    </div>
  </div>
</div>
</td>
<td>
<div class="flip-card">
  <div class="flip-card-inner">
    <div class="flip-card-front">
       <h1>Soccer Coach</h1>
       <p>Hover over to get Instructions and fortune</p>
    </div>
    <div class="flip-card-back">
      <h3>Coach Name : John Doe</h3>
      <p>Instruction : ${insBase} </p>
      <p>Fortune : ${forBase}</p>
    </div>
  </div>
</div>
</td>
</tr>

<tr>
<td>
<div class="flip-card">
  <div class="flip-card-inner">
    <div class="flip-card-front">
       <h1>Cricket Coach</h1>
       <p>Hover over to get Instructions and fortune</p>
    </div>
    <div class="flip-card-back">
     <h3>Coach Name : John Doe</h3>
      <p>Instruction : ${insBase} </p>
      <p>Fortune : ${forBase}</p>
    </div>
  </div>
</div>
</td>
<td>
<div class="flip-card">
  <div class="flip-card-inner">
    <div class="flip-card-front">
       <h1>Basket Ball Coach</h1>
       <p>Hover over to get Instructions and fortune</p>
    </div>
    <div class="flip-card-back">
      <h3>Coach Name : John Doe</h3>
      <p>Instruction : ${insBask} </p>
      <p>Fortune : ${forBask}</p>
    </div>
  </div>
</div>
</td>
<td>
<div class="flip-card">
  <div class="flip-card-inner">
    <div class="flip-card-front">
       <h1>Running Coach</h1>
       <p>Hover over to get Instructions and fortune</p>
    </div>
    <div class="flip-card-back">
      <h3>Coach Name : John Doe</h3>
      <p>Instruction : ${insBask} </p>
      <p>Fortune : ${forBask}</p>
    </div>
  </div>
</div>
</td>
</tr>
</table>
  
</body>
</html>