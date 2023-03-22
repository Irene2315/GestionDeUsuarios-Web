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
</head>
<body>
<% Usuario usuario = (Usuario)  request.getAttribute("usuario"); %>
<h1 class="fw-bold" >Datos Del Usuario</h1>
<p class="fw-bold" >Id: <% out.print(usuario.getId()); %></p>
<p class="fw-bold" >Nombre: <% out.print(usuario.getNombre()); %></p>
<p class="fw-bold" >Contraseña: <% out.print(usuario.getPassword()); %></p>

<a href="VerUsuarios" class="btn btn-primary">Volver</a>

</body>
</html>