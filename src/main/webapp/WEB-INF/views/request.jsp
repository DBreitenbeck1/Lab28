<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link rel ="stylesheet" href ="/MyStyle.css"/>
</head>
<body>

<h2>Phil's Flawless Forecasts</h2>
<main>

<c:set var="count" value="0" scope="page" />

<section>
<div>
<label>What Day Do You Want to Know the Weather For?</label>

<form action="/fore">
<select name="day">
<c:forEach items="${days }" var ="day">  
<option value="${count }"> ${day} </option>
<c:set var="count" value="${count + 1}" scope="page"/>
</c:forEach>
</select>
</div>
<h5>Where Will You Be?</h5>
<p>Enter Latitude and Longitude</p>
<label>Latitude</label>
<input name="lat" type="number" step=0.00001>
<label>Longitude</label>
<input name="longi" type="number" step=0.00001>


<button type="submit">Forecast</button>
</form>
</section>


<div>
<table class="table">
<h2>Major Cities</h2>
  <tr>
    <th>City</th>
    <th>Latitude</th>
    <th>Longitude</th>
  </tr>
  <tr>
    <td>Detroit</td>
    <td>42.33143</td> 
    <td>-83.04575</td>
  </tr>
   <tr>
    <td>New York</td>
    <td>40.73061</td> 
    <td>-73.93524</td>
  </tr>
   <tr>
    <td>Washington D.C.</td>
    <td>38.8951</td> 
    <td>-77.0364</td>
  </tr>
  
  <tr>
    <td>New Orleans</td>
    <td>29.95107</td> 
    <td>-90.07153</td>
  </tr>
  <tr>
    <td>St. Louis</td>
    <td>38.62700</td> 
    <td>-90.19940</td>
  </tr>
  <tr>
    <td>Stevensville, MT</td>
    <td>46.50992</td> 
    <td>-114.09316</td>
  </tr>
   <tr>
    <td>Houston</td>
    <td>29.74991</td> 
    <td>-95.35842</td>
  </tr>
  <tr>
    <td>Las Vegas</td>
    <td>36.11465</td> 
    <td>-115.17281</td>
  </tr>
  <tr>
    <td>Los Angeles</td>
    <td>34.05224</td> 
    <td>-118.24368</td>
  </tr>
</table>


</div>

</main>

</body>
</html>