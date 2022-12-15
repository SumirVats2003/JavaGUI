package tutorial;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setSize(500, 500);
        this.setResizable(false);
        this.setTitle("My GUI Window");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("tutorial/icon.ico");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0x123456));
    }
}
