package javaprograms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class registrationForm11 extends JFrame {

    public registrationForm11() {
        setTitle("Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));

        // Name field
        panel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField(20);
        panel.add(nameField);

        // Email field
        panel.add(new JLabel("Email:"));
        JTextField emailField = new JTextField(20);
        panel.add(emailField);

        // Password field
        panel.add(new JLabel("Password:"));
        JPasswordField passwordField = new JPasswordField(20);
        panel.add(passwordField);

        // Gender selection
        panel.add(new JLabel("Gender:"));
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        panel.add(male);
        panel.add(female);

        // Terms & conditions checkbox
        panel.add(new JLabel("Accept Terms:"));
        JCheckBox termsCheckBox = new JCheckBox("I accept");
        panel.add(termsCheckBox);

        // Submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (termsCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(registrationForm11.this, "Registration Successful!");
                } else {
                    JOptionPane.showMessageDialog(registrationForm11.this, "Please accept the terms and conditions.");
                }
            }
        });
        panel.add(submitButton);

        // Add panel to frame
        add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new registrationForm11().setVisible(true));
    }
}
