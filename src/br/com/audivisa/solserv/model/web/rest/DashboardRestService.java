package br.com.audivisa.solserv.model.web.rest;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import br.com.audivisa.solserv.model.dao.DashboardDAO;
import br.com.audivisa.solserv.model.entity.GraficoSolDash;
import br.com.audivisa.solserv.model.entity.IndicadorDash;

@Path("/dashboard") 
public class DashboardRestService {
	
	@Inject
	private DashboardDAO dashDao;
	
	@GET
	@Path("/indicadores")
	@Produces(MediaType.APPLICATION_JSON)
	public Response indicadores() {
		
		List<IndicadorDash> lista;
		try {
			lista = dashDao.buscarIndicadores();
			return Response.ok(lista, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro ao buscar a lista de indicadores.").build();
		}
	}
	
	@GET
	@Path("/grafico-sol-col")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarTodos() {
		
		List<GraficoSolDash> lista;
		try {
			lista = dashDao.buscarDadosGraficoSolic();
			return Response.ok(lista, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro ao buscar os dados do grafico de solicitacoes por colaborador.").build();
		}
	}

}
