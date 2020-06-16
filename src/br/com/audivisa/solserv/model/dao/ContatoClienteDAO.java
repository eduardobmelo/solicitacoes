package br.com.audivisa.solserv.model.dao;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import br.com.audivisa.solserv.model.entity.ContatoCliente;

@Transactional
@RequestScoped
@Named(value="contatoclientedao")
public class ContatoClienteDAO {

	@PersistenceContext(unitName="sol-serv-pu")
	private EntityManager em;

	public ContatoClienteDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<ContatoCliente> listarTodos(Integer idCliente) {
		List<ContatoCliente> resultList;
		try {
			Query query = em.createQuery(
					"SELECT cc FROM ContatoCliente cc left outer join fetch cc.municipio m left outer join fetch m.estado e WHERE cc.idCliente = :idCliente ORDER BY cc.nome", ContatoCliente.class);
			query.setParameter("idCliente", idCliente);
			resultList = query.getResultList();
		} catch (Exception e) {
			throw e;
		}

		return resultList;
	}

	public ContatoCliente salvar(ContatoCliente contato) throws Exception {

		try {
			em.persist(contato);
		} catch (Exception e) {
			throw e;
		}
		return contato;
	}

	public ContatoCliente alterar(ContatoCliente contato) throws Exception {

		try {
			contato = em.merge(contato);
		} catch (Exception e) {
			throw e;
		}
		return contato;
	}

	public ContatoCliente buscar(Integer id) throws Exception {
		try {
			Query query = em.createQuery("SELECT c FROM ContatoCliente c left outer join fetch c.municipio m left outer join fetch m.estado e WHERE c.id = :id");
			query.setParameter("id", id);
			ContatoCliente result = (ContatoCliente) query.getSingleResult();

			if (result != null) {
				if (result.getDataNascimento() != null) {
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					result.setDataNascimento(sdf.parse(sdf.format(result.getDataNascimento())));
				}
			}

			return result;
		} catch (Exception e) {
			throw e;
		}
	}

	public void excluir(Integer id) throws Exception {
		try {
			Query query = em.createQuery("DELETE FROM ContatoCliente c WHERE c.id = :id");
			query.setParameter("id", id);
			query.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
	}
}
