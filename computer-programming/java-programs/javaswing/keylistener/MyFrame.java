package javaswing.keylistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame {

    JLabel label; //declared variable
    ImageIcon dragonIcon;

    MyFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(null);

        //label
        label = new JLabel(); //instantiate the variable
        label.setBounds(0,0,50,50);
        System.out.println("it should show a box");
        dragonIcon = new ImageIcon(new ImageIcon("/Users/sukanyadhiman/My_Projects_Final/My_Programming/Java_programming/Bro_Code_Course/javaswing/keylistener/dragon.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        label.setIcon(dragonIcon);
        label.setBackground(Color.PINK);
        getContentPane().setBackground(Color.pink);
        System.out.println("it should show a red square");
        label.setOpaque(true);
        add(label);
        setVisible(true);


        MyKeyListener myKeyListener = new MyKeyListener(label);
        addKeyListener(myKeyListener); //object is now listening for key pressed

        //image

    }




}
