package farmsimulator;

/**
 * Created by Bill on 7/24/18.
 */
import java.util.ArrayList;
import java.util.List;
public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private List<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        String toString = "Farm owner: " + this.owner + "\n" +
                "Barn bulk tank: " + this.barn.getBulkTank() + "\n";


        if(this.cows.isEmpty()){
            toString += "No Cows";
        }else {
            toString += "Animals: \n";
            for (Cow cow : cows) {
                toString +="        " + cow.toString();
            }
        }

        return toString;

    }

    @Override
    public void liveHour() {
        for (Cow cow : this.cows){
            cow.liveHour();
        }

    }

    public void addCow(Cow newCow){
        this.cows.add(newCow);
    }

    public void manageCows(){
        this.barn.takeCareOf(this.cows);
    }

    public void installMilkingRobot(MilkingRobot robot){
        this.barn.installMilkingRobot(robot);
    }
}
