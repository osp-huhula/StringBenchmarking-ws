package stringbenchmarking.ws.resource;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("/Execute")
public class JHMStringenchmarkingExecuteResource {

	@GET
	@Produces("text/xml")
	public Response execute() {
		try {
			return Response.noContent().build();
		} catch (Exception e) {
			throw new WebApplicationException(e, Response.serverError().build());
		}
	}
}
