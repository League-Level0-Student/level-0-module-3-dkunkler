
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "February 21st";
		String dadsBirthday = "February 9th";
		String myBirthday = "November 15th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String input = JOptionPane.showInputDialog("Who's birthday do you want to know, mom, dad, or me?");
		// 3. Print out what the user typed
		System.out.println(input);
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		
		if(input.equals("mom"))
		{
			JOptionPane.showMessageDialog(null,  momsBirthday);
		}else if (input.equals("dad"))
		{
			JOptionPane.showMessageDialog(null,  dadsBirthday);
		}else if (input.equals("me"))
		{
			JOptionPane.showMessageDialog(null,  myBirthday);
		}

	} 
}
