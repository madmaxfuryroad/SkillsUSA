package javaswing.movingimages;

import javax.swing.*;

public class MyFrame extends JFrame {
    DragPanel myPanel = new DragPanel();

    MyFrame() {
        add(myPanel);
        setTitle("Drag and Drop");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
