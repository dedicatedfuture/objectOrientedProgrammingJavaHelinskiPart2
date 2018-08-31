package movingfigure;

import java.awt.*;

/**
 * Created by Bill on 8/21/18.
 */
public class Square extends Figure {
    private int sideLength;

    public Square(int x, int y, int sideLength) {
        super(x, y);
        this.sideLength = sideLength;
    }


    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(super.getX(), super.getY(), sideLength, sideLength);
    }
}
