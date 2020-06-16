package br.com.audivisa.solserv.model.dao;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import br.com.audivisa.solserv.model.entity.Estado;

@Transactional
@RequestScoped
@Named(value="estadodao")
public class EstadoDAO {
	
	@PersistenceContext(unitName="sol-serv-pu")
	private EntityManager em;
	
	public EstadoDAO() {	
	}

	@SuppressWarnings("unchecked")
	public List<Estado> listarTodos() {
		List<Estado> resultList;
		try {
			Query query = em.createQuery("SELECT e FROM Estado e ORDER BY e.id");
			resultList = query.getResultList();
		} catch (Exception e) {
			throw e;
		}
		
		return resultList;
	}
}
