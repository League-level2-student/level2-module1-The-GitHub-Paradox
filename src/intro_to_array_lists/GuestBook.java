package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JButton b = new JButton("Add Name");
	JButton b1 = new JButton("View Names");
	ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		new GuestBook().run();
	}
		public void run() {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		f.setVisible(true);
		f.add(p);
		f.setSize(500, 100);
		// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
		p.add(b);
		p.add(b1);
		b.addActionListener(this);
		b1.addActionListener(this);
		// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
		// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
		// all the names added to the list. Format the list as follows:
		// Guest #1: Bob Banders
		// Guest #2: Sandy Summers
		// Guest #3: Greg Ganders
		// Guest #4: Donny Doners
	}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton buttonPressed = (JButton) e.getSource();
			if(e.getSource() == b) {
				String s = JOptionPane.showInputDialog("Enter the name of a guest");
				names.add(s);
			}
			if(e.getSource() == b1) {
				for(int i = 0; i < names.size(); i++){
					String s = names.get(i);
					System.out.println("Guest " + "#"  + (i + 1) + ": " + s);
				}
			}
		}
}
