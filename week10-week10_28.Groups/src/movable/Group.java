package movable;

/**
 * Created by Bill on 7/16/18.
 */

import java.util.ArrayList;
public class Group implements Movable {
    private ArrayList<Organism> organisms;

    public Group(){
        this.organisms = new ArrayList<Organism>();
    }

    public void addToGroup(Movable movable){
        this.organisms.add((Organism) movable);
    }


    @Override
    public String toString() {
        String holder = "";
        for(Organism organism : organisms){
            holder += organism.toString() + "\n";
        }
        return holder;
    }

    @Override
    public void move(int dx, int dy) {
        for (Organism org : organisms){
            org.move(dx, dy);
        }
    }
}
