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
import br.com.audivisa.solserv.model.dao.SolicitacaoDAO;
import br.com.audivisa.solserv.model.entity.ErrorResponseBody;
import br.com.audivisa.solserv.model.entity.Solicitacao;
import br.com.audivisa.solserv.model.entity.SolicitacaoLista;
import br.com.audivisa.solserv.model.entity.SolicitacaoPainel;

@Path("/solicitacao") 
public class SolicitacaoRestService {
	
	@Inject
	private SolicitacaoDAO solicitacaoDao; 
	
	@GET
	@Path("/todos")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarTodos(@QueryParam("naoatendidas") Boolean naoatendidas, @QueryParam("situacao") String situacao, @QueryParam("colaborador")  String colaborador) {
		
		List<SolicitacaoLista> lista;
		try {
			lista = solicitacaoDao.listarTodos(naoatendidas, situacao, colaborador);
			return Response.ok(lista, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro ao buscar a lista de solicitações.").build();
		}
	}
	
	@GET
	@Path("/crud")
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscar(@QueryParam("id") Integer id) {
		Solicitacao solicitacao;
		
		try {
			solicitacao = solicitacaoDao.buscar(id);
			return Response.ok(solicitacao, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro ao buscar o solicitação.").build();
		}
	}
	
	@POST
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response salvar(Solicitacao solicitacao) {
		
		try {
			solicitacaoDao.salvar(solicitacao);
			return Response.ok(solicitacao, MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro ao salvar o solicitação.").build();
		} 
	}
	
	@PUT
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response alterar(Solicitacao solicitacao) {
		
		try {
			solicitacaoDao.alterar(solicitacao);
			return Response.ok(solicitacao, MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro ao alterar o solicitação.").build();
		} 
	}
	
	@DELETE
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response excluir(@QueryParam("id") Integer id) {
		
		try {
			solicitacaoDao.excluir(id);
			return Response.ok().build();
		} catch(Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(
					new ErrorResponseBody("", "Erro ao excluir a solicitação.", 500, e.getMessage(), "")
					).build();
		} 
	}
	
	@GET
	@Path("/painel/abertas")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarSolicitacoesAbertasPainel(@QueryParam("id") Integer id) {
		
		List<SolicitacaoPainel> lista;
		try {
			lista = solicitacaoDao.listarSolicitacoesAbertasPainel(id);
			return Response.ok(lista, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(
					new ErrorResponseBody("", "Erro ao listar as solicitações abertas do colaborador.", 500, e.getMessage(), "")
					).build();
		}
	}
}
