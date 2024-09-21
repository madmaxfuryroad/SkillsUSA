package javaswing.keylistener;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener {
    JLabel label; //declared variable
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case 37: label.setLocation(label.getX() - 2, label.getY()); //???
                break;
            case 38: label.setLocation(label.getX(), label.getY() - 2);
                print(label.getX(), label.getY());
                break;
            case 40: label.setLocation(label.getX(), label.getY() + 2);
                print(label.getX(), label.getY());
                break;
            case 39: label.setLocation(label.getX() + 2, label.getY());
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You released a key char: " + e.getKeyChar());
        System.out.println("You released a key char: " + e.getKeyCode());
    }

    private void print(int x, int y) {
        System.out.println("x: " + x + ", y: " + y);
    }

    MyKeyListener(JLabel alabel) {
        label = alabel;
    }
}
