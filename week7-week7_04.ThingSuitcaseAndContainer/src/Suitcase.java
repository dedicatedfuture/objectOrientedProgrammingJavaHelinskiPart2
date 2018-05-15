/**
 * Created by Bill on 4/4/18.
 */
import java.util.ArrayList;
public class Suitcase {
    private int maxWeight;
    private ArrayList<Thing> things = new ArrayList<Thing>();


    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing){

        if(this.totalWeight() + thing.getWeight() <= this.maxWeight){
            things.add(thing);
        }

    }

    public String toString(){
        if(things.size() == 1){
            return things.size() + " thing (" + this.totalWeight() + " kg)";}
            else if (things.size() > 1){

            return things.size() + " things (" + this.totalWeight() + " kg)";
        }else {
            return "empty (" + this.totalWeight() + " kg)";
        }
    }

    public void printThings(){
        for(Thing thingNow : things){
            System.out.println(thingNow.toString());
        }
    }

    public int totalWeight(){
        int thingsWeight = 0;
        for(Thing thingNow : things){
            thingsWeight += thingNow.getWeight();
        }
        return thingsWeight;
    }

    public Thing heaviestThing(){
        Thing heaviestThing = new Thing("blank", 0);

        if(things.size() <= 0){
            return null;
        }
        for(Thing thingNow: things){
            if(heaviestThing.getWeight() < thingNow.getWeight()){
                heaviestThing = thingNow;
            }
        }
        return heaviestThing;

    }

}
