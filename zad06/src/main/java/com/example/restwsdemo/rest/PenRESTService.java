package com.example.restwsdemo.rest;

import java.util.List;

import javax.ejb.Stateless;
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
import javax.ws.rs.core.Response;

import com.example.restwsdemo.domain.Pen;
import com.example.restwsdemo.service.PenManager;

@Path("bicycle")
@Stateless
public class PenRESTService {

	@Inject
	private PenManager pm;

	
	@GET
	@Path("/{penId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Pen getBicycle(@PathParam("penId") int id) {
		Pen p = pm.getPen(id);
		return p;
	}

	@GET
	@Path("/allPens")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pen> getPens() {
		return pm.getAllPens();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addPen(@QueryParam("id") int id, @QueryParam("producer") String producer , @QueryParam("size") double size) {
		Pen pen = new Pen(id,producer,size);
		pm.addPen(pen);
		return Response.status(201).entity("Pen").build();
	}
	
	@PUT
	@Path("/{penId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateBicycle(@PathParam("id") int id, @QueryParam("producer") String producer, @QueryParam("size") double price) {
		pm.updatePen(id, producer, price);
		return Response.status(200).build();
	}
	
	@DELETE
	@Path("/{penId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateBicycle(@PathParam("id") int id) {
		pm.deletePen(pm.getPen(id));
		return Response.status(200).build();
	}

	@DELETE
	@Path("/deleteAll")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response clearPens() {
		pm.deleteAllPens();
		return Response.status(200).build();
	}

}