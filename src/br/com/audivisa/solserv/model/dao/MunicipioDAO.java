package br.com.audivisa.solserv.model.dao;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import br.com.audivisa.solserv.model.entity.Municipio;

@Transactional
@RequestScoped
@Named(value="municipiodao")
public class MunicipioDAO {
	
	@PersistenceContext(unitName="sol-serv-pu")
	private EntityManager em;
	
	public MunicipioDAO() {	
	}

	@SuppressWarnings("unchecked")
	public List<Municipio> listarPorUf(String uf) {
		List<Municipio> resultList;
		try {
			Query query = em.createQuery("SELECT m FROM Municipio m inner join fetch m.estado WHERE m.estado.id = :uf ORDER BY m.nome");
			query.setParameter("uf", uf);
			resultList = query.getResultList();
		} catch (Exception e) {
			throw e;
		}
		
		return resultList;
	}
}
