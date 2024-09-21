package javaswing.combobox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JComboBox comboBox;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"}; //MUST USE WRAPPER CLASSES!!
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
//        comboBox.setEditable(true);
//        System.out.println(comboBox.getItemCount());
        comboBox.insertItemAt("pig",0);
        comboBox.setSelectedIndex(0);
        this.add(comboBox);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==comboBox) {
           System.out.println(comboBox.getSelectedItem());
       }
    }
}
