package tutorial;

import javax.swing.*;

public class Label {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("tutorial/icon.ico");

        JLabel label = new JLabel();
        label.setText("Hello");
        label.setIcon(image);
        // label.setHorizontalAlignment(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setTitle("My GUI Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        frame.add(label);
    }
}
