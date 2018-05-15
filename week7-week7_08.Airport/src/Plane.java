/**
 * Created by Bill on 5/4/18.
 */
import java.util.ArrayList;
public class Plane {
    private String planeId;
    private int planeCapacity;
    private ArrayList<String> flightDeparture = new ArrayList<String>();
    private ArrayList<String> flightDestination = new ArrayList<String>();

    public Plane(String planeId, int planeCapacity){
        this.planeId = planeId;
        this.planeCapacity = planeCapacity;
    }

    public String getPlaneId() {
        return planeId;
    }

    public int getPlaneCapacity(){
        return planeCapacity;
    }

    public void addFlight(String departureCode, String destinationCode){
        this.flightDeparture.add(departureCode);
        this.flightDestination.add(destinationCode);
    }

    public ArrayList<String> getFlightDeparture(){
        return flightDeparture;
    }

    public ArrayList<String> getFlightDestination(){
        return flightDestination;
    }


}
