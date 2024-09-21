package javaswing.graphics;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    MyPanel() {
        this.setPreferredSize(new Dimension(500,500));
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawLine(0,0, 500,500);
    }
}
