package br.com.audivisa.solserv.model.web.rest;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import org.apache.commons.io.IOUtils;
import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import br.com.audivisa.solserv.model.dao.ColaboradorDAO;
import br.com.audivisa.solserv.model.entity.Colaborador;
import br.com.audivisa.solserv.model.entity.ErrorResponseBody;

@Path("/colaborador") 
public class ColaboradorRestService {
	
	@Inject
	private ColaboradorDAO colaboradorService;
	
	@GET
	@Path("/todos")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarTodos() {
		
		List<Colaborador> lista;
		try {
			lista = colaboradorService.listarTodos();
			return Response.ok(lista, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro ao buscar a lista de colaboradores.").build();
		}
	}
	
	@GET
	@Path("/todos/id/nome")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarTodosIdNome() {
		
		List<Colaborador> lista;
		try {
			lista = colaboradorService.listarTodosIdNome();
			return Response.ok(lista, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro ao buscar a lista de colaboradores.").build();
		}
	}
	
	@GET
	@Path("/crud")
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscar(@QueryParam("id") Integer id) {
		Colaborador colaborador;
		
		try {
			colaborador = colaboradorService.buscar(id);
			return Response.ok(colaborador, MediaType.APPLICATION_JSON_TYPE).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erro ao buscar o cliente.").build();
		}
	}
	
	@POST
	@Path("/crud") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response salvar(Colaborador colaborador) {
		
		try {
			colaboradorService.salvar(colaborador);
			return Response.ok(colaborador, MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Erro ao salvar o colaborador.").build();
		} 
	}
	
	@PUT
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response alterar(Colaborador colaborador) {
		
		try {
			colaboradorService.alterar(colaborador);
			return Response.ok(colaborador, MediaType.APPLICATION_JSON_TYPE).build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Erro ao alterar o colaborador.").build();
		} 
	}
	
	@DELETE
	@Path("/crud")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response excluir(@QueryParam("id") Integer id) {
		
		try {
			colaboradorService.excluir(id);
			return Response.ok().build();
		} catch(Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(
				new ErrorResponseBody("", "Erro ao excluir o colaborador", 500, e.getCause().getCause().toString(), "") 
			).build();
		} 
	}
	
	@POST
	@Path("/foto/{id}")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response salvarImagem(

			@PathParam("id") Integer id,
			MultipartFormDataInput input) {
		
		@SuppressWarnings("unused")
		String fileName = "";

		Map<String, List<InputPart>> uploadForm = input.getFormDataMap();
		List<InputPart> inputParts = uploadForm.get("dados");

		for (InputPart inputPart : inputParts) {

			try {
	
				MultivaluedMap<String, String> header = inputPart.getHeaders();
				fileName = getFileName(header);
	
				//convert the uploaded file to inputstream
				InputStream inputStream = inputPart.getBody(InputStream.class,null);
	
				byte [] bytes = IOUtils.toByteArray(inputStream);
				
				colaboradorService.salvarImagem(id, bytes);
				return Response.ok().build();
	
			} catch(Exception e) {
				return Response.status(Response.Status.NOT_FOUND).entity("Erro ao salvar a foto do colaborador.").build();
			}
		}
		return null;
	}
	
	private String getFileName(MultivaluedMap<String, String> header) {

		String[] contentDisposition = header.getFirst("Content-Disposition").split(";");

		for (String filename : contentDisposition) {
			if ((filename.trim().startsWith("filename"))) {

				String[] name = filename.split("=");

				String finalFileName = name[1].trim().replaceAll("\"", "");
				return finalFileName;
			}
		}
		return "unknown";
	}
	
	@GET
	@Path("/foto/{id}")
	@Produces("image/jpg")
	public Response buscarImagem(@PathParam("id") Integer id) {
		byte[] arquivo = null;
		
		try {
			if (id == null) {
				return Response.status(Response.Status.NOT_FOUND).entity("Parâmetro nulo.").build();
			}
			arquivo = colaboradorService.buscarImagem(id);
			return Response.ok(arquivo).build();
		} catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Erro ao buscar a foto do colaborador.").build();
		}
	}
}
