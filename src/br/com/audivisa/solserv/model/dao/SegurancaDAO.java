package br.com.audivisa.solserv.model.dao;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.StringTokenizer;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import br.com.audivisa.solserv.model.entity.TokenSeguranca;
import br.com.audivisa.solserv.model.util.Criptografia;

@Transactional
@RequestScoped
@Named(value="segurancadao")
public class SegurancaDAO {

	@PersistenceContext(unitName="sol-serv-pu")
	private EntityManager em;

	public SegurancaDAO() {
	}

	public TokenSeguranca login(String username, String password) throws Exception {
		String token = null;
		TokenSeguranca t = null;
			
		try {
			token = Criptografia.criptografar(password);
			Query query = em.createQuery("SELECT NEW br.com.audivisa.solserv.model.entity.TokenSeguranca(u.senha, u.id, c.nome, 'true', c.id) "
					+ "FROM Usuario u JOIN u.colaborador c WHERE u.login = :un AND u.senha = :pw");
			query.setParameter("un", username);
			query.setParameter("pw", token);
			t = (TokenSeguranca) query.getSingleResult();
		} catch (Exception e) {
			return new TokenSeguranca(null, null, null, "false", null);
		}
		 
		return t;
	}
	
	public TokenSeguranca checkCreds(String username, String token) throws Exception {
		TokenSeguranca t = null;
			
		try {
			Query query = em.createQuery("SELECT NEW br.com.audivisa.solserv.model.entity.TokenSeguranca(u.senha, u.id, c.nome, 'true', c.id) "
					+ "FROM Usuario u JOIN u.colaborador c WHERE u.login = :un AND u.senha = :pw");
			query.setParameter("un", username);
			query.setParameter("pw", token);
			t = (TokenSeguranca) query.getSingleResult();
		} catch (Exception e) {
			return new TokenSeguranca(null, null, null, "false", null);
		}
		 
		return t;
	}
	
	public TokenSeguranca novaSenha(String username, String password, String passwordNew) throws Exception {
		TokenSeguranca t = null;
			
		try {
			password = Criptografia.criptografar(password);
			passwordNew = Criptografia.criptografar(passwordNew);
			
			Query query = em.createQuery("SELECT NEW br.com.audivisa.solserv.model.entity.TokenSeguranca(u.senha, u.id, c.nome, 'true', c.id) "
					+ "FROM Usuario u JOIN u.colaborador c WHERE u.login = :un AND u.senha = :pw");
			query.setParameter("un", username);
			query.setParameter("pw", password);
			t = (TokenSeguranca) query.getSingleResult();
			
			if (t == null) {
				throw new Exception();
			}
			
			query = em.createQuery("UPDATE Usuario u SET u.senha = :senha WHERE u.id = :id");
			query.setParameter("id", t.getUid());
			query.setParameter("senha", passwordNew);
			query.executeUpdate();
			
		} catch (Exception e) {
			return new TokenSeguranca(null, null, null, "false", null);
		}
		 
		return t;
	}

	@SuppressWarnings("rawtypes")
	public List permissoesUsuario(Integer uid) throws Exception {
		List t = null;
			
		try {
			Query query = em.createNativeQuery("SELECT DISTINCT O.OS_CODIGO FROM TB_PERMISSAO_SEG P "
					+ "INNER JOIN TB_OBJETO_SEG O ON O.OS_ID = P.OS_ID WHERE P.PS_ID IN "
					+ "(SELECT UP.PS_ID FROM TB_USUARIO_PAPEL UP WHERE UP.US_ID = :uid AND UP.UP_PERMISSAO = true ) AND P.PE_PERMISSAO = true "
					+ "ORDER BY 1");
			query.setParameter("uid", uid);
			t = query.getResultList();
		} catch (Exception e) {
			return t;
		}
		 
		return t;
	}
	
	public boolean authenticate(String authCredentials) {

		if (null == authCredentials)
			return false;
		
		// header value format will be "Basic encodedstring" for Basic
		// authentication. Example "Basic YWRtaW46YWRtaW4="
		final String encodedUserPassword = authCredentials.replaceFirst("Basic"	+ " ", "");
		String usernameAndPassword = null;
		try {
			byte[] decodedBytes = Base64.getDecoder().decode(encodedUserPassword);
			usernameAndPassword = new String(decodedBytes, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		final StringTokenizer tokenizer = new StringTokenizer(usernameAndPassword, ":");
		final String username = tokenizer.nextToken();
		final String password = tokenizer.nextToken();
		
		try {
			return this.checkCreds(username, password).getAuthenticated();
		} catch (Exception e) {
			return false;
		}
	}
	
}
