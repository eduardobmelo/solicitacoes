package br.com.audivisa.solserv.model.dao;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import br.com.audivisa.solserv.model.entity.Colaborador;

@Transactional
@RequestScoped
@Named(value="colaboradordao")
public class ColaboradorDAO {

	@PersistenceContext(unitName="sol-serv-pu")
	private EntityManager em;

	public ColaboradorDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<Colaborador> listarTodos() {
		List<Colaborador> resultList;
		try {
			Query query = em.createQuery(
					"SELECT c FROM Colaborador c join fetch c.municipio m join fetch m.estado e ORDER BY c.nome");
			
			resultList = query.getResultList();
			
			if (resultList.size() == 0) {
				return null;
			}
		} catch (Exception e) {
			throw e;
		}

		return resultList;
	}
	
	@SuppressWarnings("unchecked")
	public List<Colaborador> listarTodosIdNome() {
		List<Colaborador> resultList;
		try {
			Query query = em.createQuery("SELECT c FROM Colaborador c join fetch c.municipio m join fetch m.estado e ORDER BY c.nome");
			resultList = query.getResultList();
			
			if (resultList.size() == 0) {
				return null;
			}
		} catch (Exception e) {
			throw e;
		}

		return resultList;
	}

	public Colaborador salvar(Colaborador colaborador) throws Exception {

		try {
			em.persist(colaborador);
		} catch (Exception e) {
			throw e;
		}
		return colaborador;
	}

	public Colaborador alterar(Colaborador colaborador) throws Exception {

		try {
			colaborador = em.merge(colaborador);
		} catch (Exception e) {
			throw e;
		}
		return colaborador;
	}

	public Colaborador buscar(Integer id) throws Exception {
		try {
			Query query = em.createQuery("SELECT c FROM Colaborador c inner join fetch c.municipio m inner join fetch m.estado e WHERE c.id = :id");
			query.setParameter("id", id);
			Colaborador result = (Colaborador) query.getSingleResult();

			if (result != null) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				if (result.getDataNascimento() != null) {
					result.setDataNascimento(sdf.parse(sdf.format(result.getDataNascimento())));
				}
				
				if (result.getDataAdmissao() != null) {
					result.setDataAdmissao(sdf.parse(sdf.format(result.getDataAdmissao())));
				}
				
				if (result.getDataDemissao() != null) {
					result.setDataDemissao(sdf.parse(sdf.format(result.getDataDemissao())));
				}
			}

			return result;
		} catch (Exception e) {
			throw e;
		}
	}

	public void excluir(Integer id) throws Exception {
		try {
			Query query = em.createQuery("DELETE FROM Colaborador c WHERE c.id = :id");
			query.setParameter("id", id);
			query.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
	}
	
	public void salvarImagem(Integer id, byte[] dados) throws Exception {
		try {
			Query query = em.createNativeQuery("UPDATE tb_colaborador SET cb_foto = :foto WHERE cb_id = :id");
			query.setParameter("id", id);
			query.setParameter("foto", dados);
			query.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
	}
	
	public byte[] buscarImagem(Integer id) throws Exception {
		byte[] foto = null;
		
		try {
			Query query = em.createNativeQuery("SELECT cb_foto FROM tb_colaborador c WHERE c.cb_id = :id");
			query.setParameter("id", id);
			foto = (byte[]) query.getSingleResult();
			
			return foto;
		} catch (Exception e) {
			throw e;
		}
	}
}
