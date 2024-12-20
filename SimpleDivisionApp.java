package javaprograms;

import java.awt.FlowLayout;

import javax.swing.*;

public class SimpleDivisionApp {
	public static void main(String[] args) {
		// Create the frame
		JFrame frame = new JFrame("Integer Division");
		frame.setSize(600, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		// Create components
		JTextField num1Field = new JTextField(5);
		JTextField num2Field = new JTextField(5);
		JTextField resultField = new JTextField(5);
		resultField.setEditable(false);
		JButton divideButton = new JButton("Divide");

		// Add components to frame
		JPanel panel = new JPanel();
		panel.add(new JLabel("Num1:"));
		panel.add(num1Field);
		panel.add(new JLabel("Num2:"));
		panel.add(num2Field);
		panel.add(divideButton);
		panel.add(new JLabel("Result:"));
		panel.add(resultField);
		frame.add(panel);
		frame.setVisible(true);

		// Add action listener for the divide button
		divideButton.addActionListener(e -> {
			try {
				int num1 = Integer.parseInt(num1Field.getText());
				int num2 = Integer.parseInt(num2Field.getText());
				int result = num1 / num2;
				resultField.setText(String.valueOf(result));
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(frame, "Please enter valid integers.");
			} catch (ArithmeticException ex) {
				JOptionPane.showMessageDialog(frame, "Cannot divide by zero.");
			}
		});
		
	}
}