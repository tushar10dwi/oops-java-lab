import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StringOperations implements ActionListener {
    JFrame frame;
    JTextField inputField, outputField;
    JButton inCaps, inSmall, reverse, vowels, words, letters, reset, frequency, beginCaps;

    public StringOperations() {
        frame = new JFrame("My Frame");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Using absolute positioning to match the specific screenshot layout
        frame.getContentPane().setBackground(new Color(255, 182, 182)); // Light pink/coral

        // Labels and TextFields
        JLabel lblInput = new JLabel("Enter the string:");
        lblInput.setBounds(50, 80, 150, 30);
        frame.add(lblInput);

        inputField = new JTextField();
        inputField.setBounds(250, 80, 300, 30);
        frame.add(inputField);

        JLabel lblOutput = new JLabel("Result:");
        lblOutput.setBounds(50, 150, 150, 30);
        frame.add(lblOutput);

        outputField = new JTextField();
        outputField.setBounds(250, 150, 300, 30);
        outputField.setEditable(false);
        frame.add(outputField);

        // Buttons (Positioned to mimic the staggered look in your image)
        inCaps = new JButton("IN CAPS");
        inCaps.setBounds(20, 350, 100, 30);

        reverse = new JButton("REVERSE");
        reverse.setBounds(90, 380, 120, 30);

        inSmall = new JButton("IN SMALL");
        inSmall.setBounds(180, 350, 120, 30);

        vowels = new JButton("VOWELS");
        vowels.setBounds(260, 380, 120, 30);

        words = new JButton("WORDS");
        words.setBounds(340, 350, 120, 30);

        letters = new JButton("LETTERS");
        letters.setBounds(420, 380, 120, 30);

        frequency = new JButton("FREQUENCY");
        frequency.setBounds(500, 350, 120, 30);

        // Setup Reset Button
        reset = new JButton("RESET");
        reset.setBounds(400, 430, 100, 30);
        reset.setBackground(Color.BLUE);
        reset.setForeground(Color.WHITE);

        // Adding ActionListeners
        inCaps.addActionListener(this);
        reverse.addActionListener(this);
        inSmall.addActionListener(this);
        reset.addActionListener(e -> { inputField.setText(""); outputField.setText(""); });

        frame.add(inCaps); frame.add(reverse); frame.add(inSmall);
        frame.add(vowels); frame.add(words); frame.add(letters);
        frame.add(frequency); frame.add(reset);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = inputField.getText();

        if (e.getSource() == inCaps) {
            outputField.setText(str.toUpperCase());
        } else if (e.getSource() == inSmall) {
            outputField.setText(str.toLowerCase());
        } else if (e.getSource() == reverse) {
            String rev = new StringBuilder(str).reverse().toString();
            outputField.setText(rev);
        } else if (e.getSource() == vowels) {
            outputField.setText(str.replaceAll("(?i)[^aeiou]", ""));
        } else if (e.getSource() == letters) {
            outputField.setText(String.valueOf(str.replaceAll("[^a-zA-Z]", "").length()));
        } else if (e.getSource() == words) {
            String text = inputField.getText();
            outputField.setText(String.valueOf(text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length));
        }
    }

    public static void main(String[] args) {
        new StringOperations();
    }
}
