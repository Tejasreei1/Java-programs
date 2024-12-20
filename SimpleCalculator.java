package javaprograms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {

    private JTextField resultField;
    private String operator = "";
    private double num1 = 0, num2 = 0;

    public SimpleCalculator() {
        setTitle("Calculator");
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(5, 4)); // Change to 5 rows to fit Clear button

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C" // Clear button
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(this);
            panel.add(button);
        }
       

        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("=")) {
            try {
                num2 = Double.parseDouble(resultField.getText());
                switch (operator) {
                    case "+": num1 += num2; break;
                    case "-": num1 -= num2; break;
                    case "*": num1 *= num2; break;
                    case "/":
                        if (num2 == 0) throw new ArithmeticException("Cannot divide by zero");
                        num1 /= num2; break;
                    case "%": num1 %= num2; break;
                }
                resultField.setText(String.valueOf(num1));
                operator = ""; 
            } catch (Exception ex) {
                resultField.setText("Error");
            }
        } else if (cmd.equals("C")) { // Clear button action
            resultField.setText("");
            num1 = 0;
            num2 = 0;
            operator = "";
        } else if ("0123456789.".contains(cmd)) {
            resultField.setText(resultField.getText() + cmd);
        } else {
            operator = cmd;
            num1 = Double.parseDouble(resultField.getText());
            resultField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SimpleCalculator().setVisible(true);
        });
    }
}
