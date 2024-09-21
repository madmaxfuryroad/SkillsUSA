package javaswing;

import javax.swing.*;
import java.awt.*;

public class Main3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(null); // size of label has to be manually set
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(750,750);

        ImageIcon icon = new ImageIcon("javaswing/netflix.png");
        JLabel label = new JLabel("Hi!");
        label.setIcon(icon);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,255,255);
        frame.add(redPanel);
        redPanel.add(label);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(255,0,255,255);
        frame.add(bluePanel);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,255,500,255);
        frame.add(greenPanel);


        frame.setVisible(true);
    }

}
