package br.com.audivisa.solserv.model.dao;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import br.com.audivisa.solserv.model.entity.PapelSeguranca;
import br.com.audivisa.solserv.model.entity.PermissaoSeguranca;

@Transactional
@RequestScoped
@Named(value="papelsegurancadao")
public class PapelSegurancaDAO {

	@PersistenceContext(unitName="sol-serv-pu")
	private EntityManager em;

	public PapelSegurancaDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<PapelSeguranca> listarTodos() {
		List<PapelSeguranca> resultList;
		try {
			Query query = em.createQuery(
					"SELECT distinct p FROM PapelSeguranca p "
					+ " ORDER BY p.nome ");
			resultList = query.getResultList();
		} catch (Exception e) {
			throw e;
		}

		return resultList;
	}
	
	public PapelSeguranca salvar(PapelSeguranca papel) throws Exception {

		try {
			em.persist(papel);
		} catch (Exception e) {
			throw e;
		}
		return papel;
	}

	public PapelSeguranca alterar(PapelSeguranca papel) throws Exception {

		try {
			papel.setPermissoes(permissoes(papel.getId()));
			papel = em.merge(papel);
		} catch (Exception e) {
			throw e;
		}
		
		return papel;
	}

	public PapelSeguranca buscar(Integer id) throws Exception {
		try {
			Query query = em.createQuery("SELECT p FROM PapelSeguranca p "
					+ "WHERE p.id = :id");
			query.setParameter("id", id);
			PapelSeguranca result = (PapelSeguranca) query.getSingleResult();
			
			result.setPermissoes(permissoes(id));

			return result;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	private List<PermissaoSeguranca> permissoes(Integer id) {
		List<PermissaoSeguranca> listaPermissoes = null;
		
		try {
			Query query = em.createQuery("SELECT pe FROM PermissaoSeguranca pe "
					+ "join fetch pe.objeto o "
					+ "WHERE pe.idPapel = :id "
					+ "ORDER BY o.hierarquia");
			query.setParameter("id", id);
			
			listaPermissoes = query.getResultList();
			
			return listaPermissoes;
		} catch (Exception e) {
			throw e;
		}
	}

	public void excluir(Integer id) throws Exception {
		try {
			Query query = em.createQuery("DELETE FROM PapelSeguranca c WHERE c.id = :id");
			query.setParameter("id", id);
			query.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
	}
	
	public void atualizarPermissao(PermissaoSeguranca permissao) {
		try {
			Query query = em.createQuery("UPDATE PermissaoSeguranca p SET p.permissao = :permissao WHERE p.id = :id");
			query.setParameter("id", permissao.getId());
			query.setParameter("permissao", permissao.getPermissao());
			query.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
	}
	
}
