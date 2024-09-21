package javaswing.newwindow;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        LaunchPage launchPage = new LaunchPage();
        JOptionPane.showMessageDialog(null, "plain message", "Information", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "informaiton message", "Information", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "question message", "Information", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "warning message", "Information", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "error message", "Information", JOptionPane.ERROR_MESSAGE);

        System.out.println(JOptionPane.showConfirmDialog(null, "Bro do you even code?", "Coding?", JOptionPane.YES_NO_CANCEL_OPTION));
        String name = JOptionPane.showInputDialog("What is your name? ");
        System.out.println(name);

        String[] responses = {"No, you are awesome", "Thank you!", "*blush*"};
        JOptionPane.showOptionDialog(null, "You are awesome", "Secret Message", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses, 0);
    }
}
