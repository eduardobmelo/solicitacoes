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
import br.com.audivisa.solserv.model.dao.PapelSegurancaDAO;
import br.com.audivisa.solserv.model.entity.PapelSeguranca;
import br.com.audivisa.solserv.model.entity.PermissaoSeguranca;

@Path("/papelSeguranca") 
public class PapelSegurancaRestService {
	
	@Inject
	private PapelSegurancaDAO papelDao;
	
	@GET
	@Path("/todos")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarTodos() {
		
		List<PapelSeguranca> lista;
		try {
			lista = papelDao.listarTodos();
			return Response.ok(lista, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro ao buscar a lista de papeis de segurança.").build();
		}
	}
	
	@GET
	@Path("/crud")
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscar(@QueryParam("id") Integer id) {
		PapelSeguranca papel;
		
		try {
			papel = papelDao.buscar(id);
			return Response.ok(papel, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro ao buscar o papel de segurança.").build();
		}
	}
	
	@POST
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response salvar(PapelSeguranca papel) {
		
		try {
			papelDao.salvar(papel);
			return Response.ok(papel, MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Erro ao salvar o papel de segurança.").build();
		} 
	}
	
	@PUT
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response alterar(PapelSeguranca papel) {
		
		try {
			papelDao.alterar(papel);
			return Response.ok(papel, MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Erro ao alterar o papel de segurança.").build();
		} 
	}
	
	@DELETE
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response excluir(@QueryParam("id") Integer id) {
		
		try {
			papelDao.excluir(id);
			return Response.ok().build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Erro ao excluir o papel de segurança.").build();
		} 
	}
	
	@PUT
	@Path("/permissao")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response atualizarPermissao(PermissaoSeguranca permissao) {
		
		try {
			papelDao.atualizarPermissao(permissao);
			return Response.ok(permissao, MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Erro ao alterar a permissão do objeto para o papel.").build();
		} 
	}
}
