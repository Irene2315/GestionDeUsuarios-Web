<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>


	<h1 class="fw-bold">Modificar Usuario</h1>

	<form method="POST" action="ModificarUsuario">
		<p class="fw-bold">
			Id: ${usuario.id } <input type="hidden" name="id"
				value="${usuario.id }" /> <br>
		</p>

		<p class="fw-bold">
			Nombre: <input type="text" name="nombre" value="${usuario.nombre}" />
			<br>
		</p>
		<br>
		<p class="fw-bold">
			Contraseņa: <input type="text" name="password"
				value="${usuario.password }" /> <br>
		</p>
		<br>
		<p class="fw-bold">
			Fecha Login: <input type="date" name="fechaLogin"
				value="${usuario.fechaLogin }" /> <br>
		</p>
		<br> 
		<p>Roles:
		
		<select name="rol">
			<option value="0"></option>
			<c:forEach items="${roles}" var="rol">
			
				<c:if test="${rol.id == usuario.rol.id}">
					<option value="${rol.id}" selected> ${rol.nombre} </option>
				</c:if>
				
				<c:if test="${rol.id != usuario.rol.id}">
					<option value="${rol.id}"> ${rol.nombre} </option>
				</c:if>
				
			</c:forEach>
		</select> 
		</P>
	
		<br> <input type="submit" class="btn btn-secondary"
			value="Enviar" />




	</form>

	<a href="VerUsuarios" class="btn btn-primary">Volver</a>

</body>
</html>