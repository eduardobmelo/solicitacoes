package br.com.audivisa.solserv.model.web.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente;
import br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteProxy;
import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;

@Path("/cep") 
public class CepRestService {
	
	@GET
	@Path("/")
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
	public Response consultarCep(@QueryParam("cep") String cep) {
		
		try {
			AtendeCliente atendeCliente = new AtendeClienteProxy();
			
			EnderecoERP end = atendeCliente.consultaCEP(cep);
			
			return Response.ok(end, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (SigepClienteException e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("\"" + e.getFaultString() + "\"").build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
}
