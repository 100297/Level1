import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;

public class fancyWindows implements KeyListener {
  int vissible = 1;
	JFrame frame = new JFrame();
  public static void main(String[] args) {
	fancyWindows man = new fancyWindows();
	man.buildWindow();
  }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
			}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			Random a = new Random();
			int b = a.nextInt(1000);
			frame.setSize(b,b);
			}
		}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
void buildWindow() {
	frame.setVisible(true);
	frame.addKeyListener(this);
	frame.setSize(200, 200);
}
}
