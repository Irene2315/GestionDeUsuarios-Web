package controlador;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import clases.Rol;
import clases.Usuario;
import modelo.ModeloRol;
import modelo.ModeloUsuario;

@WebServlet("/Registrar")
public class Registrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Registrar() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ModeloRol rolM = new ModeloRol();
		rolM.conectar();		
		ArrayList <Rol> roles = rolM.getRoles();
		rolM.cerrar();
		
		request.setAttribute("roles", roles);
		request.getRequestDispatcher("VistaCrear.jsp").forward(request, response); }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Usuario usuario = new Usuario();
		ModeloUsuario usuarioM = new ModeloUsuario();
		
		String nombre =request.getParameter("nombre");
		String password=request.getParameter("password");
		SimpleDateFormat formatFecha= new SimpleDateFormat ("yyyy-MM-dd");
		
		Date FechaLogin;		
		int idRol =Integer.parseInt(request.getParameter("rol"));
		usuario.setNombre(nombre);
		usuario.setPassword(password);
		try {
			FechaLogin = formatFecha.parse(request.getParameter("fechaLogin"));
			
			usuario.setFechaLogin(FechaLogin);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); }
		Rol rol = new Rol();
		rol.setId(idRol);
		usuario.setRol(rol);
		
		usuarioM.conectar();
		usuarioM.registrarUsuario(usuario);
		usuarioM.cerrar();
		
		response.sendRedirect("VerUsuarios");} }
