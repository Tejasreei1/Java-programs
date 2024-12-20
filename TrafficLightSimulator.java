package javaprograms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightSimulator {
	
    public static void main(String[] args) {
    	
        JFrame frame = new JFrame("Traffic Light Stimulaor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());
        
        JLabel messageLabel = new JLabel();
        messageLabel.setFont(new Font("Arial", Font.BOLD, 20));
        
        JRadioButton redButton = new JRadioButton("Red");
        JRadioButton yellowButton = new JRadioButton("Yellow");
        JRadioButton greenButton = new JRadioButton("Green");
        
        redButton.setBackground(Color.RED);
        yellowButton.setBackground(Color.YELLOW);
        greenButton.setBackground(Color.GREEN);
        
        ButtonGroup group = new ButtonGroup();
        
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);
        
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Stop");
                messageLabel.setForeground(Color.RED);
            }
        });
        yellowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Ready");
                messageLabel.setForeground(Color.YELLOW);
            }
        });
        greenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Go");
                messageLabel.setForeground(Color.GREEN);
            }
        });
        frame.add(messageLabel);
        frame.add(redButton);
        frame.add(yellowButton);
        frame.add(greenButton);
        frame.setVisible(true);
    }
}
