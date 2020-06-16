package br.com.audivisa.solserv.model.dao;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import br.com.audivisa.solserv.model.entity.PermissaoSeguranca;

@Transactional
@RequestScoped
@Named(value="permissaosegurancadao")
public class PermissaoSegurancaDAO {

	@PersistenceContext(unitName="sol-serv-pu")
	private EntityManager em;

	public PermissaoSegurancaDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<PermissaoSeguranca> listarTodosPorPapel(Integer idPapel) {
		List<PermissaoSeguranca> resultList;
		try {
			Query query = em.createQuery(
					"SELECT p FROM PermissaoSeguranca p join fetch p.objetos o ORDER BY o");
			resultList = query.getResultList();
		} catch (Exception e) {
			throw e;
		}

		return resultList;
	}
	
	public PermissaoSeguranca salvar(PermissaoSeguranca permissao) throws Exception {

		try {
			em.persist(permissao);
		} catch (Exception e) {
			throw e;
		}
		
		return permissao;
	}

	public PermissaoSeguranca alterar(PermissaoSeguranca permissao) throws Exception {

		try {
			permissao = em.merge(permissao);
		} catch (Exception e) {
			throw e;
		}
		
		return permissao;
	}

	public PermissaoSeguranca buscar(Integer id) throws Exception {
		try {
			Query query = em.createQuery("SELECT c FROM PermissaoSeguranca c WHERE c.id = :id");
			query.setParameter("id", id);
			PermissaoSeguranca result = (PermissaoSeguranca) query.getSingleResult();

			return result;
		} catch (Exception e) {
			throw e;
		}
	}

	public void excluir(Integer id) throws Exception {
		try {
			Query query = em.createQuery("DELETE FROM PermissaoSeguranca c WHERE c.id = :id");
			query.setParameter("id", id);
			query.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
	}
	
}
