package javaswing.radiobuttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;

    JRadioButton pizzaButton;
    JRadioButton burgerButton;
    JRadioButton hotdogButton;

    ImageIcon pizzaIcon;
    ImageIcon burgerIcon;
    ImageIcon hotdogIcon;
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);

        pizzaIcon = new ImageIcon("javaswing/radiobuttons/pizza.png");
        pizzaIcon = new ImageIcon("javaswing/radiobuttons/burger.png");
        pizzaIcon = new ImageIcon("javaswing/radiobuttons/hotdog.png");

        pizzaButton = new JRadioButton("pizza");
        pizzaButton.addActionListener(this);
        burgerButton = new JRadioButton("burger"); //ISNT SHOWING!
        burgerButton.addActionListener(this);
        hotdogButton = new JRadioButton("hotdog"); //ISTN SHOWING!!
        hotdogButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon);
        burgerButton.setIcon(burgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(burgerButton);
        group.add(hotdogButton);

        //add the buttons on the frame
        this.add(pizzaButton);
        this.add(burgerButton);
        this.add(hotdogButton);



        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzaButton) {
            System.out.println("You ordered pizza.");
        } else if(e.getSource()==burgerButton) {
            System.out.println("You ordered a burger.");
        } else {
            System.out.println("You ordered a hotdog.");
        }
    }
}