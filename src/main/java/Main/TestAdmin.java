package Main;

import org.ipn.bean.Administrador;
import org.ipn.bean.Persona;
import org.ipn.bean.dao.AdminDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdmin {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*
		Administrador administrador = (Administrador)applicationContext.getBean( "admin");
		
		System.out.println(":::" + administrador);  
		*/
		
		Persona persona = new Persona();
		
		
		
		AdminDao adminDao = ( AdminDao)aC.getBean("adminDao");
		
		adminDao.save(persona);
	}


}
