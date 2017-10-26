package org.ipn.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Direccion {
	
	private String calle;
	private String cp;
	
	
	public Direccion() {
		
	}


	public Direccion(String calle, String cp) {
		
		this.calle = calle;
		this.cp = cp;
	}


	public String getCalle() {
		return calle;
	}

	@Autowired
	public void setCalle(@Value("Insurgentes sur 3300")String calle) {
		this.calle = calle;
	}


	public String getCp() {
		return cp;
	}

	@Autowired
	public void setCp(@Value("333")String cp) {
		this.cp = cp;
	}


	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", cp=" + cp + "]";
	}
	
	
	

}
