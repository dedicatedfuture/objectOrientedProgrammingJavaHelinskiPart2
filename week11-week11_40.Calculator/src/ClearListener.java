/**
 * Created by Bill on 8/14/18.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ClearListener implements ActionListener {
    private JTextField input;
    private JButton clear;
    private JTextField output;

    public ClearListener(JTextField input,  JTextField output, JButton clear) {
        this.input = input;
        this.clear = clear;
        this.output = output;
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        this.input.setText("");
        this.output.setText("0");
        this.clear.setEnabled(false);

    }
}
