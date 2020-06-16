package br.com.audivisa.solserv.model.web.rest;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import br.com.audivisa.solserv.model.dao.UsuarioDAO;
import br.com.audivisa.solserv.model.entity.NovaSenha;
import br.com.audivisa.solserv.model.entity.Usuario;
import br.com.audivisa.solserv.model.entity.UsuarioPapel;

@Path("/usuario") 
public class UsuarioRestService {
	
	@Inject
	private UsuarioDAO usuarioDao;
	
	@GET
	@Path("/todos")
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
	public Response listarTodos() {
		
		List<Usuario> lista;
		try {
			lista = usuarioDao.listarTodos();
			return Response.ok(lista, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).type(MediaType.TEXT_PLAIN).entity("Erro ao buscar a lista de usuarios.").build();
		}
	}
	
	@GET
	@Path("/crud")
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
	public Response buscar(@QueryParam("id") Integer id) {
		Usuario usuario;
		
		try {
			usuario = usuarioDao.buscar(id);
			return Response.ok(usuario, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).type(MediaType.TEXT_PLAIN).entity("Erro ao buscar o usuário.").build();
		}
	}
	
	@POST
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
	public Response salvar(Usuario usuario) {
		
		try {
			usuarioDao.salvar(usuario);
			return Response.ok(usuario, MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			String erro = e.getMessage();
			erro = erro.replace("\"", "'");
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).type(MediaType.TEXT_PLAIN).entity(erro).build();
		} 
	}
	
	@PUT
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
	public Response alterar(Usuario usuario) {
		
		try {
			usuarioDao.alterar(usuario);
			return Response.ok(usuario, MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			String erro = e.getMessage();
			erro = erro.replace("\"", "'");
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).type(MediaType.TEXT_PLAIN).entity(erro).build();
		} 
	}
	
	@DELETE
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
	public Response excluir(@QueryParam("id") Integer id) {
		
		try {
			usuarioDao.excluir(id);
			return Response.ok().build();
		} catch(Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).type(MediaType.TEXT_PLAIN).entity("Erro ao excluir o usuario.").build();
		} 
	}
	
	@PUT
	@Path("/permissao")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
	public Response atualizarPermissao(UsuarioPapel permissao) {
		
		try {
			usuarioDao.atualizarPermissao(permissao);
			return Response.ok(permissao, MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			String erro = e.getCause().getCause().getCause().getMessage();
			erro = erro.replace("\"", "'");
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).type(MediaType.TEXT_PLAIN).entity(erro).build();
		} 
	}
	
	@GET
	@Path("/inserirNovosPapeis")
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
	public Response inserirNovosPapeis(@QueryParam("id") Integer id) {
		try {
			usuarioDao.inserirNovosPapeis(id);
			return Response.ok("OK", MediaType.TEXT_PLAIN).build();
		} catch(Exception e) {
			String erro = e.getCause().getCause().getCause().getMessage();
			erro = erro.replace("\"", "'");
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).type(MediaType.TEXT_PLAIN).entity(erro).build();
		} 
	}
	
	@PUT
	@Path("/novaSenha")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
	public Response novaSenha(NovaSenha novaSenha) {
		
		try {
			Usuario usuario = usuarioDao.novaSenha(novaSenha);
			return Response.ok(usuario, MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			String erro = e.getMessage();
			erro = erro.replace("\"", "'");
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).type(MediaType.TEXT_PLAIN).entity(erro).build();
		} 
	}
}
