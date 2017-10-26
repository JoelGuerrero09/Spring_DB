package org.ipn.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Administrador {
	
	private int idAd;
	private String nombre;
	@Autowired
	private Direccion direccion;
	
	
	
	public Administrador() {
	}
	
	public Administrador(int idAd, String nombre) {
		this.idAd = idAd;
		this.nombre = nombre;
	}
	
	public int getIdAd() {
		return idAd;
	}
	public void setIdAd(int idAd) {
		this.idAd = idAd;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Administrador [idAd=" + idAd + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	

}
