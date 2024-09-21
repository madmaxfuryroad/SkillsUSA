package javaswing.mouseinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label; //delcaring

    MyFrame() {
        label = new JLabel(); //initilized
        label.setBounds(0, 0, 100,100);
        label.setBackground(Color.blue);
        label.setOpaque(true);
        add(label);
        this.addMouseListener(this); //label says "You need to hand me the key to be a MouseListener", so I passed in the key

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // pressed +  released
        System.out.println("you clicked the mouse!");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // pressed
        System.out.println("you pressed the mouse!");
        label.setBackground(Color.PINK);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        System.out.println("you released the mouse!");
        label.setBackground(Color.BLUE);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        System.out.println("you entered the component!");

    }

    @Override
    public void mouseExited(MouseEvent e) {
//        System.out.println("you exited the component!");
    }
}
