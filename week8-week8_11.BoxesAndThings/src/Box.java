import java.util.ArrayList;
public class Box implements ToBeStored{
    private double maxWeight;
    private ArrayList<ToBeStored> stuff = new ArrayList<ToBeStored>();


    public Box(double maxWeight){
        this.maxWeight = maxWeight;
    }


    public void add(ToBeStored thing){
        if(weight() + thing.weight() <= maxWeight){
            this.stuff.add(thing);
        }
    }

    public double weight(){
        double weight = 0;
        for (ToBeStored thing: stuff){
            weight += thing.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + stuff.size() + " things, total weight " + weight() + " kg";
    }

}