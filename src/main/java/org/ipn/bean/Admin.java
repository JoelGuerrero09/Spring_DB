package org.ipn.bean;

public class Admin {
	
	private Integer idAdmin;
	private String nombre, apellido, hobby;
	
	
	
	
	
	public Admin() {
		
	}
	
	public Admin(Integer idAdmin, String nombre, String apellido, String hobby) {
		
		this.idAdmin = idAdmin;
		this.nombre = nombre;
		this.apellido = apellido;
		this.hobby = hobby;
	}
	
	public Integer getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(Integer idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	

}
