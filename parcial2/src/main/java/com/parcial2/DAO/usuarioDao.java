package com.parcial2.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;



public class usuarioDao {
	public  List<Usuario>  ingresoUsuario(Usuario usu){
		List<Usuario> usuario= new ArrayList();
		
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("parcial2");
		em = emf.createEntityManager();
		
		try {
			
			em.getTransaction().begin();
			usuario = em.createQuery("from Usuario as u where  u.nombre = '"+usu.getNombre()+"' and u.contrasenia = '"+usu.getContrasenia()+"'").getResultList();
			
			em.getTransaction().commit();
			
			
			for (Usuario datosids:usuario){
				
				usu.setId(datosids.getId());
			
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e+"error");
		}
		
		
		
		return usuario;
		
		
	}
	
	
	
	
	
	
	

}
