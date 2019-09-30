package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	 JFrame frame = new JFrame();
	 JPanel panel = new JPanel();
	 JButton add = new JButton();
	 JButton view = new JButton();
	ArrayList<String> names = new ArrayList<String>();
	
	public static void main(String[] args) {
		_02_GuestBook GB = new _02_GuestBook();
		GB.frame();
	}
	
	public void frame() {
		frame.setVisible(true);
		frame.add(panel);
		add.setText("Add Name");
		panel.add(add);
		add.addActionListener(this);
		view.setText("View Names");
		panel.add(view);
		view.addActionListener(this);
		names.add("Bob Banders");
		names.add("Sandy Summers");
		names.add("Greg Ganders");
		names.add("Donny Doners");
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(add)) {
			String y = JOptionPane.showInputDialog("Add A Name");
			names.add(y);
		}
		else if(e.getSource().equals(view)) {
			//for(int i = 0; i < names.size(); i++) {
			JOptionPane.showMessageDialog(null, names/*.get(i)*/);
			//}
		}
	}
}
