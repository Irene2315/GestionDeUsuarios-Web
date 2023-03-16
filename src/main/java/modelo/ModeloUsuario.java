package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Usuario;
import conexion.Conector;

public class ModeloUsuario extends Conector {

	public ArrayList<Usuario> getUsuarios (){
		
		PreparedStatement prt;
		ArrayList <Usuario> usuarios = new ArrayList <>();
		Usuario usuario = new Usuario();
		try {
			prt = con.prepareStatement("SELECT * FROM `usuarios` ");
			ResultSet resultado = prt.executeQuery();
			
			
			
			while(resultado.next()) {
				usuario = new Usuario();
				usuario.setId(resultado.getInt(1));
				usuario.setNombre(resultado.getString(2));
				usuarios.add(usuario);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return usuarios;
		}
	
	public void  eliminarUsuario (int id) {
		
		PreparedStatement prt;
		
		try {
			prt = con.prepareStatement("DELETE FROM `usuarios` WHERE id=?");
			prt.setInt(1, id);
			prt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
		
		
	
}
