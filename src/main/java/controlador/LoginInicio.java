package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.synth.SynthPasswordFieldUI;

import clases.Usuario;
import modelo.ModeloUsuario;

/**
 * Servlet implementation class LoginInicio
 */
@WebServlet("/LoginInicio")
public class LoginInicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginInicio() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("VistaLoging.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre =request.getParameter("nombre");
		String password=request.getParameter("password");
				
		ModeloUsuario usuarioM = new ModeloUsuario();
		usuarioM.conectar();
		String contrasenaBdd = usuarioM.getContrasena(nombre);
		
		if (password.equals(contrasenaBdd)) {//login ok
			//conseguir el usuario de la BBDD
			
			Usuario usuarioLogueado =usuarioM.getUsuario(nombre);
				
			//gaurdar el usuario en session
			HttpSession session = request.getSession();
			session.setAttribute("usuarioLogueado", usuarioLogueado);
			
			response.sendRedirect("VerUsuarios");
		}
		else {
			request.getRequestDispatcher("VistaLoging.jsp").forward(request, response);
		}
		
		usuarioM.cerrar();
	}
}
