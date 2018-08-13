package containers;

/**
 * Created by Bill on 7/17/18.
 */
import java.util.ArrayList;
public class ContainerHistory {
    private ArrayList<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation){
        this.history.add(situation);
    }

    public void reset(){
        this.history.clear();
    }

    public ArrayList<Double> getHistory() {
        return history;
    }

    public String toString(){
        return this.history.toString();
    }

    public double maxValue(){
        double maxedOut = 0;

        if(this.history.isEmpty()){
            return 0;
        }

        for (double value : this.history){
            if(maxedOut < value){
                maxedOut = value;
            }
        }
        return maxedOut;
    }

    public double minValue(){
        double minAmount;

        if(this.history.isEmpty()){
            return 0;
        }
        minAmount = this.history.get(0);
        for (double value : this.history){
            if(minAmount > value){
                minAmount = value;
            }
        }
        return minAmount;

    }

    public double average(){
        double total = 0;

        if(this.history.isEmpty()){
            return 0;
        }

        for (double value : this.history){
                total += value;

        }
        return  total / this.history.size();

    }

    public double greatestFluctuation(){
        if(this.history.isEmpty() || this.history.size() == 1){
            return 0;
        }

        double greatestFluctuation = Math.abs(this.history.get(0) - this.history.get(1));

        for(int i = 0; i < history.size() -1; i++){
            if(greatestFluctuation < Math.abs(this.history.get(i) - this.history.get(i + 1) )){
                greatestFluctuation = Math.abs(this.history.get(i) - this.history.get(i + 1) );
            }
        }
        return greatestFluctuation;
    }


    public double variance(){
        if(this.history.isEmpty() || this.history.size() == 1){
            return 0;
        }
        double mean = this.average();
        double temp = 0.0;

        for(double number : this.history){
            temp += Math.pow((number - mean), 2);
        }
        return temp / (this.history.size() -1);
    }
}
