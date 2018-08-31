package clicker.ui;

/**
 * Created by Bill on 8/13/18.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import clicker.applicationlogic.Calculator;


public class ClickListener implements ActionListener {
    private JLabel label;
    private Calculator calculator;

    public ClickListener(Calculator calculator, JLabel label) {
        this.label = label;
        this.calculator = calculator;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        this.calculator.increase();
        this.label.setText( "" + this.calculator.giveValue());
    }
}
