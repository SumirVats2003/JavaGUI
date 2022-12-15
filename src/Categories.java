import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Categories extends JFrame implements ActionListener {
    JLabel label;
    JButton button2 = new JButton();
    JButton button3 = new JButton();

    Categories() {
        ImageIcon image = new ImageIcon(getClass().getResource("/Assets/poly.png"));
        System.out.println(image);
        label = new JLabel(image);
        //label.setBounds(4, 10, 491, 312);

        // Frame Settings
        this.setSize(500, 420);
        this.setLayout(null);
        this.setLocation(400, 100);
        this.getContentPane().setBackground(new Color(0x4287f5));
        this.setResizable(false);

        // Button
        button2.setBounds(145, 350, 100, 25);
        button2.setText("Back");
        button2.setFocusable(false);
        button2.addActionListener(this);

        button3.setBounds(255, 350, 100, 25);
        button3.setText("Finish");
        button3.setFocusable(false);
        button3.addActionListener(this);

        this.add(label);
        this.add(button2);
        this.add(button3);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button2) {
            this.dispose();
            new MainDisplay();
        }
        if(e.getSource() == button3) {
            System.exit(0);
        }
    }
}
