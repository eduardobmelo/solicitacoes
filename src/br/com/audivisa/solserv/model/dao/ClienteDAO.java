package br.com.audivisa.solserv.model.dao;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.transaction.Transactional;
import br.com.audivisa.solserv.model.entity.Cliente;
import br.com.audivisa.solserv.model.entity.ClienteLista;

@Transactional
@RequestScoped
@Named(value="clientedao")
public class ClienteDAO {

	@PersistenceContext(unitName="sol-serv-pu")
	private EntityManager em;

	public ClienteDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> listarTodos() {
		List<Cliente> resultList;
		try {
			Query query = em.createQuery(
					"SELECT c FROM Cliente c inner join fetch c.municipio m inner join fetch m.estado e ORDER BY c.nomeRazaoSocial");
			resultList = query.getResultList();
		} catch (Exception e) {
			throw e;
		}

		return resultList;
	}
	
	@SuppressWarnings("unchecked")
	public List<ClienteLista> listarTodosIdNome() {
		List<ClienteLista> resultList;
		try {
			Query query = em.createQuery(
					"SELECT NEW br.com.audivisa.solserv.model.entity.ClienteLista(c.id, c.nomeRazaoSocial) "
					+ "FROM Cliente c ORDER BY c.nomeRazaoSocial");
			resultList = query.getResultList();
		} catch (Exception e) {
			throw e;
		}

		return resultList;
	}

	public Cliente salvar(Cliente cliente) throws Exception {

		try {
			em.persist(cliente);
		} catch (PersistenceException e) {
			throw new Exception(e.getCause().getCause().getMessage());
		} 
		return cliente;
	}

	public Cliente alterar(Cliente cliente) throws Exception {

		try {
			cliente = em.merge(cliente);
		} catch (Exception e) {
			throw e;
		} 
		return cliente;
	}

	public Cliente buscar(Integer id) throws Exception {
		try {
			Query query = em.createQuery("SELECT c FROM Cliente c inner join fetch c.municipio m inner join fetch m.estado e WHERE c.id = :id");
			query.setParameter("id", id);
			Cliente result = (Cliente) query.getSingleResult();

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
			Query query = em.createQuery("DELETE FROM Cliente c WHERE c.id = :id");
			query.setParameter("id", id);
			query.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
	}
}
