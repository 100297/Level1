import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chucklecliker implements ActionListener {
	public static void main(String[] args) {
		Chucklecliker ma = new Chucklecliker();
		ma.makeButtons();
	}

	public void makeButtons() {
	JFrame man = new JFrame();
	man.setVisible(true);
	JPanel a = new JPanel();
    
	JButton b = new JButton("JOKE");
	JButton c = new JButton("Punchline");
	a.add(b);		
	a.add(c);
	man.add(a);
	b.addActionListener(this);
	c.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "hi");
	}
}

// Make a JFrame in makeButtons() method and get it to show.

// Add a JPanel and two JButtons and get them to show up like this:

// *[Optional] Customize your GUI with setText, setSize, etc.

// Make a pop-up that says “hi” when either of the buttons are pressed. You will
// need to add listeners to the buttons for this to work.

// Check if the ActionEvent came from the joke button or the punchline button.
// if(arg0.getSource() == jokeButton)
// You might need to move the declaration of your buttons above the the
// makeButtons() method.

// Use JOptionPane to print the joke or the punchline depending on which button
// was clicked.
