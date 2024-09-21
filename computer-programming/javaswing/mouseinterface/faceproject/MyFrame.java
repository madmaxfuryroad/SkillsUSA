package javaswing.mouseinterface.faceproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon smile;
    ImageIcon dizzy;
    ImageIcon cry;
    ImageIcon pain;

    MyFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600,500);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null); //sets the window to the middle of your screen

        label = new JLabel();
        label.addMouseListener(this); //adding mouse listener to the label
        smile = new ImageIcon(new ImageIcon("javaswing/mouseinterface/faceproject/smile.png").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT));
        dizzy = new ImageIcon(new ImageIcon("javaswing/mouseinterface/faceproject/dizzy.png").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT));
        cry = new ImageIcon(new ImageIcon("javaswing/mouseinterface/faceproject/cry.png").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT));
        pain = new ImageIcon(new ImageIcon("javaswing/mouseinterface/faceproject/pain.png").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT));
        label.setIcon(smile);
        add(label);


        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
            label.setIcon(pain);
        }
        else {
            label.setIcon(cry);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        label.setIcon(cry);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        label.setIcon(pain);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(dizzy);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(smile);
    }
}
