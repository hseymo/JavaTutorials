import java.util.ArrayList;
import java.util.List;

public class TaxiService {

	public List<Vehicle> list(Vehicle one, Vehicle two, Vehicle three) {
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(3);
        vehicles.add(one);
        vehicles.add(two);
        vehicles.add(three);
        return vehicles;
	}

	/**
	 * Ride cannot have more than 4 passengers. Ride must have a driver and at least
	 * 1 passenger.
	 * 
	 * If the Ride is not valid, throw the InvalidRideException.
	 * 
	 * @param ride
	 * @return
	 */
	//public void validate(Ride ride) throws InvalidRideException {
        //int numOfPass = ride.getPassengers().size();
 
        
		//if (ride.getDriver() == null) {
        //    throw new InvalidRideException();
        //}
        
        //if (ride.getPassengers() == null) {
        //    throw new InvalidRideException();
        //} else if (numOfPass < 1) {
        //    throw new InvalidRideException();
        //} else if (numOfPass > 4) {
        //    throw new InvalidRideException();
        //}
	//}
	
	public void validate(Ride ride) throws InvalidRideException {
		if (ride == null) {
			throw new InvalidRideException();
		}
        if (ride.getDriver() == null) {
            throw new InvalidRideException();
        }
        if (ride.getPassengers() == null || ride.getPassengers().size() <1) {
           throw new InvalidRideException();
        } 
        if (ride.getPassengers().size() > 4) {
            throw new InvalidRideException();
        }
	}
	
	//public int business(Ride ride) {
    //    int count = 0;
        
    //    for (int i=0; i<ride.getPassengers().length; i++){
    //        if (ride.getPassengers()[i].getAccountType() == "BUSINESS"){
    //            count++;
    //        }
    //    }
	//	return count;
	//}

}
