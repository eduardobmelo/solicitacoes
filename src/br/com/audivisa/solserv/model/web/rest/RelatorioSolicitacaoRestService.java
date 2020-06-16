package br.com.audivisa.solserv.model.web.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriInfo;
import br.com.audivisa.solserv.model.report.RelatorioSolicitacaoPorCliente;
import br.com.audivisa.solserv.model.report.RelatorioSolicitacaoPorColaborador;

@Path("/relatorios/solicitacoes") 
public class RelatorioSolicitacaoRestService {
	@Context
	UriInfo uri;
	
	@GET
	@Path("/por/colaborador")
	@Produces("application/pdf")
	public Response solicitacoesPorColaborador(@Context UriInfo uri) {
		
		String idColaborador = uri.getQueryParameters().getFirst("idColaborador");
		String idPrioridade = uri.getQueryParameters().getFirst("idPrioridade");
		String idSituacao = uri.getQueryParameters().getFirst("idSituacao");
		
		try {
			RelatorioSolicitacaoPorColaborador djr = new RelatorioSolicitacaoPorColaborador(idColaborador,
					idPrioridade, idSituacao);
			byte[] report = djr.getDynamicJasperReport();
			
			ResponseBuilder responseBuilder = Response.ok((Object) report);
			responseBuilder.header("Content-Disposition", "attachment; filename=\"SolicitacoesPorColaborador.pdf\"");
		    return responseBuilder.build();
		}  catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
	@GET
	@Path("/por/cliente")
	@Produces("application/pdf")
	public Response solicitacoesPorCliente(@Context UriInfo uri) {
		
		String idCliente = uri.getQueryParameters().getFirst("idCliente");
		String idPrioridade = uri.getQueryParameters().getFirst("idPrioridade");
		String idSituacao = uri.getQueryParameters().getFirst("idSituacao");
		
		try {
			RelatorioSolicitacaoPorCliente djr = new RelatorioSolicitacaoPorCliente(idCliente,
					idPrioridade, idSituacao);
			byte[] report = djr.getDynamicJasperReport();
			
			ResponseBuilder responseBuilder = Response.ok((Object) report);
			responseBuilder.header("Content-Disposition", "attachment; filename=\"SolicitacoesPorCliente.pdf\"");
		    return responseBuilder.build();
		}  catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
}
