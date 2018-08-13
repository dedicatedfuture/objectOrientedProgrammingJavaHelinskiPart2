package dungeon;

/**
 * Created by Bill on 8/12/18.
 */
import java.util.Random;
public class Vampire {
    private int x, y, length, height;


    public Vampire(int length, int height){
        this.length = length;
        this.height = height;
        this.x = setInitial(this.length);
        this.y = setInitial(this.height);
    }


    public int setInitial(int restriction){
        int initial;
        Random rando = new Random();
        initial = rando.nextInt(restriction-1) + 1;
        return initial;
    }

    public void move(){
        Random rando = new Random();
        int direction = rando.nextInt(4) + 1;

        //randomize direction 1 = up, 2 = down, 3 = left, 4 = right
        if(direction == 1 && (this.y - 1) >= 0){
            this.y --;
        }else if(direction == 2 && (this.y + 1) < this.height){
            this.y++;
        }else if(direction == 3 && (this.x - 1) >= 0){
            this.x--;
        }else if(direction == 4 && (this.x + 1) < this.length){
            this.x++;
        }

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "v " + x + " "+ y;
    }
}
