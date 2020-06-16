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
import br.com.audivisa.solserv.model.dao.ContatoClienteDAO;
import br.com.audivisa.solserv.model.entity.ContatoCliente;

@Path("/contatoCliente") 
public class ContatoClienteRestService {
	
	@Inject
	private ContatoClienteDAO contatoService;
	
	@GET
	@Path("/todos")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarTodos(@QueryParam("idCliente") Integer id) {
		
		List<ContatoCliente> lista;
		try {
			lista = contatoService.listarTodos(id);
			return Response.ok(lista, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro ao buscar a lista de contatos do cliente.").build();
		}
	}
	
	@GET
	@Path("/crud")
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscar(@QueryParam("id") Integer id) {
		ContatoCliente cliente;
		
		try {
			cliente = contatoService.buscar(id);
			return Response.ok(cliente, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro ao buscar o contato do cliente.").build();
		}
	}
	
	@POST
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response salvar(ContatoCliente cliente) {
		
		try {
			contatoService.salvar(cliente);
			return Response.ok(cliente, MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Erro ao salvar o contato do cliente.").build();
		} 
	}
	
	@PUT
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response alterar(ContatoCliente cliente) {
		
		try {
			contatoService.alterar(cliente);
			return Response.ok(cliente, MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Erro ao alterar o contato do cliente.").build();
		} 
	}
	
	@DELETE
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response excluir(@QueryParam("id") Integer id) {
		
		try {
			contatoService.excluir(id);
			return Response.ok().build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Erro ao excluir o contato do cliente.").build();
		} 
	}
}
