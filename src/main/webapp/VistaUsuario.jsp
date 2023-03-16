<%@ page import="clases.Usuario" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Usuario usuario = (Usuario)  request.getAttribute("usuario"); %>
<h1>DATOS DEL USUARIO</h1>
<p>Id: <% out.print(usuario.getId()); %></p>
<p>Nombre: <% out.print(usuario.getNombre()); %></p>


</body>
</html>