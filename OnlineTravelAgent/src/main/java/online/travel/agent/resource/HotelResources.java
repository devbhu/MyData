package online.travel.agent.resource;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import online.travel.agent.model.Hotel;
import online.travel.agent.services.CreateHotelService;

import org.springframework.web.bind.annotation.RequestBody;



@Path("hotel")
@Consumes("application/json")
public class HotelResources {
	
	
	@PUT
	@Path("/createhotel")
	public void createHotel(@RequestBody Hotel hotel)
	{  
		System.out.println("I am getting called ");
		//TODO Send proper response code
		if(hotel == null){
			
			//TODO return with error
		}
		try {
			CreateHotelService.getServiceInstance().save(hotel);
			//return new ResponseEntity<>(HttpStatus.OK);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
}
