package javaswing.menubar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {
    JMenuItem loadMenu = new JMenuItem("Load");
    JMenuItem exitMenu = new JMenuItem("Exit");
    JMenuItem saveMenu = new JMenuItem("Save");
    JMenu fileMenu = new JMenu("File"); //adding items to the main menu bar
    JMenu editMenu = new JMenu("Edit"); //adding items to the main menu bar
    JMenu helpMenu = new JMenu("Help"); //adding items to the main menu bar

    MyFrame() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();


        menuBar.add(fileMenu); //adding the menu to the main menu
        menuBar.add(editMenu); //adding the menu to the main menu
        menuBar.add(helpMenu); //adding the menu to the main menu


        loadMenu.addActionListener(this);
        exitMenu.addActionListener(this);
        saveMenu.addActionListener(this);

        fileMenu.add(loadMenu);
        fileMenu.add(saveMenu);
        fileMenu.add(exitMenu);

        loadMenu.setMnemonic(KeyEvent.VK_L); //setting a shortcut
        saveMenu.setMnemonic(KeyEvent.VK_S);
        exitMenu.setMnemonic(KeyEvent.VK_Q);


        this.setJMenuBar(menuBar); //setting the main menubar to one of the menubar we created


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadMenu) {
            System.out.println("Loading item...");
        }
        if (e.getSource() == saveMenu) {
            System.out.println("Saving file");
        }
        if (e.getSource() == exitMenu) {
            System.exit(0);
        }
    }
}
