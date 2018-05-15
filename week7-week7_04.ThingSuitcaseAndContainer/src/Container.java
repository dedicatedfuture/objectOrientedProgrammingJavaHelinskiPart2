/**
 * Created by Bill on 4/4/18.
 */
import java.util.ArrayList;
public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();

    public Container(int maxWeight){
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase){
        if(totalWeight() + suitcase.totalWeight() <= this.maxWeight){
            suitcases.add(suitcase);
        }

    }

    public int totalWeight(){
        int totalWeight = 0;
        for (Suitcase currentCase : suitcases){
            totalWeight += currentCase.totalWeight();
        }
        return totalWeight;
    }

    public String toString(){
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    public void printThings(){
        for (Suitcase currentCase : suitcases){
            currentCase.printThings();
        }
    }


}
