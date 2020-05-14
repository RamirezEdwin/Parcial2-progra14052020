package com.parcial2.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TbHistorial;



public class historialDao {

	public void agregarDatosHistorial(TbHistorial his){
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("procticalogin");
		em = emf.createEntityManager();
	    em.getTransaction().begin();
	    em.persist(his);
	    em.flush();
	    em.getTransaction().commit();
	}
	
	public List<Object>	historial(){
		
		List<Object> HISTO = new ArrayList<>();
		
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("procticalogin");
		em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			HISTO = em.createQuery("SELECT his.idHistorial, his.TbUsuariop.idUsuarios, his.fecha, "
			+" usu.nombre_usuario, usu.apellido_usuario"
			+" FROM tbHistorial AS his"
			+" INNER JOIN TbUsuariop AS usu ON usu.idUsuarios = his.TbUsuariop.idUsuarios").getResultList();
			
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e+"error");
		}
		return HISTO;
	}
		
		
		
		
	}
	

