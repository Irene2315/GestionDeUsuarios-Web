<%@ page import="clases.Usuario" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
</head>
<body>


<h1 class="fw-bold" >Datos Del Usuario</h1>
<p class="fw-bold" >Id: ${usuario.id }</p>
<p class="fw-bold" >Nombre: ${usuario.nombre}</p>
<p class="fw-bold" >Contraseña: ${usuario.password}</p>
<p class="fw-bold" >Fecha Login: ${usuario.fechaLogin}</p>


<a href="VerUsuarios" class="btn btn-primary">Volver</a>

</body>
</html>