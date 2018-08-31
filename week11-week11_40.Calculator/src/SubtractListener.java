import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bill on 8/14/18.
 */
public class SubtractListener implements ActionListener {

    private JTextField input;
    private Calculator calculator;
    private JTextField output;
    private JButton clear;

    public SubtractListener(JTextField input, Calculator calculator, JTextField output, JButton clear) {
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
            if(this.output.getText().equals("")){
                total = this.calculator.subtractValue(0, Integer.parseInt(this.input.getText()));

            }else{
                total = this.calculator.subtractValue(Integer.parseInt(this.output.getText()), Integer.parseInt(this.input.getText()));
            }

            this.input.setText("");
            this.output.setText("" + total);
            this.clear.setEnabled(true);
        }else{
            this.input.setText("");

        }



        if(this.output.getText().equals("0")){
            this.clear.setEnabled(false);
        }
    }
}
