package controlador;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Usuario;
import modelo.ModeloUsuario;

/**
 * Servlet implementation class Eliminar
 */
@WebServlet("/Eliminar")
public class Eliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Eliminar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//coger la id de la linea que he selecionado eliminar
		//enviarle el id a la base de datos para que elimine el odjeto
		//visualizar la tabla con los cambios realizados (ver usuarios)
		
		
		
		
	ModeloUsuario usuarioM = new ModeloUsuario();
	
	usuarioM.conectar();
		
	int id = Integer.parseInt(request.getParameter("id"));
	
	usuarioM.eliminarUsuario(id);
	
	
	//visualizar
	ArrayList <Usuario> usuarios = new ArrayList<>();
	
	usuarios= usuarioM.getUsuarios();
	
	usuarioM.cerrar();

	request.setAttribute("usuarios", usuarios);
	
	
	request.getRequestDispatcher("TableForm.jsp").forward(request, response);
	
	
	usuarioM.cerrar();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
