<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Weather Application</title>

<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style type="text/css">
.table {
	width: 40%;
}
</style>

</head>
<body>
	<table class="table table-striped">
		<caption>
			<strong>Brussels wheather</strong>
		</caption>
		<thead>
		</thead>
		<tbody>
			<tr>
				<td>humidity</td>
				<td>${weatherData.main.humidity}</td>
			</tr>
			<tr>
				<td>pressure</td>
				<td>${weatherData.main.pressure}</td>
			</tr>
			<tr>
				<td>temp</td>
				<td>${weatherData.main.temp}</td>
			</tr>
			<tr>
				<td>temp_max</td>
				<td>${weatherData.main.tempMax}</td>
			</tr>
			<tr>
				<td>temp_min</td>
				<td>${weatherData.main.tempMin}</td>
			</tr>
			<tr>
				<td>Wind Speed</td>
				<td>${weatherData.wind.speed}</td>
			</tr>
		</tbody>
	</table>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>