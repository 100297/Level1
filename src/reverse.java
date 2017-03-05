import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class reverse implements ActionListener {
	JFrame a = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	JButton b = new JButton();
	JTextField t = new JTextField(20);

	public static void main(String[] args) {
		reverse a = new reverse();
		a.activate();
	}

	void activate() {
		p.add(l);
		p.add(t);
		p.add(b);
		a.add(p);
		a.setVisible(true);
		a.pack();
		b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String gt = t.getText();
		String fin = "";
		String cop = t.getText();

		for (int len = cop.length(); len >= 1; len--) {
			fin += gt.substring(len - 1, len);
			l.setText(fin);
		}
	}
}