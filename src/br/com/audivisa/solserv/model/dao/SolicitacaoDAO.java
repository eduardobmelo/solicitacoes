package br.com.audivisa.solserv.model.dao;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import br.com.audivisa.solserv.model.entity.Solicitacao;
import br.com.audivisa.solserv.model.entity.SolicitacaoLista;
import br.com.audivisa.solserv.model.entity.SolicitacaoPainel;

@Transactional
@RequestScoped
@Named(value="solicitacaodao")
public class SolicitacaoDAO {

	@PersistenceContext(unitName="sol-serv-pu")
	private EntityManager em;

	public SolicitacaoDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<SolicitacaoLista> listarTodos(Boolean naoatendidas, String situacao, String colaborador) {
		List<SolicitacaoLista> resultList;
		String where = "";
		
		try {
			if (naoatendidas != null) {
				where += "ss.encerrada <> " + naoatendidas.toString();
			}
			
			if (situacao != null && !situacao.isEmpty()) {
				if (where.length() > 0) {
					where += " and";
				}
				where += " ss.id =  " + situacao;
				
			}
			
			if (colaborador != null && !colaborador.isEmpty()) {
				if (where.length() > 0) {
					where += " and";
				}
				where += " co.id = " + colaborador;
			}
			
			if (where.length() > 0) {
				where = " where " + where;
			}
			
			Query query = em.createQuery(
					"SELECT NEW br.com.audivisa.solserv.model.entity.SolicitacaoLista(s.titulo, "
					+ "s.dataHoraSolicitacao,"
					+ "s.execucao,"
					+ "co.nome,"
					+ "ss.descricao,"
					+ "s.id) "
					+ "FROM Solicitacao s "
					+ "join s.cliente c "
					+ "join s.situacao ss "
					+ "join s.colaborador co "
					+ where
					+ " ORDER BY s.dataHoraSolicitacao");
			
			resultList = query.getResultList();
			
			if (resultList.size() == 0) {
				return null;
			}
			
		} catch (Exception e) {
			throw e;
		}

		return resultList;
	}

	public Solicitacao salvar(Solicitacao solicitacao) throws Exception {

		try {
			em.persist(solicitacao);
		} catch (Exception e) {
			throw e;
		}
		
		return solicitacao;
	}

	public Solicitacao alterar(Solicitacao solicitacao) throws Exception {

		try {
			solicitacao = em.merge(solicitacao);
		} catch (Exception e) {
			throw e;
		}
		
		return solicitacao;
	}

	public Solicitacao buscar(Integer id) throws Exception {
		try {
			
			Query query = em.createQuery("SELECT s FROM Solicitacao s "
					+ "join fetch s.situacao si "
					+ "join fetch s.cliente c "
					+ "join fetch c.municipio cm "
					+ "join fetch cm.estado "
					+ "join fetch s.colaborador co "
					+ "join fetch co.municipio com "
					+ "join fetch s.prioridade "
					+ "WHERE s.id = :id");
			query.setParameter("id", id);
			Solicitacao result = (Solicitacao) query.getSingleResult();

			return result;
		} catch (Exception e) {
			throw e;
		}
	}

	public void excluir(Integer id) throws Exception {
		try {
			Query query = em.createQuery("DELETE FROM Solicitacao c WHERE c.id = :id");
			query.setParameter("id", id);
			query.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<SolicitacaoPainel> listarSolicitacoesAbertasPainel(Integer idColaborador) {
		List<SolicitacaoPainel> resultList;
		
		try {
			Query query = em.createQuery(
					"SELECT NEW br.com.audivisa.solserv.model.entity.SolicitacaoPainel(s.id,"
					+ "s.dataHoraSolicitacao,"
					+ "ss.descricao,"
					+ "s.execucao,"
					+ "p.nivel, "
					+ "cl.nomeRazaoSocial,"
					+ "s.solicitacao) "
					+ "FROM Solicitacao s "
					+ "join s.situacao ss "
					+ "join s.colaborador co "
					+ "join s.prioridade p "
					+ "join s.cliente cl "
					+ "where co.id = :id "
					+ "and ss.encerrada <> true "
					+ "ORDER BY s.dataHoraSolicitacao, p.nivel");
			query.setParameter("id", idColaborador);
			resultList = query.getResultList();
			
			if (resultList.size() == 0) {
				return null;
			}
			
		} catch (Exception e) {
			throw e;
		}

		return resultList;
	}
}
