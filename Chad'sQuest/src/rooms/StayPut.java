package rooms;

import java.util.Random;
import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class StayPut {

	

	public static void StayPutGame()
	{
		
		@SuppressWarnings("resource")
		Scanner input1 = new Scanner(System.in);
		String asnwerLine;
		String decides;
		int score = 0;
		
		 Random r = new Random();
		 
    	 int computer = r.nextInt(4) + 1;
		 do{
    	 System.out.println("Chad deciedes to stay in his desk, and there is a game open on his computer. PLAY or NO");
		 
			 
		 decides = input1.nextLine();
	     if(decides.equals("PLAY"))
	     {
	    	 System.out.println("Welcome to the game of all games. Even and OODS.");
	    	 System.out.println("EVEN or ODDS");
	    	 asnwerLine = input1.nextLine();
	    	
	    	

			if(asnwerLine.equals("EVEN") && computer == 1||asnwerLine.equals("EVEN") && computer == 3)//EvenLose
	    	 {
	    		 System.out.println("The answer was odd. HAHAHA You lose. You have " + score + " points.");
	    		 System.out.println("Would you like to play again? YES or NO");
	    		 
	    	 }
	    	
	    	if(asnwerLine.equals("EVEN") && computer == 2 ||asnwerLine.equals("EVEN") && computer == 4)//EvenWin
	    	{
	    		score++;
	    		System.out.println("The answer was even, nice one. You have " + score + " points.");
	    		System.out.println("Would you like to play again? YES or NO");
	    		
	    	}
	    	
	    	if(asnwerLine.equals("ODDS") && computer == 2||asnwerLine.equals("ODD") && computer == 4)//OddLose
	    	{
	    		System.out.println("The answer was even. HAHAHAHA You lose. You have " + score + " points.");
	    		System.out.println("Would you like to play again? YES or NO");
	    	}
	    	
	    	if(asnwerLine.equals("ODDS") && computer == 1||asnwerLine.equals("ODD") && computer == 3)//OddWin
	    	{
	    		score++;
	    		System.out.println("The answer was odd, You did good donkey, you did good. You have " + score + " points.");
	    		System.out.println("Would you like to play again? YES or NO");
	    	
	    	}
	    	 
	     }else
	     
	    	 System.out.println("uhh What?");
	         decides = input1.nextLine();
		 }while(decides.equals("YES"));
		 
		 
	
	}

}
