package application;
import java.util.Random;
/**
 * Created by Bill on 6/30/18.
 */
public class Thermometer implements Sensor{
    private boolean activated;

    public Thermometer(){
        this.activated = false;
    }

    public void on(){
        this.activated = true;
    };

    public void off(){
        this.activated = false;
    };

    public boolean isOn(){
        return this.activated;
    };


    @Override
    public int measure(){
        if(this.activated == false){
            throw new IllegalStateException("");
        }

        Random rando = new Random();
        return rando.nextInt(61) - 30;



    }

}
