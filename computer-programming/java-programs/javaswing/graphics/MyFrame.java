package javaswing.graphics;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel panel;
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        panel = new MyPanel();
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }



}
