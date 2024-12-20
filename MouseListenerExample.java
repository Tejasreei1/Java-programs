package javaprograms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample extends JFrame implements MouseListener {
	Label l;
	MouseListenerExample() {
		addMouseListener(this);
		l = new Label();
		l.setBounds(20, 50, 150, 20);
		add(l);
		setSize(300, 300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void mouseClicked(MouseEvent e) {
		l.setText("Mouse Clicked");
	}
	public void mouseEntered(MouseEvent e) {
		l.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent e) {
		l.setText("Mouse Exited");
	}
	public void mousePressed(MouseEvent e) {
		l.setText("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent e) {
		l.setText("Mouse Released");
	}
	public static void main(String[] args) {
		new MouseListenerExample();
	}
}