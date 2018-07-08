package application;

/**
 * Created by Bill on 6/30/18.
 */
public class ConstantSensor implements Sensor {
    private int measure;
    public ConstantSensor(int measure){
        this.measure = measure;
    }

    public int measure(){
        return this.measure;
    }

    public void on(){};
    public void off(){};

    public boolean isOn(){
        return true;
    }
}
