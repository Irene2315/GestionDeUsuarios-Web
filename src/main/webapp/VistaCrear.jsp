<%@ page import="clases.Usuario" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<% Usuario usuario = (Usuario)  request.getAttribute("usuario"); %>
<h1 class="fw-bold" > Resgistrar Usuario</h1>

<form method="POST" action="Registrar">
		
		<p>Nombre:
		<input type="text" name="nombre" /> <br></p>
		<br>
		<br>
		<input type="submit" class="btn btn-secondary" value="Guardar"/>
	
	
</form>

		<a href="VerUsuarios" class="btn btn-primary">Volver</a>
		
		

</body>
</html>