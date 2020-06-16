package br.com.audivisa.solserv.model.dao;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import br.com.audivisa.solserv.model.entity.Prioridade;

@Transactional
@RequestScoped
@Named(value="prioridadedao")
public class PrioridadeDAO {

	@PersistenceContext(unitName="sol-serv-pu")
	private EntityManager em;

	public PrioridadeDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<Prioridade> listarTodos() {
		List<Prioridade> resultList;
		try {
			Query query = em.createQuery(
					"SELECT c FROM Prioridade c ORDER BY c.nivel");
			resultList = query.getResultList();
		} catch (Exception e) {
			throw e;
		}

		return resultList;
	}
	
	public Prioridade salvar(Prioridade prioridade) throws Exception {

		try {
			em.persist(prioridade);
		} catch (Exception e) {
			throw e;
		}
		
		return prioridade;
	}

	public Prioridade alterar(Prioridade prioridade) throws Exception {

		try {
			prioridade = em.merge(prioridade);
		} catch (Exception e) {
			throw e;
		}
		
		return prioridade;
	}

	public Prioridade buscar(Integer id) throws Exception {
		try {
			Query query = em.createQuery("SELECT c FROM Prioridade c WHERE c.id = :id");
			query.setParameter("id", id);
			Prioridade result = (Prioridade) query.getSingleResult();

			return result;
		} catch (Exception e) {
			throw e;
		}
	}

	public void excluir(Integer id) throws Exception {
		try {
			Query query = em.createQuery("DELETE FROM Prioridade c WHERE c.id = :id");
			query.setParameter("id", id);
			query.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
	}
	
}
