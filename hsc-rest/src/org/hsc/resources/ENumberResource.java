package org.hsc.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBElement;

import org.hsc.db.DBHelper;
import org.hsc.model.ENumber;

import com.google.gson.Gson;

@Path("/enumber")
public class ENumberResource {
		// This method is called if XMLis request
		@GET
		@Produces({ MediaType.APPLICATION_JSON })
		public List<ENumber> getXML() {
			DBHelper db = DBHelper.getDBHelper();
			List<ENumber> enumbers = db.getENumberList();
			return enumbers;
//			Gson gson = new Gson();
//			String json = gson.toJson(enumbers);	
//			return Response.status(200).entity(json).build();
		}
		
		@POST
		@Consumes("application/json")
		public Response createProductInJSON(ENumber enumber) {
	 
			String result = "Product created : " + enumber;
			return Response.status(201).entity(result).build();
	 
		}
}
