package javaswing.keybindings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game extends JFrame{

    JFrame frame;
    JLabel label;
    Action upAction = new UpAction();
    Action downAction = new DownAction();
    Action leftAction = new LeftAction();
    Action rightAction = new RightAction();

    Game() {
        frame = new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.orange);
        label.setBounds(100,100,100,100);
        label.setOpaque(true);
        frame.add(label); //adding label onto main frame

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        //adding bindings
        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "xxx"); //adding keystroke to uparrow
        label.getActionMap().put("xxx", upAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction"); //adding keystroke to uparrow
        label.getActionMap().put("downAction", downAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction"); //adding keystroke to uparrow
        label.getActionMap().put("leftAction", leftAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction"); //adding keystroke to uparrow
        label.getActionMap().put("rightAction", rightAction);

        frame.setVisible(true); //making main frame visible
    }

    public class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() - 10);
        }

        public void sayHello() {

        }
    }

    public class DownAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    public class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY());
        }
    }

    public class RightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY());
        }
    }


}

