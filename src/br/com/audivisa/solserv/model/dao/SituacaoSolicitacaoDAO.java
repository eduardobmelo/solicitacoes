package br.com.audivisa.solserv.model.dao;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import br.com.audivisa.solserv.model.entity.SituacaoSolicitacao;

@Transactional
@RequestScoped
@Named(value="situacaosolicitacaodao")
public class SituacaoSolicitacaoDAO {

	@PersistenceContext(unitName="sol-serv-pu")
	private EntityManager em;

	public SituacaoSolicitacaoDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<SituacaoSolicitacao> listarTodos() {
		List<SituacaoSolicitacao> resultList;
		try {
			Query query = em.createQuery(
					"SELECT s FROM SituacaoSolicitacao s ORDER BY s.id");
			resultList = query.getResultList();
		} catch (Exception e) {
			throw e;
		}

		return resultList;
	}

	public SituacaoSolicitacao salvar(SituacaoSolicitacao situacao) throws Exception {

		try {
			if (situacao.getEncerrada() == null) 
				situacao.setEncerrada( Boolean.FALSE);
			
			em.persist(situacao);
		} catch (Exception e) {
			throw e;
		}
		
		return situacao;
	}

	public SituacaoSolicitacao alterar(SituacaoSolicitacao situacao) throws Exception {

		try {
			if (situacao.getEncerrada() == null) 
				situacao.setEncerrada( Boolean.FALSE);
			
			situacao = em.merge(situacao);
		} catch (Exception e) {
			throw e;
		}
		
		return situacao;
	}

	public SituacaoSolicitacao buscar(Integer id) throws Exception {
		try {
			Query query = em.createQuery("SELECT s FROM SituacaoSolicitacao s WHERE s.id = :id");
			query.setParameter("id", id);
			SituacaoSolicitacao result = (SituacaoSolicitacao) query.getSingleResult();

			return result;
		} catch (Exception e) {
			throw e;
		}
	}

	public void excluir(Integer id) throws Exception {
		try {
			Query query = em.createQuery("DELETE FROM SituacaoSolicitacao s WHERE s.id = :id");
			query.setParameter("id", id);
			query.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
	}
	
	public SituacaoSolicitacao buscarPrimeiraSituacaoEncerramento() {
		try {
			Query query = em.createQuery("SELECT s FROM SituacaoSolicitacao s "
					+ "WHERE s.encerrada = true");
			@SuppressWarnings("unchecked")
			List<SituacaoSolicitacao> resultList = query.getResultList();

			if (resultList.size() > 0) 
				return resultList.get(0);
			else
				return null;
			
		} catch (Exception e) {
			throw e;
		}
	}
}
