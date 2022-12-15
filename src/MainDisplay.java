import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainDisplay extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;

    MainDisplay() {
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();

        // Frame Settings
        this.setSize(500, 540);
        this.setLayout(null);
        this.setLocation(400, 100);
        this.getContentPane().setBackground(new Color(0x4287f5));
        this.setResizable(false);

        // Button 1
        button1.setBounds(10, 10, 230, 230);
        button1.setText("<html><p align=center>Read about Polymorphism through this amazing article</p></html>");
        button1.setFocusable(false);
        button1.addActionListener(this);

        // Button 2
        button2.setBounds(260, 10, 230, 230);
        button2.setText("<html><p align=center>Understand various kinds of polymorphism</p></html>");
        button2.setFocusable(false);
        button2.addActionListener(this);

        // Button 3
        button3.setBounds(10, 260, 230, 230);
        button3.setText("<html><p align=center>Implementation of polymorphism</p></html>");
        button3.setFocusable(false);
        button3.addActionListener(this);

        // Button 4
        button4.setBounds(260, 260, 230, 230);
        button4.setText("<html><p align=center>Java code example illustrating polymorphism</p></html>");
        button4.setFocusable(false);
        button4.addActionListener(this);

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1) {
            this.dispose();
            new Polymorphism();
        }
        if(e.getSource() == button2) {
            this.dispose();
            new Polymorphism();
        }
        if(e.getSource() == button3) {
            this.dispose();
            new Polymorphism();
        }
        if(e.getSource() == button4) {
            this.dispose();
            new Polymorphism();
        }
    }
}
