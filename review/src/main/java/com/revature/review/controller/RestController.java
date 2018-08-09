package com.revature.review.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

@Path("/rest")
public class RestController extends Application{
	
	@GET
	@Path("/hello")
	@Produces("text/plain")
	public String hello() {
		return "Hello!";
	}
	
	@POST
	@Produces("text/plain")
	@Consumes("application/x-www-form-urlencoded")
	public String helloPost(@FormParam("message") String m) {
		return m;
	}
	
	@GET
	@Path("/{name: [a-zA-Z][a-zA-Z]*}")
	@Produces("text/plain")
	public String helloName(@PathParam("name") String n) {
		return "Hello, " + n;
	}
	
	@GET
	@Path("/{fname}/{lname}")
	@Produces("text/plain")
	public Response getFullName(@PathParam("fname") String fname,
			@PathParam("lname") String lname) {
		String output = "Hello, " + fname + " " + lname;
		return Response.status(200).entity(output).build();
	}

}
