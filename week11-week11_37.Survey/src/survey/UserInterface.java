package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        this.frame = new JFrame("Survey");
        this.frame.setPreferredSize(new Dimension(500, 500));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        createComponents(this.frame.getContentPane());



        this.frame.pack();
        this.frame.setVisible(true);
    }

    private void createComponents(Container container){
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        JLabel areYou = new JLabel("Are you?");
        JCheckBox yesBox = new JCheckBox("Yes!");
        JCheckBox noBox = new JCheckBox("No!");
        JLabel why = new JLabel("Why?");
        JRadioButton noReason = new JRadioButton("No reason.");
        JRadioButton funRadio = new JRadioButton("Because it is fun!");
        JButton doneButton = new JButton("Done!");


        container.add(areYou);
        container.add(yesBox);
        container.add(noBox);
        container.add(why);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(noReason);
        buttonGroup.add(funRadio);

        container.add(noReason);
        container.add(funRadio);
        container.add(doneButton);

    }


    public JFrame getFrame() {
        return frame;
    }
}
