package anotherTextGame;


import javax.swing.JOptionPane;
public class Start 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String answer;
		
		
		answer =
 		JOptionPane.showInputDialog(null,"Welcome to Bartforts Casino. Would you like to enter? YES or NO.");
		
		
		if(answer.equalsIgnoreCase("yes"))
		{
			
			answer = JOptionPane.showInputDialog(null, "Are you a Mr or Ms?");
			if(answer.equalsIgnoreCase("Mr"))
			{
				answer = JOptionPane.showInputDialog(null, "Welcome Sir, Would you like to make a bond with us tonight? (Adds $50 to your funds) YES or NO.");
				if(answer.equalsIgnoreCase("Yes"))
				{
					JOptionPane.showMessageDialog(null,"Ok if you will follow me Mr, we will get that set up for you.");
					JOptionPane.showMessageDialog(null,"My name is Mr. Nelson, I am the floor manager. If you have an issue with my staff, please let me know.");
					JOptionPane.showMessageDialog(null,"Mr Nelson Brings you up a nice stair case in the back of the cosino.");
					JOptionPane.showMessageDialog(null,"It's easy to see nobody comes back here because it's so well kept, unlike the rest of the casino.");
				}
			if(answer.equalsIgnoreCase("Ms"))
			{
				JOptionPane.showInputDialog(null, "Welcome Ms, Would you like to make a bond with us tonight? (Adds $50 to your funds) YES or NO.");
				if(answer.equalsIgnoreCase("Yes"))
				{
					JOptionPane.showInputDialog(null, "Ok if you will follow me Ms, we will get that set up for you.");
				}
			}
			
			
			}
		}
	}

}
