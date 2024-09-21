package javaswing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(700,700);



        JLabel label = new JLabel("Just have a little faith.");
        Border border = BorderFactory.createLineBorder(Color.BLUE, 3);

        ImageIcon imageIcon = new ImageIcon("javaswing/image.png");
        label.setIcon(imageIcon);

        label.setHorizontalTextPosition(JLabel.CENTER); //relative to the image
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(31, 50, 151));
        label.setFont(new Font("MV Boli", Font.BOLD, 20));
        label.setIconTextGap(10);
        label.setBackground(new Color(26, 63, 99, 194));
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(100,0,550,550);

//        frame.setLayout(null);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }

}
