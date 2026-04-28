import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Test");
        f.setSize(500,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l = new JLabel("Enter Sex: ");
        l.setBounds(20,20,100,20);
        f.add(l);

        JTextArea t = new JTextArea();
        t.setBounds(150,20,100,40);
        f.add(t);

        JButton b = new JButton("Fuck me!");
        b.setBounds(200,200,100,50);
        f.add(b);

        f.setVisible(true);
    }
}