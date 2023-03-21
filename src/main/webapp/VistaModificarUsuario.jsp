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
<h1> Usuario Modificar</h1>

<form method="POST" action="ModificarUsuario">
		<p>Id: <% out.print(usuario.getId()); %>
		<input type="hidden" name="id" value="<% out.print(usuario.getId()); %>"/> <br> </p>
		
		<p>Nombre:
		<input type="text" name="nombre" value="<% out.print(usuario.getNombre()); %>"/> <br></p>
		<br>
		<br>
		<input type="submit" class="btn btn-secondary" value="Enviar"/>
		
		
	
	
</form>

		<a href="VerUsuarios" class="btn btn-primary">Volver</a>

</body>
</html>