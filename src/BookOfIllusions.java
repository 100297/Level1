import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be
 * loaded.
 **/

public class BookOfIllusions extends MouseAdapter {

	public static void main(String[] args) throws Exception {
		BookOfIllusions illusions = new BookOfIllusions();
		illusions.createBook();

	}

	JLabel ma;
	JFrame mn = new JFrame();

	private void createBook() {

		mn.setVisible(true);

		mn.setSize(400, 400);

		String a = "75f1a3d4c87fb8f6d76f010fc651d331.png";
		String b = "16-optical-illusion.png";

		JLabel ma;

		ma = loadImageFromComputer(a);
		loadImageFromComputer(b);

		mn.add(ma);

		mn.pack();

		mn.addMouseListener(BookOfIllusions.this);
	}

	public void mousePressed(MouseEvent e) {

		System.out.println("Clicked!!");

		mn.remove(ma);

		JLabel ma2;
		ma2 = loadImageFromComputer("16-optical-illusion.png");
		mn.add(ma2);
		// 14. pack the frame
		mn.pack();
	}

	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}
