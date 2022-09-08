package com.guesserGame;

import java.util.Scanner;

class Guesser
{
	int Guesser;
	public int guesser()
	{
		System.out.println("Enter the Guesser choosen Number: ");
		Scanner sc = new Scanner(System.in);
		Guesser = sc.nextInt();
		return Guesser;
	}
}

class Player
{
	int Player;
	public int player(int num)
	{
		System.out.println("Enter the Guess number of Player"+num+": ");
		Scanner sc = new Scanner(System.in);
		Player = sc.nextInt();
		return Player;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	public void collectNumFromGuesser()
	{
		Guesser gs = new Guesser();
		numFromGuesser = gs.guesser();
	}
	
	public void collectNumFromPlayer()
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		p1.player(1);
		p2.player(2);
		p3.player(3);
		
		numFromPlayer1 = p1.Player;
		numFromPlayer2 = p2.Player;
		numFromPlayer3 = p3.Player;
	}
	public void decide()
	{

			if(numFromPlayer1 == numFromGuesser)
			{
				if(numFromPlayer2 == numFromGuesser && numFromPlayer3 == numFromGuesser)
				{
					System.out.println("All player1 , Player2 and Player3 are winners hence GAME TIED");
				}
				else if(numFromPlayer2 == numFromGuesser)
				{
					System.out.println("Player1 and Player2 are winner");
				}
				else if(numFromPlayer3 == numFromGuesser)
				{
					System.out.println("Player1 and Player3 are winner");
				}
				else
					System.out.println("Player 1 is winner");
			}
			else if(numFromPlayer2 == numFromGuesser)
			{
				if(numFromPlayer3 == numFromGuesser)
				{
					System.out.println("Player2 and Player3 is the winner");
				}
				System.out.println("Player2 is winner");
			}
			else if(numFromPlayer3 == numFromGuesser)
				System.out.println("Player3 is the winner");
			else
				System.out.println("All Player Lost\nGAME OVER");
			System.out.println("-------------   TO PLAY AGAIN TYPE (TRUE) OR TO EXIT TYPE (FALSE)------------------- ");
			
			boolean replay = true;
			while(replay)
			{
			Scanner sc = new Scanner(System.in);
			replay = sc.nextBoolean();
			Umpire ump = new Umpire();
			ump.collectNumFromGuesser();
			ump.collectNumFromPlayer();
			ump.decide();
		    }
	}
}

public class GuesserGame {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Umpire ump = new Umpire();
		ump.collectNumFromGuesser();
		ump.collectNumFromPlayer();
		ump.decide();

	}

}
