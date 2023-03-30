
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
<body>

	<table class="table">
	
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Id</th>
      <th scope="col">Nombre</th>
      <th scope="col">Contraseña</th>
      <th scope="col">Fecha_Login</th>
      <th scope="col">Roles</th>
      <th scope="col"></th>
      <th scope="col"></th>
      <td><a href="Registrar" class="btn btn-dark">Registrar </a> </td>
     
    </tr>
  </thead>
  <tbody>
    
     <c:forEach items="${usuarios}" var="usuario">
    <tr>
      <th scope="row"></th>
      <td>${usuario.id}</td>
      <td>${usuario.nombre}</td>
      <td>${usuario.password}</td>
      <td>${usuario.fechaLogin}</td>
      <td> ${usuario.rol.nombre} </td>
      
      <td><a href="VerUsuario?id=${usuario.id}" class="btn btn-primary ">Ver</a></td>
      <td><a href="ModificarUsuario?id=${usuario.id}" class="btn btn-secondary ">Modificar </a> </td>
      <td><a href="Eliminar?id=${usuario.id}" class="btn btn-danger" >eliminar </a> </td>
    </tr>
    
    </c:forEach>
    
    
  </tbody>
</table>

</body>
</html>