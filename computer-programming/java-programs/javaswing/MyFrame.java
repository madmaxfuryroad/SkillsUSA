package javaswing;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(String title) {
        this.setTitle(title);
        this.setBackground(new Color(19, 5, 34));
        this.setDefaultCloseOperation(WindowConstants. EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500,500);

        ImageIcon imageIcon = new ImageIcon("Image.png");
        this.setIconImage(imageIcon.getImage());

        this.setVisible(true);
        System.out.println("hello");
    }
}
