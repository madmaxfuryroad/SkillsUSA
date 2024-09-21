package javaswing.colorchooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Choose a color!");
        label = new JLabel("This is some text");
        //label.setBackground(Color.orange);
        label.setOpaque(true);
        label.setFont(new Font("Times New Roman", Font.BOLD, 50));
        button.addActionListener(this);

        this.add(button);
        this.add(label);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Color Picker", Color.black);
            //label.setForeground(color);
            label.setBackground(color);
            button.setBackground(color);
            button.setOpaque(true);
        }
    }
}
