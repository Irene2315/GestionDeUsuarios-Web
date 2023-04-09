package modelo;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Rol;
import conexion.Conector;

public class ModeloRol extends Conector {
	
	public ArrayList<Rol> getRoles (){
		
		PreparedStatement prt;
		ArrayList <Rol> roles = new ArrayList <>();
		Rol rol = new Rol();
			try {
				prt = con.prepareStatement("SELECT id,nombre FROM roles ");
				ResultSet resultado = prt.executeQuery();
				
				while(resultado.next()) {
					rol = new Rol();
					rol.setId(resultado.getInt(1));
					rol.setNombre(resultado.getString(2));
					
					roles.add(rol);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return roles;
		}

	public Rol getRol(int id) {
		
		PreparedStatement prt;
		Rol rol = new Rol();
		
			try {
				prt= con.prepareStatement("SELECT id,nombre FROM roles WHERE id=?");
				prt.setInt(1, id);
				
				ResultSet result = prt.executeQuery();

				while(result.next()) {
					rol.setId(result.getInt(1));
					rol.setNombre(result.getString(2));
					
					return rol;					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rol;
		}
	}



