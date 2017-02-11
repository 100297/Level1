import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class New implements ActionListener {

	public JFrame frame = new JFrame();
	public JPanel panel = new JPanel();
	public JButton ad = new JButton();
	public JButton sub = new JButton();
	JButton ran = new JButton();
	JLabel num = new JLabel();

	public static void main(String[] args) {
		System.out.println("Hello");
	}

	public void start() {
		panel.add(num);
		panel.add(ad);
		panel.add(sub);
		panel.add(ran);
		ad.addActionListener(this);
		sub.addActionListener(this);
		ran.addActionListener(this);
		frame.add(panel);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
