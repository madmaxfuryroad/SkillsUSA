package javaswing.layeredpane;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JLabel label1 = new JLabel();
        label1.setOpaque(true); //so we can see the label
        label1.setBackground(Color.red);
        label1.setBounds(50,50,200,200); //sets position and size

        JLabel label2 = new JLabel();
        label2.setOpaque(true); //so we can see the label
        label2.setBackground(Color.orange);
        label2.setBounds(100,100,200,200); //sets position and size

        JLabel label3 = new JLabel();
        label3.setOpaque(true); //so we can see the label
        label3.setBackground(Color.pink);
        label3.setBounds(150,150,200,200); //sets position and size

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);

        JFrame frame = new JFrame("JLayeredPane");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(layeredPane);
        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(2));
        layeredPane.add(label3,Integer.valueOf(1));
    }

}
