package org.hsc.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.hsc.db.DBHelper;
import org.hsc.model.ENumber;
import org.hsc.model.Form;

import com.google.gson.Gson;

@Path("/form")
public class FormResources {

	@GET
	@Produces({ MediaType.TEXT_PLAIN })
	public Response getForm() {
		DBHelper db = DBHelper.getDBHelper();
		Form form = db.getForm(1000022);
		
		Gson gson = new Gson();
		String jsonString = gson.toJson(form);
		
		return Response.status(200).entity(jsonString).build();
		
	}
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	public Response postForm(String jsonString) {
		Gson gson = new Gson();
		Form form = gson.fromJson(jsonString, Form.class);
		
		StringBuilder res = new StringBuilder();
		res.append("name = " + form.getName() + "\n");
		res.append("values = " + form.getValues().toString());
		
		DBHelper db = DBHelper.getDBHelper();
		int ref = db.saveForm(form);
//		int ref = db.insertHalalForm(form);
		
		String refCode = String.valueOf(ref);
		return Response.status(201).entity(refCode).build();
 
	}

}