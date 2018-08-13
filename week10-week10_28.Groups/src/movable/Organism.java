package movable;

/**
 * Created by Bill on 7/16/18.
 */
public class Organism implements Movable{
    private int xCoordinate;
    private int yCoordinate;


    public Organism(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    @Override
    public void move(int dx, int dy) {
        this.xCoordinate += dx;
        this.yCoordinate += dy;
    }

    @Override
    public String toString() {
        return "x: " + this.xCoordinate + "; y: " + this.yCoordinate;
    }
}
