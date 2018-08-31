package movingfigure;

/**
 * Created by Bill on 8/21/18.
 */
import java.awt.*;
import java.util.ArrayList;
public class CompoundFigure extends Figure {
    private ArrayList<Figure> shapes;

    public CompoundFigure() {

        this.shapes = new ArrayList<Figure>();
    }

    public void add(Figure f){
        this.shapes.add(f);
    }

    @Override
    public void draw(Graphics graphics) {
        for(Figure shape : shapes){
            shape.draw(graphics);
        }
    }

    @Override
    public void move(int dx, int dy) {

        for(Figure shape : shapes){
            shape.move(dx, dy);
        }

    }
}
