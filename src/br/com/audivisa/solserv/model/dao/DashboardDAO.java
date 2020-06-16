package br.com.audivisa.solserv.model.dao;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import br.com.audivisa.solserv.model.entity.GraficoSolDash;
import br.com.audivisa.solserv.model.entity.IndicadorDash;

@Transactional
@RequestScoped
@Named(value="dashboarddao")
public class DashboardDAO {
	
	@PersistenceContext(unitName="sol-serv-pu")
	private EntityManager em;
	
	public DashboardDAO() {
	}
	
	public List<IndicadorDash> buscarIndicadores() {
		List<IndicadorDash> resultado = new ArrayList<IndicadorDash>();
		
		try {
			Query query = em.createQuery("SELECT count(c) FROM Cliente c");
			Long qtd = (Long) query.getSingleResult();
			
			if (qtd != null) {
				resultado.add(new IndicadorDash("Clientes", qtd, "fa fa-user fa-5x","primary"));
			}
			
			query = em.createQuery("SELECT count(c) FROM Solicitacao c");
			qtd = (Long) query.getSingleResult();
			
			if (qtd != null) {
				resultado.add(new IndicadorDash("Solicitações", qtd, "fa fa-tasks fa-5x","green"));
			}
			
			query = em.createQuery("SELECT count(c) FROM Colaborador c");
			qtd = (Long) query.getSingleResult();
			
			if (qtd != null) {
				resultado.add(new IndicadorDash("Colaboradores", qtd, "fa fa-user fa-5x","red"));
			}
			
		} catch (Exception e) {
			throw e;
		}

		return resultado;
	}
	
	@SuppressWarnings("unchecked")
	public List<GraficoSolDash> buscarDadosGraficoSolic() {
		List<GraficoSolDash> resultado = new ArrayList<GraficoSolDash>();
		
		try {
			Query query = em.createQuery("SELECT NEW br.com.audivisa.solserv.model.entity.GraficoSolDash(c.nome, count(s))"
					+ " FROM Solicitacao s inner join s.colaborador c GROUP BY c.nome");
			
			resultado = query.getResultList();
			
		} catch (Exception e) {
			throw e;
		}

		return resultado;
	}

}
