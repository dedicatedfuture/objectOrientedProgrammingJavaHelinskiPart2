package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame("");
        this.frame.setPreferredSize(new Dimension(600, 600));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(this.frame.getContentPane());

        this.frame.pack();
        this.frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField topTextArea = new JTextField();
        JLabel bottomLabel = new JLabel();
        JButton copyButton = new JButton("Copy!");

        ActionEventListener copier = new ActionEventListener(topTextArea, bottomLabel);
        copyButton.addActionListener(copier);

        container.add(topTextArea);
        container.add(copyButton);
        container.add(bottomLabel);


    }
}
