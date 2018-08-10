package com.revature.review.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.revature.review.beans.Cave;

@Path("/caves")
public class CaveController extends Application {
	
	private static List<Cave> caves;
	
	public CaveController() {
		caves = new ArrayList<>();
		caves.add(new Cave(1, "Cave 1", 4));
		caves.add(new Cave(2, "Cave 2", 5));
		caves.add(new Cave(3, "Cave 3", 2));
	}
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cave> getAllCaves() {
		return caves;
	}

	@GET
	@Path("/hello")
	@Produces("text/plain")
	public String randomStringOfCharacters() {
		return "Hello!";
	}
	
	@Path("/{caveid}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Cave returnCaveById(@PathParam("caveid") String caveid) {
		Cave returnCave = null;
		for (Cave c : caves) {
			if (c.getId() == Integer.parseInt(caveid)) {
				returnCave = c;
			}
		}
		return returnCave;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/post")
	public Response addCaveById(Cave c) {
		caves.add(c);
		System.out.println(c.getName());
		System.out.println(caves);
		return Response.status(201).entity(c).build();
	}
}
