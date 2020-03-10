<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<!-- Jquery -->
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>
<!-- Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<!-- JavaScript -->
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.1.0/css/all.css"
	integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt"
	crossorigin="anonymous">
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="css/menu.css">
<link rel="stylesheet" href="css/turnos.css">

</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light">
		<a class="navbar-brand" href="#"><img src="img/logoclinica.jpg"
			alt=""></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="./">Inicio
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="./Turnos">Turnos</a>
				</li>

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">Gestion</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item " href="#">Entrar</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item " href="#">Registrarse</a>

					</div></li>

			</ul>
			
		</div>
	</nav>
	<div class="table-title">
		<h3>TURNOS</h3>
	</div>
	<table class="table-fill">
		<thead>
			<tr>
				<th >id</th>
				<th >dni</th>
				<th >nombre</th>
				<th>apellido</th>
				<th >fecha</th>
				<th >hora</th>
				<th >consultorio</th>
				<th >medico</th>

			</tr>
		   
		</thead>
		<tbody class="table-hover">
		
		
		<c:forEach  var="turnos" items="${TURNOS}">
			<tr>
				<td >${turnos.getId()}</td>
				<td >${turnos.getDni()}</td>
				<td >${turnos.getName()}</td>
				<td >${turnos.getSecondName()}</td>
				<td >${turnos.getFecha()}</td>
				<td >${turnos.getHora()}</td>
				<td >${turnos.getConsultorio()}</td>
				<td >${turnos.getMedico()}</td>
             
			</tr>
		</c:forEach>
        

		</tbody>
	</table>
	

</body>
</html>