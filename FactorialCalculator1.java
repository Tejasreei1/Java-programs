package javaprograms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialCalculator1 {
    public static void main(String[] args) {
        // Create the frame and set properties
        JFrame frame = new JFrame("Factorial Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 120);

        // Create input field, button, and output field
        JTextField inputField = new JTextField(10);
        JButton computeButton = new JButton("Compute");
        JTextField outputField = new JTextField(10);
        outputField.setEditable(false);

        // Add components to frame
        frame.setLayout(new FlowLayout());
        frame.add(inputField);
        frame.add(computeButton);
        frame.add(outputField);

        // Button click action
        computeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(inputField.getText());
                    outputField.setText(String.valueOf(calculateFactorial(number)));
                } catch (NumberFormatException ex) {
                    outputField.setText("Invalid input");
                }
            }

            // Method to calculate factorial
            private int calculateFactorial(int num) {
                int result = 1;
                for (int i = 1; i <= num; i++) {
                    result *= i;
                }
                return result;
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}
