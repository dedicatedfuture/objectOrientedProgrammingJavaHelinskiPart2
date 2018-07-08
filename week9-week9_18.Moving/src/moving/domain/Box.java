/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Bill
 */
public class Box implements Thing{
    private int maxCapacity;
    private List<Thing> box;

    
    public Box(int maximumCapacity){
        this.maxCapacity = maximumCapacity;
        this.box = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing){
        if(this.getVolume() + thing.getVolume() <= maxCapacity){
            box.add(thing);
            return true;
        }
        return false;
    }
    @Override
    public String toString(){

        return super.toString();
    }

    @Override
    public int getVolume(){
        int volume = 0;
        for(Thing thing : this.box){
            volume += thing.getVolume();
        }

        return volume;
    }
    
    
}
