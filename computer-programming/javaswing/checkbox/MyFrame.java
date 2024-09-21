package javaswing.checkbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    ImageIcon right;
    ImageIcon wrong;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(1000,500);

        button = new JButton("Submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot.");
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
        ImageIcon right = new ImageIcon(new ImageIcon("javaswing/checkbox/checkmark.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        ImageIcon wrong = new ImageIcon(new ImageIcon("javaswing/checkbox/wrongmark.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));

        checkBox.setIcon(wrong);
        checkBox.setSelectedIcon(right);

        this.add(button);
        this.add(checkBox);
//        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println(checkBox.isSelected());
        };
    }
}
