package br.com.audivisa.solserv.model.web.rest;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import br.com.audivisa.solserv.model.dao.MunicipioDAO;
import br.com.audivisa.solserv.model.entity.Municipio;

@Path("/municipio") 
public class MunicipioRestService {
	
	@Inject
	private MunicipioDAO municipioService;
	
	@GET
	@Path("/todosPorUf")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarTodosPorUf(@QueryParam("uf") String uf) {
		
		List<Municipio> lista;
		try {
			lista = municipioService.listarPorUf(uf);
			return Response.ok(lista, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro ao buscar a lista de municipios.").build();
		}
	}
	
}
