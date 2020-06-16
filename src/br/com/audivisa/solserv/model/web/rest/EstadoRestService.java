package br.com.audivisa.solserv.model.web.rest;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import br.com.audivisa.solserv.model.dao.EstadoDAO;
import br.com.audivisa.solserv.model.entity.Estado;

@Path("/estado") 
public class EstadoRestService {
	
	@Inject
	private EstadoDAO estadoService;
	
	@GET
	@Path("/todos")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarTodos() {
		
		List<Estado> lista;
		try {
			lista = estadoService.listarTodos();
			return Response.ok(lista, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro ao buscar a lista de estados.").build();
		}
	}
	
}
