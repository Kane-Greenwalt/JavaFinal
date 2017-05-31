package rooms;

import java.util.Scanner;
public class RightRoom 
{

	public static void RightHall()
	{
		
		String input;
		Scanner input1 = new Scanner(System.in);
		System.out.println("You know Chad, you make it very easy being a narator.");
		System.out.println("Im glad you listened too me.");
		System.out.println("Now just go through that door and leave.");
		System.out.println("Chad opens up the door and sees an unfinshed hallway.");
		System.out.println("The walls are half painted and there is only one door on the left side of the hallway.");
		System.out.println("A little further down the hall there is a door that leads to the outside.");
		System.out.println("Does Chad go to the DOOR, or WALKS down the hall.");
		input = input1.nextLine();
		if(input.equalsIgnoreCase("WALKS"))
		{
			System.out.println("Chad walks down the hall.");
			System.out.println("Finds a door, then walks out.");
		}
		if(input.equals("DOOR"))
		{
			System.out.println("Chad cracks open the door to get a peak inside.");
			System.out.println("The room is filled with monitors and one microphone, with soundproofing everywhere.");
			System.out.println("Chad looked closer and there was a man in there.");
			System.out.println("This man was hunched over the microphone, then slowly sits up and turns to look at Chad.");
			System.out.println("The man had a long beard, and looks dirty.");
			System.out.println("The old man stood up and the sound of bottles clinking together was heard.");
			System.out.println("The man walked over to the door Chad was at, then slowly closed it.");
			System.out.println("Don't mind the man in the room he's not important.");
			System.out.println("Chad then walks down the hallway, and opens up the door and leaves.");
			System.out.println("Game Over ending 8");
			System.out.println("We highly recomend you replay our game.");
		}
	}

}
