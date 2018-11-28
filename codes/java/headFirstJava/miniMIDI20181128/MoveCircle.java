package mainpackage;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MoveCircle {
	JButton button;
	JFrame frame;
	JLabel label;
	int x = 70;
	int y = 70;
	
	
	
	public void go() {		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button = new JButton();
		label = new JLabel();

		MyDrawPanel drawPanel = new MyDrawPanel();

		button.addActionListener(new ButtonListener());
		
		
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(drawPanel);
		frame.getContentPane().add(BorderLayout.NORTH, label);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
		button.setText("click me");
		label.setText("text");
				
		for(int i=0; i<130; i++) {
			x++;
			y++;
			
			System.out.println("x= "+x+" y= "+y);
			frame.repaint();
		try {
			Thread.sleep(50);
		}catch(Exception ex) {}
		}
		
	}
	
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			/*
			for(int i=0; i<130; i++) {
				x++;
				y++;
				frame.repaint();
			}
			try {
				Thread.sleep(50);
			}catch(Exception ex) {}
			*/
		}
	}
	
	class MyDrawPanel extends JPanel {
		 public void paintComponent(Graphics g) {
			 g.setColor(Color.orange);
			 g.fillOval(x, y, 50, 50);
		 }
	}
}
