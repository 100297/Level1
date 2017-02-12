import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class slotMachine implements ActionListener {
	int mbet;
	int ccsh = 1000;
	JFrame fm = new JFrame();
	JButton sn = new JButton();
	JPanel pan = new JPanel();
	JLabel sl1 = new JLabel();
	JLabel sl2 = new JLabel();
	JLabel sl3 = new JLabel();
	int a;
	int a1;
	int a2;
	String b;
	String b1;
	String b2;
	Random ran = new Random();
	JLabel csh = new JLabel();
	JTextField bet = new JTextField();

	public static void main(String[] args) {
		slotMachine mn = new slotMachine();
		mn.activate();
	}

	private void activate() {
		pan.add(sn);
		pan.add(sl1);
		pan.add(sl2);
		pan.add(sl3);
		pan.add(csh);
		pan.add(bet);
		fm.add(pan);
		fm.setVisible(true);
		bet.setBounds(50, 50, 50, 50);
		csh.setBounds(200, 200, 200, 200);
		sl1.setBounds(100, 400, 50, 50);
		sl2.setBounds(200, 400, 50, 50);
		sl3.setBounds(300, 400, 50, 50);
		sn.setBounds(100, 200, 100, 200);
		pan.setLayout(null);
		a = ran.nextInt(3);
		b = "" + a;
		sl1.setText(b);
		a1 = ran.nextInt(3);
		b1 = "" + a1;
		sl2.setText(b1);
		a2 = ran.nextInt(3);
		b2 = "" + a2;
		sl3.setText(b2);
		sn.addActionListener(this);
		sn.setText("Spin!");

		fm.setSize(700, 700);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random ran = new Random();
		a = ran.nextInt(3);
		b = "" + a;
		sl1.setText(b);
		a1 = ran.nextInt(3);
		b1 = "" + a1;
		sl2.setText(b1);
		a2 = ran.nextInt(3);
		b2 = "" + a2;
		sl3.setText(b2);
		String mbet1 = bet.getText();
		mbet = Integer.parseInt(mbet1);

		if (a == a1 && a == a2) {
			JOptionPane.showMessageDialog(null, "YOU WON!");
			ccsh = ccsh + mbet;
		} else {
			ccsh = ccsh - mbet;
		}
		String temp = "" + ccsh;
		csh.setText(temp);
	}

}
