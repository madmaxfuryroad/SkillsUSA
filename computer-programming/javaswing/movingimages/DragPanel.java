package javaswing.movingimages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    ImageIcon imageIcon = new ImageIcon(new ImageIcon("javaswing/movingimages/wing.jpg").getImage().getScaledInstance(180, 180, Image.SCALE_DEFAULT));
    final int WIDTH = imageIcon.getIconWidth();
    final int HEIGHT = imageIcon.getIconHeight();
    Point imageCorner;
    Point prevPT;

    DragPanel() {
        imageCorner = new Point(0,0); //starts the very top left corner
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        addMouseListener(clickListener);
        addMouseMotionListener(dragListener);
    }

    public void paintComponent(Graphics g) { //repaint image after we update position
        super.paintComponent(g);
        imageIcon.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
        System.out.println("inside paintComponent");
    }

    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            prevPT = e.getPoint(); //updating the previous point to whereever we click
        }
    }

    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            Point currentPt = e.getPoint();
            imageCorner.translate((int)(currentPt.getX() - prevPT.getX()), (int) (currentPt.getY() - prevPT.getY()));
            prevPT = currentPt;
            repaint();

        }

    }

}
