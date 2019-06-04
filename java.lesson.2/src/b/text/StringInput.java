package b.text;

import javax.swing.JOptionPane;

public class StringInput {
	
	public static void main(String[] args) {
		// get a user name as input an print it
		
		// 1. get the name from the user
		String userName = JOptionPane.showInputDialog("enter your name");
		
		// 2. print the user name
		System.out.println(userName);
	}

}
