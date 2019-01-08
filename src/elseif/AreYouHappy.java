package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Are you happy?");
		if (input.equals("yes"))
		{
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			System.exit(0);
		}
		else if (input.equals("no"))
		{
			input = JOptionPane.showInputDialog("Do you want to be happy?");
			if(input.equals("yes"))
			{
				JOptionPane.showMessageDialog(null,  "Change something.");
				System.exit(0);
			}
			else if(input.equals("no"))
			{
				JOptionPane.showMessageDialog(null,  "Keep doing whatever you're doing.");
			}
		}
	}
}
