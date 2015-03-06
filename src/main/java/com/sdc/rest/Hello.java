package com.sdc.rest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 * Hello.java
 */

/**
 * @author Simone 28/feb/2015
 */
@Path("/HelloService")
public class Hello {

	
	
	@GET
	@Path("/sayhello")
	@Produces(MediaType.TEXT_HTML)
	public Response helloTo(@QueryParam("name") @DefaultValue("Foo") String name) {
		String bodyContent = "Hello " + name;
		String toReturn = "<html><head></head><body style=\"font-weight:bold\">" + bodyContent + "</body></html>";

		return Response.status(Status.OK).entity(toReturn)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				//.allow("OPTIONS")
				.build();
	}
	
	
	
	
}
