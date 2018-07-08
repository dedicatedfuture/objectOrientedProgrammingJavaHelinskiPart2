package application;

/**
 * Created by Bill on 6/30/18.
 */
import java.util.ArrayList;
import java.util.List;


public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor(){
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }



    public void addSensor(Sensor additional){
        this.sensors.add(additional);
    }

    public boolean isOn(){

        for(Sensor sensor: sensors){
            if(sensor.isOn() == false){
                return false;
            }
        }
        return true;

    }

    public void on(){
        for(Sensor sensor: sensors){
            sensor.on();
        }

    }

    public void off(){
        boolean allOn = true;
        for(Sensor sensor : sensors){
           sensor.off();
        }
        if(allOn == false){
            this.sensors.get(0).off();
        }

    }

    public int measure(){
        boolean activated = isOn();

        if( activated = false || this.sensors.size() == 0){
            throw new IllegalStateException();
        }

        int total = 0;
        for(Sensor sensor : sensors){
            total += sensor.measure();
        }
        int avg = (int) Math.floor(total/ this.sensors.size());
        this.readings.add(avg);
        return avg;
    }



    public List<Integer> readings(){


        return this.readings;

    }
}
