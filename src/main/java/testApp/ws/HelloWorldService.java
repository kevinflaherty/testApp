package testApp.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;
 
@Path("/helloworld")
public class HelloWorldService {
 
	  @GET
	  @Produces("application/json")
	  public Response getGreeting() throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Name", "Bloopis"); 
		jsonObject.put("Greeting", "Hello");
 
		String result = "@Produces(\"application/json\") Output: \n\nGreeting Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
 
	  @Path("{name}")
	  @GET
	  @Produces("application/json")
	  public Response getGreetingByName(@PathParam("name") String name) throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Name", name); 
		jsonObject.put("Greeting", "Hello");
 
		String result = "@Produces(\"application/json\") Output: \n\nGreet By Name Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
}