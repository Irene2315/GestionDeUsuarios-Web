package controlador;

import java.io.IOException;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Usuario;
import modelo.ModeloUsuario;

/**
 * Servlet implementation class ModidicarUsuario
 */
@WebServlet("/ModificarUsuario")
public class ModificarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ModeloUsuario usuarioM = new ModeloUsuario();
		
		usuarioM.conectar();
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Usuario usuario = new Usuario();
		
		usuario = usuarioM.getUsuario(id);
		
		
		request.setAttribute("usuario", usuario);
		
		
		request.getRequestDispatcher("VistaModificarUsuario.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usuario usuario = new Usuario();
		ModeloUsuario usuarioM = new ModeloUsuario();
		
		
		
		
			int id = Integer.parseInt( request.getParameter("id"));
			String nombre =request.getParameter("nombre");
			String password = request.getParameter("password");
			
			
			
			
			SimpleDateFormat formatFecha= new SimpleDateFormat ("yyyy-MM-dd");
			Date FechaLogin;
			
				try {
					FechaLogin = formatFecha.parse(request.getParameter("fechaLogin"));
					usuario.setFechaLogin((java.sql.Date) FechaLogin);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			
			
			
			
			usuario.setId(id);
			usuario.setNombre(nombre);
			usuario.setPassword(password);
			
		
		
		
		
		
		usuarioM.conectar();
		
		usuarioM.modificarUsuario(usuario);
		
		
		response.sendRedirect("VerUsuarios");
		}
	}



