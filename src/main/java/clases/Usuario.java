package clases;

import java.util.Date;

public class Usuario {
	
	private int id;
	private String nombre;
	private String password;
	private Date fechaLogin;
	private Rol rol;
	
	public Usuario(int id, String nombre, String password, Date fechaLogin, Rol rol) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.password = password;
		this.fechaLogin = fechaLogin;
		this.rol = rol;
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


	public Rol getRol() {
		return rol;
	}


	public void setRol(Rol rol) {
		this.rol = rol;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", password=" + password + ", fechaLogin=" + fechaLogin
				+ ", rol=" + rol + "]";
	}
	
	
	
	 
	
	
	
	
	

}