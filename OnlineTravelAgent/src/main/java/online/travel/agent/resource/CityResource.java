/**
 * 
 */
package online.travel.agent.resource;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import online.travel.agent.services.CreateCityService;

/**
 * @author dsin85
 *
 */
@Path("city")
@Produces("application/json")
@Consumes("application/json")
public class CityResource {

	
	@PUT
	@Path("/createCity/{id}/{cityname}/{countryname}")
	public void createCity(@PathParam("id") int  id,@PathParam("cityname") String cityname,@PathParam("countryname") String countryname)
	{  
		try {
			CreateCityService.getServiceInstance().save(id,cityname,countryname);
			//return new ResponseEntity<>(HttpStatus.OK);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
