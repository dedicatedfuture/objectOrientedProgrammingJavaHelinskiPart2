package clicker.ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;
import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;

    public UserInterface(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());

        JLabel textField = new JLabel("" + this.calculator.giveValue());
        JButton button = new JButton("Click!");


        container.add(textField, BorderLayout.NORTH);
        container.add(button, BorderLayout.SOUTH);

        button.addActionListener(new ClickListener(this.calculator, textField));

    }

    public JFrame getFrame() {
        return frame;
    }
}
