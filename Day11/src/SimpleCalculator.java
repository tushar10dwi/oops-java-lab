import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator implements ActionListener {
    // Component declarations
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[6];
    JButton addButton, subButton, mulButton, divButton, percButton, equButton, offButton;
    JPanel panel;

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public SimpleCalculator() {
        // 1. Create the Frame
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(Color.CYAN);

        // 2. Create the Top Panel (Label and TextField)
        JPanel topPanel = new JPanel(new GridLayout(1, 2));
        JLabel label = new JLabel("CALCULATOR", SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.CYAN);
        label.setForeground(Color.BLUE);
        label.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.LEFT);

        topPanel.add(label);
        topPanel.add(textField);

        // 3. Initialize Buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        percButton = new JButton("%");
        equButton = new JButton("=");
        offButton = new JButton("OFF");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = percButton;
        functionButtons[5] = equButton;

        for (int i = 0; i < 6; i++) {
            functionButtons[i].addActionListener(this);
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        // 4. Create Center Panel for Grid (4x4)
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        // Adding components to the grid exactly as per your image
        panel.add(numberButtons[1]); panel.add(numberButtons[2]); panel.add(numberButtons[3]); panel.add(addButton);
        panel.add(numberButtons[4]); panel.add(numberButtons[5]); panel.add(numberButtons[6]); panel.add(subButton);
        panel.add(numberButtons[7]); panel.add(numberButtons[8]); panel.add(numberButtons[9]); panel.add(mulButton);
        panel.add(divButton);        panel.add(numberButtons[0]); panel.add(percButton);      panel.add(equButton);

        // 5. Setup OFF Button
        offButton.addActionListener(e -> System.exit(0));

        // 6. Assembly
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(offButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle Number Buttons
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

        // Handle Operator Buttons
        if (e.getSource() == addButton || e.getSource() == subButton ||
                e.getSource() == mulButton || e.getSource() == divButton || e.getSource() == percButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = e.getActionCommand().charAt(0);
            textField.setText("");
        }

        // Handle Equals Button
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
                case '%': result = num1 % num2; break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}