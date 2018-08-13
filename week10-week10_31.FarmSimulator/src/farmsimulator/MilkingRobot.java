package farmsimulator;

/**
 * Created by Bill on 7/23/18.
 */
public class MilkingRobot {
    private BulkTank tank;

    public MilkingRobot(){
        this.tank = null;
    }

    public BulkTank getBulkTank(){
        return this.tank;
    }


    public void setBulkTank(BulkTank tank){
        this.tank = tank;
    }


    public void milk(Milkable milkable){
        if(this.tank == null){
            throw new IllegalStateException("Please hook up a tank");
        }
        this.tank.addToTank(milkable.milk());
    }






}
