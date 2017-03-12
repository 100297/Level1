import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class multSquare implements ActionListener {
	String num;
	int Fnum;
	JFrame mn = new JFrame();
	JLabel a = new JLabel();
	JPanel b = new JPanel();
	JButton b2 = new JButton();
	JButton b1 = new JButton();
	JTextField min = new JTextField(20);

	public static void main(String[] args) {
		multSquare a = new multSquare();
		a.activate();
	}

	void activate() {
		b.add(min);
		b.add(a);
		b.add(b1);
		b.add(b2);
		mn.add(b);
		mn.setVisible(true);
		b1.setText("Square");
		b2.setText("Double");
		b1.addActionListener(this);
		b2.addActionListener(this);
		mn.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		num = min.getText();
		Fnum = Integer.parseInt(num);
		if (e.getSource() == b1) {
			Fnum = Fnum * Fnum;
			JOptionPane.showMessageDialog(null, Fnum);
			min.setText(Fnum + "");
		}
		if (e.getSource() == b2) {
			Fnum = Fnum * 2;
			JOptionPane.showMessageDialog(null, Fnum);
			min.setText(Fnum + "");
		}
	}
}
