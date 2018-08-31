package movingfigure;

/**
 * Created by Bill on 8/14/18.
 */
import java.awt.Graphics;



public abstract class  Figure {
    private int x;
    private int y;


    public Figure(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Figure(){

    }

    public abstract void draw(Graphics graphics);

    public void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
