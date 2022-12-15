import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.exit;

public class Polymorphism extends JFrame implements ActionListener {
    String text = """
            <html>
            <style>
            * {
                margin: auto;
                padding: 10px;
            }
            p {
                background-color: white;
                color: black;
                text-align: center;
            }
            </style>
            <p>
            Polymorphism in Java is a concept by which we can perform a single action in different ways. Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms. 
            </p>
            <p>
            There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. We can perform polymorphism in java by method overloading and method overriding.
            </p>
            <p>
            If you overload a static method in Java, it is the example of compile time polymorphism. Here, we will focus on runtime polymorphism in java.
            </p>
            </html>
            """;
    JLabel label = new JLabel(text);
    JButton button2 = new JButton();
    JButton button3 = new JButton();

    Polymorphism() {
        // label
        label.setBounds(10, 10, 400, 400);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font(null, Font.PLAIN, 20));

        // Frame Settings
        this.setSize(420, 500);
        this.setLayout(null);
        this.setLocation(400, 100);
        this.getContentPane().setBackground(new Color(0x4287f5));
        this.setResizable(false);

        // Button
        button2.setBounds(105, 425, 100, 25);
        button2.setText("Back");
        button2.setFocusable(false);
        button2.addActionListener(this);

        button3.setBounds(215, 425, 100, 25);
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
