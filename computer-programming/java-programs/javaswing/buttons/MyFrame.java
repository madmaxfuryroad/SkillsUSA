package javaswing.buttons;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    MyFrame() {
        button = new JButton();
        button.setBounds(100,100,100,50); //where the button should be positioned relative to the frame
        button.addActionListener(this);
        button.setText("Press this!");
        button.setFocusable(false);
        button.setSize(250, 100);


//        ImageIcon imageIcon = new ImageIcon("javaswing/netflix.png");
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("javaswing/netflix.png").getImage().getScaledInstance(50,55, Image.SCALE_SMOOTH));
        button.setIcon(imageIcon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 30));
        button.setIconTextGap(-10);
        button.setForeground(new Color(227, 105, 183)); //font color
        button.setBackground(Color.black); //background color
        button.setOpaque(true); //fill every pixel
//        button.setBorder(BorderFactory.createLineBorder(Color.pink, 7, true));
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setBorder(new LineBorder(Color.PINK));
//        button.setBorderPainted(false); //dont fill the border


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.add(button);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println("Clicked!");
            button.setEnabled(false);
        }
    }
}
