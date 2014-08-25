package com.saikrishna.api.resources;

import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("hello")
public class HellowWorldResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMessage() {
		return Response.status(Response.Status.OK).entity(new HashMap<String,String>(){
			{
				put("message","Jersey is awesome :)");
			}
		}).build();
	}
	
}
