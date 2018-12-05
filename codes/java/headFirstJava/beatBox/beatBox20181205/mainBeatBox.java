package beatBox20181205;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JCheckBox;

public class mainBeatBox {
	JFrame frame;
	JPanel panel;
	JPanel panelButton;//panelButton has 4 buttons: buttonStart,buttonStop,buttonTempoUp,buttonTempoDown
	JPanel panelCheckBox;
	JPanel panelCheckBoxLine;
	JPanel panelLabel;
	JButton buttonStart,buttonStop,buttonTempoUp,buttonTempoDown;
	JCheckBox check1,check2,check3,check4,check5,check6;
	JLabel labelPiano,labelGuitar,labelUkulele;
	
	
	
	public static void main(String[] args) {
		mainBeatBox beatBox = new mainBeatBox();
		beatBox.go();
	}
	public void go() {//Layout
		frame = new JFrame();
		panel = new JPanel();
		
		panelButton = new JPanel();
		panelButton.setLayout(new BoxLayout(panelButton, BoxLayout.Y_AXIS));
		frame.getContentPane().add(BorderLayout.EAST,panelButton);

		panelCheckBox = new JPanel();
		panelCheckBox.setLayout(new BoxLayout(panelCheckBox, BoxLayout.Y_AXIS));
		frame.getContentPane().add(BorderLayout.CENTER,panelCheckBox);
		
		panelCheckBoxLine = new JPanel();
		panelCheckBox.add(panelCheckBoxLine);
		
		panelLabel = new JPanel();
		panelLabel.setLayout(new BoxLayout(panelLabel, BoxLayout.Y_AXIS));
		frame.getContentPane().add(BorderLayout.WEST,panelLabel);
		
		
		//buttons
		buttonStart = new JButton("Start");
		panelButton.add(buttonStart);
		buttonStop = new JButton("Stop");
		panelButton.add(buttonStop);
		buttonTempoUp = new JButton("Tempo Up");
		panelButton.add(buttonTempoUp);
		buttonTempoDown = new JButton("Tempo Down");
		panelButton.add(buttonTempoDown);
		
		check1 = new JCheckBox();
		check2 = new JCheckBox();
		check3 = new JCheckBox();
		check4 = new JCheckBox();
		check5 = new JCheckBox();
		check6 = new JCheckBox();
		
		panelCheckBoxLine.add(check1);
		panelCheckBoxLine.add(check2);
		panelCheckBoxLine.add(check3);
		panelCheckBoxLine.add(check4);
		panelCheckBoxLine.add(check5);
		panelCheckBoxLine.add(check6);
		
		Font bigFont = new Font("serif", Font.BOLD, 28);
		labelPiano = new JLabel("Piano");
		labelGuitar = new JLabel("Guitar");
		labelUkulele = new JLabel("Ukulele");
		labelPiano.setFont(bigFont);
		labelGuitar.setFont(bigFont);
		labelUkulele.setFont(bigFont);
		
		panelLabel.add(labelPiano);
		panelLabel.add(labelGuitar);
		panelLabel.add(labelUkulele);
		

		frame.setSize(500,500);
		frame.setVisible(true);
	}
	
	
}
