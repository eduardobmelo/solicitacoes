package br.com.audivisa.solserv.model.dao;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import br.com.audivisa.solserv.model.entity.NovaSenha;
import br.com.audivisa.solserv.model.entity.Usuario;
import br.com.audivisa.solserv.model.entity.UsuarioPapel;
import br.com.audivisa.solserv.model.util.Criptografia;

@Transactional
@RequestScoped
@Named(value="usuariodao")
public class UsuarioDAO {

	@PersistenceContext(unitName="sol-serv-pu")
	private EntityManager em;

	public UsuarioDAO() {
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> listarTodos() {
		List<Usuario> resultList;
		try {
			Query query = em.createQuery(
					"SELECT NEW br.com.audivisa.solserv.model.entity.UsuarioLista(u.id, u.facebook, u.login, c.nome, u.situacao) "
					+ "FROM Usuario u join u.colaborador c "
					+ "ORDER BY u.login");
			resultList = query.getResultList();
		} catch (Exception e) {
			throw e;
		}

		return resultList;
	}

	public Usuario salvar(Usuario usuario) throws Exception {
		
		try {
			if (jaPossuiUsuarioAtivo(usuario.getColaborador().getId(), usuario.getId()))
				throw new Exception("Colaborador já possui outro usuário ativo.");
		
			String token = Criptografia.criptografar(usuario.getSenha());
			usuario.setSenha(token);
			usuario.setSenha2(usuario.getSenha());
		
			if (usuario.getDataCadastro() != null) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				usuario.setDataCadastro(sdf.parse(sdf.format(usuario.getDataCadastro())));
			}
		
			em.persist(usuario);
			inserirNovosPapeis(usuario.getId());
		} catch (Exception e) {
			throw e;
		}
		
		return usuario;
	}

	public Usuario alterar(Usuario usuario) throws Exception {
		
		try {
			if (jaPossuiUsuarioAtivo(usuario.getColaborador().getId(), usuario.getId()))
				throw new Exception("Colaborador já possui outro usuário ativo.");
		} catch (Exception e) {
			throw e;
		} 

		try {
			usuario = em.merge(usuario);
		} catch (Exception e) {
			throw e;
		} 
		
		usuario.setSenha2(usuario.getSenha());
		
		if (usuario.getDataCadastro() != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			usuario.setDataCadastro(sdf.parse(sdf.format(usuario.getDataCadastro())));
		}
		
		return usuario;
	}
	
	private boolean jaPossuiUsuarioAtivo(Integer idColaborador, Integer idUsuarioAtual) {
		
		try {
			Long qtd =  new Long("0");
			
			String sql = "SELECT count(u) FROM Usuario u "
					+ "WHERE u.colaborador.id = :id "
					+ "and u.situacao = 'Ativo' ";
			
			if (idUsuarioAtual != null) {
				sql += "and u.id != :id2 ";
			}
					
			Query query = em.createQuery(sql);
			
			if (idUsuarioAtual != null) {
				query.setParameter("id2", idUsuarioAtual);
			}
			
			query.setParameter("id", idColaborador);
			
			if (query.getSingleResult() != null) {
				qtd = (Long) query.getSingleResult();
			}
			
			if (qtd > 1)
				return true;
			
		} catch (Exception e) {
			throw e;
		}
		return false;
	}

	public Usuario buscar(Integer id) throws Exception {
		try {
			Query query = em.createQuery("SELECT u FROM Usuario u "
					+ "join fetch u.colaborador c "
					+ "join fetch c.municipio m "
					+ "join fetch m.estado e "
					+ "WHERE u.id = :id");
			query.setParameter("id", id);
			Usuario result = (Usuario) query.getSingleResult();
			
			if (result != null) {
				if (result.getDataCadastro() != null) {
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					result.setDataCadastro(sdf.parse(sdf.format(result.getDataCadastro())));
				}
				result.setSenha2(result.getSenha());
			}
			
			// Verifica a existencia de novos papeis que nao existam na lista
			// do usuario.
			inserirNovosPapeis(id);
			
			// Busca os papeis e as permissoes para o usuario
			result.setPapeis(permissoes(id));

			return result;
		} catch (Exception e) {
			throw e;
		}
	}

	public void excluir(Integer id) throws Exception {
		try {
			Query query = em.createQuery("DELETE FROM Usuario c WHERE c.id = :id");
			query.setParameter("id", id);
			query.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	private List<UsuarioPapel> permissoes(Integer id) {
		List<UsuarioPapel> listaPermissoes = null;
		
		try {
			Query query = em.createQuery("SELECT up FROM UsuarioPapel up "
					+ "join fetch up.papel p "
					+ "WHERE up.idUsuario = :id "
					+ "ORDER BY up.papel.nome");
			query.setParameter("id", id);
			
			listaPermissoes = query.getResultList();
			
			return listaPermissoes;
		} catch (Exception e) {
			throw e;
		}
	}
	
	public void atualizarPermissao(UsuarioPapel permissao) {
		try {
			Query query = em.createQuery("UPDATE UsuarioPapel p SET p.permissao = :permissao WHERE p.id = :id");
			query.setParameter("id", permissao.getId());
			query.setParameter("permissao", permissao.getPermissao());
			query.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
	}
	
	public void inserirNovosPapeis(Integer idUsuario) {
		try {
			Query query = em.createQuery("INSERT INTO UsuarioPapel (papel, permissao, idUsuario) "
					+ "SELECT p, :permissao, :idUsuario from PapelSeguranca p "
					+ "WHERE p.id not in (SELECT ps.id FROM UsuarioPapel up join up.papel ps WHERE up.idUsuario = :idUsuario2)");
			query.setParameter("permissao", new Boolean("false"));
			query.setParameter("idUsuario", idUsuario);
			query.setParameter("idUsuario2", idUsuario);
			query.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Usuario novaSenha(NovaSenha novaSenha) throws Exception {
		Usuario t = null;
			
		try {
			String senha = Criptografia.criptografar(novaSenha.getSenha());
			
			Query query = em.createQuery("UPDATE Usuario u SET u.senha = :senha WHERE u.id = :id");
			query.setParameter("id", novaSenha.getId());
			query.setParameter("senha", senha);
			query.executeUpdate();
			
		} catch (Exception e) {
			throw e;
		}
		
		try {
			t = buscar(novaSenha.getId());
		} catch (Exception e) {
			throw e;
		} 
		
		return t;
	}
	
}
