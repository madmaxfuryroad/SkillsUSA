package javaswing.filechooser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {
    JButton button; //declaring
    MyFrame() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //creating the button
        button = new JButton("Select File"); //intilizing
        button.setSize(20,20);
        button.addActionListener(this);
        this.add(button);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File("."));

            int response = fileChooser.showOpenDialog(null); //select file to open
            if (response == JFileChooser.APPROVE_OPTION){  //if someone successfully opens a file
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath()); //get the file path
                System.out.println(file);
            }
        }
    }
}
