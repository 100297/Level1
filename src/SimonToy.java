import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimonToy implements ActionListener {
	String Unums = "";
	String Gnums = "";

	JButton green = new JButton();
	JButton red = new JButton();
	JButton yellow = new JButton();
	JButton blue = new JButton();

	public static void main(String[] args) {
		SimonToy min = new SimonToy();
		min.manage();
	}

	public void manage() {
		Setup();
		nextRound();
		if (Unums.equals(Gnums)) {
			nextRound();
		}
	}

	void Setup() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		panel.setOpaque(true);
		green.setOpaque(true);
		red.setOpaque(true);
		yellow.setOpaque(true);
		blue.setOpaque(true);
		green.setBackground(Color.lightGray);
		red.setBackground(Color.lightGray);
		yellow.setBackground(Color.lightGray);
		blue.setBackground(Color.lightGray);
		panel.setBackground(Color.lightGray);
		panel.add(green);
		panel.add(red);
		panel.add(yellow);
		panel.add(blue);
		green.addActionListener(this);
		red.addActionListener(this);
		yellow.addActionListener(this);
		blue.addActionListener(this);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	void nextRound() {

		Random a = new Random();
		int b = a.nextInt(4);
		Gnums += b;
		System.out.println(Gnums);
		Unums = "";
		flashButtons(Gnums);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == green) {
			Unums += "0";
		}
		if (e.getSource() == red) {
			Unums += "1";
		}
		if (e.getSource() == yellow) {
			Unums += "2";
		}
		if (e.getSource() == blue) {
			Unums += "3";
		}
	}

	public void flashButtons(String gnums) {
		for (int i = 0; i < gnums.length(); i++) {
			int num = Integer.parseInt(gnums.charAt(i) + "");
			if (num == 0) {
				green.setBackground(Color.GREEN);
			} else if (num == 1) {
				red.setBackground(Color.RED);
			} else if (num == 2) {
				yellow.setBackground(Color.YELLOW);
			} else if (num == 3) {
				blue.setBackground(Color.BLUE);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			green.setBackground(Color.lightGray);
			red.setBackground(Color.lightGray);
			yellow.setBackground(Color.lightGray);
			blue.setBackground(Color.lightGray);
		}
	}
}