package boxes;

/**
 * Created by Bill on 7/24/18.
 */
import java.util.ArrayList;
import java.util.List;
public class MaxWeightBox extends Box{
    private int maxWeight;
    private List<Thing> box;

    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.box = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        int totalWeight = 0;
        for(Thing thingy: box){
            totalWeight += thingy.getWeight();
        }
        if(totalWeight + thing.getWeight() <= this.maxWeight){
            this.box.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.box.contains(thing)){
            return true;
        }
        return false;
    }
}
