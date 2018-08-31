package movingfigure;

/**
 * Created by Bill on 8/19/18.
 */
import javax.swing.JPanel;
import java.awt.Graphics;
public class DrawingBoard extends JPanel{

    private Figure figure;

    public DrawingBoard(Figure figure){
        this.figure = figure;
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        figure.draw(g);
    }
}
