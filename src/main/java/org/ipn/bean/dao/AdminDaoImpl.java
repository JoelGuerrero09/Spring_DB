package org.ipn.bean.dao;

import org.ipn.bean.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component ("adminDao")
public class AdminDaoImpl {
	
	private NamedParameterJdbcTemplate jdbcTemplate;

	
	@Autowired
	public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public boolean save(Persona persona) {
		String sqlInsert = "INSERT INTO Persona (nombre) values (:nombre)";
		BeanPropertySqlParameterSource paramMap = new BeanPropertySqlParameterSource(admin);
		return jdbcTemplate.update(sqlInsert, paramMap) ==1;
		
	}
	
	
  

}
