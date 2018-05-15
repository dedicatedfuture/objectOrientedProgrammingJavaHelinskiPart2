/**
 * Created by Bill on 5/7/18.
 */
import java.util.Scanner;
import java.util.ArrayList;
public class TextInterface {
    private Scanner reader;
    private ArrayList<Plane> planeList = new ArrayList<Plane>();

    public TextInterface(Scanner reader){
        this.reader = reader;
    }

    public void startAirportPanel(){
        System.out.println("Choose operation: ");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
    }

    public void startFlightServices(){
        System.out.println("Choose operation: ");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
    }

    public void start(){

        System.out.println("Airport panel");
        System.out.println("--------------------");

        while(true) {
            this.startAirportPanel();
            String response = this.reader.nextLine();

            if (response.equals("x")) {
                break;
            } else if (response.equals("1")) {
                this.addAirplane();
            } else if(response.equals("2")){
                this.addFlight();
            } else{
                System.out.println("Unknown Statement");
            }
        }

        System.out.println("Flight service");
        System.out.println("--------------------");

        while(true){
            this.startFlightServices();
            String response = this.reader.nextLine();

            if (response.equals("x")) {
                break;
            } else if (response.equals("1")) {
                this.printPlanes();
            } else if(response.equals("2")){
                this.printFlights();
            } else if(response.equals("3")){
                this.printPlaneInfo();
            } else {
                System.out.println("Unknown Statement");
            }


        }
    }


    public void addAirplane(){
        System.out.print("Give plane ID:");
        String planeId = reader.nextLine();
        System.out.print("Give plane capacity:");
        int planeCapacity = Integer.parseInt(reader.nextLine());

        Plane newPlane = new Plane(planeId, planeCapacity);
        this.planeList.add(newPlane);
    }

    public void addFlight(){
        System.out.print("Give plane ID: ");
        String planeId = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departureCode = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destinationCode = reader.nextLine();


        for (Plane plane : planeList){
            if (plane.getPlaneId().equals(planeId)){
                plane.addFlight(departureCode, destinationCode);
            }
        }
    }

    public void printPlanes(){

        for (Plane plane : planeList){
            System.out.println(plane.getPlaneId() + " (" + plane.getPlaneCapacity() + " ppl)");
        }
    }

    public void printFlights(){

        for (int i = 0; i < planeList.size(); i++){
            for(int j = 0; j < planeList.get(i).getFlightDeparture().size(); j++){
                System.out.println(planeList.get(i).getPlaneId() + " (" + planeList.get(i).getPlaneCapacity() +
                        " ppl) (" + planeList.get(i).getFlightDeparture().get(j) + "-" +
                        planeList.get(i).getFlightDestination().get(j) + ")" );
            }


        }
    }

    public void printPlaneInfo(){
        System.out.print("Give plane ID: ");
        String response = reader.nextLine();
        for(Plane plane : this.planeList){
            if(plane.getPlaneId().equals(response)){
                System.out.println(plane.getPlaneId() + " (" + plane.getPlaneCapacity() + " ppl)");
            }
        }
    }

}
