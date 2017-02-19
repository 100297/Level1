import java.util.Random;

import javax.swing.JOptionPane;

public class powerBall {
	public static void main(String[] args) {
		String a1 = JOptionPane.showInputDialog("pick a number between one and thirtee");
		int fa1 = Integer.parseInt(a1);
		String a2 = JOptionPane.showInputDialog("pick a number between one and thirtee");
		int fa2 = Integer.parseInt(a2);
		String a3 = JOptionPane.showInputDialog("pick a number between one and thirtee");
		int fa3 = Integer.parseInt(a3);
		String a4 = JOptionPane.showInputDialog("pick a number between one and thirtee");
		int fa4 = Integer.parseInt(a4);
		String a5 = JOptionPane.showInputDialog("pick a number between one and thirtee");
		int fa5 = Integer.parseInt(a5);
		String a6 = JOptionPane.showInputDialog("pick a number between one and thirtee");
		int fa6 = Integer.parseInt(a6);
		Random rn = new Random();
		int nt = 0;
		int b1 = rn.nextInt(30);
		int b2 = rn.nextInt(30);
		int b3 = rn.nextInt(30);
		int b4 = rn.nextInt(30);
		int b5 = rn.nextInt(30);
		int b6 = rn.nextInt(30);
		while (!(b1 == fa1 && b2 == fa2 && b3 == fa3 && b4 == fa4 && b5 == fa5 && b6 == fa6)) {
			b1 = rn.nextInt(30);
			b2 = rn.nextInt(30);
			b3 = rn.nextInt(30);
			b4 = rn.nextInt(30);
			b5 = rn.nextInt(30);
			b6 = rn.nextInt(30);
			nt++;
		}
		JOptionPane.showMessageDialog(null, "" + nt);
	}
}
