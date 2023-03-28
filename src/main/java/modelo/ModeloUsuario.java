package modelo;





import java.sql.Date;

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
				prt = con.prepareStatement("SELECT id, nombre,password,fecha_login,id_rol FROM usuarios ");
				
				
				ResultSet resultado = prt.executeQuery();
				
				
				
				while(resultado.next()) {
					usuario = new Usuario();
					usuario.setId(resultado.getInt(1));
					usuario.setNombre(resultado.getString(2));
					usuario.setPassword(resultado.getString(3));
					usuario.setFechaLogin(resultado.getDate(4));
					usuario.setIdRol(resultado.getInt(5));
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
		
		public Usuario getUsuario (int id) {
			
			PreparedStatement prt;
			
			Usuario usuario = new Usuario();
			
			
			try {
				prt = con.prepareStatement("SELECT id,nombre, password, fecha_login,id_rol FROM usuarios WHERE id=?");
				
				prt.setInt(1, id);
				
				ResultSet result = prt.executeQuery();
				while(result.next()) {
					usuario.setId(result.getInt(1));
					usuario.setNombre(result.getString(2));
					usuario.setPassword(result.getString(3));
					usuario.setFechaLogin(result.getDate(4));
					usuario.setIdRol(result.getInt(5));
					return usuario;	
				}	
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return usuario;	
			
				
			
			
		}
	
	public void modificarUsuario (Usuario usuario) {
		
		PreparedStatement prt;
		
		
		try {
			prt = con.prepareStatement("UPDATE usuarios SET nombre=?, password=?,fecha_login=?,id_rol=? WHERE id=?");
			
			
			
			
			prt.setString(1, usuario.getNombre());
			prt.setString(2, usuario.getPassword());
			
			prt.setDate(3,new Date (usuario.getFechaLogin().getTime()));
			
			prt.setInt(4, usuario.getIdRol());
			prt.setInt(5, usuario.getId());
			
			prt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void registrarUsuario(Usuario usuario) {
		
		PreparedStatement prt;
		
		
		
		try {
			prt = con.prepareStatement("INSERT INTO usuarios(nombre,password,fecha_login,id_rol) VALUES (?,?,?,?)");
			prt.setString(1,usuario.getNombre() );
			prt.setString(2,usuario.getPassword() );
			prt.setDate(3, new Date (usuario.getFechaLogin().getTime()));
			prt.setInt(4, usuario.getIdRol());
			
			prt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
		
	
}
