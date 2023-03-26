<%@ page import="java.util.ArrayList" %>
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
<%
	ArrayList <Usuario> usuarios = (ArrayList <Usuario>) request.getAttribute("usuarios");
	
%>
	<table class="table">
	
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Id</th>
      <th scope="col">Nombre</th>
      <th scope="col">Contraseña</th>
      <th scope="col">Fecha_Login</th>
      <th scope="col"></th>
      <th scope="col"></th>
      <td><a href="Registrar" class="btn btn-dark">Registrar </a> </td>
     
    </tr>
  </thead>
  <tbody>
    
    <% for (Usuario usuario : usuarios) {
		
	
    %>
    <tr>
      <th scope="row"></th>
      <td><% out.println(usuario.getId()); %></td>
      <td><% out.println(usuario.getNombre()); %></td>
      <td><% out.println(usuario.getPassword()); %></td>
      <td><% out.println(usuario.getFechaLogin()); %></td>
      <td><a href="VerUsuario?id=<% out.println(usuario.getId()); %>" class="btn btn-primary ">Ver</a></td>
      <td><a href="ModificarUsuario?id=<% out.println(usuario.getId()); %>" class="btn btn-secondary ">Modificar </a> </td>
      <td><a href="Eliminar?id=<% out.println(usuario.getId()); %>" class="btn btn-danger" >eliminar </a> </td>
    </tr>
    <%
		}%>  
    
    
  </tbody>
</table>

</body>
</html>