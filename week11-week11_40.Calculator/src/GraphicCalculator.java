
import java.awt.Container;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;



public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private Calculator calculator;


    public GraphicCalculator() {
        this.calculator = new Calculator();
    }

    @Override
    public void run() {

        this.frame = new JFrame("Calculator");
        this.frame.setPreferredSize(new Dimension(500, 500));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(this.frame);

        this.frame.pack();
        this.frame.setVisible(true);

    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);

        container.setLayout(layout);
        JTextField output = new JTextField("0");
        output.setEnabled(false);
        JTextField input = new JTextField("");

        container.add(output);
        container.add(input);
        container.add(createPanel(input, output));


    }

    private JPanel createPanel(JTextField input, JTextField output){
        JPanel panel = new JPanel(new GridLayout(1, 3));

        JButton add = new JButton("+");
        JButton subtract = new JButton("-");
        JButton clear = new JButton("Z");
        clear.setEnabled(false);

        panel.add(add);
        panel.add(subtract);
        panel.add(clear);

        add.addActionListener(new AdditionListener(input, this.calculator, output, clear ));
        subtract.addActionListener(new SubtractListener(input, this.calculator, output, clear));
        clear.addActionListener(new ClearListener(input, output, clear));

        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
