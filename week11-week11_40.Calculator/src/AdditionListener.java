/**
 * Created by Bill on 8/13/18.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AdditionListener implements ActionListener{
    private JTextField input;
    private Calculator calculator;
    private JTextField output;
    private JButton clear;

    public AdditionListener(JTextField input, Calculator calculator, JTextField output, JButton clear) {
        this.input = input;
        this.calculator = calculator;
        this.output = output;
        this.clear = clear;
    }


    public boolean isInputInteger(){
        try {
            Integer.parseInt(this.input.getText());
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int total;



        if(isInputInteger()) {
            Integer.parseInt(this.input.getText());
            if (this.output.getText().equals("")) {
                total = this.calculator.addValue(Integer.parseInt(this.input.getText()), 0);
            } else {
                total = this.calculator.addValue(Integer.parseInt(this.input.getText()), Integer.parseInt(this.output.getText()));

            }

            this.input.setText("");

            this.output.setText("" + total);
            this.clear.setEnabled(true);


        }else {
            this.input.setText("");

        }





        if(this.output.getText().equals("0")){
            this.clear.setEnabled(false);
        }
    }
}
