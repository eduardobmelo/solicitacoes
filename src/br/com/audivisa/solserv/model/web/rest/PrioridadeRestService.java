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
import br.com.audivisa.solserv.model.dao.PrioridadeDAO;
import br.com.audivisa.solserv.model.entity.Prioridade;

@Path("/prioridade") 
public class PrioridadeRestService {
	
	@Inject
	private PrioridadeDAO prioridadeDao;
	
	@GET
	@Path("/todos")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarTodos() {
		
		List<Prioridade> lista;
		try {
			lista = prioridadeDao.listarTodos();
			return Response.ok(lista, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro ao buscar a lista de prioridades.").build();
		}
	}
	
	@GET
	@Path("/crud")
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscar(@QueryParam("id") Integer id) {
		Prioridade prioridade;
		
		try {
			prioridade = prioridadeDao.buscar(id);
			return Response.ok(prioridade, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro ao buscar o prioridade.").build();
		}
	}
	
	@POST
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response salvar(Prioridade prioridade) {
		
		try {
			prioridadeDao.salvar(prioridade);
			return Response.ok(prioridade, MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Erro ao salvar a prioridade.").build();
		} 
	}
	
	@PUT
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response alterar(Prioridade prioridade) {
		
		try {
			prioridadeDao.alterar(prioridade);
			return Response.ok(prioridade, MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Erro ao alterar a prioridade.").build();
		} 
	}
	
	@DELETE
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response excluir(@QueryParam("id") Integer id) {
		
		try {
			prioridadeDao.excluir(id);
			return Response.ok().build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Erro ao excluir a prioridade.").build();
		} 
	}
	
}
