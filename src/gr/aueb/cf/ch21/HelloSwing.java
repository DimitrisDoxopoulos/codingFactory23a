package gr.aueb.cf.ch21;

import javax.swing.*;

public class HelloSwing {
    public static void main(String[] args) {
        JFrame helloFrame = new JFrame("Coding Factory");
        helloFrame.setSize(500, 250);
        helloFrame.setLocationRelativeTo(null);
        helloFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.add(new JLabel("Hello World!"));

        helloFrame.setContentPane(contentPane);
        helloFrame.setVisible(true);
    }
}
