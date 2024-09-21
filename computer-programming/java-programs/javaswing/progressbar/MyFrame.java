package javaswing.progressbar;

import javax.swing.*;
import java.awt.*;

public class MyFrame {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();


    MyFrame() throws InterruptedException {
        bar.setValue(0);
        bar.setBounds(0, 0, 500,300);
        bar.setStringPainted(true); //adds a percentage to progress bar
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.red); //setting foreground color

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //main canvas
        frame.setSize(500,500);
        frame.setLayout(null);

        frame.add(bar);
        frame.setVisible(true);

        fill();
    }

    public void fill() throws InterruptedException {
        int counter = 100;
        while(counter>0) {
            bar.setValue(counter);
            Thread.sleep(50); //take a pause
            counter -=1;
        }

        bar.setString("You Lose!");

    }
}
