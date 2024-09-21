package javaswing.newwindow;

import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello!");

    NewWindow() {
        frame.setSize(420,420); //set sizes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set closing methods
        frame.setLayout(null); //set layout
        label.setBounds(0,0,100,50); //set label sizes
        label.setFont(new Font("Times New Roman", Font.BOLD, 25)); //set fonts
        frame.add(label); //adding label to frame
        frame.setVisible(true); //showing frame
    }
}
