package javaswing.textfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas", Font.BOLD, 35));
        textField.setForeground(Color.pink); //text color
        textField.setBackground(Color.magenta);
        textField.setCaretColor(Color.white);
        textField.setText("username");


        button = new JButton("Submit");
        button.addActionListener(this);

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println("Welcome, "+textField.getText());
            textField.setEditable(false); //text field disabled
            button.setEnabled(false); //button gets disabled
        }
    }
}
