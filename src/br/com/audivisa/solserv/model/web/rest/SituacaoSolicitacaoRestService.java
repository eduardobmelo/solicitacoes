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
import br.com.audivisa.solserv.model.dao.SituacaoSolicitacaoDAO;
import br.com.audivisa.solserv.model.entity.SituacaoSolicitacao;

@Path("/situacaoSolicitacao") 
public class SituacaoSolicitacaoRestService {
	
	@Inject
	private SituacaoSolicitacaoDAO situacaoDao;
	
	@GET
	@Path("/todos")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarTodos() {
		
		List<SituacaoSolicitacao> lista;
		try {
			lista = situacaoDao.listarTodos();
			return Response.ok(lista, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
	@GET
	@Path("/crud")
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscar(@QueryParam("id") Integer id) {
		SituacaoSolicitacao situacao;
		
		try {
			situacao = situacaoDao.buscar(id);
			return Response.ok(situacao, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
	@POST
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response salvar(SituacaoSolicitacao situacao) {
		
		try {
			situacaoDao.salvar(situacao);
			return Response.ok(situacao, MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
		} 
	}
	
	@PUT
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response alterar(SituacaoSolicitacao situacao) {
		
		try {
			situacaoDao.alterar(situacao);
			return Response.ok(situacao, MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
		} 
	}
	
	@DELETE
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response excluir(@QueryParam("id") Integer id) {
		
		try {
			situacaoDao.excluir(id);
			return Response.ok().build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
		} 
	}
	
	@GET
	@Path("/primeiraSituacaoEncerramento")
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPrimeiraSituacaoEncerramento() {
		SituacaoSolicitacao situacao;
		
		try {
			situacao = situacaoDao.buscarPrimeiraSituacaoEncerramento();
			return Response.ok(situacao, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
}
