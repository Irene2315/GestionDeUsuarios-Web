package clases;

import java.util.Date;

public class Usuario {
	
	private int id;
	private String nombre;
	private String password;
	private Date fechaLogin;
	private int idRol;
	
	
	public Usuario(int id, String nombre, String password, Date fechaLogin, int idRol) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.password = password;
		this.fechaLogin = fechaLogin;
		this.idRol = idRol;
	}

	public Usuario() {
		
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Date getFechaLogin() {
		return fechaLogin;
	}


	public void setFechaLogin(Date fechaLogin) {
		this.fechaLogin = fechaLogin;
	}


	public int getIdRol() {
		return idRol;
	}


	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", password=" + password + ", fechaLogin=" + fechaLogin
				+ ", idRol=" + idRol + "]";
	}
	
	 
	
	
	
	
	

}