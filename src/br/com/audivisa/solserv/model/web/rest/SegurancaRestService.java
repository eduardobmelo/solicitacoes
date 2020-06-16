package br.com.audivisa.solserv.model.web.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import br.com.audivisa.solserv.model.dao.SegurancaDAO;

@Path("/seguranca") 
public class SegurancaRestService {
	
	@Inject
	private SegurancaDAO segDao;
	
	@GET
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(@QueryParam("username") String username, @QueryParam("password") String password) {
		
		try {
			return Response.ok(segDao.login(username, password), MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Falha no login.").build();
		} 
	}
	
	@GET
	@Path("/novaSenha")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response novaSenha(@QueryParam("username") String username, @QueryParam("password") String password, @QueryParam("passwordNew") String passwordNew) {
		
		try {
			return Response.ok(segDao.novaSenha(username, password, passwordNew), MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Falha na alteração da senha.").build();
		} 
	}
	
	@GET
	@Path("/checkCreds")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response CheckCreds(@QueryParam("username") String username, @QueryParam("token") String token) {
		
		try {
			if (username == null || token == null) {
				return Response.status(Response.Status.NOT_FOUND).entity("Falha na verificação do token.").build();
			}
			return Response.ok(segDao.checkCreds(username, token), MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Falha na verificação do token.").build();
		} 
	}
	
	@GET
	@Path("/permissoesUsuario")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response permissoes(@QueryParam("uid") Integer uid) {
		try {
			return Response.ok(segDao.permissoesUsuario(uid), MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Falha na verificação do token.").build();
		} 
	}
}
