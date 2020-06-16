package br.com.audivisa.solserv.model.dao;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import br.com.audivisa.solserv.model.entity.ObjetoSeguranca;

@Transactional
@RequestScoped
@Named(value="objetosegurancadao")
public class ObjetoSegurancaDAO {

	@PersistenceContext(unitName="sol-serv-pu")
	private EntityManager em;

	public ObjetoSegurancaDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<ObjetoSeguranca> listarTodos() {
		List<ObjetoSeguranca> resultList;
		try {
			Query query = em.createQuery(
					"SELECT c FROM ObjetoSeguranca c ORDER BY c.hierarquia");
			resultList = query.getResultList();
		} catch (Exception e) {
			throw e;
		}

		return resultList;
	}

	public ObjetoSeguranca salvar(ObjetoSeguranca objeto) throws Exception {

		try {
			em.persist(objeto);
		} catch (Exception e) {
			throw e;
		}
		
		return objeto;
	}

	public ObjetoSeguranca alterar(ObjetoSeguranca objeto) throws Exception {

		try {
			objeto = em.merge(objeto);
		} catch (Exception e) {
			throw e;
		}
		
		return objeto;
	}

	public ObjetoSeguranca buscar(Integer id) throws Exception {
		try {
			Query query = em.createQuery("SELECT c FROM ObjetoSeguranca c WHERE c.id = :id");
			query.setParameter("id", id);
			ObjetoSeguranca result = (ObjetoSeguranca) query.getSingleResult();

			return result;
		} catch (Exception e) {
			throw e;
		}
	}

	public void excluir(Integer id) throws Exception {
		try {
			Query query = em.createQuery("DELETE FROM ObjetoSeguranca c WHERE c.id = :id");
			query.setParameter("id", id);
			query.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
	}
}
