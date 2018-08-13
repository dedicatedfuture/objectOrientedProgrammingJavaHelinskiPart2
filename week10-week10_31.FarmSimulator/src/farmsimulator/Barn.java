package farmsimulator;


import java.util.Collection;
/**
 * Created by Bill on 7/23/18.
 */
public class Barn {
    private BulkTank tank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank tank){
        this.tank = tank;
        this.milkingRobot = null;
    }


    public BulkTank getBulkTank(){
        return this.tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkingRobot = milkingRobot;
        milkingRobot.setBulkTank(this.tank);
    }



    public void takeCareOf(Cow cow){
        if(this.milkingRobot != null){
            this.milkingRobot.milk(cow);
        }else{
            throw new IllegalStateException("Please install the milking robot");
        }

    }

    public void takeCareOf(Collection<Cow> cows){

        if(this.milkingRobot != null){
            for(Cow cow : cows){
                this.milkingRobot.milk(cow);
            }

        }else{
            throw new IllegalStateException("Please install the milking robot");
        }

    }


    public String toString(){
        return this.tank.toString();
    }





}
