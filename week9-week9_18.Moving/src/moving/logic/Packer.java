/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;
import moving.domain.Box;
import moving.domain.Thing;


/**
 *
 * @author Bill
 */
import java.util.List;
import java.util.ArrayList;
public class Packer {
    private int boxesVolume; 
    
    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things){
        ArrayList<Box> packer = new ArrayList<Box>();
        for (Thing thing : things) {
            Box box = new Box(boxesVolume);
            while (box.addThing(thing)) {
                box.addThing(thing);
            }
            packer.add(box);
            box = new Box(boxesVolume);
        }
        return packer;
    }


}
