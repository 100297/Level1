import java.util.Random;

import javax.swing.JOptionPane;

public class ExperimentryMath {
	public static void main(String[] args) {
		String us = JOptionPane.showInputDialog("Name a number from one to 100");
		int fus = Integer.parseInt(us);
		int cn = 0;
		int ran;
		Random a = new Random();
		Random b = new Random();
		for (int i = 0; i < 1000000; i++) {
			if (fus == a.nextInt(100) && fus == b.nextInt(100)) {
				cn++;
			}
		}

		JOptionPane.showMessageDialog(null, cn);
	}
}
