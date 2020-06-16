package br.com.audivisa.solserv.model.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sol-serv-pu");
	
	public EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
}
