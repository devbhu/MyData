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

import online.travel.agent.services.CreateCountryService;

/**
 * @author dsin85
 *
 */
@Path("country")
@Produces("application/json")
@Consumes("application/json")
public class CountryResource {

	

	@PUT
	@Path("/createcountry/{id}/{countryname}")
	public void createCountry(@PathParam("id") int  id,@PathParam("countryname") String countryname)
	{  
		try {
			CreateCountryService.getServiceInstance().save(id,countryname);
			//return new ResponseEntity<>(HttpStatus.OK);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
